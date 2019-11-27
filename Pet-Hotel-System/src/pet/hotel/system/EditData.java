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
/**
 *
 * @author Asadur Rahman
 */
public class EditData extends javax.swing.JFrame {
    
    ArrayList<InfoOnReg> Registration;
    ArrayList<InfoOnBooking> Booking;
    ArrayList<InfoOnPkg> Package;
    ArrayList<InfoOnPayment> Payment;
    
    DecimalFormat formatter;
    
     

    /**
     * Creates new form EditData
     */
    public EditData() {
        initComponents();
        this.setLocationRelativeTo(null); // center the form in screen.
        
        formatter = new DecimalFormat("#,####.00");
        
        Registration = new ArrayList<InfoOnReg>(); // initializing the array list
        Booking = new ArrayList<InfoOnBooking>(); // initializing the booking array list
        Package = new ArrayList<InfoOnPkg>(); // initializing the package array list
        Payment = new ArrayList<InfoOnPayment>(); // initializing the payment list
        populateArrayList();
        
        String [] RegistrationArray = new String[Registration.size()];
        for (int i = 0; i < Registration.size(); i++)
        {
            RegistrationArray [i] = Registration.get(i).getCust_Name();
           jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(RegistrationArray));
        }
        
        
        
    }
    
     public void saveRegistrationToFile()
    {
        try
        {
            FileOutputStream file = new FileOutputStream("InfoOnRegistration.dat"); 
            ObjectOutputStream outputFile = new ObjectOutputStream(file);
            
            for (int i = 0; i < Registration.size(); i++ )
            {
                outputFile.writeObject(Registration.get(i)); // Registration is the array list; get(i) takes the objects and saves to file called InfoOnRegistration.dat  
                
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
          try
        {
            FileInputStream file4 = new FileInputStream("InfoOnPayment.dat");
            ObjectInputStream inputFile4 = new ObjectInputStream(file4);
            
            boolean endOfFile = false;
            
            while (!endOfFile )
            {
                 try
                 {
                     Payment.add((InfoOnPayment)inputFile4.readObject());
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
                inputFile4.close();
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
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jTextField1 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Edit / Update / Delete -  Data");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Edit/Update/Delete Data PHS");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(231, 46, 391, -1));

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Choose Customer Name:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(221, 91, -1, -1));

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Customer Address:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(256, 158, -1, -1));
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(367, 152, 255, -1));

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Customer E-mail:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(266, 192, -1, -1));

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(367, 186, 255, -1));

        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Customer Phone Number:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(218, 220, -1, -1));
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(367, 220, 255, -1));

        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Pet Name:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(305, 260, -1, -1));
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(367, 254, 255, -1));

        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Arrival Date:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(298, 288, -1, -1));
        getContentPane().add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(367, 288, 255, -1));

        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Departure Date:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(276, 328, -1, -1));
        getContentPane().add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(367, 322, 255, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/save.png"))); // NOI18N
        jButton1.setText("Save");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(302, 407, -1, -1));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-delete-bin-48.png"))); // NOI18N
        jButton2.setText("Delete");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(474, 407, -1, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(367, 86, 255, -1));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(367, 118, 255, -1));

        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Customer Name:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(268, 118, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/bg2.jpg"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if ( jTextField1.getText().isEmpty() || jTextField2.getText().isEmpty() 
                || jTextField3.getText().isEmpty() || jTextField4.getText().isEmpty()
                || jTextField5.getText().isEmpty() ||  jTextField6.getText().isEmpty() || 
                jTextField7.getText().isEmpty()
                )
        {
            
            JOptionPane.showMessageDialog(null, "Please enter all fields!");
    
        }
        else 
        {
               int selectedIndex = jComboBox1.getSelectedIndex();
               Registration.get(selectedIndex).setCust_Name(jTextField1.getText().trim());
               Registration.get(selectedIndex).setCust_Address(jTextField2.getText().trim());
               Registration.get(selectedIndex).setCust_Email(jTextField3.getText().trim());
               Registration.get(selectedIndex).setCust_Ph_No(Double.parseDouble(jTextField4.getText().trim()));
               Registration.get(selectedIndex).setPet_Name(jTextField5.getText().trim());
               Registration.get(selectedIndex).setArrival_date(jTextField6.getText().trim());
               Registration.get(selectedIndex).setDeparture_date(jTextField7.getText().trim());
               
               saveRegistrationToFile();
               
                   
       
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
       int selectedIndex = jComboBox1.getSelectedIndex(); 
       
       jTextField1.setText(Registration.get(selectedIndex).getCust_Name());
       jTextField2.setText(Registration.get(selectedIndex).getCust_Address());
       jTextField3.setText(Registration.get(selectedIndex).getCust_Email());
       jTextField4.setText(Registration.get(selectedIndex).getCust_Ph_No()+"");
       jTextField5.setText(Registration.get(selectedIndex).getPet_Name());
       jTextField6.setText(Registration.get(selectedIndex).getArrival_date());
       jTextField7.setText(Registration.get(selectedIndex).getDeparture_date());
      
      
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        int selectedIndex = jComboBox1.getSelectedIndex(); 
        Registration.remove(selectedIndex);
        
        saveRegistrationToFile();
        
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(EditData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditData().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    // End of variables declaration//GEN-END:variables
}
