/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger; // Provides the ability to trace out the errors 
import java.util.regex.Pattern;  // Help to define and match the pattern with the input string
import javax.swing.*;
/**
 *
 * @author am
 */
public class ModifyPDGUI extends javax.swing.JFrame {

    /**
     * Creates new form ModifyPDGUI
     */
    public ModifyPDGUI() {
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

        ExitBut = new javax.swing.JButton();
        BackBut = new javax.swing.JButton();
        UpdateBut = new javax.swing.JButton();
        CitizenshipChoice = new javax.swing.JComboBox<>();
        DOBDateChooser = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        SearchBut = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        CitizenshipTxt = new javax.swing.JTextField();
        PasswordTxt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        PhoneTxt = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        AgeTxt = new javax.swing.JTextField();
        NameTxt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        CountryLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        HealthIDTxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        PassportTxt = new javax.swing.JTextField();
        SelectBut = new javax.swing.JButton();
        PassportLabel = new javax.swing.JLabel();
        ICTxt = new javax.swing.JTextField();
        ICLabel = new javax.swing.JLabel();
        CountryTxt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ExitBut.setText("Exit");
        ExitBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitButActionPerformed(evt);
            }
        });

        BackBut.setText("Back");
        BackBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButActionPerformed(evt);
            }
        });

        UpdateBut.setText("Update");
        UpdateBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateButActionPerformed(evt);
            }
        });

        CitizenshipChoice.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Citizen", "Non-Citizen" }));
        CitizenshipChoice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CitizenshipChoiceActionPerformed(evt);
            }
        });

        DOBDateChooser.setDateFormatString("dd/MM/yyyy");

        jLabel5.setText("Age");

        SearchBut.setText("Search");
        SearchBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchButActionPerformed(evt);
            }
        });

        jLabel8.setText("Citizenship");

        CitizenshipTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CitizenshipTxtActionPerformed(evt);
            }
        });

        jLabel7.setText("Password");

        jLabel9.setText("DOB");

        jLabel6.setText("Phone");

        CountryLabel.setText("Country");

        jLabel3.setText("Name");

        jLabel2.setText("Health ID");

        SelectBut.setText("Select");
        SelectBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SelectButActionPerformed(evt);
            }
        });

        PassportLabel.setText("Passport No.");

        ICLabel.setText("NRIC");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Modify Personal Details");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BackBut)
                        .addGap(185, 185, 185)
                        .addComponent(UpdateBut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(151, 151, 151)
                        .addComponent(ExitBut)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(151, 151, 151))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(jLabel7)
                .addGap(8, 8, 8)
                .addComponent(PasswordTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                .addGap(58, 58, 58)
                .addComponent(CountryLabel)
                .addGap(18, 18, 18)
                .addComponent(CountryTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(80, 80, 80)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addGap(124, 473, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel6)
                                .addComponent(PassportLabel)
                                .addComponent(ICLabel)
                                .addComponent(jLabel8))
                            .addGap(8, 8, 8)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(NameTxt, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(HealthIDTxt, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(PhoneTxt, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(PassportTxt)
                                .addComponent(ICTxt, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(CitizenshipTxt))
                            .addGap(23, 23, 23)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(46, 46, 46)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel9)
                                        .addComponent(jLabel5))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(23, 23, 23)
                                            .addComponent(AgeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(DOBDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addComponent(SearchBut, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(CitizenshipChoice, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(SelectBut, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(80, 80, 80)))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 330, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel7)
                                .addComponent(PasswordTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(CountryLabel)
                                .addComponent(CountryTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(UpdateBut, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7))
                            .addComponent(ExitBut, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BackBut)))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(56, 56, 56)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(CitizenshipTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(CitizenshipChoice, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(SelectBut, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(ICLabel)
                                .addComponent(ICTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(PassportLabel)
                                .addComponent(PassportTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(SearchBut, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(25, 25, 25)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(NameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5)
                        .addComponent(AgeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3))
                    .addGap(20, 20, 20)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(HealthIDTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addComponent(DOBDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(PhoneTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(180, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ExitButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitButActionPerformed
        System.exit(0);
    }//GEN-LAST:event_ExitButActionPerformed

    private void BackButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButActionPerformed
        new PersonalGUI().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BackButActionPerformed
    
   
   
    private void writefile(String filename, String content) throws FileNotFoundException, IOException
    {
        FileOutputStream fileOut = new FileOutputStream(filename); //Writes data into the file
        fileOut.write(content.getBytes());  // Encodes the string into a sequence of bytes and stores it in a byte array
        fileOut.close();
    }
    
    private void modifyfile(String filename, int line, String newline) throws IOException  // Modify method to modify details
    {
                File fpeople = new File(filename);  // Open said file when method is used and scan
                Scanner s = new Scanner(fpeople);
                String content = ""; 
                int counter = 0; // Declare counter for line
                
                while(s.hasNext()) // Go through lines
                {
                    String details = s.nextLine();
                    if(counter++==line)   // If counter is equal to line then add one to counter
                    {
                        content += newline + "\r\n"; // content is replaced with newline
                    }
                       
                    else
                     {
                        content += details + "\r\n"; 
                     }
                    
                }
                
                writefile(filename,content);
                JOptionPane.showMessageDialog(this,"Details Modified.","System Message",JOptionPane.INFORMATION_MESSAGE);
    }
    
    
    private void UpdateButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateButActionPerformed
        
        String tosearch = CitizenshipTxt.getText();                 // If fields are empty, display system message
        if(NameTxt.equals("") || DOBDateChooser.equals("") 
                            || AgeTxt.equals("") 
                            || PhoneTxt.equals("") 
                            || HealthIDTxt.equals("") 
                            || PasswordTxt.equals("") 
                            || ICTxt.equals("") 
                            || CitizenshipTxt.equals("")){
                        
                        JOptionPane.showMessageDialog(this,"Empty field detected!",    //Validation for empty fields
                                "Fill up all fields",JOptionPane.INFORMATION_MESSAGE);
                             return;
                            }
                    else if(!Pattern.matches("^[0-9]+$",AgeTxt.getText())   // Checks if Age and Phone are numbers 
                            ||!Pattern.matches("^[0-9]+$",PhoneTxt.getText()))
                    {
                        JOptionPane.showMessageDialog(
                                this,"Age and Phone number must be Number only","Invalid format", // Validation
                                JOptionPane.INFORMATION_MESSAGE);
                        return;
                    }
        if(tosearch.equals("Citizen"))
        {
            String DOB = ((JTextField)DOBDateChooser.getDateEditor().getUiComponent()).getText();  
            String ab = NameTxt.getText() +","+ ICTxt.getText() +","+ DOB
                    +","+AgeTxt.getText() +","+ PhoneTxt.getText() +","+ HealthIDTxt.getText() +","+ PasswordTxt.getText();
            
            try {
                if(this.isSelected)
                {
                    modifyfile("PeopleCitizen.txt", this.line, ab);
                }
                else
                {
                    JOptionPane.showMessageDialog(this,"Error.","System Message",JOptionPane.INFORMATION_MESSAGE);
                }
                
            } catch (IOException ex) {
                Logger.getLogger(ModifyPDGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        
        else 
        {
            String DOB = ((JTextField)DOBDateChooser.getDateEditor().getUiComponent()).getText();     // Text from file that will run through modifyfile
            String ab = NameTxt.getText() +","+ PassportTxt.getText() +","+ DOB
                    +","+AgeTxt.getText() +","+ CountryTxt.getText() +","+ PhoneTxt.getText() +","+ HealthIDTxt.getText() 
                    +","+ PasswordTxt.getText();
            
            try {
                if(this.isSelected)
                {
                    modifyfile("PeopleNonCitizen.txt", this.line, ab);
                }else
                {
                    JOptionPane.showMessageDialog(this,"Error.","System Message",JOptionPane.INFORMATION_MESSAGE);
                }
                
            } catch (IOException ex) {
                Logger.getLogger(ModifyPDGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        this.isSelected =false;
    }//GEN-LAST:event_UpdateButActionPerformed

    private void CitizenshipChoiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CitizenshipChoiceActionPerformed

    }//GEN-LAST:event_CitizenshipChoiceActionPerformed

    private int line = 0;
    private boolean isSelected=false;
    
    private void SearchButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchButActionPerformed
        String tosearch = CitizenshipTxt.getText();

        int app=0;
        this.line = 0;
        this.isSelected=false;
        if(tosearch.equals("Citizen"))
        {
            try
            {
                File fpeople = new File("PeopleCitizen.txt");
                Scanner s = new Scanner(fpeople);
                String IC = ICTxt.getText();                    // Get text within nric field
                while(s.hasNext())
                {
                  
                    
                    
                    String details = s.nextLine();
                    String[] info = details.split(",");             //Helps in parsing complex strings easily using regex delimiters
                    if(info[1].equals(IC))                          // If the second string is equal IC set text and other info
                    {
                        NameTxt.setText(info[0]);
                        AgeTxt.setText(info[3]);
                        PhoneTxt.setText(info[4]);
                        HealthIDTxt.setText(info[5]);
                        PasswordTxt.setText(info[6]);
                        Date date1=new SimpleDateFormat("dd/mm/yyyy").parse(info[2]);
                        DOBDateChooser.setDate(date1);
                        NameTxt.setEditable(true);
                        AgeTxt.setEditable(true);
                        HealthIDTxt.setEditable(true);
                        PhoneTxt.setEditable(true);
                        CountryTxt.setEditable(true);
                        PasswordTxt.setEditable(true);
                        DOBDateChooser.setEnabled(true);
                        app =1;
                        this.isSelected=true;
                        break;
                    }
                    
                    this.line += 1;             // if not my line then add one and go to next line
                }
                if(app==0)
                {
                    JOptionPane.showMessageDialog(
                            this,"Details not found.","System Message",         // Validation
                            JOptionPane.INFORMATION_MESSAGE);
                    ICTxt.setText("");
                }
            }
            catch(FileNotFoundException fe)
            {
                JOptionPane.showMessageDialog(
                        this,"File not found.","System Message",                // Validation
                        JOptionPane.WARNING_MESSAGE);
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
                File pnc = new File("PeopleNonCitizen.txt");
                Scanner s = new Scanner(pnc);
                String Passport = PassportTxt.getText();            // Get passport field 
                while(s.hasNext())                                   // While loop scan file lines
                {
                    String details = s.nextLine();
                    String[] info = details.split(",");             //Helps in parsing complex strings easily using regex delimiters
                    if(info[1].equals(Passport))
                    {
                        NameTxt.setText(info[0]);
                        Date date1=new SimpleDateFormat("dd/mm/yyyy").parse(info[2]);
                        DOBDateChooser.setDate(date1);
                        AgeTxt.setText(info[3]);
                        CountryTxt.setText(info[4]);
                        PhoneTxt.setText(info[5]);
                        HealthIDTxt.setText(info[6]);
                        PasswordTxt.setText(info[7]);
                        
                        
                        
                        NameTxt.setEditable(true);
                        AgeTxt.setEditable(true);
                        HealthIDTxt.setEditable(true);
                        PhoneTxt.setEditable(true);
                        CountryTxt.setEditable(true);
                        PasswordTxt.setEditable(true);
                        DOBDateChooser.setEnabled(true);
                        app=1;
                        this.isSelected =true;
                        break;
                    }
                    this.line++;
                }
                if(app==0)
                {
                    JOptionPane.showMessageDialog(
                            this,"Details not found in File","System Message",      // Validation
                            JOptionPane.INFORMATION_MESSAGE);
                    PassportTxt.setText("");
                }
            }
            catch(FileNotFoundException fe)
            {
                JOptionPane.showMessageDialog(
                        this,"File not found","System Message",     // Validation
                        JOptionPane.WARNING_MESSAGE);
            }
            catch(Exception e)
            {
                System.out.println("Error");
            }
        }
    }//GEN-LAST:event_SearchButActionPerformed

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
            CountryLabel.setVisible(false);
            CountryTxt.setVisible(false);
        }
        else if(citizenship.equals("Non-Citizen"))
        {
            PassportLabel.setVisible(true);
            PassportTxt.setVisible(true);
            PassportTxt.revalidate();
            PassportTxt.repaint();
            ICLabel.setVisible(false);
            ICTxt.setVisible(false);
            CountryLabel.setVisible(true);
            CountryTxt.setVisible(true);
        }
    }//GEN-LAST:event_SelectButActionPerformed

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
            java.util.logging.Logger.getLogger(ModifyPDGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModifyPDGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModifyPDGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModifyPDGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModifyPDGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AgeTxt;
    private javax.swing.JButton BackBut;
    private javax.swing.JComboBox<String> CitizenshipChoice;
    private javax.swing.JTextField CitizenshipTxt;
    private javax.swing.JLabel CountryLabel;
    private javax.swing.JTextField CountryTxt;
    private com.toedter.calendar.JDateChooser DOBDateChooser;
    private javax.swing.JButton ExitBut;
    private javax.swing.JTextField HealthIDTxt;
    private javax.swing.JLabel ICLabel;
    private javax.swing.JTextField ICTxt;
    private javax.swing.JTextField NameTxt;
    private javax.swing.JLabel PassportLabel;
    private javax.swing.JTextField PassportTxt;
    private javax.swing.JTextField PasswordTxt;
    private javax.swing.JTextField PhoneTxt;
    private javax.swing.JButton SearchBut;
    private javax.swing.JButton SelectBut;
    private javax.swing.JButton UpdateBut;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
