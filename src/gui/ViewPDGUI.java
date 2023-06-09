/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui;
import java.io.*;
import java.util.Scanner;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;


/**
 *
 * @author am
 */
public class ViewPDGUI extends javax.swing.JFrame {

    /**
     * Creates new form ViewPDGUI
     */
    public ViewPDGUI() {
        initComponents();
        Passport.repaint();
        ICLabel.setVisible(false);
        NRIC.setVisible(false);
        PassportLabel.setVisible(false);
        Passport.setVisible(false);
        Passport.revalidate();
        NRIC.setVisible(false);
        NRIC.revalidate();
        NRIC.repaint();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jDialog1 = new javax.swing.JDialog();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        BackBut = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        PrintArea = new javax.swing.JTextArea();
        NRIC = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        StatusSelect = new javax.swing.JComboBox<>();
        ICLabel = new javax.swing.JLabel();
        SearchBut = new javax.swing.JButton();
        Status = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        SelectBut = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        PassportLabel = new javax.swing.JLabel();
        Passport = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BackBut.setText("Back");
        BackBut.setToolTipText("");
        BackBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButActionPerformed(evt);
            }
        });

        PrintArea.setColumns(20);
        PrintArea.setRows(5);
        jScrollPane2.setViewportView(PrintArea);

        jLabel9.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel9.setText("Citizenship Status");

        StatusSelect.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Citizen", "Non-Citizen" }));
        StatusSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StatusSelectActionPerformed(evt);
            }
        });

        ICLabel.setText("NRIC");

        SearchBut.setText("View");
        SearchBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchButActionPerformed(evt);
            }
        });

        Status.setEditable(false);

        jLabel12.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel12.setText("Confirmation");

        SelectBut.setText("Select");
        SelectBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SelectButActionPerformed(evt);
            }
        });

        jLabel8.setText("Citizenship");

        PassportLabel.setText("Passport Number");

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel1.setText("View Personal Details");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(BackBut, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addComponent(ICLabel)
                                .addGap(18, 18, 18)
                                .addComponent(NRIC, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(PassportLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Passport, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(233, 233, 233)
                                .addComponent(jLabel1)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addGap(288, 288, 288))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel9)
                                .addGap(171, 171, 171))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(44, 44, 44)
                                .addComponent(Status, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(StatusSelect, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(SelectBut))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(287, 287, 287)
                        .addComponent(SearchBut, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(97, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(StatusSelect, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SelectBut)
                    .addComponent(jLabel8)
                    .addComponent(Status, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jLabel12)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(NRIC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ICLabel))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(PassportLabel)
                        .addComponent(Passport, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(SearchBut, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BackBut, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BackButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButActionPerformed
        // TODO add your handling code here:
        new PersonalGUI().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BackButActionPerformed

    private void StatusSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StatusSelectActionPerformed

    }//GEN-LAST:event_StatusSelectActionPerformed

    private void SearchButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchButActionPerformed
        String citizenship = Status.getText();
        int choice=0;
        if(citizenship.equals("Citizen"))
        {
            try
            {
                File fpeople = new File("PeopleCitizen.txt");
                Scanner s = new Scanner(fpeople);
                String id = NRIC.getText();
                while(s.hasNext())
                {
                    String details = s.nextLine();
                    String[] info = details.split(",");
                    if(info[1].equals(id))
                    {
                      //  PrintArea.setText(info[0]);
                        String formatted = String.format(
                                "Name: %1$-5s             "
                                + "NRIC: %2$-20s "
                                + "DOB: %3$-15s "
                                + "Age:%4$-10s "
                                + "Phone: %5$-15s\n",
                                info[0],
                                info[1],
                                info[2],
                                info[3],
                                info[4]);
                        PrintArea.setText("");
                        PrintArea.append(formatted);
                        choice =1;
                        break;
                    }
                }
                if(choice==0)
                {
                    JOptionPane.showMessageDialog(this,"Record not found.","System Message",JOptionPane.INFORMATION_MESSAGE);
                    NRIC.setText("");
                }
            }

            catch(FileNotFoundException fe)
            {
                JOptionPane.showMessageDialog(this,"Not found.","System Message",JOptionPane.WARNING_MESSAGE);
            }
            

        }
        else
        {
            try
            {
                File fpeople = new File("PeopleNonCitizen.txt");
                Scanner s = new Scanner(fpeople);
                String passport = Passport.getText();
                while(s.hasNext())
                {
                    String details = s.nextLine();
                    String[] info = details.split(",");
                    if(info[1].equals(passport))
                    {
                       String formatted = String.format(
                               "Name: %1$-5s       "
                                       + "Passport: %2$-20s "
                                       + "DOB: %3$-15s "
                                       + "Age: %4$-10s "
                                       + "Country: %5$-15s\n",
                               info[0],info[1],info[2],info[3],info[4]);
                       PrintArea.setText("");
                       PrintArea.append(formatted);
                        choice =1;
                        break;
                    }
                }
                if(choice==0)
                {
                    JOptionPane.showMessageDialog(this,"Record not found.","System Message",JOptionPane.INFORMATION_MESSAGE);
                    Passport.setText("");
                }

            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(this,"No Record Found","Record not found",JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }//GEN-LAST:event_SearchButActionPerformed

    private void SelectButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SelectButActionPerformed
        String citizenship = StatusSelect.getSelectedItem().toString();
        Status.setText(citizenship);
        //CancelBut.setVisible(true);
        if(citizenship.equals("Citizen"))
        {
            ICLabel.setVisible(true);
            NRIC.setVisible(true);
            NRIC.revalidate();
            NRIC.repaint();
            Passport.setVisible(false);
            PassportLabel.setVisible(false);
        }
        else if(citizenship.equals("Non-Citizen"))
        {
            PassportLabel.setVisible(true);
            Passport.setVisible(true);
            Passport.revalidate();
            Passport.repaint();
            ICLabel.setVisible(false);
            NRIC.setVisible(false);
        }
    }//GEN-LAST:event_SelectButActionPerformed

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
            java.util.logging.Logger.getLogger(ViewPDGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewPDGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewPDGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewPDGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewPDGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackBut;
    private javax.swing.JLabel ICLabel;
    private javax.swing.JTextField NRIC;
    private javax.swing.JTextField Passport;
    private javax.swing.JLabel PassportLabel;
    private javax.swing.JTextArea PrintArea;
    private javax.swing.JButton SearchBut;
    private javax.swing.JButton SelectBut;
    private javax.swing.JTextField Status;
    private javax.swing.JComboBox<String> StatusSelect;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
