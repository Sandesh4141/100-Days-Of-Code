// package JTextArea_in_swing;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import java.awt.FlowLayout;

public class TextAreaSwing extends JFrame {
    TextAreaSwing() {
        // can give rows and colums as input -> for size
        this.setLayout(new FlowLayout());
        JTextArea feedback = new JTextArea("Enter Feedback here", 10, 20);
        this.add(feedback);
        this.setSize(500, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

    }

    public static void main(String[] args) {
        new TextAreaSwing();
    }
}
