import javax.swing.JButton;
import javax.swing.JFrame;

public class FramesInSwing extends JFrame {
    JFrame frame;
    JButton btn;

    FramesInSwing() {
        this.setSize(400, 500);
        this.setVisible(true);
        this.add(btn);
        btn.setSize(100, 200);

    }

    public static void main(String[] args) {
        new FramesInSwing();

    }
}
