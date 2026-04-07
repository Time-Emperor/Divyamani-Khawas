import java.awt.*;
import javax.swing.*;

public class Layout{
    public static void main(String[] args) {
        JFrame frame=new JFrame("C3"); //creating the frame obj
        frame.setSize(500, 450);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.getContentPane().setBackground(Color.LIGHT_GRAY);
        frame.setLayout(null);

        //panel1
        JPanel panel1=new JPanel();
        panel1.setLayout(null);
        panel1.setBounds(30, 30, 420, 350);
        panel1.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3)); //set border
        panel1.setBackground(Color.WHITE); //set the backeground to the panel1

        JLabel idLabel=new JLabel("Student ID");
        idLabel.setBounds(50, 30, 100, 25);
        panel1.add(idLabel);

        JTextField idTextField=new JTextField();
        idTextField.setBounds(150, 30, 200, 25);
        panel1.add(idTextField);

        JLabel nameLabel=new JLabel("Name");
        nameLabel.setBounds(50, 70, 100, 25);
        panel1.add(nameLabel);

        JTextField nameTextField=new JTextField();
        nameTextField.setBounds(150, 70, 200, 25);
        panel1.add(nameTextField);

        
        JLabel courseLabel=new JLabel("Course");
        courseLabel.setBounds(50, 110, 100, 25);
        panel1.add(courseLabel);

        String [] courses={"BIT", "BBA"};
        JComboBox<String> box=new JComboBox<>(courses);
        box.setBounds(150, 110, 200, 25);
        panel1.add(box);

           
        JLabel genderLabel=new JLabel("Gender");
        genderLabel.setBounds(50, 150, 100, 25);
        panel1.add(genderLabel);

        JRadioButton maleButton=new JRadioButton("Male");
        maleButton.setBounds(150, 150, 70, 25);
        panel1.add(maleButton);

        JRadioButton femaleButton=new JRadioButton("Female");
        femaleButton.setBounds(250, 150, 70, 25);
        panel1.add(femaleButton);

        ButtonGroup group=new ButtonGroup();
        group.add(femaleButton);
        group.add(maleButton);

          JLabel descLabel=new JLabel("Desc");
        descLabel.setBounds(50, 190, 100, 25);
        panel1.add(descLabel);

        JTextArea area=new JTextArea();
        JScrollPane pane=new JScrollPane(area);
        pane.setBounds(150, 190, 200, 50);
        panel1.add(pane);

        JButton saveButton=new JButton("Save");
        saveButton.setBounds(100, 280, 80, 30);
        panel1.add(saveButton);
        
        saveButton.addActionListener(e -> {
            String id = idTextField.getText();
            if (!id.matches("\\d+")) {
                JOptionPane.showMessageDialog(frame, "Please enter on the digits", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            String name = nameTextField.getText();

            String course = (String) box.getSelectedItem();

            String gender = "";
            if (maleButton.isSelected()) {
                gender = "male";
            } else if (femaleButton.isSelected()) {
                gender = "female";
            }
            String areas = area.getText();

            if (name.isEmpty() || id.isEmpty() || course.isEmpty()) {
                JOptionPane.showMessageDialog(frame, "Please filled all the details", "Error",
                        JOptionPane.ERROR_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(frame, "Student ID : " + id +
                        "\nName : " + name + "\nCourse : " + course + "\nGender : " + gender + "\nDesc : " + areas);
            }

        });
        JButton cancelButton=new JButton("Cancel");
        cancelButton.setBounds(250, 280, 80, 30);
        panel1.add(cancelButton);
        
        





    





      



        frame.add(panel1);
        //at last
        frame.setVisible(true);
        

    }

}