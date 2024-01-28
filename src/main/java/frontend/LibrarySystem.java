/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package frontend;

import constants.LoginCredentials;

/**
 *
 * @author HP
 */
public class LibrarySystem extends javax.swing.JFrame implements Point{

    /**
     * Creates new form LibrarySystem
     */
    public LibrarySystem() {
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

        AdminRole = new javax.swing.JButton();
        LibrarianRole = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Library System");
        setBackground(new java.awt.Color(0, 0, 0));
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));

        AdminRole.setBackground(new java.awt.Color(0, 0, 0));
        AdminRole.setForeground(new java.awt.Color(255, 255, 255));
        AdminRole.setText("Admin Role");
        AdminRole.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        AdminRole.setOpaque(true);
        AdminRole.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdminRoleActionPerformed(evt);
            }
        });

        LibrarianRole.setBackground(new java.awt.Color(0, 0, 0));
        LibrarianRole.setForeground(new java.awt.Color(255, 255, 255));
        LibrarianRole.setText("Librarian Role");
        LibrarianRole.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        LibrarianRole.setOpaque(true);
        LibrarianRole.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LibrarianRoleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(AdminRole, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(LibrarianRole, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(AdminRole, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(LibrarianRole, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AdminRoleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdminRoleActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        admin = new Login(LoginCredentials.ADMIN_USERNAME,LoginCredentials.ADMIN_PASSWORD,"Admin Login");
        admin.setPreviousPoint(this);
        admin.setVisible(true);
    }//GEN-LAST:event_AdminRoleActionPerformed

    private void LibrarianRoleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LibrarianRoleActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        librarian = new Login(LoginCredentials.LIBRARIAN_USERNAME,LoginCredentials.LIBRARIAN_PASSWORD,"Librarian Login");
        librarian.setPreviousPoint(this);
        librarian.setVisible(true);
    }//GEN-LAST:event_LibrarianRoleActionPerformed

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
            java.util.logging.Logger.getLogger(LibrarySystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LibrarySystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LibrarySystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LibrarySystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LibrarySystem().setVisible(true);
            }
        });
    }
public void setPreviousPoint(Point point)
{
    this.prevPoint = point;
}
public Point getPreviousPoint()
{
    return this.prevPoint;
}
private Point prevPoint;
Login admin;
Login librarian;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AdminRole;
    private javax.swing.JButton LibrarianRole;
    // End of variables declaration//GEN-END:variables
}
