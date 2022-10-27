import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Flayout extends JFrame {
    FlowLayout flayout = new FlowLayout(FlowLayout.RIGHT);
    JButton b1 = new JButton("Click ME");
    JButton b2 = new JButton("Click ME");
    JButton b3 = new JButton("Click ME");
    JButton b4 = new JButton("Click ME");
    JButton b5 = new JButton("Click ME");

    Flayout() {
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        b1.setSize(100, 100);
        b2.setSize(100, 100);
        b3.setSize(100, 100);
        b4.setSize(100, 100);
        b5.setSize(100, 100);

        this.add(b1);
        this.add(b2);
        this.add(b3);
        this.add(b4);
        this.add(b5);
        this.setLayout(new FlowLayout());

    }

    public static void main(String[] args) {
        new Flayout();
    }
}
