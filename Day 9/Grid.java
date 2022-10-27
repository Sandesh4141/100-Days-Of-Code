import java.awt.*;
import javax.swing.*;

public class Grid extends JFrame{
    JButton btn1 = new JButton("Button 1");
    JButton btn2 = new JButton("Button 2");
    JButton btn3 = new JButton("Button 3");
    JButton btn4 = new JButton("Button 4");
    JButton btn5 = new JButton("Button 5");
    JButton btn6 = new JButton("Button 6");

    ImageIcon icon = new ImageIcon();
    Object object = new Object();
    
    Grid(){
        this.setSize(500, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(btn1);
        this.add(btn2);
        this.add(btn3);
        this.add(btn4);
        this.add(btn5);
        this.add(btn6);
        this.setLayout(new GridLayout(2,4));
        this.setVisible(true);
    }
    public static void main(String[] args) {
        System.out.println("Working....");
        // new Grid();

    }
}