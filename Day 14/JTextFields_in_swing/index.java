import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.FlowLayout;

public class index extends JFrame{

    index(){
        this.setLayout(new FlowLayout());
        JTextField name = new JTextField(20);
        JTextField midName = new JTextField(20);
        JTextField lastName = new JTextField(20);

        name.setText("Enter name");
        midName.setText("Enter Midname");
        lastName.setText("Enter Last Name");
        this.setSize(500, 500);

        this.add(name);
        this.add(midName);
        this.add(lastName);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    public static void main(String[] args) {
        // System.out.println("Working...");
        new index();
    }
}