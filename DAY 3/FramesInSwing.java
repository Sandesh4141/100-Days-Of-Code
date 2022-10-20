import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class FramesInSwing{
    public static void main(String[] args) {
        // System.out.println("Working..");

        // creating frame using instance
        JFrame frame = new JFrame("Frames title goes here");
        ImageIcon image = new ImageIcon("./icon.jpg");
        frame.setSize(400, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setResizable(true);
        // frame.setTitle("My First Frame in Java Swing");
        // frame.setBackground();
        frame.setIconImage(image.getImage());
        frame.getContentPane().setBackground(new Color(64, 42, 243));
    }

}

