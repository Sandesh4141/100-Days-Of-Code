import javax.swing.*;

public class tempCodeRunnerFile extends JFrame {
    tempCodeRunnerFile() {
        ImageIcon image = new ImageIcon("icon.jpg");
        this.setSize(500, 455);
        this.setVisible(true);
        this.setTitle("Creation Of Jframe using inheritance");
        this.setIconImage(image.getImage());
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        tempCodeRunnerFile runFile = new tempCodeRunnerFile();

    }
}