/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui;
import java.io.*;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author am
 */
public class ViewCwGUI extends javax.swing.JFrame {

    /**
     * Creates new form ViewCW
     */
    public ViewCwGUI() {
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

        BackBut = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        PrintArea = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        ExitBut = new javax.swing.JButton();
        Viewall = new javax.swing.JButton();
        Status = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BackBut.setText("Back");
        BackBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButActionPerformed(evt);
            }
        });

        PrintArea.setColumns(20);
        PrintArea.setRows(5);
        jScrollPane1.setViewportView(PrintArea);

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel2.setText("View Vaccine Records");

        ExitBut.setText("Exit");
        ExitBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitButActionPerformed(evt);
            }
        });

        Viewall.setText("View All");
        Viewall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewallActionPerformed(evt);
            }
        });

        Status.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Vaccine Wise", "Centre Wise" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(BackBut)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ExitBut))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(Status, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(90, 90, 90)
                        .addComponent(Viewall, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 224, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 212, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(205, 205, 205))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 676, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(94, 94, 94)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Status, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Viewall, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 290, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BackBut)
                    .addComponent(ExitBut))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(234, 234, 234)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(87, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BackButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        VaccinationGUI vacc = new VaccinationGUI();
        vacc.setVisible(true);
    }//GEN-LAST:event_BackButActionPerformed

    private void ExitButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitButActionPerformed
        System.exit(0);
    }//GEN-LAST:event_ExitButActionPerformed

    private void ViewallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewallActionPerformed
        // TODO add your handling code here:
        String choice = Status.getSelectedItem().toString();
        try
        {
            File supply = new File("SupplyVaccine.txt");
            Scanner s = new Scanner(supply);
            PrintArea.setText("");
            if(choice.equals("Vaccine Wise"))
            {
                String choice1 = Status.getSelectedItem().toString();
                
                      while(s.hasNext())
                        {
                            String details = s.nextLine();
                            String[] info = details.split(",");
                            
                                
                                // newsupplycode1+","+vaccinetype+","+vaccinecentre+","+amount+","+date
                                
                                String formatted = String.format("%1$-8s %2$-15s %3$-10s %4$-15s\n",info[0],info[1],info[3],info[4]);
                                PrintArea.append(formatted);
                        }

            }
            
            else if (choice.equals("Centre Wise")) 
                    {
                      while(s.hasNext())
                        {
                            String details = s.nextLine();
                            String[] info = details.split(",");
                            String formatted = String.format("%1$-8s %2$-15s %3$-10s %4$-15s\n",info[0],info[2],info[3],info[4]);
                            PrintArea.append(formatted);
                        }
                    }
        }
        
        catch(FileNotFoundException fe)
        {
            JOptionPane.showMessageDialog(this,
                    "Record not found.","System Message",
                    JOptionPane.WARNING_MESSAGE);
        }
        catch(Exception e)
        {
            System.out.println("Error");
        } 
        
            

        
        /*
        String citizenship = Status.getText();
        int choice=0;
        if(citizenship.equals("Vaccine Wise"))
        {
            try
            {
                File fpeople = new File("CitizenAppoint.txt");
                Scanner s = new Scanner(fpeople);
                String IC = NRIC.getText();
                while(s.hasNext())
                {
                    String details = s.nextLine();
                    String[] appointinfo = details.split(",");
                    if(appointinfo[1].equals(IC))
                    {
                      //  PrintArea.setText(info[0]);
                        String formatted = String.format(
                                "%Name: 1$-10s ID: %2$-15s "
                                + "Date: %3$-15s Time: %4$-10s "
                                + "Vaccine: %5$-15s Centre: %6$-15s\n",
                                
                                appointinfo[0],appointinfo[1],appointinfo[2],appointinfo[3],appointinfo[4], appointinfo[5]);
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
            { JOptionPane.showMessageDialog(this,"Not found","System Message",JOptionPane.WARNING_MESSAGE);}
            
            catch(Exception e)
            {JOptionPane.showMessageDialog(this,"Error","System Message",JOptionPane.WARNING_MESSAGE);}

        }
        else
        {
            try
            {
                File fpeople = new File("NonCitizenAppoint.txt");
                Scanner y = new Scanner(fpeople);
                String passport = Passport.getText();
                while(y.hasNext())
                {
                    String details = y.nextLine();
                    String[] appointinfo = details.split(",");
                    if(appointinfo[1].equals(passport))
                    {
                       String formatted = String.format(
                                     "Name: %1$-10s     Passport: %2$-15s "
                                       + "Date: %3$-15s Time: %4$-10s "
                                       + "Vaccine: %5$-15s Centre: %6$-15s\n",
                               
                               appointinfo[0],appointinfo[1],appointinfo[2],appointinfo[3],appointinfo[4], appointinfo[5]);
                       PrintArea.append(formatted);
                        choice =1;
                        break;
                    }
                }
                if(choice==0)
                {
                    JOptionPane.showMessageDialog(this,"Record not found.","System Message"
                            ,JOptionPane.INFORMATION_MESSAGE);
                            Passport.setText("");
                }

            }
            catch(Exception e)
            { JOptionPane.showMessageDialog(this,"No Record Found","Record not found"
                    ,JOptionPane.INFORMATION_MESSAGE); }
        }
        */
       
    }//GEN-LAST:event_ViewallActionPerformed

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
            java.util.logging.Logger.getLogger(ViewCwGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewCwGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewCwGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewCwGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewCwGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackBut;
    private javax.swing.JButton ExitBut;
    private javax.swing.JTextArea PrintArea;
    private javax.swing.JComboBox<String> Status;
    private javax.swing.JButton Viewall;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
