package ru.karproj.snaker;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RussianLanguage extends JFrame {
    private JButton button = new JButton("Подтвердить");
    private JTextField input = new JTextField("", 5);
    private JLabel lable = new JLabel("Ваше имя:");
    private JRadioButton radio1 = new JRadioButton("Дантист");
    private JRadioButton radio2 = new JRadioButton("Хирург");
    private JRadioButton radio3 = new JRadioButton("Терапевт");
    private JCheckBox check = new JCheckBox("Подтвердить", false);



    public RussianLanguage() {
        super("На Русском");
        this.setBounds(350, 350, 450, 400);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        Container container = this.getContentPane();
        container.setLayout(new GridLayout(5, 5, 2, 2));
        container.add(lable);
        container.add(input);
        container.setBackground(Color.cyan);

        ButtonGroup group = new ButtonGroup();
        Font f1 = new Font("TimesRoman", Font.BOLD, 13);
        radio1.setFont(f1);
        radio2.setFont(f1);
        radio3.setFont(f1);

        group.add(radio1);
        group.add(radio2);
        group.add(radio3);

        container.add(radio1);
        radio1.setSelected(true);
        container.add(radio2);
        container.add(radio3);
        container.add(check);
        button.addActionListener(new ButtonEventListener3());
        container.add(button);
    }

    class ButtonEventListener3 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
                boolean b = false;

                String message = "";
            do {
                try {
                    if (!check.isSelected()) {
                        message+= "Вернитесь назад и завершите регистрацию!!!!";
                    } else {
                        message += "Сервис выбран\n";
                        message += "Имя пациента" + " " + input.getText() + "\n";
                        message += "Количество людей в очереди перед вами:" + " " + " " + (int) (Math.random() * 20) + "\n";


                        if (radio1.isSelected())
                            message += "Имя Доктора:" + " " + "Курмангазиева Лейла \n";
                        if (radio2.isSelected())
                            message += "Имя Доктора:" + " " + "Кенеш Абдильд Сагадыбекулы\n";
                        if (radio3.isSelected())
                            message += "Имя Доктора" + " " + "Косыбаева Умитжан Аманкельдиновна\n";
                    }
                } catch (Exception e1) {
                  ;
                    break;
                }
            } while (b);
            JOptionPane.showMessageDialog(null, message, "Купон", JOptionPane.PLAIN_MESSAGE);
        }
    }
}
