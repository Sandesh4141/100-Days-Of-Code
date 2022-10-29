import javax.swing.*;;

public class FramesInSwing2 {
    public static void main(String[] args) {
        // System.out.println("Hello");
        new MyFrame();
    }

}

class MyFrame extends JFrame {
    JButton btn = new JButton("Click Me");
    JButton btn1 = new JButton("Click Me");
    JButton btn2 = new JButton("Click Me");
    JButton btn3 = new JButton("Click Me");
    JButton btn4 = new JButton("Click Me");

    JLabel label = new JLabel("Label...");
    JPanel jPanel = new JPanel();

    MyFrame() {
        this.setSize(450, 400);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setVisible(true);
        btn.setSize(100, 140);
        this.add(btn);
        this.setTitle("Sandesh Pawar Created this frame");
        this.add(label);
        this.add(jPanel);

        jPanel.add(btn);
        jPanel.add(btn1);
        jPanel.add(btn2);
        jPanel.add(btn3);
        jPanel.add(btn4);
        jPanel.add(btn4);

    }

}