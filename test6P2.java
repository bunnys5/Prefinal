package preFinal;

import java.awt.FlowLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class test6P2 extends JFrame implements KeyListener {
    
    private JLabel charLabel;
    private JLabel codeLabel;
    private JLabel modLabel;
    private JLabel modTextLabel;
    
    public test6P2() {
        super("Key Event Demo");
        setLayout(new FlowLayout());
        
        charLabel = new JLabel("Key Char:");
        add(charLabel);
        
        codeLabel = new JLabel("Key Code:");
        add(codeLabel);
        
        modLabel = new JLabel("Modifiers:");
        add(modLabel);
        
        modTextLabel = new JLabel("Modifiers Text:");
        add(modTextLabel);
        
        addKeyListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 200);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    
    @Override
    public void keyTyped(KeyEvent e) {
        char c = e.getKeyChar();
        charLabel.setText("Key Char: " + c);
        
        int mods = e.getModifiers();
        String modsText = KeyEvent.getKeyModifiersText(mods);
        modLabel.setText("Modifiers: " + mods);
        modTextLabel.setText("Modifiers Text: " + modsText);
    }
    
    @Override
    public void keyPressed(KeyEvent e) {
        int code = e.getKeyCode();
        codeLabel.setText("Key Code: " + code);
    }
    
    @Override
    public void keyReleased(KeyEvent e) {
        // do nothing
    }
    
    public static void main(String[] args) {
        new test6P2();
    }
}

