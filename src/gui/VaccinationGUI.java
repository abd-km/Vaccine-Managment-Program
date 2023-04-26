/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui;

/**
 *
 * @author am
 */
public class VaccinationGUI extends javax.swing.JFrame {

    /**
     * Creates new form VaccinationGUI
     */
    public VaccinationGUI() {
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

        MainLabel = new javax.swing.JLabel();
        BackBut = new javax.swing.JButton();
        ExitBut = new javax.swing.JButton();
        ViewCWBut = new javax.swing.JButton();
        SearchCWBut = new javax.swing.JButton();
        ViewLabel = new javax.swing.JLabel();
        SearchLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        MainLabel.setFont(new java.awt.Font("Skia", 1, 24)); // NOI18N
        MainLabel.setText("People Vaccination Panel");

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

        ViewCWBut.setText("View Vaccines");
        ViewCWBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewCWButActionPerformed(evt);
            }
        });

        SearchCWBut.setText("Search Vaccines");
        SearchCWBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchCWButActionPerformed(evt);
            }
        });

        ViewLabel.setFont(new java.awt.Font("Skia", 0, 18)); // NOI18N
        ViewLabel.setText("View");

        SearchLabel.setFont(new java.awt.Font("Skia", 0, 18)); // NOI18N
        SearchLabel.setText("Search");

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
                        .addContainerGap(85, Short.MAX_VALUE)
                        .addComponent(MainLabel)
                        .addGap(0, 85, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(204, 204, 204)
                                .addComponent(SearchLabel))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(167, 167, 167)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ViewCWBut, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(SearchCWBut, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(207, 207, 207)
                .addComponent(ViewLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(MainLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(ViewLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ViewCWBut, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(SearchLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SearchCWBut, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BackBut)
                    .addComponent(ExitBut))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ExitButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitButActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_ExitButActionPerformed

    private void BackButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        ListGUI lg = new ListGUI();
        lg.setVisible(true);
    }//GEN-LAST:event_BackButActionPerformed

    private void ViewCWButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewCWButActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        ViewCwGUI cw = new ViewCwGUI();
        cw.setVisible(true);
    }//GEN-LAST:event_ViewCWButActionPerformed

    private void SearchCWButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchCWButActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        SearchVRGUI sw = new SearchVRGUI();
        sw.setVisible(true);
    }//GEN-LAST:event_SearchCWButActionPerformed

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
            java.util.logging.Logger.getLogger(VaccinationGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VaccinationGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VaccinationGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VaccinationGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VaccinationGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackBut;
    private javax.swing.JButton ExitBut;
    private javax.swing.JLabel MainLabel;
    private javax.swing.JButton SearchCWBut;
    private javax.swing.JLabel SearchLabel;
    private javax.swing.JButton ViewCWBut;
    private javax.swing.JLabel ViewLabel;
    // End of variables declaration//GEN-END:variables
}
