import java.awt.*;
import java.awt.event.*;

public class MouseDemo extends Frame implements MouseListener {
    Label lbl;

    MouseDemo() {
        lbl = new Label("Click inside the window");
        lbl.setBounds(50, 100, 200, 30);
        add(lbl);

        addMouseListener(this);

        setSize(300, 250);
        setLayout(null);
        setVisible(true);
    }

    // Handles mouse click
    public void mouseClicked(MouseEvent e) {
        lbl.setText("Mouse Clicked at (" + e.getX() + ", " + e.getY() + ")");
    }

    // Required by MouseListener interface
    public void mousePressed(MouseEvent e) {}
    public void mouseReleased(MouseEvent e) {}
    public void mouseEntered(MouseEvent e) {}
    public void mouseExited(MouseEvent e) {}

    public static void main(String[] args) {
        new MouseDemo();
    }
}