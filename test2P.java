package preFinal;

import javax.swing.*;
import java.awt.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class test2P extends JFrame {
	
	private JComboBox<String> comboBox;
	public test2P() {
		
		super("My date format");
		setSize(300, 300);
		setLayout(null);
		
		String[] format = {"yyyy/MM/dd", "MM/dd/yyyy", "dd/MM/yyyy"};
		comboBox = new JComboBox<>(format);
		comboBox.setBounds(20, 20, 100, 30);
		add(comboBox);
		
		JLabel label = new JLabel();
		label.setBounds(20, 60 ,100 ,20);
		add(label);
		
		JButton button = new JButton("Get Date format");
		button.setBounds(20, 100, 100, 20);
		button.addActionListener(e->{
			String formats = (String) comboBox.getSelectedItem();
			SimpleDateFormat dateFormat = new SimpleDateFormat(formats);
			String formattedDate = dateFormat.format(new Date());
			label.setText(formattedDate);
			
		});
		
		setVisible(true);
		
	}
	
	public static void main(String[] args ) {
		new test2P();
		
	}
	
}