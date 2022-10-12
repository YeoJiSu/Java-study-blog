import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class MultithreadHttpServer {
    public static void main(String[] args) {
        HttpServer server;
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        try {
            server = HttpServer.create(new InetSocketAddress(8080), 0);
            server.createContext("/api/hello", exchange -> {
                OutputStream output = exchange.getResponseBody();
                if ("GET".equals(exchange.getRequestMethod())){
                    sleep(1000);
                    String responseBody = "Hello, World!\n";
                    exchange.getResponseHeaders().add("Content-Type", "text/html");
                    exchange.sendResponseHeaders(HttpURLConnection.HTTP_OK, responseBody.getBytes().length);
                    output.write(responseBody.getBytes());
                    output.flush();
                    Runnable runnable = new Runnable() {
                        @Override
                        public void run() {
                            ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) executorService;
                            System.out.println(Thread.currentThread().getName() + " - Done!");

                        }
                    };
                     executorService.execute(runnable);

                    } else {
                    //exchange.sendResponseHeaders(405, Constants.NOT_ALLOWED.length());
                    //output.write(Constants.NOT_ALLOWED.getBytes());
                    output.flush();
                }
                exchange.close();
            });
            server.setExecutor(null); //default ServiceExecutor
            server.start();

        } catch (IOException ex) {
            System.err.println(ex);
        }
    }

    private static void sleep(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {}
    }
}