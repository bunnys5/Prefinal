package preFinal;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.filechooser.FileNameExtensionFilter;

public class test7P extends JFrame {

	private JLabel imageLabel;
	
	public test7P() {
		
		
		// Set up the form
		super("Image Chooser");
		 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setSize(1000, 1000);
		
		// Set up the image label
		imageLabel = new JLabel();
		imageLabel.setHorizontalAlignment(JLabel.CENTER);
		imageLabel.setVerticalAlignment(JLabel.CENTER);
		add(imageLabel, BorderLayout.CENTER);
		
		// Set up file chooser button
		JButton chooseButton = new JButton("Choose Image");
		chooseButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFileChooser chooser = new JFileChooser();
				FileNameExtensionFilter filter = new FileNameExtensionFilter(
					"Image", "jpg", "jpeg", "png", "gif");
				chooser.setFileFilter(filter);
				int returnVal = chooser.showOpenDialog(test7P.this);
				if (returnVal == JFileChooser.APPROVE_OPTION) {
					File file = chooser.getSelectedFile();
					try {
						Image image = Toolkit.getDefaultToolkit().getImage(file.getAbsolutePath());
						
					} catch(Exception ex) {
						JOptionPane.showMessageDialog(test7P.this, "Error loading image: " + ex.getMessage());
					}
				}
			}
		});
		add(chooseButton, BorderLayout.SOUTH);
		
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new test7P().setVisible(true);
			}
		});
	}
}
