
// java program illustrate JLables 
import javax.swing.*;
import java.awt.*;

public class Jlables extends JFrame {
    private JLabel label = new JLabel("Label 1");
    private JLabel label2 = new JLabel("Label 2");

    Jlables() {
        this.setSize(500, 500);
        this.setLayout(new FlowLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(label);
        this.add(label2);

        this.setVisible(true);
    }

    public static void main(String[] args) {
        // System.out.println("Working..");
        Jlables l1 = new Jlables();

    }
}