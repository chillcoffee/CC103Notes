package week14_HN;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GUI_Demo extends JFrame implements ActionListener{
    JLabel lblName = new JLabel("Juan Reyes");
    JLabel lblSection = new JLabel("BSInfoTech 1 - HN");
    JLabel lblSubject = new JLabel("CC 103");
    JButton btnOK = new JButton("OK");
    public GUI_Demo(){
        super("Calculator");
        setSize(450, 200);  //width, height
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(2,2));
        add(lblSection);
        add(lblName);
        add(lblSubject);
        add(btnOK);
        btnOK.addActionListener(this);
    }
    
    public static void main(String[] args) {
        GUI_Demo window = new GUI_Demo();
        window.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Na click an OK");
        String label = lblSection.getText();
        System.out.println(label);
        lblName.setText("Na click an OK");
    }
}
