package week14_HN;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Greet extends JFrame implements ActionListener{
    JLabel lblNum1 = new JLabel("Enter your name: ");
    JTextField txtNum1 = new JTextField(20);    
    JButton btnGreet = new JButton("Say Hi!");
    JLabel lblResult = new JLabel("");
    
    public Greet(){
        super("Gatepass");
        setSize(350, 150);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(lblNum1);
        add(txtNum1);
        add(btnGreet); btnGreet.addActionListener(this);
        add(lblResult);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        String name = txtNum1.getText();
        lblResult.setText("Hi hello how are you, kamusta ka naman, "+name+"?");
    }
    
    public static void main(String[] args) {
        Greet window = new Greet();
        window.setVisible(true);
    }
}
