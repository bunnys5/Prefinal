package preFinal;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.*;

public class test7 extends JFrame {
    private JLabel imageLabel;

    public test7() {
        // Set up the form
        setTitle("Image Chooser");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);

        // Set up the image label
        imageLabel = new JLabel();
        imageLabel.setHorizontalAlignment(JLabel.CENTER);
        imageLabel.setVerticalAlignment(JLabel.CENTER);
        add(imageLabel, BorderLayout.CENTER);

        // Set up the file chooser button
        JButton chooseButton = new JButton("Choose Image");
        chooseButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JFileChooser chooser = new JFileChooser();
                FileNameExtensionFilter filter = new FileNameExtensionFilter(
                    "images", "jpg", "jpeg", "png", "gif");
                chooser.setFileFilter(filter);
                int returnVal = chooser.showOpenDialog(test7.this);
                if (returnVal == JFileChooser.APPROVE_OPTION) {
                    File file = chooser.getSelectedFile();
                    try {
                        Image image = Toolkit.getDefaultToolkit().getImage(file.getAbsolutePath());
                        ImageIcon icon = new ImageIcon(image);
                        imageLabel.setIcon(icon);
                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(test7.this, "Error loading image: " + ex.getMessage());
                    }
                }
            }
        });
        add(chooseButton, BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new test7().setVisible(true);
            }
        });
    }
}
