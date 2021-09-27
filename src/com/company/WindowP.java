package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class WindowP extends JFrame {
    private int number;
    private int ideal;
    private int count=0;
    private Random random = new Random();
    JButton butTry = new JButton("Try");
    JTextField jta = new JTextField (2);//2 числа ввести можно только

    public WindowP() throws HeadlessException {
        add(jta,BorderLayout.NORTH);
        add(butTry,BorderLayout.SOUTH);
        setSize(400,100);
        ideal=random.nextInt(20);
        System.out.println(ideal);
        butTry.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    count++;
                    int x=Integer.parseInt(jta.getText().trim());

                    if(x<ideal){
                    JOptionPane.showMessageDialog(null, "Число угадываемое больше");
                    }
                    else if(x>ideal){
                        JOptionPane.showMessageDialog(null, "Число угадываемое меньше");
                    }
                    else if (x==ideal){
                        JOptionPane.showMessageDialog(null, "Вы угадали");
                        dispose();
                    }
                    if (count==3 && x!=ideal){
                        JOptionPane.showMessageDialog(null, "Вы не успели угадать");
                        dispose();
                    }

                }
                catch (Exception exception){
                    JOptionPane.showMessageDialog(null, "Некорректный ввод");
                }

            }
        });
    }

    public static void main(String[] args) {
        new WindowP().setVisible(true);

    }
}
