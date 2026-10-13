import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

/* <applet code="FactApplet.class" width="250" height="150"></applet> */

public class FactApplet extends Applet implements ActionListener {
    TextField t = new TextField(5);
    Button b = new Button("Compute");
    int ans = 1;

    public void init() {
        add(t);
        add(b);
        b.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        int n = Integer.parseInt(t.getText());
        ans = 1;
        for (int i = 1; i <= n; i++) ans *= i;
        repaint();
    }

    public void paint(Graphics g) {
        g.drawString("Factorial: " + ans, 20, 80);
    }
}