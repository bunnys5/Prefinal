package preFinal;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class test3P extends JFrame implements ActionListener {

	private JLabel label;
	private JButton button;
	
	public test3P() {
		
		super("My color chooser A");
		setSize(400, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new GridLayout(2, 1));
		
		label = new JLabel("Choose some color");
		label.setOpaque(true);
		label.setBackground(Color.white);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		
		button = new JButton("Choose Color!");
		button.setBounds(200, 50, 100, 50);
		
		button.addActionListener(this);
		
		add(label);
		add(button);
		
		setVisible(true);
		
		
		
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == button) {
			Color color = JColorChooser.showDialog(this, "Choose color frame", label.getBackground());
			
			if(color != null) {
				label.setBackground(color);
			}
		} 
	}
	
	public static void main(String []args) {
		new test3P();
		
	}

}