package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChangingFont extends JFrame {
    JTextArea textArea = new JTextArea("The text added here is just for demo. "+
            "\nThis demonstrates the usage of JTextArea in Java. ");
    JMenuBar menuBar = new JMenuBar();
    JMenu menu = new JMenu("Цвет");
    JMenuItem jMenuItem1 = new JMenuItem("синий");
    JMenuItem jMenuItem2 = new JMenuItem("красный");
    JMenuItem jMenuItem3 = new JMenuItem("черный");
    JMenu menu2 = new JMenu("Шрифт");
    JMenuItem jMenuItem11 = new JMenuItem("Times New Roman");
    JMenuItem jMenuItem22 = new JMenuItem("MS Sans Serif");
    JMenuItem jMenuItem33 = new JMenuItem("Courier New");
    public ChangingFont() throws HeadlessException {
        add(textArea,BorderLayout.CENTER);
        setSize(400,400);
        menu.add(jMenuItem1);
        menu.add(jMenuItem2);
        menu.add(jMenuItem3);
        menu2.add(jMenuItem11);
        menu2.add(jMenuItem22);
        menu2.add(jMenuItem33);
        menuBar.add(menu);
        menuBar.add(menu2);
        setJMenuBar(menuBar);
        jMenuItem1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.setForeground(Color.blue);

            }
        });
        jMenuItem2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.setForeground(Color.red);
            }
        });
        jMenuItem3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.setForeground(Color.black);
            }
        });
        jMenuItem11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Font font = new Font("Times New Roman", Font.BOLD, 12);
                textArea.setFont(font);
            }
        });
        jMenuItem22.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Font font = new Font("MS Sans Serif", Font.BOLD, 12);
                textArea.setFont(font);
            }
        });
        jMenuItem33.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Font font = new Font("Courier New", Font.BOLD, 12);
                textArea.setFont(font);
            }
        });
        //add(menuBar);
        //add(menu);

    }

    public static void main(String[] args) {
        new ChangingFont().setVisible(true);



    }

}
