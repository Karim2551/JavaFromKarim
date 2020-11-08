package ru.karproj.snaker;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SimpleGUI extends JFrame {
    private JButton button = new JButton("Press");
    private JTextField input = new JTextField("", 5);
    private JLabel lable = new JLabel("input:");
    private JRadioButton radio1 = new JRadioButton("Kazakh");
    private JRadioButton radio2 = new JRadioButton("Russian");
    private JRadioButton radio3 = new JRadioButton("English");
    private JCheckBox check = new JCheckBox("Подтвердить/Confirm", false);

    public SimpleGUI() {
        super("In Kazakh");
        this.setBounds(150, 150, 250, 100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = this.getContentPane();
        container.setLayout(new GridLayout(3, 2, 2, 2));
        container.add(lable);
        container.add(input);

        ButtonGroup group = new ButtonGroup();
        group.add(radio1);
        group.add(radio2);
        group.add(radio3);
        container.add(radio1);
        radio1.setSelected(true);
        container.add(radio2);
        container.add(radio3);
        container.add(check);
        button.addActionListener(new ButtonEventListener());
        container.add(button);
    }

    class ButtonEventListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            String message = "";
            message += "Service was chosen\n";
            message += "Text is" + input.getText() + "\n";

            message += " " + (radio1.isSelected() ? "Language" : "Язык") + " " + "is Selected/сервиса выбран!\n";
            message += "Checkbox is" + ((check.isSelected()) ? "checked" : "unchecked");
            JButton b1 = new JButton("Next");
            b1.setVisible(true);
            JOptionPane.showMessageDialog(null, message, "Output", JOptionPane.PLAIN_MESSAGE);
        }
    }
}

