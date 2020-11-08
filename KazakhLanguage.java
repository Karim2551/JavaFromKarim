package ru.karproj.snaker;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class KazakhLanguage  extends JFrame {
    private JButton button = new JButton("Растау");
    private JTextField input = new JTextField("", 5);
    private JLabel lable = new JLabel("Аты-жөні:");
    private JRadioButton radio1 = new JRadioButton("Тіс дәрігер");
    private JRadioButton radio2 = new JRadioButton("Хирург");
    private JRadioButton radio3 = new JRadioButton("Терапевт");
    private JCheckBox check = new JCheckBox("\n" +
            "Регистр", false);

    public KazakhLanguage() {
        super("Қазақ тілі");
        this.setBounds(350, 350, 450, 400);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = this.getContentPane();
        container.setBackground(Color.cyan);

        container.setLayout(new GridLayout(5, 5, 2, 2));
        container.add(lable);
        container.add(input);

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
        container.add(button);
        button.addActionListener(new ButtonEventListener1());
     }



    class ButtonEventListener1 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {

            boolean b = false;

            String message = " ";
            do {
                try {
                    if (!check.isSelected()) {
                        message+= "Тіркеу аяқталмады\n";
                    } else {
                            message += "Қызмет таңдалды\n";
                            message += "Аты-жөні" + " "+ input.getText() + "\n";
                            message += "Сіздің алдыңызда" + " " + (int) (Math.random() * 20) + " " + " адам бар" + "\n";


                            if (radio1.isSelected())
                                message += "Дәрігердің аты-жөні:" + " " + " Құрманғазиева Лейла\n";
                            if (radio2.isSelected())
                                message += "Дәрігердің аты-жөні:" + " " + "Кенеш Әбділда Сағадибекұлы\n";
                            if (radio3.isSelected())
                                message += "Дәрігердің аты-жөні:" + " " + "Қосыбаева Умітжан Аманкелдықызы\n";
                    }
                } catch (Exception e1) {
                    break;
                }
            } while (b);

            JOptionPane.showMessageDialog(null, message, "Купон", JOptionPane.PLAIN_MESSAGE);
        }
    }
}
