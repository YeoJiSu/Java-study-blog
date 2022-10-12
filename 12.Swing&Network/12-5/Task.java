import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Task extends SwingWorker {
    @Override
    protected Object doInBackground() throws Exception {
        Random random = new Random();
        int value = 0;
        setProgress(0);
        while (value < 100) {
            try {
                Thread.sleep(random.nextInt(1000));
            } catch (InterruptedException e){ }
            value += random.nextInt(10);
            int min = Math.min(value, 100);
            setProgress(min);
        }
        return null;
    }
}
