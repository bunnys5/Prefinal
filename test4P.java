package preFinal;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.filechooser.FileNameExtensionFilter;

public class test4P extends JFrame implements ActionListener {
	
	private JTextArea textArea;
	private JFileChooser fileChooser;
	
	public test4P() {
        super("File Chooser Demo");

        // Create the text area
        textArea = new JTextArea(20, 40);

        // Create the file chooser
        fileChooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Text files (*.txt)", "txt");
        fileChooser.setFileFilter(filter);
        
        // Create the buttons
        JButton openButton = new JButton("Open");
        openButton.addActionListener(this);
        JButton saveButton = new JButton("Save");
        saveButton.addActionListener(this);

        // Add the components to the frame
        Container contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());
        contentPane.add(new JScrollPane(textArea), BorderLayout.CENTER);
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(openButton);
        buttonPanel.add(saveButton);
        contentPane.add(buttonPanel, BorderLayout.SOUTH);

        // Set the default close operation
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Set the size of the window and make it visible
        setSize(500, 500);
        setVisible(true);
		
	}
	
	public void actionPerformed(ActionEvent event) {
		if(event.getActionCommand().equals("Open")) {
			int returnVal = fileChooser.showOpenDialog(this);
			if(returnVal == JFileChooser.APPROVE_OPTION) {
				File file = fileChooser.getSelectedFile();
				try {
					Scanner scanner = new Scanner(file);
					while (scanner.hasNextLine()) {
						String line = scanner.nextLine();
						textArea.append(line + "\n");
					}
					
				} catch(IOException e) {
					JOptionPane.showMessageDialog(this, "Error writing file: "  + file.getName());
				}
			}
		} else if(event.getActionCommand().equals("Save")) {
			int returnVal = fileChooser.showSaveDialog(this);
			if(returnVal == JFileChooser.APPROVE_OPTION) {
				File file = fileChooser.getSelectedFile();
				try {
					
					PrintWriter writer = new PrintWriter(file);
					writer.print(textArea.getText());
					writer.close();
					
				} catch (IOException e) {
                    JOptionPane.showMessageDialog(this, "Error writing file: " + file.getName(), "Error", JOptionPane.ERROR_MESSAGE);
                }
			}
		}
	
	}
	

	
	
	public static void main(String[] args) {
		new test4P();
	}
}











