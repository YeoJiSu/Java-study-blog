package view;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class SwingTextFieldView extends JFrame implements ActionListener{
    protected JTextField field;
    protected JTextArea area;

    public SwingTextFieldView(){
        setTitle("SwingTextFieldView");
        Toolkit kit = Toolkit.getDefaultToolkit();
        Dimension screenSize = kit.getScreenSize();
        int screenHeight = screenSize.height;
        int screenWidth = screenSize.width;
        setLocation(screenWidth/2, screenHeight/2);

        JPanel panel = new JPanel();
        field = new JTextField(20);
        JButton btn = new JButton("Enter");
        panel.add(field); panel.add(btn);

        JPanel panel2 = new JPanel();
        area = new JTextArea(5,30);
        panel2.add(area);

        add(BorderLayout.NORTH, panel);
        add(BorderLayout.CENTER, panel2);

        btn.addActionListener(this);
        field.addActionListener(this);

        JScrollPane scrollPane = new JScrollPane(area);
        add(scrollPane);

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String text = field.getText();
        area.append(text+"\n");
        field.selectAll();
        area.setCaretPosition(area.getDocument().getLength());

    }
}
