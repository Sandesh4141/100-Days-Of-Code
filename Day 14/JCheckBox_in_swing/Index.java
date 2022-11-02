import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class Index extends JFrame {

    Index() {
        // FlowLayout layout = new FlowLayout();
        JCheckBox c1 = new JCheckBox("Sandesh", false);
        JCheckBox c2 = new JCheckBox("Sudesh", false);
        JCheckBox c3 = new JCheckBox("Ajay", false);
        JCheckBox c4 = new JCheckBox("DS", false);
        JCheckBox c5 = new JCheckBox("AbhiShek", false);
        c1.setFont(new Font("Arial", Font.BOLD, 17));
        c2.setFont(new Font("Arial", Font.BOLD, 17));
        c3.setFont(new Font("Arial", Font.BOLD, 17));
        c4.setFont(new Font("Arial", Font.BOLD, 17));
        c5.setFont(new Font("Arial", Font.BOLD, 17));
        this.add(c1);
        this.add(c2);
        this.add(c3);
        this.add(c4);
        this.add(c5);
        this.setSize(500, 500);
        this.setBackground(new Color(190, 13, 44));
        this.setLayout(new GridLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

    }

    public static void main(String[] args) {

        new Index();
    }
}