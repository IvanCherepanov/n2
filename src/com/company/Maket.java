package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Maket extends JFrame {
    JLabel jLabelC = new JLabel("center");
    JLabel jLabelN = new JLabel("north");
    JLabel jLabelS = new JLabel("south");
    JLabel jLabelE = new JLabel("east");
    JLabel jLabelW = new JLabel("west");

    public Maket() throws HeadlessException {
        add(jLabelE,BorderLayout.EAST);
        add(jLabelC,BorderLayout.CENTER);
        add(jLabelW, BorderLayout.WEST);
        add(jLabelN,BorderLayout.NORTH);
        add(jLabelS,BorderLayout.SOUTH);
        jLabelC.setHorizontalAlignment(JLabel.CENTER);
        jLabelE.setHorizontalAlignment(JLabel.CENTER);
        jLabelN.setHorizontalAlignment(JLabel.CENTER);
        jLabelS.setHorizontalAlignment(JLabel.CENTER);
        jLabelW.setHorizontalAlignment(JLabel.CENTER);
        setSize(400,400);
        jLabelW.addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                JOptionPane.showMessageDialog(null, "Добро пожаловать в Джидда");

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
        jLabelS.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                JOptionPane.showMessageDialog(null, "(Добро пожаловать Абха");
            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
        jLabelN.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                JOptionPane.showMessageDialog(null, "(Добро пожаловать в N)");
            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
        jLabelC.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                JOptionPane.showMessageDialog(null, "Добро пожаловать в C");
            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
        jLabelE.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                JOptionPane.showMessageDialog(null, " Добро пожаловать в Дахране");
            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
    }

    public static void main(String[] args) {
        new Maket().setVisible(true);
    }
}
