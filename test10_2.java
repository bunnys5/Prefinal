package preFinal;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class test10_2 extends JFrame implements ActionListener {
    
    // Declare the different cards to display
    private JPanel cardPanel;
    private JPanel form1Card;
    private JPanel form2Card;
    
    // Declare the menu bar and menu items
    private JMenuBar menuBar;
    private JMenu menu;
    private JMenuItem form1Item;
    private JMenuItem form2Item;
    
    public test10_2() {
        // Set up the frame
        setTitle("Swing Form Example");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        // Set up the menu bar
        menuBar = new JMenuBar();
        menu = new JMenu("Forms");
        form1Item = new JMenuItem("Form 1");
        form2Item = new JMenuItem("Form 2");
        form1Item.addActionListener(this);
        form2Item.addActionListener(this);
        menu.add(form1Item);
        menu.add(form2Item);
        menuBar.add(menu);
        setJMenuBar(menuBar);
        
        // Set up the card layout
        cardPanel = new JPanel(new CardLayout());
        form1Card = new JPanel();
        form1Card.add(new JLabel("This is Form 1"));
        form2Card = new JPanel();
        form2Card.add(new JLabel("This is Form 2"));
        cardPanel.add(form1Card, "form1");
        cardPanel.add(form2Card, "form2");
        add(cardPanel);
        
        // Show the initial form
        CardLayout cardLayout = (CardLayout) cardPanel.getLayout();
        cardLayout.show(cardPanel, "form1");
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == form1Item) {
            CardLayout cardLayout = (CardLayout) cardPanel.getLayout();
            cardLayout.show(cardPanel, "form1");
        } else if (e.getSource() == form2Item) {
            CardLayout cardLayout = (CardLayout) cardPanel.getLayout();
            cardLayout.show(cardPanel, "form2");
        }
    }
    
    public static void main(String[] args) {
    	test10_2 example = new test10_2();
        example.setVisible(true);
    }
}
