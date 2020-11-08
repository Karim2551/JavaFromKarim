package ru.karproj.snaker;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Main {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Medicine Service");

            Container c = frame.getContentPane();
            c.setBackground(Color.CYAN);
            frame.setSize(600,400);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            frame.setLocationRelativeTo(null);
            frame.setLayout(new GridBagLayout());
            frame.setResizable(false);

             Font f1 = new Font("TimesRoman", Font.BOLD, 20);
            JButton m = new JButton("Қазақ тілі");
                    m.setBackground(Color.PINK);
                    frame.add(m);
                    m.setFont(f1);
                    m.setCursor(new Cursor(Cursor.HAND_CURSOR));
                    m.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent actionEvent) {
                            KazakhLanguage kz = new KazakhLanguage();
                            kz.setVisible(true);
                        }
                    });

            JButton m2 = new JButton("Русский язык");
                    m2.setBackground(Color.MAGENTA);
                    frame.add(m2);
                    m2.setFont(f1);
                    m2.setCursor(new Cursor(Cursor.HAND_CURSOR));
                    m2.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent actionEvent) {
                            RussianLanguage rl = new RussianLanguage();
                            rl.setVisible(true);
                        }
                    });


            JButton m3 = new JButton("English Language");
                    m3.setBackground(Color.CYAN);
                    frame.add(m3);
                    m3.setFont(f1);
                    m3.setCursor(new Cursor(Cursor.HAND_CURSOR));
                    m3.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent actionEvent) {
                            EnglishLanguage el = new EnglishLanguage();
                            el.setVisible(true);
                        }
                    });


                    frame.setVisible(true);
    }
}

