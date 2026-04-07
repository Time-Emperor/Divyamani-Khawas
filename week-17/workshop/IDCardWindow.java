package workshop;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class IDCardWindow extends JFrame {
    public IDCardWindow(Student student) {
        super(student.getname() + "'- ID Card");
        setSize(500, 320);
        setLocationRelativeTo(null);
        setResizable(false);
       add(new JLabel(student.toHtmlCard(),
        SwingConstants.CENTER));
    
    }
}
