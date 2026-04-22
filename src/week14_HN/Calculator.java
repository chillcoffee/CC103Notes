package week14_HN;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Calculator extends JFrame implements ActionListener {

    JLabel lblNum1 = new JLabel("Enter first number: ");
    JTextField txtNum1 = new JTextField(25);
    JLabel lblNum2 = new JLabel("Enter second number: ");
    JTextField txtNum2 = new JTextField(23);
    JButton btnGreet = new JButton("Add");
    JLabel lblResult = new JLabel("");

    public Calculator() {
        super("Gatepass");
        setSize(450, 150);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(lblNum1);
        add(txtNum1);
        add(lblNum2);
        add(txtNum2);
        add(btnGreet); btnGreet.addActionListener(this);
        add(lblResult);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String firstNum = txtNum1.getText(); //trim() remove spaces at the beginning and end
        String secondNum = txtNum2.getText();
        try {
            double sum = Double.parseDouble(firstNum) + Double.parseDouble(secondNum);     //try catch just in case useer inputs are not numbers
            lblResult.setText("The sum of the two numbers above is " + sum);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(rootPane, "Please enter numerical digits only.");
            txtNum1.setText("");
            txtNum2.setText("");
        }

    }

    public static void main(String[] args) {
        Calculator window = new Calculator();
        window.setVisible(true);
    }
}
