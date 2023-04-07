package preFinal;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class test3 extends JFrame implements ActionListener {

    private JLabel label;
    private JButton button;

    public test3() {
        // Set up the JFrame
        super("Color Chooser Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 200);
        setLayout(new GridLayout(2, 1));

        // Create the label and button
        label = new JLabel("Choose a color!");
        label.setOpaque(true);
        label.setBackground(Color.WHITE);
        label.setHorizontalAlignment(SwingConstants.CENTER);

        button = new JButton("Choose Color");
        button.setBounds(200, 50, 100, 50);
        
        button.addActionListener(this);

        // Add the components to the JFrame
        add(label);
        add(button);

        // Show the JFrame
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            // Open the color chooser dialog
            Color color = JColorChooser.showDialog(this, "Choose a color", label.getBackground());

            // Update the label's background color to the selected color
            if (color != null) {
                label.setBackground(color);
            }
        }
    }

    public static void main(String[] args) {
        new test3();
    }

}

