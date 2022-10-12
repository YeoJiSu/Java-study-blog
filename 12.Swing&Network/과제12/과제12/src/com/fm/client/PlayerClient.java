package com.fm.client;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fm.unit.Player;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;


public class PlayerClient extends JFrame implements ActionListener {
    private static String value;
    private static String url="http://localhost:9000/players?";

    private static final HttpClient client =HttpClient.newBuilder()
            .version(HttpClient.Version.HTTP_1_1)
            .followRedirects(HttpClient.Redirect.NORMAL)
            .build();
    private JTextField input;
    private JTextArea output;
    private Write write;

    public PlayerClient() {
        setTitle("과제 12 - 선수 번호 목록 가져오기 ");
        setLayout(new GridLayout(5,10));
        input = new JTextField(20);
        output = new JTextArea(20,20);
        output.setMargin(new Insets(6,6,6,6));
        output.setEditable(false);

        JPanel panel = new JPanel();
        panel.add(new JLabel("입력하시오: "));
        panel.add(input);
        JPanel panel2 = new JPanel();
        panel2.add(new JLabel(" 결과값: "));
        panel2.add(output);
        add(panel,BorderLayout.WEST);
        add(panel2,BorderLayout.EAST);
        add(new JScrollPane(output), BorderLayout.NORTH);
        setSize(400,700);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        input.addActionListener(this);


    }
    public void actionPerformed(ActionEvent event){
        write = new Write();
        write.addPropertyChangeListener(new PropertyChangeListener() {
            @Override
            public void propertyChange(PropertyChangeEvent evt) {
                url="http://localhost:9000/players?";
            }
        });
        write.execute();

    }
    public class Write extends SwingWorker{

        @Override
        protected Object doInBackground() throws Exception {
            String value = input.getText();
            List<String> list = Arrays.asList(value.split(" "));
            int index = 0;

            for (String str:list){
                if (index%2==0){
                    url+=str+"=";
                }
                else{
                    url+=str+"&";
                }
                index++;
            }
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(url))
                    .timeout(Duration.ofMinutes(1))
                    .header("Content-Type","text/html")
                    .GET()
                    .build();
            try {
                HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
                ObjectMapper mapper = new ObjectMapper();
                List<Player> players = mapper.readValue(response.body(), new TypeReference<List<Player>>() {
                });
                if (response.statusCode() == 200){
                    output.setText(null);
                    output.append(String.valueOf(players));
                }
            }catch(IOException e){
                e.printStackTrace();
            }catch(InterruptedException e) {
                e.printStackTrace();
            }
            return null;
        }
    }

    public static void main(String[] args){
        new PlayerClient();
        // SwingWorker로 처리하니까 속도가 훨씬 빠름 ...!!!! 굿
    }
}
