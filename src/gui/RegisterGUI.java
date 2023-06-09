/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui;
import java.io.*;
import java.util.Scanner;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


/**
 *
 * @author am
 */
public class RegisterGUI extends javax.swing.JFrame {

    /**
     * Creates new form RegisterGUI
     */
    public RegisterGUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField6 = new javax.swing.JTextField();
        BackBut = new javax.swing.JButton();
        ExitBut = new javax.swing.JButton();
        SubmitBut = new javax.swing.JButton();
        MainLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Password = new javax.swing.JPasswordField();
        CountryLabel = new javax.swing.JLabel();
        HID = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        CitizenshipChoice = new javax.swing.JComboBox<>();
        NRIC = new javax.swing.JTextField();
        ICLabel = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Age = new javax.swing.JTextField();
        dob = new com.toedter.calendar.JDateChooser();
        PassportLabel = new javax.swing.JLabel();
        Country = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        Name = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Status = new javax.swing.JTextField();
        Phone = new javax.swing.JTextField();
        SelectBut = new javax.swing.JButton();
        Passport = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        jTextField6.setText("jTextField6");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BackBut.setText("Back");
        BackBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButActionPerformed(evt);
            }
        });

        ExitBut.setText("Exit");
        ExitBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitButActionPerformed(evt);
            }
        });

        SubmitBut.setText("Submit");
        SubmitBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitButActionPerformed(evt);
            }
        });

        MainLabel.setFont(new java.awt.Font("Skia", 1, 24)); // NOI18N
        MainLabel.setText("Registration Details");

        jLabel1.setText("Password:");

        Password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordActionPerformed(evt);
            }
        });

        CountryLabel.setText("Country");

        HID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HIDActionPerformed(evt);
            }
        });

        jLabel3.setText("Age");

        CitizenshipChoice.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Citizen", "Non-Citizen" }));
        CitizenshipChoice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CitizenshipChoiceActionPerformed(evt);
            }
        });

        NRIC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NRICActionPerformed(evt);
            }
        });

        ICLabel.setText("NRIC");

        jLabel6.setText("Status");

        Age.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgeActionPerformed(evt);
            }
        });
        Age.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                AgeKeyTyped(evt);
            }
        });

        dob.setDateFormatString("dd/MM/yyyy");

        PassportLabel.setText("Passport Number");

        jLabel7.setText("Phone");

        Name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameActionPerformed(evt);
            }
        });

        jLabel5.setText("Health ID");

        jLabel4.setText("D.O.B");

        SelectBut.setText("Confirm");
        SelectBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SelectButActionPerformed(evt);
            }
        });

        Passport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PassportActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel9.setText("Citizenship Status");

        jLabel10.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel10.setText("Name");

        jLabel11.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel11.setText("Personal Information");

        jLabel12.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel12.setText("Identificataion");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BackBut)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ExitBut)
                        .addGap(36, 36, 36))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Name, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                            .addComponent(Status))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(CitizenshipChoice, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(SelectBut)
                        .addGap(53, 53, 53))))
            .addGroup(layout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(Password, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(SubmitBut, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addComponent(dob, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 84, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(jLabel11)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(50, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel6))
                        .addGap(220, 220, 220))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CountryLabel)
                            .addComponent(jLabel3)
                            .addComponent(jLabel7))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(Country, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Phone, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Age, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ICLabel)
                            .addComponent(jLabel5)
                            .addComponent(PassportLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(HID, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                            .addComponent(Passport, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NRIC))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(jLabel12)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(232, 232, 232)
                        .addComponent(jLabel9))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(185, 185, 185)
                        .addComponent(MainLabel)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(MainLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(Status, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CitizenshipChoice, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SelectBut))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Age, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(PassportLabel)
                    .addComponent(Passport, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CountryLabel)
                    .addComponent(Country, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(HID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Phone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(ICLabel)
                    .addComponent(NRIC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BackBut)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel1)
                                .addComponent(Password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4))
                            .addComponent(dob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(71, 71, 71))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ExitBut)
                        .addComponent(SubmitBut, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void SubmitButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitButActionPerformed
        // TODO add your handling code here:
        try
        {
            String name = 
                    Name.getText().trim();
            String DOB = 
                    ((JTextField)dob.getDateEditor().getUiComponent()).getText();
            String age = 
                    Age.getText().trim();
            String country = 
                    Country.getText().trim();
            String phone = 
                    Phone.getText().trim();
            String ID = 
                    HID.getText().trim();
            String password = 
                    Password.getText().trim();
            String IC = 
                    NRIC.getText().trim();
            String citizenship = 
                    Status.getText().trim();
            String passport = 
                    Passport.getText().trim();
            
            int kat=0;
            
            

            if(citizenship.equals("Citizen"))
            {
                try
                {
                    File fpeople1 = new File("PeopleCitizen.txt");
                    Scanner s1 = new Scanner(fpeople1);
                }
                catch(FileNotFoundException fe)
                {
                    PrintWriter ex = new PrintWriter("PeopleCitizen.txt");
                    ex.print("");
                    ex.close(); 
                }
                File fpeople = new File("PeopleCitizen.txt");
                Scanner s = new Scanner(fpeople);

                while(s.hasNext())
                {
                    String details = s.nextLine();
                    if(details.contains(IC))
                        kat=1;
                }
                try (PrintWriter ab = new PrintWriter(new BufferedWriter
                (new FileWriter("PeopleCitizen.txt",true))))
                {
                    if(name.equals("") 
                            || DOB.equals("") 
                            || age.equals("") 
                            || phone.equals("") 
                            || ID.equals("") 
                            || password.equals("") 
                            || IC.equals("") 
                            || citizenship.equals(""))
                        
                        JOptionPane.showMessageDialog(this,"Empty field detected!",
                                "Fill up all fields",JOptionPane.INFORMATION_MESSAGE);
                    
                    else if(!Pattern.matches("^[0-9]+$",Age.getText())
                            ||!Pattern.matches("^[0-9]+$",Phone.getText()))
                    {
                        JOptionPane.showMessageDialog(
                                this,"Age and Phone number Must be Number only","Invalid format",
                                JOptionPane.INFORMATION_MESSAGE);
                    }
                    else if(kat==1)
                        JOptionPane.showMessageDialog(
                                this,"You are already registered","Registration failure",
                                JOptionPane.INFORMATION_MESSAGE);
                    else
                    {
                        ab.println(name+","+IC+","+DOB+","+age+","+phone+","+ID+","+password);
                        
                        ab.close();
                        JOptionPane.showMessageDialog(
                                this,"Registration Successful","Registered Message",
                                JOptionPane.PLAIN_MESSAGE);
                        
                        Name.setText("");
                        dob.setCalendar(null);
                        Age.setText("");
                        Country.setText("");
                        Phone.setText("");
                        HID.setText("");
                        Password.setText("");
                        NRIC.setText("");
                        Passport.setText("");
                        Status.setText("");
                        
                        CountryLabel.setVisible(false);
                        Country.setVisible(false); // Make invisible 
                        
                        
                        ICLabel.setVisible(false);
                        NRIC.setVisible(false);
                        
                        PassportLabel.setVisible(false);
                        Passport.setVisible(false); // Make invisible
                        kat=0;
                    }
                    
                }
                catch(IOException ioe)
                {
                    System.out.println("Error");
                }   
            }
            else
            {
                try
                {
                    File fpeople2 = new File("PeopleNonCitizen.txt");
                    Scanner s2 = new Scanner(fpeople2);
                }
                catch(FileNotFoundException fe)
                {
                    PrintWriter pnc = new PrintWriter("PeopleNonCitizen.txt");
                    pnc.print("");
                    pnc.close(); 
                }
                File fpeople2 = new File("PeopleNonCitizen.txt");
                Scanner s4 = new Scanner(fpeople2);
               
                
                while(s4.hasNext())
                {
                    String details = s4.nextLine();
                    if(details.contains(passport))
                        kat=1;
                }
                try (PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("PeopleNonCitizen.txt",true))))
                {
                    if(name.equals("") || DOB.equals("") 
                                       || age.equals("") 
                                       || country.equals("") 
                                       || phone.equals("") 
                                       || ID.equals("") 
                                       || password.equals("") 
                                       || citizenship.equals("") 
                                       || passport.equals(""))
                        
                        JOptionPane.showMessageDialog(
                                this,"Missing Fields","System Message",
                                JOptionPane.INFORMATION_MESSAGE);
                    
                    
                    else if(!Pattern.matches("^[0-9]+$",Age.getText())||!Pattern.matches("^[0-9]+$",Phone.getText()))
                    {
                        JOptionPane.showMessageDialog(
                                this,"Invalid Age / Number","System Message",
                                JOptionPane.INFORMATION_MESSAGE);
                    }
                    else if(kat==1)
                        JOptionPane.showMessageDialog(
                                this,"Already Registered.","System Message",
                                JOptionPane.INFORMATION_MESSAGE);
                    else
                    {
                        pw.println(name+","+passport+","+DOB+","+age+","+country+","+phone+","+ID+","+password);
                        pw.close();
                        JOptionPane.showMessageDialog(
                                this,"Successfuly Registered.","System Message",
                                JOptionPane.PLAIN_MESSAGE);
                        Name.setText("");
                        dob.setCalendar(null);
                        Age.setText("");
                        Country.setText("");
                        Phone.setText("");
                        HID.setText("");
                        Password.setText("");
                        Passport.setText("");
                        Status.setText("");
                        NRIC.setText("");
                        
                        PassportLabel.setVisible(false);
                        Passport.setVisible(false);
                        CountryLabel.setVisible(false);
                        Country.setVisible(false);
                        NRIC.setVisible(false);
                        ICLabel.setVisible(false);
                        kat=0;
                    }
                }
                catch(IOException ioe)
                {
                    System.out.println("Error");
                }
            }   
        }
        catch(Exception e)
        {
            System.out.println("Error");        
        }
              
        
    }//GEN-LAST:event_SubmitButActionPerformed

    private void BackButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButActionPerformed
        // TODO add your handling code here:
        new PeopleGUI().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BackButActionPerformed

    private void ExitButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitButActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_ExitButActionPerformed

    private void PasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PasswordActionPerformed

    private void HIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HIDActionPerformed

    private void CitizenshipChoiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CitizenshipChoiceActionPerformed

    }//GEN-LAST:event_CitizenshipChoiceActionPerformed

    private void NRICActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NRICActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NRICActionPerformed

    private void AgeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_AgeKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_AgeKeyTyped

    private void NameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NameActionPerformed

    private void SelectButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SelectButActionPerformed
        String citizenship = CitizenshipChoice.getSelectedItem().toString();
        Status.setText(citizenship);
        if(citizenship.equals("Citizen"))
        {
            ICLabel.setVisible(true);
            NRIC.setVisible(true);
            NRIC.revalidate();
            NRIC.repaint();
            Passport.setVisible(false);
            PassportLabel.setVisible(false);
            CountryLabel.setVisible(false);
            Country.setVisible(false);
        }
        else if(citizenship.equals("Non-Citizen"))
        {
            PassportLabel.setVisible(true);
            Passport.setVisible(true);
            Passport.revalidate();
            Passport.repaint();
            NRIC.setVisible(false);
            ICLabel.setVisible(false);
            CountryLabel.setVisible(true);
            Country.setVisible(true);
            Country.revalidate();
            Country.repaint();
        }
    }//GEN-LAST:event_SelectButActionPerformed

    private void PassportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PassportActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PassportActionPerformed

    private void AgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AgeActionPerformed

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
            java.util.logging.Logger.getLogger(RegisterGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Age;
    private javax.swing.JButton BackBut;
    private javax.swing.JComboBox<String> CitizenshipChoice;
    private javax.swing.JTextField Country;
    private javax.swing.JLabel CountryLabel;
    private javax.swing.JButton ExitBut;
    private javax.swing.JTextField HID;
    private javax.swing.JLabel ICLabel;
    private javax.swing.JLabel MainLabel;
    private javax.swing.JTextField NRIC;
    private javax.swing.JTextField Name;
    private javax.swing.JTextField Passport;
    private javax.swing.JLabel PassportLabel;
    private javax.swing.JPasswordField Password;
    private javax.swing.JTextField Phone;
    private javax.swing.JButton SelectBut;
    private javax.swing.JTextField Status;
    private javax.swing.JButton SubmitBut;
    private com.toedter.calendar.JDateChooser dob;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables
}
