import java.awt.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
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
        
        JButton checkMembershipButton=new JButton("Check Membership");
        checkMembershipButton.setBounds(400, 250, 150, 30);
        mainFrame.add(checkMembershipButton);
        

        JButton exportButton=new JButton("Export");
        exportButton.setBounds(450, 300, 150, 30);
        mainFrame.add(exportButton);


        exportButton.addActionListener(e->{
            try(BufferedWriter bw=new BufferedWriter(new FileWriter("GYMPlan.txt"))) {
                if (list.isEmpty()){
                    JOptionPane.showMessageDialog(mainFrame,"ArrayList is Empty");
                }
                for (Membership m : list) {
                    bw.write(m.display()+"\n");
                }
                JOptionPane.showMessageDialog(mainFrame,"Sucessfully Done");
            } catch (IOException ea) {
                System.out.println(ea);
            }
        }
        );



        JButton loadButton=new JButton("Load");
        loadButton.setBounds(300, 300, 150, 30);
        mainFrame.add(loadButton);
         
        

        JTextArea area= new JTextArea();
        JScrollPane displayArea = new JScrollPane(area);
        displayArea.setBounds(50,320 , 500, 300);
        mainFrame.add(displayArea);
        
        addBasicButton.addActionListener(e ->{
            String name= nameField.getText();
            if(!name.matches("[a-zA-Z]+")){
                JOptionPane.showMessageDialog(mainFrame, "Invalid Input", "Error",JOptionPane.ERROR_MESSAGE);
                return;
            }

            double fee=Double.parseDouble(feeField.getText());
            String tempFee=(String)(feeField.getText());
            if(!tempFee.matches("\\d+")){
                    JOptionPane.showMessageDialog(mainFrame,"Invalid fee Input","Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
            int duration = Integer.parseInt(durationField.getText());
            String tempDuration=(String)(durationField.getText());
            
                if(!tempDuration.matches("\\d+")){
                    JOptionPane.showMessageDialog(mainFrame,"Invalid Input","Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }

            String type = (String)typeComboBox.getSelectedItem();
            
            

            BasicMembership basic=new BasicMembership(name, fee, duration, type, duration);
            list.add(basic);

            JOptionPane.showMessageDialog(mainFrame, "Name: "+basic.getName()+"\nFee: "+basic.getFee()+"\nType: "+basic.getType()+"\nDuration: "+basic.getDuration());
        });

        addPremiumButton.addActionListener(e ->{
            String name= nameField.getText();
            double fee=Double.parseDouble(feeField.getText());
            int duration = Integer.parseInt(durationField.getText());
            String type = (String)typeComboBox.getSelectedItem();
            int trainerSlots=Integer.parseInt(trainerSlotField.getText());
            
            PremiumMembership premium=new PremiumMembership(name, fee, duration, type, trainerSlots);
            list.add(premium);

            JOptionPane.showMessageDialog(mainFrame, "Name: "+premium.getName()+"\nFee: "+premium.getFee()+"\nType: "+premium.getType()+"\nDuration: "+premium.getDuration()+"\nTrainer Slots:"+premium.getTrainerSlot());
        });
        
        checkMembershipButton.addActionListener(e->{
            int index=Integer.parseInt(indexField.getText());
            Membership m=list.get(index);
            String plan=(m instanceof BasicMembership)? "Basic Membership":
                        (m instanceof PremiumMembership)? "Premium Membership":"No Type";
            JOptionPane.showMessageDialog(mainFrame, "Type is:"+plan);
                    });

        displayButton.addActionListener(e->{
            area.setText("");

            for (int i = 0; i < list.size(); i++) {
                area.append(i+list.get(i).display()+"\n");
            }
        });





        clearButton.addActionListener(e->{
            nameField.setText("");
            feeField.setText("");
            durationField.setText("");
            sessionField.setText("");
            typeComboBox.setSelectedItem(null);
            trainerSlotField.setText("");
        });

         mainFrame.setVisible(true);



    }
}