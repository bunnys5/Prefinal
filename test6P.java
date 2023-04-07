package preFinal;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class test6P extends JPanel implements KeyListener {
	
	public test6P() {
		
		setPreferredSize(new Dimension(500, 300));
		setBackground(Color.cyan);
		setOpaque(true);
		
		JTextArea textArea = new JTextArea(10, 30);
		textArea.addKeyListener(this);
		add(textArea);
		
		
	}
	
	public static void main(String[] args) {
		JFrame frame = new JFrame("Test05A");
		frame.setContentPane(new test6P());
		
		frame.pack();
		frame.setVisible(true);
		
	}
	
	public void keyTyped(KeyEvent e) {
		System.out.println("keyTyped()");
		char keyChar = e.getKeyChar();
		System.out.println("keyChar:" + keyChar);
		int keyCode = e.getKeyCode();
		System.out.println("keyCode:" + keyCode);
		int modifier = e.getModifiers();
		System.out.println("modifier:" + modifier);
		String modifierText = e.getKeyModifiersText(modifier);
		System.out.println("modifierText:" + modifierText);
		}
	
	public void keyPressed(KeyEvent e) {
		System.out.println("keyTyped()");
		
	}
	
	public void keyReleased(KeyEvent e) {
		System.out.println("keyTyped()");
	}

}
