package preFinal;

import javax.swing.*;
import java.awt.*;

public class test1 extends JFrame {
    private JLabel label;
    private JLabel label1;
    private JTextField textField;
    private JTextField textField1;
    private JButton button;

    public test1() {
        // Set the title and size of the form
        setTitle("My Form");
        setSize(400, 300);

        // Set the layout to null for custom positioning of components
        setLayout(null);

        // Create the label
        label = new JLabel("Username");
        label.setBounds(20, 20, 100, 20);
        add(label);
        label1 = new JLabel("Password");
        label1.setBounds(20, 60, 100, 20);
        add(label1);

        // Create the text field
        textField = new JTextField();
        textField1 = new JTextField();
        textField1.setBounds(130, 60, 150, 20);
        textField.setBounds(130, 20, 150, 20);
        add(textField);
        add(textField1);

        // Create the button
        button = new JButton("Submit");
        button.setBounds(100, 160, 100, 30);
        add(button);

        // Set the background color of the form
        getContentPane().setBackground(Color.lightGray);

        // Make the form visible
        setVisible(true);
    }

    public static void main(String[] args) {
    	test1 form = new test1();
    	
    }
}
