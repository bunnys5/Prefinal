package preFinal;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;

public class test5P extends JFrame implements MouseListener, MouseMotionListener {
	
	public test5P() {
		super("Mouse Form");
		addMouseListener(this);
		addMouseMotionListener(this);
		
		setSize(400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
	}
	
	public void mouseClicked(MouseEvent e) {
		int x = e.getX();
		int y = e.getY();
		System.out.println("Mouse Clicked at: " + x + "y: " + y);
		
	}
	
	public void mousePressed(MouseEvent e) {
		int x = e.getX();
		int y = e.getY();
		System.out.println("Mouse Pressed at: " + x + "y: " + y);
		
	}
	
	public void mouseReleased(MouseEvent e) {
		int x = e.getX();
		int y = e.getY();
		System.out.println("Mouse Released at: " + x + "y: " + y);
		
	}
	
	public void mouseDragged(MouseEvent e) {
		int x = e.getX();
		int y = e.getY();
		System.out.println("Mouse Dragged at: " + x + "y: " + y);
		
	}
	
	public void mouseMoved(MouseEvent e) {
		int x = e.getX();
		int y = e.getY();
		System.out.println("Mouse Moved at: " + x + "y: " + y);
	}
	
	public void mouseExited(MouseEvent e) {
		
	}
	
	public void mouseEntered(MouseEvent e) {
		
	}
	
	
	
	public static void main(String []args) {
		new test5P();
	}
}
