package ru.karproj.snaker;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EnglishLanguage extends JFrame {
    private JButton button = new JButton("Confirm");
    private JTextField input = new JTextField("", 5);
    private JLabel lable = new JLabel("Your name:");
    private JRadioButton radio1 = new JRadioButton("Dentist");
    private JRadioButton radio2 = new JRadioButton("Surgeon");
    private JRadioButton radio3 = new JRadioButton("Therapist");
    private JCheckBox check = new JCheckBox("Registr", false);



    public EnglishLanguage() {

        super("English");
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
        button.addActionListener(new ButtonEventListener2());
        container.add(button);
    }

    class ButtonEventListener2 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            boolean b = false;

            String message = "";

            do {
                try {
                    if (!check.isSelected()) {
                        message+= "Registration was't finished!!!\n";
                    } else {
                            message += "Service was chosen\n";
                            message += "Name:" + " " + input.getText() + "\n";
                            message += "The number of people before you:" + " " + (int) (Math.random() * 20) + "\n";


                            if (radio1.isSelected())
                                message += "Doctor's name:" + " " + "Kurmangazieva Leila \n";
                            if (radio2.isSelected())
                                message += "Doctor's name:" + " " + " Kenesh Abdilda Sagadibekuly\n";
                            if (radio3.isSelected())
                                message += "Doctor's name:" + " " + " Kosybaeva Umitzhan Amankeldykizy\n";
                    }
                } catch (Exception e1) {

                    break;
                }
            } while (b);

            JOptionPane.showMessageDialog(null, message, "Check", JOptionPane.PLAIN_MESSAGE);
        }
    }
}
