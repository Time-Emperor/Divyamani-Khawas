import javax.swing.*;
import java.awt.*;
public class StudentGui extends JFrame{
    
    StudentGui(){
        setTitle("Students Information");
        setSize(400, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.WHITE);
    }

    public static void main(String[] args) {
       StudentGui g = new StudentGui();
       g.setVisible(true);
    }
}
