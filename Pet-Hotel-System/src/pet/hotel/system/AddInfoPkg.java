/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pet.hotel.system;

import javax.swing.*;
import java.util.*;
import java.io.*;
import java.text.*;


public class AddInfoPkg extends javax.swing.JFrame {

    ArrayList<InfoOnReg> Registration;
    ArrayList<InfoOnBooking> Booking;
    ArrayList<InfoOnPkg> Package;
    
    DecimalFormat formatter;
    
    
    
    public AddInfoPkg() {
        initComponents();
        this.setLocationRelativeTo(null); // center the form in screen.
        
        formatter = new DecimalFormat("#,####.00");
        
        Registration = new ArrayList<InfoOnReg>(); // initializing the array list
        Booking = new ArrayList<InfoOnBooking>(); // initializing the booking array list
        Package = new ArrayList<InfoOnPkg>(); // initializing the package array list
        populateArrayList();
        
        
          String [] RegistrationArray = new String[Registration.size()];
        for (int i = 0; i < Registration.size(); i++)
        {
            RegistrationArray [i] = Registration.get(i).getPet_Type();
           jComboBox6.setModel(new javax.swing.DefaultComboBoxModel<>(RegistrationArray));
        }
        
        String [] BookingArray = new String[Booking.size()];
        for (int i = 0; i < Booking.size(); i++)
        {
            BookingArray [i] = Booking.get(i).getType_of_room();
            jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(BookingArray));
        }
        for (int i = 0; i < Booking.size(); i++)
        {
            BookingArray [i] =  formatter.format(Booking.get(i).getPrice_per_week());
            jComboBox7.setModel(new javax.swing.DefaultComboBoxModel<>(BookingArray));
        }
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Available", "Not Available" }));

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Available", "Not Available" }));

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Available", "Not Available" }));

        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Available", "Not Available" }));
        
        
    }
    public void populateArrayList() // Array method to store data
    {
        try
        {
            FileInputStream file = new FileInputStream("InfoOnRegistration.dat");
            ObjectInputStream inputFile = new ObjectInputStream(file);
            
            boolean endOfFile = false;
            
            while (!endOfFile )
            {
                 try
                 {
                     Registration.add((InfoOnReg)inputFile.readObject());
                 }
                 catch (EOFException e) //end of file exception
                 {
                     endOfFile = true;
                 }
                 catch (Exception f)
                 {
                     JOptionPane.showMessageDialog(null, f.getMessage());
                 }
            }
                inputFile.close();
        }
        catch (IOException e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        
        try
        {
            FileInputStream file2 = new FileInputStream("InfoOnBooking.dat");
            ObjectInputStream inputFile2 = new ObjectInputStream(file2);
            
            boolean endOfFile = false;
            
            while (!endOfFile )
            {
                 try
                 {
                     Booking.add((InfoOnBooking)inputFile2.readObject());
                 }
                 catch (EOFException e) //end of file exception
                 {
                     endOfFile = true;
                 }
                 catch (Exception f)
                 {
                     JOptionPane.showMessageDialog(null, f.getMessage());
                 }
            }
                inputFile2.close();
        }
        catch (IOException e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
          try
        {
            FileInputStream file = new FileInputStream("InfoOnPackage.dat");
            ObjectInputStream inputFile = new ObjectInputStream(file);
            
            boolean endOfFile = false;
            
            while (!endOfFile )
            {
                 try
                 {
                     Package.add((InfoOnPkg)inputFile.readObject());
                 }
                 catch (EOFException e) //end of file exception
                 {
                     endOfFile = true;
                 }
                 catch (Exception f)
                 {
                     JOptionPane.showMessageDialog(null, f.getMessage());
                 }
            }
                inputFile.close();
        }
        catch (IOException e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    
    } 
     public void savePackagingToFile()
    {
        try
        {
            FileOutputStream file = new FileOutputStream("InfoOnPackage.dat"); 
            ObjectOutputStream outputFile = new ObjectOutputStream(file);
            
            for (int i = 0; i < Package.size(); i++ )
            {
                outputFile.writeObject(Package.get(i)); // Registration is the array list; get(i) takes the objects and saves to file called InfoOnRegistration.dat  
                
            }
            outputFile.close(); // closes the file
            
            JOptionPane.showMessageDialog(null, "Successfully saved!"); // when the file closes shows the message "File has been successfully saved". 
            this.dispose(); // closes the window after showing the above message.
        }   
        catch (IOException e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        Save = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        jComboBox4 = new javax.swing.JComboBox<>();
        jComboBox5 = new javax.swing.JComboBox<>();
        jComboBox6 = new javax.swing.JComboBox<>();
        jComboBox7 = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        Cust_Name = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Add Information on Package");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Information on Package");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(263, 44, 314, -1));

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Fill up the following details:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 84, 220, -1));

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Pet Type:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(263, 130, -1, -1));

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Type of Room:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(233, 162, -1, -1));

        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Grooming:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(254, 194, -1, -1));

        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Toys:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(283, 226, -1, -1));

        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Food:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(281, 258, -1, -1));

        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Vaccine:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(266, 290, -1, -1));

        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Price Per Week (RM):");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(196, 322, -1, -1));

        Save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/save.png"))); // NOI18N
        Save.setText("Save");
        Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveActionPerformed(evt);
            }
        });
        getContentPane().add(Save, new org.netbeans.lib.awtextra.AbsoluteConstraints(357, 416, -1, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 157, 257, -1));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 189, 257, -1));

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 221, 257, -1));

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(jComboBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 253, 257, -1));

        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(jComboBox5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 285, 257, -1));

        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(jComboBox6, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 125, 257, -1));

        jComboBox7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(jComboBox7, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 317, 257, -1));

        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Customer Name:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(217, 355, -1, -1));

        Cust_Name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cust_NameActionPerformed(evt);
            }
        });
        getContentPane().add(Cust_Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 349, 257, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/bg5.jpg"))); // NOI18N
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, -1, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/bg5.jpg"))); // NOI18N
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveActionPerformed
        // TODO add your handling code here:
        
         if (   Cust_Name.getText().isEmpty() )
        {
            
            JOptionPane.showMessageDialog(null, "Please enter all fields!");
    
        }
         else 
         {
        
                    String pettype = (String) jComboBox6.getSelectedItem();
                    String typeOfRoom = (String) jComboBox1.getSelectedItem();
                    String grooming = (String) jComboBox2.getSelectedItem();
                    String toys = (String) jComboBox3.getSelectedItem();
                    String food = (String) jComboBox4.getSelectedItem();
                    String vaccine = (String) jComboBox5.getSelectedItem();
                    String price_p_week = (String) jComboBox7.getSelectedItem();
                    String cust_name = Cust_Name.getText().trim();
        
                    InfoOnPkg infoonpackaging = new  InfoOnPkg(pettype, typeOfRoom, grooming, toys, food, vaccine,cust_name, Double.parseDouble(price_p_week)); 
                    Package.add(infoonpackaging);
                    savePackagingToFile();
                   
         }
        
    }//GEN-LAST:event_SaveActionPerformed

    private void Cust_NameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cust_NameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Cust_NameActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AddInfoPkg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddInfoPkg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddInfoPkg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddInfoPkg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddInfoPkg().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Cust_Name;
    private javax.swing.JButton Save;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JComboBox<String> jComboBox6;
    private javax.swing.JComboBox<String> jComboBox7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
