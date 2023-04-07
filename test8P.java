package preFinal;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class test8P extends JFrame{
	
	public test8P() {
		super("Graphics2D Example");
		
		setSize(400, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		JPanel panel = new JPanel() {
			public void paintComponent(Graphics g) {
				super.paintComponent(g);
				
				Graphics2D g2d = (Graphics2D) g;
				
				// Draw a string
				g2d.drawString("Hello, Graphics2D", 20, 20);
				
				g2d.drawLine(20, 40, 100, 40);
				
				g2d.drawRect(20, 60, 80, 40);
				
				g2d.setColor(Color.blue);
				g2d.fillOval(20, 120, 80, 40);
				
			}
		};
		
		add(panel);
		
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(()-> new test8P().setVisible(true));
	}
	
	
}

