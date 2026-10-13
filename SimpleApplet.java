import java.applet.Applet;
import java.awt.Graphics;

/*
<applet code="SimpleApplet.class" width="300" height="200">
</applet>
*/

public class SimpleApplet extends Applet {
    // paint method is called automatically to display graphics/text
    public void paint(Graphics g) {
        g.drawString("Hello, Welcome to Applet!", 50, 100);
    }
}