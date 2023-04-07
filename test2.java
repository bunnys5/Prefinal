package preFinal;

import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class test2 extends JFrame {
    private JComboBox<String> comboBox;

    public test2() {
        // Set the title and size of the form
        setTitle("My Form");
        setSize(300, 200);

        // Set the layout to null for custom positioning of components
        setLayout(null);

        // Create the combo box with date formats
        String[] formats = {"yyyy-MM-dd", "dd/MM/yyyy", "MM/dd/yyyy"};
        comboBox = new JComboBox<>(formats);
        comboBox.setBounds(20, 20, 120, 20);
        add(comboBox);

        // Create the label to display the formatted date
        JLabel label = new JLabel();
        label.setBounds(20, 60, 200, 20);
        add(label);

        // Create the button to trigger the date formatting
        JButton button = new JButton("Get Formatted Date");
        button.setBounds(20, 100, 160, 30);
        add(button);

        // Add an action listener to the button to format the date when clicked
        button.addActionListener(e -> {
            String format = (String) comboBox.getSelectedItem();
            SimpleDateFormat dateFormat = new SimpleDateFormat(format);
            String formattedDate = dateFormat.format(new Date());
            label.setText(formattedDate);
        });

        // Make the form visible
        setVisible(true);
    }

    public static void main(String[] args) {
        test2 form = new test2();
    }
}

