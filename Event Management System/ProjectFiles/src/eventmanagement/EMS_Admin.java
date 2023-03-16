
package eventmanagement;

import javax.swing.JOptionPane;


public class EMS_Admin extends javax.swing.JInternalFrame {


    public EMS_Admin()
    {
        initComponents();
        EMS_Connection cn=new EMS_Connection(); //Object of connection class
    }

public void ResetFields() // Method for resetting fields
{
    txtUserName.setText(null);
    txtPassword.setText(null);
}  
// End of Method for resetting fields

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnLogin = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        lblPassword = new javax.swing.JLabel();
        lblUserName = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        jLabel8 = new javax.swing.JLabel();

        setTitle("Admin Panel");
        setPreferredSize(new java.awt.Dimension(750, 600));
        getContentPane().setLayout(null);

        jPanel5.setBackground(new java.awt.Color(255, 153, 0));
        jPanel5.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 51, 0)));
        jPanel5.setLayout(null);

        jLabel32.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel32.setText("Event");
        jPanel5.add(jLabel32);
        jLabel32.setBounds(70, 10, 60, 17);

        jLabel33.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel33.setText("Management");
        jPanel5.add(jLabel33);
        jLabel33.setBounds(70, 30, 80, 17);

        jLabel34.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel34.setText("System");
        jPanel5.add(jLabel34);
        jLabel34.setBounds(70, 50, 70, 17);

        jLabel31.setIcon(new javax.swing.ImageIcon("E:\\iProject\\EventManagement\\EventManagement\\src\\eventmanagement\\Images\\1426575633_tmp_header_calendar.png")); // NOI18N
        jPanel5.add(jLabel31);
        jLabel31.setBounds(10, 10, 50, 60);

        getContentPane().add(jPanel5);
        jPanel5.setBounds(0, 0, 740, 80);

        jLabel3.setIcon(new javax.swing.ImageIcon("E:\\iProject\\EventManagement\\EventManagement\\src\\eventmanagement\\Images\\User-icon.png")); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 90, 240, 250);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel6.setText("User Name:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(260, 110, 100, 30);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel7.setText("Password:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(260, 160, 100, 30);

        btnLogin.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnLogin.setIcon(new javax.swing.ImageIcon("E:\\iProject\\EventManagement\\EventManagement\\src\\eventmanagement\\Images\\login_icon.png")); // NOI18N
        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        getContentPane().add(btnLogin);
        btnLogin.setBounds(380, 210, 100, 50);

        jLabel10.setIcon(new javax.swing.ImageIcon("E:\\iProject\\EventManagement\\EventManagement\\src\\eventmanagement\\Images\\User Control Panel.png")); // NOI18N
        getContentPane().add(jLabel10);
        jLabel10.setBounds(480, 240, 240, 260);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 153, 0));
        jLabel2.setText("EVENT");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(40, 360, 170, 70);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 153, 0));
        jLabel4.setText("   MANAGEMENT SYSTEM");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(50, 410, 360, 60);

        jLabel5.setIcon(new javax.swing.ImageIcon("E:\\iProject\\EventManagement\\EventManagement\\src\\eventmanagement\\Images\\Calendar.png")); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(210, 330, 160, 170);

        txtUserName.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtUserName.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtUserNameCaretUpdate(evt);
            }
        });
        getContentPane().add(txtUserName);
        txtUserName.setBounds(350, 110, 140, 30);

        lblPassword.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblPassword.setText("Required");
        getContentPane().add(lblPassword);
        lblPassword.setBounds(500, 160, 110, 30);

        lblUserName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblUserName.setText("Required");
        getContentPane().add(lblUserName);
        lblUserName.setBounds(500, 110, 110, 30);

        txtPassword.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtPassword.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtPasswordCaretUpdate(evt);
            }
        });
        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });
        getContentPane().add(txtPassword);
        txtPassword.setBounds(350, 160, 140, 30);

        jLabel8.setIcon(new javax.swing.ImageIcon("E:\\iProject\\EventManagement\\EventManagement\\src\\eventmanagement\\Images\\calendar icon main.png")); // NOI18N
        getContentPane().add(jLabel8);
        jLabel8.setBounds(0, 74, 740, 450);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // User will be loged in and current frame will switch to All Buttons Frame
       try{
           String u="Admin";
           String p="admin123";
            if(u.equals(txtUserName.getText()) && p.equals(txtPassword.getText()))
            {
                JOptionPane.showMessageDialog(this,"Welcom "+u);

                AdminJframe jf=new AdminJframe();
                jf.show();
            }
            else
            {
                JOptionPane.showMessageDialog(this, "Invalid User Name or Password ");
            }
        }
        catch(Exception ex)
        {
            System.out.println(ex);
        }
         if(lblUserName.getText().equals("Required") || lblPassword.getText().equals("Required"))
        {
            JOptionPane.showMessageDialog(this, "All fields are Required");
        }
        ResetFields();
    }//GEN-LAST:event_btnLoginActionPerformed

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordActionPerformed

    private void txtUserNameCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtUserNameCaretUpdate
        // Validations for user name field
         String s="^[a-zA-Z]{5,5}$";
         lblUserName.setText(EMS_Validation.validation(s, txtUserName.getText()));  
            if (txtUserName.getText().equals(""))
            {
                lblUserName.setText("Required");
            }         
    }//GEN-LAST:event_txtUserNameCaretUpdate

    private void txtPasswordCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtPasswordCaretUpdate
        // Validations for password field
        String s="^[a-zA-Z,0-9,!,@,#]{8,8}$";
          lblPassword.setText(EMS_Validation.validation(s, txtPassword.getText()));
                if (txtPassword.getText().equals(""))
                {
                    lblPassword.setText("Required");
                }
    }//GEN-LAST:event_txtPasswordCaretUpdate


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblUserName;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}
