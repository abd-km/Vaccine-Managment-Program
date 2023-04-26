/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import javax.swing.*;
import java.io.*;
import java.util.*;
import java.util.regex.Pattern;
/**
 *
 * @author choww
 */
public class DeleteAppoint extends javax.swing.JFrame {

    /**
     * Creates new form DeleteAppoint
     */
    public DeleteAppoint() {
        initComponents();
        ICLabel.setVisible(false);
        ICTxt.setVisible(false);
        PassportLabel.setVisible(false);
        PassportTxt.setVisible(false);
        SearchBut.setVisible(false);
        NameTxt.setEditable(false);
        TypeTxt.setEditable(false);
        CentreTxt.setEditable(false);
        TimeTxt.setEditable(false);
        DateTxt.setEditable(false);
        CitizenshipTxt.setEditable(false);
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
        BackBut = new javax.swing.JButton();
        ExitBut = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        NameTxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        TypeTxt = new javax.swing.JTextField();
        CentreTxt = new javax.swing.JTextField();
        TimeTxt = new javax.swing.JTextField();
        DeleteBut = new javax.swing.JButton();
        CitizenshipChoice = new javax.swing.JComboBox<>();
        SelectBut = new javax.swing.JButton();
        ICLabel = new javax.swing.JLabel();
        CitizenshipTxt = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        PassportLabel = new javax.swing.JLabel();
        PassportTxt = new javax.swing.JTextField();
        SearchBut = new javax.swing.JButton();
        ICTxt = new javax.swing.JTextField();
        DateTxt = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Delete Vaccine Appointment");

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

        jLabel3.setText("Name");

        jLabel4.setText("Type of Vaccine");

        jLabel5.setText("Vaccine Centre");

        jLabel6.setText("Appointment Date");

        jLabel7.setText("Appointment Time");

        TypeTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TypeTxtActionPerformed(evt);
            }
        });

        DeleteBut.setText("Delete");
        DeleteBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteButActionPerformed(evt);
            }
        });

        CitizenshipChoice.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Citizen", "Non-Citizen" }));
        CitizenshipChoice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CitizenshipChoiceActionPerformed(evt);
            }
        });

        SelectBut.setText("Select");
        SelectBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SelectButActionPerformed(evt);
            }
        });

        ICLabel.setText("NRIC");

        CitizenshipTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CitizenshipTxtActionPerformed(evt);
            }
        });

        jLabel8.setText("Citizenship");

        PassportLabel.setText("Passport No.");

        PassportTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PassportTxtActionPerformed(evt);
            }
        });

        SearchBut.setText("Search");
        SearchBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchButActionPerformed(evt);
            }
        });

        ICTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ICTxtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(115, 115, 115))
            .addGroup(layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(ICLabel)
                                        .addGap(80, 80, 80))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(PassportLabel)
                                        .addGap(31, 31, 31)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ICTxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(PassportTxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(NameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel7)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel3))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(BackBut)
                                            .addGap(60, 60, 60)))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(19, 19, 19)
                                            .addComponent(CentreTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(18, 18, 18)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(DeleteBut, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(TimeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(18, 18, 18)
                                            .addComponent(DateTxt))))
                                .addComponent(TypeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(73, 73, 73)
                                .addComponent(ExitBut))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(SearchBut, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(CitizenshipTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(CitizenshipChoice, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(SelectBut)
                        .addGap(41, 41, 41))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(CitizenshipTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CitizenshipChoice, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SelectBut))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ICTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ICLabel))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(PassportLabel)
                            .addComponent(PassportTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(SearchBut, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TypeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(CentreTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(DateTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(TimeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BackBut)
                    .addComponent(DeleteBut, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ExitBut))
                .addGap(0, 39, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ExitButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitButActionPerformed
        System.exit(0);
    }//GEN-LAST:event_ExitButActionPerformed

    private void BackButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButActionPerformed
       this.setVisible(false);
       VaccineAppoint va = new VaccineAppoint();
       va.setVisible(true);
    }//GEN-LAST:event_BackButActionPerformed

    private void TypeTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TypeTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TypeTxtActionPerformed

    private void CitizenshipChoiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CitizenshipChoiceActionPerformed

    }//GEN-LAST:event_CitizenshipChoiceActionPerformed

    private void SelectButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SelectButActionPerformed
        String citizenship = CitizenshipChoice.getSelectedItem().toString();
        CitizenshipTxt.setText(citizenship);
        SearchBut.setVisible(true);
        if(citizenship.equals("Citizen"))
        {
            ICLabel.setVisible(true);
            ICTxt.setVisible(true);
            ICTxt.revalidate();
            ICTxt.repaint();
            PassportTxt.setVisible(false);
            PassportLabel.setVisible(false);
        }
        else if(citizenship.equals("Non-Citizen"))
        {
            PassportLabel.setVisible(true);
            PassportTxt.setVisible(true);
            PassportTxt.revalidate();
            PassportTxt.repaint();
            ICLabel.setVisible(false);
            ICTxt.setVisible(false);
        }
    }//GEN-LAST:event_SelectButActionPerformed

    private void SearchButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchButActionPerformed
        String citizenship = CitizenshipTxt.getText();
        int flag=0;
        if(citizenship.equals("Citizen"))
        {
            try
            {
                File fpeople = new File("PeopleCitizen.txt");
                Scanner s = new Scanner(fpeople);
                String IC = ICTxt.getText();
                while(s.hasNext())
                {
                    String details = s.nextLine();
                    String[] info = details.split(",");
                    if(info[1].equals(IC))
                    {
                        NameTxt.setText(info[0]);
                        flag =1;
                        break;
                    }
                }
                if(flag==0)
                {
                    JOptionPane.showMessageDialog(this,"People not yet registered","Details not found",JOptionPane.INFORMATION_MESSAGE);
                    ICTxt.setText("");
                }
                
                File fappoint = new File("CitizenAppoint.txt");
                Scanner sf = new Scanner(fappoint);
                while(sf.hasNext())
                {
                    String appointdetails = sf.nextLine();
                    String[] appointinfo= appointdetails.split(",");
                    if(appointinfo[1].equals(IC))
                    {
                        DateTxt.setText(appointinfo[2]);
                        TimeTxt.setText(appointinfo[3]);
                        TypeTxt.setText(appointinfo[4]);
                        CentreTxt.setText(appointinfo[5]);
                        flag =1;
                        break;
                    }
                    else
                    {
                        flag=2;
                    }
                }
                if(flag==2)
                {
                    JOptionPane.showMessageDialog(this,"People not yet registered for vaccination yet","Registration Record not found",JOptionPane.INFORMATION_MESSAGE);
                    ICTxt.setText("");
                }
            }
            catch(FileNotFoundException fe)
            {
              JOptionPane.showMessageDialog(this,"File records not found","File error",JOptionPane.WARNING_MESSAGE);
            }
            catch(Exception e)
            {
                System.out.println("Error");
            }
            
        }
        else
        {
            try
            {
                File fpeople = new File("PeopleNonCitizen.txt");
                Scanner s = new Scanner(fpeople);
                String passport = PassportTxt.getText();
                while(s.hasNext())
                {
                    String details = s.nextLine();
                    String[] info = details.split(",");
                    if(info[1].equals(passport))
                    {
                        NameTxt.setText(info[0]);
                        flag =1;
                        break;
                    }
                }
                if(flag==0)
                {
                    JOptionPane.showMessageDialog(this,"People not yet registered","Details not found",JOptionPane.INFORMATION_MESSAGE);
                    PassportTxt.setText("");
                }
                
                File fappoint = new File("NonCitizenAppoint.txt");
                Scanner sf = new Scanner(fappoint);
                while(sf.hasNext())
                {
                    String appointdetails = sf.nextLine();
                    String[] appointinfo= appointdetails.split(",");
                    if(appointinfo[1].equals(passport))
                    {
                        DateTxt.setText(appointinfo[2]);
                        TimeTxt.setText(appointinfo[3]);
                        TypeTxt.setText(appointinfo[4]);
                        CentreTxt.setText(appointinfo[5]);
                        flag =1;
                        break;
                    }
                    else
                    {
                        flag=2;
                    }
                }
                if(flag==2)
                {
                    JOptionPane.showMessageDialog(this,"People not yet registered for vaccination yet","Registration Record not found",JOptionPane.INFORMATION_MESSAGE);
                    PassportTxt.setText("");
                }
            }
            catch(Exception e)
            {
                System.out.println("Error");
            }
        }
    }//GEN-LAST:event_SearchButActionPerformed

    private void DeleteButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteButActionPerformed
        String citizenship = CitizenshipTxt.getText();
        String name = NameTxt.getText().trim();
        String IC = ICTxt.getText().trim();
        String passport = PassportTxt.getText().trim();     // Trim to remove whitespaces before and after
        String type = TypeTxt.getText().trim();
        String centre = CentreTxt.getText().trim();
        String date = DateTxt.getText().trim();
        String time = TimeTxt.getText().trim();
        try
        {
            if(citizenship.equals("Citizen"))
            {
                if(name.equals("") || type.equals("") || centre.equals("") || date.equals("") || time.equals(""))
                        JOptionPane.showMessageDialog(this,"kindly select dedtails to be removed","Nothing is selected",JOptionPane.INFORMATION_MESSAGE);
                else                    // Validation
                {
                    try
                    {
                        File fpeople = new File("CitizenAppoint.txt");
                        Scanner s = new Scanner(fpeople);
                        StringBuilder buffer = new StringBuilder();
                            
                        while(s.hasNext())
                        {
                            String details = s.nextLine();   
                            if(!details.contains(IC))
                            {
                                buffer.append(details+System.lineSeparator());
                            }
                        }
                        String filedetail = buffer.toString();
                        FileWriter fw = new FileWriter(fpeople);
                        fw.write(filedetail);
                        fw.close();
                        CitizenshipTxt.setText("");
                        NameTxt.setText("");
                        ICTxt.setText("");
                        TypeTxt.setText("");
                        CentreTxt.setText("");
                        DateTxt.setText("");
                        TimeTxt.setText("");
                        JOptionPane.showMessageDialog(this,"Record Successfully Removed","Record removed",JOptionPane.INFORMATION_MESSAGE);
                            
                    }
                    catch(IOException io)
                    {
                        System.out.println("IO error"); // Validation
                    }
                }
            }
            else
            {               // Validation
                if(name.equals("") || type.equals("") || centre.equals("") || date.equals("") || time.equals(""))
                        JOptionPane.showMessageDialog(this,"kindly select details to be removed","Nothing is selected",JOptionPane.INFORMATION_MESSAGE);
                else
                {
                    try
                    {
                        File fpeople = new File("NonCitizenAppoint.txt");
                        Scanner s = new Scanner(fpeople);
                        StringBuilder buffer = new StringBuilder();
                            
                        while(s.hasNext())
                        {
                            String details = s.nextLine();   
                            if(!details.contains(passport))
                            {
                                buffer.append(details+System.lineSeparator()); // Returns the system-dependent line separator string
                            }
                        }
                        String filedetail = buffer.toString();
                        FileWriter fw = new FileWriter(fpeople);
                        fw.write(filedetail);
                        fw.close();
                        CitizenshipTxt.setText("");                 
                        NameTxt.setText("");
                        PassportTxt.setText("");
                        TypeTxt.setText("");
                        CentreTxt.setText("");
                        DateTxt.setText("");
                        TimeTxt.setText("");
                        JOptionPane.showMessageDialog(this,"Record Successfully Removed","Record removed",JOptionPane.INFORMATION_MESSAGE);
                            // Validation
                    }
                    catch(IOException io)
                    {
                        System.out.println("IO error");  // Validation
                    }
                }
            }
        }
        catch(Exception e)
        {
            System.out.println("Error"); // Validation
        }
        finally
        {
            ICLabel.setVisible(false);
            ICTxt.setVisible(false);
            PassportTxt.setVisible(false);
            PassportLabel.setVisible(false);
            SearchBut.setVisible(false);
        }
    }//GEN-LAST:event_DeleteButActionPerformed

    private void ICTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ICTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ICTxtActionPerformed

    private void PassportTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PassportTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PassportTxtActionPerformed

    private void CitizenshipTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CitizenshipTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CitizenshipTxtActionPerformed

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
            java.util.logging.Logger.getLogger(DeleteAppoint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DeleteAppoint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DeleteAppoint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DeleteAppoint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DeleteAppoint().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackBut;
    private javax.swing.JTextField CentreTxt;
    private javax.swing.JComboBox<String> CitizenshipChoice;
    private javax.swing.JTextField CitizenshipTxt;
    private javax.swing.JTextField DateTxt;
    private javax.swing.JButton DeleteBut;
    private javax.swing.JButton ExitBut;
    private javax.swing.JLabel ICLabel;
    private javax.swing.JTextField ICTxt;
    private javax.swing.JTextField NameTxt;
    private javax.swing.JLabel PassportLabel;
    private javax.swing.JTextField PassportTxt;
    private javax.swing.JButton SearchBut;
    private javax.swing.JButton SelectBut;
    private javax.swing.JTextField TimeTxt;
    private javax.swing.JTextField TypeTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    // End of variables declaration//GEN-END:variables
}
