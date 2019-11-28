/* Asadur Rahman (SUKD1702099)
 * Dibakar Sutra Dhar ()
 * Nandita Dhanda ()
 * Abdourahmane Diallo ()
 * Mohamed Abdellah Abdelhag ()
 * Ahmed Aref Ahmed ()
 */
package pet.hotel.system;

import javax.swing.*;
import java.util.*;
import java.io.*;


public class AddInfoBooking extends javax.swing.JFrame {
    
    ArrayList<InfoOnReg> Registration;
    ArrayList<InfoOnBooking> Booking;

    /**
     * Creates new form AddInfoBooking
     */
    public AddInfoBooking() {
        initComponents();
        this.setLocationRelativeTo(null); // center the form in screen.
        Registration = new ArrayList<InfoOnReg>(); // initializing the array list
        Booking = new ArrayList<InfoOnBooking>(); // initializing the booking array list
        populateArrayList();
        
        String [] RegistrationArray = new String[Registration.size()];
        for (int i = 0; i < Registration.size(); i++)
        {
            RegistrationArray [i] = Registration.get(i).getPet_Type();
           jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(RegistrationArray));
        }
        
        for (int i = 0; i < Registration.size(); i++)
        {
         
            RegistrationArray [i] = Registration.get(i).getBreed();
            jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(RegistrationArray));
        }
        for (int i = 0; i < Registration.size(); i++)
        {
         
            RegistrationArray [i] = Registration.get(i).getCust_Name();
            jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(RegistrationArray));
        }
        for (int i = 0; i < Registration.size(); i++)
        {
         
            RegistrationArray [i] = Registration.get(i).getPet_Name();
            jComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(RegistrationArray));
        }
        
     
       
                
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A Class", "B Class", "C Class" }));
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
    
    
    } 
     public void saveBookingToFile()
    {
        try
        {
            FileOutputStream file = new FileOutputStream("InfoOnBooking.dat"); 
            ObjectOutputStream outputFile = new ObjectOutputStream(file);
            
            for (int i = 0; i < Booking.size(); i++ )
            {
                outputFile.writeObject(Booking.get(i)); // Registration is the array list; get(i) takes the objects and saves to file called InfoOnRegistration.dat  
                
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

        jLabel12 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Arrival_date = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        Departure_date = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        Price_Per_Week = new javax.swing.JTextField();
        Save = new javax.swing.JButton();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jComboBox4 = new javax.swing.JComboBox<>();
        jComboBox5 = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/bg5.jpg"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Add Information on Booking");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Information on Booking");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 40, 280, -1));

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Fill up the following details: ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, 220, -1));

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Customer Name:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, -1, -1));

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Pet Name:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, -1, -1));

        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Breed:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 210, -1, -1));

        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Type of Room:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, -1, -1));

        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Arrival Date:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 270, -1, -1));
        getContentPane().add(Arrival_date, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 270, 226, -1));

        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Departure Date:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 310, -1, -1));

        Departure_date.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Departure_dateActionPerformed(evt);
            }
        });
        getContentPane().add(Departure_date, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 300, 226, -1));

        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Price Per Week (RM):");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 330, -1, -1));

        Price_Per_Week.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Price_Per_WeekActionPerformed(evt);
            }
        });
        getContentPane().add(Price_Per_Week, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 330, 226, -1));

        Save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/save.png"))); // NOI18N
        Save.setText("Save");
        Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveActionPerformed(evt);
            }
        });
        getContentPane().add(Save, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 380, -1, -1));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 230, 226, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 200, 226, -1));

        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Pet Type:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, -1, -1));

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 170, 226, -1));

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(jComboBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 110, 226, -1));

        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(jComboBox5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 140, 226, -1));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/bg1.jpg"))); // NOI18N
        jPanel1.add(jLabel15);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Departure_dateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Departure_dateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Departure_dateActionPerformed

    private void Price_Per_WeekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Price_Per_WeekActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Price_Per_WeekActionPerformed

    private void SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveActionPerformed
        // TODO add your handling code here:
        
          if (   Arrival_date.getText().isEmpty() || 
                Departure_date.getText().isEmpty() || Price_Per_Week.getText().isEmpty()
                )
        {
            
            JOptionPane.showMessageDialog(null, "Please enter all fields!");
    
        }
        else 
        {
                    String name = (String) jComboBox4.getSelectedItem();
                    String petName = (String) jComboBox5.getSelectedItem();
                    String pettype = (String) jComboBox3.getSelectedItem();
                    String breed = (String) jComboBox1.getSelectedItem();
                    String typeOfRoom = (String) jComboBox2.getSelectedItem();
                    String arrival_date = Arrival_date.getText().trim();
                    String departure_date = Departure_date.getText().trim();
                    String price_p_week =  Price_Per_Week.getText().trim();
                    
        
                    InfoOnBooking infoonbooking = new  InfoOnBooking(name, petName, pettype, breed, typeOfRoom, arrival_date, departure_date, Double.parseDouble(price_p_week)); 
                    Booking.add(infoonbooking);
                    saveBookingToFile();
                   
       
        }
              
    }//GEN-LAST:event_SaveActionPerformed

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
            java.util.logging.Logger.getLogger(AddInfoBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddInfoBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddInfoBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddInfoBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddInfoBooking().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Arrival_date;
    private javax.swing.JTextField Departure_date;
    private javax.swing.JTextField Price_Per_Week;
    private javax.swing.JButton Save;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
