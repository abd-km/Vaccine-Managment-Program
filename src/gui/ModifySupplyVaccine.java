/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;
import gui.SupplyVaccine;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.regex.Pattern;
import javax.swing.*;
/**
 *
 * @author choww
 */
public class ModifySupplyVaccine extends javax.swing.JFrame {

    /**
     * Creates new form ModifySupplyVaccine
     */
    public ModifySupplyVaccine() {
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

        AmountTxt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        VaccineType = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        UpdateBut = new javax.swing.JButton();
        BackBut = new javax.swing.JButton();
        ExitBut = new javax.swing.JButton();
        Centre = new javax.swing.JComboBox<>();
        SupplyDateChooser = new com.toedter.calendar.JDateChooser();
        jLabel6 = new javax.swing.JLabel();
        CodeTxt = new javax.swing.JTextField();
        SearchBut = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Modify Supply Of Vaccine");

        VaccineType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pfizer", "Sinovac", "AstraZeneca", "Sputnik V", "CanSinoBio" }));

        jLabel2.setText("Vaccine Type");

        jLabel3.setText("Vaccine Centre");

        jLabel4.setText("Amount (thousands)");

        jLabel5.setText("Supply Date ");

        UpdateBut.setText("Update");
        UpdateBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateButActionPerformed(evt);
            }
        });

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

        Centre.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kuala Lumpur", "Bukit Jalil", "Shah Alam", "Sungai Buloh", "Subang Jaya" }));

        SupplyDateChooser.setDateFormatString("dd/MM/yyyy");

        jLabel6.setText("Supply Code");

        SearchBut.setText("Search");
        SearchBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchButActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(BackBut)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ExitBut)
                .addGap(24, 24, 24))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel5)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel2))
                                    .addGap(84, 84, 84)
                                    .addComponent(VaccineType, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addGap(54, 54, 54)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(Centre, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(AmountTxt, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(SupplyDateChooser, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(100, 100, 100)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CodeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(SearchBut, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addComponent(UpdateBut, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(83, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(CodeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(SearchBut, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(VaccineType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(Centre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(AmountTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(SupplyDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(UpdateBut, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BackBut)
                    .addComponent(ExitBut))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BackButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButActionPerformed
        this.setVisible(false);
        SupplyVaccine sv = new SupplyVaccine();
        sv.setVisible(true);
    }//GEN-LAST:event_BackButActionPerformed

    private void SearchButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchButActionPerformed
        try
        {
            File f = new File("SupplyVaccine.txt");
            Scanner s = new Scanner(f);
            String code = CodeTxt.getText();
            int flag=0;
            while(s.hasNext())
            {
                String details = s.nextLine();
                String[] info = details.split(",");
                if(info[0].equals(code))
                {
                    VaccineType.setSelectedItem(info[1]);
                    Centre.setSelectedItem(info[2]);
                    AmountTxt.setText(info[3]);
                    Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(info[4]);  
                    SupplyDateChooser.setDate(date1);
                    flag=1;
                    break;
                }
            }
            if(flag==0)
            {
                JOptionPane.showMessageDialog(this,"Records not found","Details not found",JOptionPane.INFORMATION_MESSAGE);
                CodeTxt.setText("");
            }
        }
        catch(FileNotFoundException fe)
        {
            JOptionPane.showMessageDialog(this,"File not found","Error searching file",JOptionPane.WARNING_MESSAGE);
        }
        catch(Exception e)
        {
            System.out.println("error");
        }
    }//GEN-LAST:event_SearchButActionPerformed

    private void UpdateButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateButActionPerformed
        String supplycode = CodeTxt.getText();
        String amount = AmountTxt.getText().trim();
        String type = VaccineType.getSelectedItem().toString();
        String centre = Centre.getSelectedItem().toString();
        String date = ((JTextField)SupplyDateChooser.getDateEditor().getUiComponent()).getText();
        try
        {           // Validation
            if(supplycode.equals("") || amount.equals("") || type.equals("") || centre.equals("") || date.equals(""))
            JOptionPane.showMessageDialog(this,"kindly select dedtails to be modified","Nothing is selected",JOptionPane.INFORMATION_MESSAGE);
            else if(!Pattern.matches("^[0-9]+$",AmountTxt.getText()))
                JOptionPane.showMessageDialog(this,"Amount Must be Number only","Invalid format",JOptionPane.INFORMATION_MESSAGE);
            else
            {
                try
                    {
                        File fsupply = new File("SupplyVaccine.txt");       
                        Scanner s = new Scanner(fsupply);           // To scan
                        StringBuilder buffer = new StringBuilder();
                            
                        while(s.hasNext())
                        {
                            String details = s.nextLine();   
                            if(details.contains(supplycode))
                            {
                                String linetochange = details;
                                linetochange = linetochange.replace(details,supplycode+","+type+","+centre+","+amount+","+date+","+centre);
                                buffer.append(linetochange+System.lineSeparator());
                            }
                            else
                                buffer.append(details+System.lineSeparator());
                        }
                        String filedetail = buffer.toString();
                        FileWriter fw = new FileWriter(fsupply);
                        fw.write(filedetail);
                        fw.close();
                        AmountTxt.setText("");
                        SupplyDateChooser.setCalendar(null);
                        JOptionPane.showMessageDialog(this,"Record Successfully Modified","Record removed",JOptionPane.INFORMATION_MESSAGE);
                            
                    }
                    catch(IOException io)
                    {
                        System.out.println("IO error");     // Validation
                    }
            }
        }
        catch(Exception e)
        {
            System.out.println("Error");            // Validation
        }
    }//GEN-LAST:event_UpdateButActionPerformed

    private void ExitButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitButActionPerformed
        System.exit(0);
    }//GEN-LAST:event_ExitButActionPerformed

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
            java.util.logging.Logger.getLogger(ModifySupplyVaccine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModifySupplyVaccine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModifySupplyVaccine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModifySupplyVaccine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModifySupplyVaccine().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AmountTxt;
    private javax.swing.JButton BackBut;
    private javax.swing.JComboBox<String> Centre;
    private javax.swing.JTextField CodeTxt;
    private javax.swing.JButton ExitBut;
    private javax.swing.JButton SearchBut;
    private com.toedter.calendar.JDateChooser SupplyDateChooser;
    private javax.swing.JButton UpdateBut;
    private javax.swing.JComboBox<String> VaccineType;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}