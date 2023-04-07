package preFinal;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class test1P extends JFrame {
	
	private JLabel label;
	private JLabel label2;
	private JTextField textField;
	private JTextField textField2;
	private JButton button;
	
	public test1P() {
		
		//Set the title frame
		super("My form A");
		setSize(300, 300);
		setLayout(null);
		
		label = new JLabel("Name");
		label.setBounds(30, 30, 100, 30);
		add(label);
		
		label2 = new JLabel("Surname");
		label2.setBounds(30, 90, 100, 30);
		add(label2);
		
		textField = new JTextField();
		textField.setBounds(100, 30, 100, 30);
		add(textField);
		
		textField2 = new JTextField();
		textField2.setBounds(100, 90, 100, 30);
		add(textField2);
		
		
		
		button = new JButton("Submit");
		button.setBounds(100, 200, 100, 30);
		add(button);
		
		getContentPane().setBackground(Color.orange);
		
		
		
		
		
		setVisible(true);
		
	}
	
	public static void main(String []args) {
		new test1P();
	}
	
	
}

