package workshop;
import java.awt.*;

import javax.swing.SwingUtilities;

public class WorkshopLauncher {
    public static void main(String[] args) {
        Student s1=new Student("111", "Divyamani Khawas", "BIT", "Male","2027:01:01","Itahari International College");
        Student s2=new Student("112", "Biraj Shrestha", "BIT", "Male","2027:01:01","Itahari International College");
        Student s3=new Student("113", "Yodin Raya", "BIT", "Male","2027:01:01","Itahari International College");

        SwingUtilities.invokeLater(()->{
            IDCardWindow w1 = new IDCardWindow(s1);
            w1.setVisible(true);

            IDCardWindow w2 =new IDCardWindow(s2);
            w2.setVisible(true);

            IDCardWindow w3 =new IDCardWindow(s3);
            Point p =w1.getLocation();
            w2.setLocation(p.x + 40, p.y + 40);
            w3.setVisible(true);
        });
    }

}
