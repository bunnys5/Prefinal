package preFinal;

import javax.swing.*;
import java.awt.*;

public class test8 extends JFrame {

    public test8() {
        super("Graphics2D Example");

        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel() {
            public void paintComponent(Graphics g) {
                super.paintComponent(g);

                Graphics2D g2d = (Graphics2D) g;

                // Draw a string
                g2d.drawString("Hello, Graphics2D!", 20, 20);

                // Draw a line
                g2d.drawLine(20, 40, 100, 40);

                // Draw a rectangle
                g2d.drawRect(20, 60, 80, 40);

                // Fill an ellipse
                g2d.setColor(Color.BLUE);
                g2d.fillOval(20, 120, 80, 40);
            }
        };

        add(panel);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new test8().setVisible(true));
    }
}

