
package eventmanagement;

import javax.swing.JDesktopPane;
import java.sql.*;
import javax.swing.JOptionPane;

public class eventmanagementjframe extends javax.swing.JFrame {

    public eventmanagementjframe() {
        initComponents();
        EventmanagementSignUp su=new EventmanagementSignUp(); //Object of SignUp frame
        jDesktopPane1.add(su); //on frame load SignUp frame will be added on jDesktopPane1
        su.show(); //Displaying login form

    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jDesktopPane1 = new javax.swing.JDesktopPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(860, 535));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setLayout(null);
        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 354, 0, 0);

        jPanel3.setLayout(null);
        getContentPane().add(jPanel3);
        jPanel3.setBounds(0, 49, 0, 0);

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));
        jPanel4.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 51, 0)));
        jPanel4.setLayout(null);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon("E:\\iProject\\EventManagement\\EventManagement\\src\\eventmanagement\\Images\\Login icon.png")); // NOI18N
        jButton1.setText("Login");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton1);
        jButton1.setBounds(10, 30, 110, 50);

        jButton2.setIcon(new javax.swing.ImageIcon("E:\\iProject\\EventManagement\\EventManagement\\src\\eventmanagement\\Images\\sign_up.png")); // NOI18N
        jButton2.setText("Signup");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton2);
        jButton2.setBounds(10, 90, 110, 50);

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon("E:\\iProject\\EventManagement\\EventManagement\\src\\eventmanagement\\Images\\exit.png")); // NOI18N
        jButton3.setText("Exit");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton3);
        jButton3.setBounds(10, 210, 110, 50);

        jButton4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon("E:\\iProject\\EventManagement\\EventManagement\\src\\eventmanagement\\Images\\admin.png")); // NOI18N
        jButton4.setText("Admin");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton4);
        jButton4.setBounds(10, 150, 110, 50);

        getContentPane().add(jPanel4);
        jPanel4.setBounds(0, 0, 130, 500);

        jDesktopPane1.setMinimumSize(new java.awt.Dimension(77, 31));
        jDesktopPane1.setPreferredSize(new java.awt.Dimension(750, 600));
        getContentPane().add(jDesktopPane1);
        jDesktopPane1.setBounds(130, 0, 720, 500);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // Sign Up page will appear on button click
        jDesktopPane1.removeAll();
        EventmanagementSignUp su = new EventmanagementSignUp();
        jDesktopPane1.add(su);
        su.show();

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // Login page will appear on button click
        jDesktopPane1.removeAll();
        EventmanagementLogin ev = new EventmanagementLogin();
        jDesktopPane1.add(ev);
        ev.show();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
     // Program will be exited on button click
     int a=JOptionPane.showConfirmDialog(this, "Are you sure you want to exit?","Exited",JOptionPane.YES_NO_OPTION);
            if (a==0) 
            {
                System.exit(1);
            }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // Admin panel will appear on button click
        jDesktopPane1.removeAll();
        EMS_Admin am = new EMS_Admin();
        jDesktopPane1.add(am);
        am.show();
    }//GEN-LAST:event_jButton4ActionPerformed

    public static void main(String args[]) {
     

        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(eventmanagementjframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(eventmanagementjframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(eventmanagementjframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(eventmanagementjframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new eventmanagementjframe().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}
