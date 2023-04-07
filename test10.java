package preFinal;

import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class test10 extends JFrame implements ActionListener {
    private static final long serialVersionUID = 1L;
    private CardLayout cardLayout;
    private JPanel cardPanel;
    private JMenuItem menuItem1, menuItem2, menuItem3;

    public test10() {
        super("Swing Form Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(new Dimension(400, 300));

        // create menu bar and menu items
        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("Forms");
        menuItem1 = new JMenuItem("Form 1");
        menuItem2 = new JMenuItem("Form 2");
        menuItem3 = new JMenuItem("Form 3");

        // add menu items to menu
        menu.add(menuItem1);
        menu.add(menuItem2);
        menu.add(menuItem3);

        // add menu to menu bar
        menuBar.add(menu);

        // create card layout and panel
        cardLayout = new CardLayout();
        cardPanel = new JPanel(cardLayout);

        // create three panels for three forms
        JPanel panel1 = new JPanel();
        panel1.add(new JLabel("Form 1"));

        JPanel panel2 = new JPanel();
        panel2.add(new JLabel("Form 2"));

        JPanel panel3 = new JPanel();
        panel3.add(new JLabel("Form 3"));

        // add three panels to card panel
        cardPanel.add(panel1, "1");
        cardPanel.add(panel2, "2");
        cardPanel.add(panel3, "3");

        // add menu items action listeners
        menuItem1.addActionListener(this);
        menuItem2.addActionListener(this);
        menuItem3.addActionListener(this);

        // add menu bar and card panel to frame
        setJMenuBar(menuBar);
        getContentPane().add(cardPanel);

        setVisible(true);
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> new test10());
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == menuItem1) {
            cardLayout.show(cardPanel, "1");
        } else if (e.getSource() == menuItem2) {
            cardLayout.show(cardPanel, "2");
        } else if (e.getSource() == menuItem3) {
            cardLayout.show(cardPanel, "3");
        }
    }
}
