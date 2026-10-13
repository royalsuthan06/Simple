import javax.swing.*;
import java.awt.event.*;

public class SwingDemo {
    public static void main(String[] args) {
        // 1. Create Frame (window)
        JFrame f = new JFrame("Swing Example");

        // 2. Create Label and Button
        JLabel label = new JLabel("Click the button");
        label.setBounds(50, 50, 200, 30);

        JButton btn = new JButton("Click Me");
        btn.setBounds(50, 100, 100, 30);

        // 3. Add Click Action
        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("Hello, Swing!");
            }
        });

        // 4. Add components to Frame
        f.add(label);
        f.add(btn);

        // 5. Window settings
        f.setSize(300, 250);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}