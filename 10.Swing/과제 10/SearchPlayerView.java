package com.fm.view;

import com.fm.controller.SearchPlayerController;
import com.fm.model.SearchPlayerModel;
import com.fm.repository.PlayerRepository;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class SearchPlayerView  extends JFrame {
    private JLabel jlb1 = new JLabel("name        ",JLabel.RIGHT);
    private JLabel jlb2 = new JLabel("club          ",JLabel.RIGHT);
    private JLabel jlb3 = new JLabel("position    ",JLabel.RIGHT);
    private JLabel jlb4 = new JLabel("nationality ",JLabel.RIGHT);

    private JTextField tf1 = new JTextField(70);
    private JTextField tf2 = new JTextField(70);
    private JTextField tf3 = new JTextField(70);
    private JTextField tf4 = new JTextField(70);

    private JButton btn1 = new JButton("Create");
    private JButton btn2 = new JButton("Delete");
    private JButton btn3 = new JButton("Search");

    private JTable table = new JTable();
    private JScrollPane scrollPane = new JScrollPane(table);

    public SearchPlayerView(SearchPlayerController controller, SearchPlayerModel model) {
        JPanel jp1 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JPanel jp2 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JPanel jp3 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JPanel jp4 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JPanel jp5 = new JPanel(new FlowLayout(FlowLayout.RIGHT));

        jp1.add(jlb1);
        jp1.add(tf1);
        add(jp1);

        jp2.add(jlb2);
        jp2.add(tf2);
        add(jp2);

        jp3.add(jlb3);
        jp3.add(tf3);
        add(jp3);

        jp4.add(jlb4);
        jp4.add(tf4);
        add(jp4);

        btn3.addActionListener(new ActionListener() {
            String txt1 = tf1.getText();
            String txt2 = tf2.getText();
            String txt3 = tf3.getText();
            String txt4 = tf4.getText();
            @Override
            public void actionPerformed(ActionEvent e) {
                List<SearchCondition> list = new ArrayList<>();
                if (txt1!="")list.add(new SearchCondition("name",tf1.getText()));
                if (txt2!="")list.add(new SearchCondition("club",tf2.getText()));
                if (txt3!="")list.add(new SearchCondition("position",tf3.getText()));
                if (txt4!="")list.add(new SearchCondition("nationality",tf4.getText()));
                //PlayerRepository.searchPlayer(list);
                controller.searchPlayer(list);
                //기능을 어떻게 구현헤야할까.....흑흑
            }
        });

        jp5.add(btn1);
        jp5.add(btn2);
        jp5.add(btn3);
        add(jp5);

        table.setModel(model);
        table.setRowHeight(50);
        table.setPreferredScrollableViewportSize(new Dimension(800, 500));
        getContentPane().setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
        add(scrollPane);
    }

}

