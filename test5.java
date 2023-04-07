package preFinal;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;

public class test5 extends JFrame implements MouseListener, MouseMotionListener {
    public test5() {
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
        System.out.println("Mouse clicked at: (" + x + ", " + y + ")");
    }

    public void mousePressed(MouseEvent e) {
        int x = e.getX();
        int y = e.getY();
        System.out.println("Mouse pressed at: (" + x + ", " + y + ")");
    }

    public void mouseReleased(MouseEvent e) {
        int x = e.getX();
        int y = e.getY();
        System.out.println("Mouse released at: (" + x + ", " + y + ")");
    }

    public void mouseMoved(MouseEvent e) {
        int x = e.getX();
        int y = e.getY();
        System.out.println("Mouse moved at: (" + x + ", " + y + ")");
    }

    public void mouseDragged(MouseEvent e) {
        int x = e.getX();
        int y = e.getY();
        System.out.println("Mouse dragged at: (" + x + ", " + y + ")");
    }

    // We need to implement these methods from the MouseListener interface, 
    // but we won't use them in this example.
    public void mouseEntered(MouseEvent e) {}
    public void mouseExited(MouseEvent e) {}

    public static void main(String[] args) {
        new test5();
    }
}

