package view;
import javax.swing.*;
import java.awt.*;

public class HelloSwingWorldView extends JFrame {
    public HelloSwingWorldView(){
        setTitle("HelloSwingWorldView");
        Toolkit kit = Toolkit.getDefaultToolkit();
        Dimension screenSize = kit.getScreenSize();
        int screenHeight = screenSize.height;
        int screenWidth = screenSize.width;
        setSize(screenWidth/4, screenHeight/5);
        setLocation(screenWidth/4, screenHeight/4);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(new JLabel("Hello World"), BorderLayout.CENTER);
    }
}
