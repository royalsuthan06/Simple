import java.awt.*;
import java.awt.event.*;

public class KeyDemo extends Frame implements KeyListener {
    Label lbl;

    KeyDemo() {
        // Label to show the key status
        lbl = new Label("Press any key...");
        lbl.setBounds(50, 100, 200, 30);
        add(lbl);

        // Register KeyListener
        addKeyListener(this);

        // Frame properties
        setSize(300, 250);
        setLayout(null);
        setVisible(true);
    }

    // Triggered when a key is pressed and released
    public void keyTyped(KeyEvent e) {
        lbl.setText("Key Typed: " + e.getKeyChar());
    }

    // Required by KeyListener interface
    public void keyPressed(KeyEvent e) {}
    public void keyReleased(KeyEvent e) {}

    public static void main(String[] args) {
        new KeyDemo();
    }
}