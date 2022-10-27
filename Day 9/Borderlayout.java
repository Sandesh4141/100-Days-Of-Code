import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.border.Border;

public class Borderlayout extends JFrame{
    JFrame jFrame = new JFrame();

    JButton b1 = new JButton("Click Me");
    JButton b2 = new JButton("Click Me");
    JButton b3 = new JButton("Click Me");
    JButton b4 = new JButton("Click Me");
    JButton b5 = new JButton("Click Me");

    Borderlayout(){
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.add(b1, BorderLayout.EAST);
        this.add(b2, BorderLayout.SOUTH);
        this.add(b3, BorderLayout.NORTH);
        this.add(b4, BorderLayout.CENTER);
        this.add(b5, BorderLayout.WEST);
        
    }
    public static void main(String[] args) {
       new Borderlayout();
    }
}
