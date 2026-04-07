import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;


public class GymGui {
  
    public static void main(String[] args) {
        JFrame mainFrame = new JFrame("Gym Membership Form");
        mainFrame.setSize(620, 700);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setLocationRelativeTo(null);
        mainFrame.getContentPane().setBackground(Color.LIGHT_GRAY);
        mainFrame.setLayout(null);
        ArrayList<Membership> list = new ArrayList<>();
       

        JLabel nameJLabel = new JLabel("Name: ");
        nameJLabel.setBounds(50,40,100,25);
        mainFrame.add(nameJLabel);
        
        JTextField nameField = new JTextField();
        nameField.setBounds(150, 40, 120, 25);
        mainFrame.add(nameField);

        JLabel feeJLabel = new JLabel("Fee: ");
        feeJLabel.setBounds(50,80,100,25);
        mainFrame.add(feeJLabel);
        
        JTextField feeField = new JTextField();
        feeField.setBounds(150, 80, 120, 25);
        mainFrame.add(feeField);

        JLabel durationJLabel = new JLabel("Duration: ");
        durationJLabel.setBounds(50,120,100,25);
        mainFrame.add(durationJLabel);
        
        JTextField durationField = new JTextField();
        durationField.setBounds(150, 120, 120, 25);
        mainFrame.add(durationField);

        JLabel typeJLabel = new JLabel("Type: ");
        typeJLabel.setBounds(50,160,100,25);
        mainFrame.add(typeJLabel);

        String[] types={"Basic", "Premium"};
        JComboBox typeComboBox = new JComboBox<>(types);
        typeComboBox.setBounds(150, 160, 100, 25);
        mainFrame.add(typeComboBox);

        JLabel sessionJLabel = new JLabel("Session: ");
        sessionJLabel.setBounds(50,200,100,25);
        mainFrame.add(sessionJLabel);
        
        JTextField sessionField = new JTextField();
        sessionField.setBounds(150, 200, 120, 25);
        mainFrame.add(sessionField);

        JLabel trainerSlotJLabel = new JLabel("Trainer Slot: ");
        trainerSlotJLabel.setBounds(50,240,100,25);
        mainFrame.add(trainerSlotJLabel);
        
        JTextField trainerSlotField = new JTextField();
        trainerSlotField.setBounds(150, 240, 120, 25);
        mainFrame.add(trainerSlotField);

        JLabel indexJLabel = new JLabel("Index: ");
        indexJLabel.setBounds(50,280,100,25);
        mainFrame.add(indexJLabel);
        
        JTextField indexField = new JTextField();
        indexField.setBounds(150, 280, 120, 25);
        mainFrame.add(indexField);

        JButton addBasicButton=new JButton("Add Basic");
        addBasicButton.setBounds(400, 75, 150, 30);
        mainFrame.add(addBasicButton);

        JButton addPremiumButton=new JButton("Add Premium");
        addPremiumButton.setBounds(400, 125, 150, 30);
        mainFrame.add(addPremiumButton);

        JButton displayButton=new JButton("Display");
        displayButton.setBounds(400, 175, 150, 30);
        mainFrame.add(displayButton);

        JButton clearButton=new JButton("Clear");
        clearButton.setBounds(400, 225, 150, 30);
        mainFrame.add(clearButton);

        JTextArea area= new JTextArea();
        JScrollPane displayArea = new JScrollPane(area);
        displayArea.setBounds(50,320 , 500, 300);
        mainFrame.add(displayArea);
        
        addBasicButton.addActionListener(e ->{
            String name= nameField.getText();
            double fee=Double.parseDouble(feeField.getText());
            int duration = Integer.parseInt(durationField.getText());
            String type = (String)typeComboBox.getSelectedItem();
            
            BasicMembership basic=new BasicMembership(name, fee, duration, type, duration);
            list.add(basic);

            JOptionPane.showMessageDialog(mainFrame, "Name: "+basic.getName()+"\nFee: "+basic.getFee()+"\nType: "+basic.getType()+"\nDuration: "+basic.getDuration());
        });
        
        displayButton.addActionListener(e->{
            area.setText("");

            for (int i = 0; i < list.size(); i++) {
                area.append(i+list.get(i).display()+"\n");
            }
        });

         mainFrame.setVisible(true);



    }
}