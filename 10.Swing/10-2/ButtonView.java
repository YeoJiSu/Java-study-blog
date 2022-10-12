package view;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonView extends JFrame {
    public ButtonView(){
        setTitle("view.ButtonView");
        Toolkit kit = Toolkit.getDefaultToolkit();
        Dimension screenSize = kit.getScreenSize();
        int screenHeight = screenSize.height;
        int screenWidth = screenSize.width;
        setLocation(screenWidth/2, screenHeight/2);
        JButton btn1 = new JButton("Disable middle button");
        JButton btn2 = new JButton("Middle button");
        JButton btn3 = new JButton("Enable middle button");

        add(btn1,BorderLayout.LINE_START);
        add(btn2,BorderLayout.CENTER);
        add(btn3,BorderLayout.LINE_END);

        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btn1.setEnabled(false); // 버튼 비활성화하기
                btn2.setEnabled(false); // 버튼 비활성화하기
                btn3.setEnabled(true); //버튼 활성화
            }
        });

        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "dialog", "Message",JOptionPane.ERROR_MESSAGE);
                // 에러메세지 나오게 하기
            }
        });

        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btn1.setEnabled(true);// 버튼 활성화
                btn2.setEnabled(true); //버튼 활성화
                btn3.setEnabled(false);// 버튼 비활성화하기
            }
        });
    }
}
