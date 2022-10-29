import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.*;

public class Addition {

    public static void main(String args[]) {
        // System.out.println("Working..");
        new Gui();
    }
}

class Gui extends JFrame implements ActionListener {
    JTextField n1;
    JTextField n2;
    JButton addBtn;
    JLabel l1, l2;

    Gui() {
        try {
            n1 = new JTextField(10);
            n2 = new JTextField(10);
            addBtn = new JButton("Add Numbers");
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setSize(500, 500);
            this.setLayout(new FlowLayout());
            n1.setSize(100, 50);
            n2.setSize(100, 50);

            this.add(n1);
            this.add(n2);
            this.add(addBtn);
            // here we need to pass the object of ActionListener
            // but ActionListner is not class it is interface and we
            // cannnot create any instance of it.
            // thats why we need find a class that implements action listener
            // or we will implement our class with ActionListener.
            // addBtn.addActionListener();

            this.setVisible(true);
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }

    }
}