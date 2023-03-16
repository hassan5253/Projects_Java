
package eventmanagement;

import java.sql.*;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JDesktopPane;
import net.proteanit.sql.DbUtils;


public class EventmanagementLogin extends javax.swing.JInternalFrame
{

    
public EventmanagementLogin() {
        initComponents();
        
        EMS_Connection cn=new EMS_Connection(); //Object of Connection Class
    }

   
public void Resetfields() //Method for resetting fields
{
    txtUserName.setText(null);
    txtPassword.setText(null);
}

    @SuppressWarnings("unchecked")
 
public static void main(String arr[])
{ 
     
}
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        btnLogin = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        lblPassword = new javax.swing.JLabel();
        lblUserName = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();

        jLabel1.setToolTipText("");

        setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 102, 0), 2, true));
        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setFont(new java.awt.Font("Arial Black", 0, 10)); // NOI18N
        setPreferredSize(new java.awt.Dimension(750, 650));

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${background}"), this, org.jdesktop.beansbinding.BeanProperty.create("background"));
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${foreground}"), this, org.jdesktop.beansbinding.BeanProperty.create("foreground"));
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("Event Management System"), this, org.jdesktop.beansbinding.BeanProperty.create("title"));
        bindingGroup.addBinding(binding);

        getContentPane().setLayout(null);

        jPanel1.setLayout(null);
        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 0, 280);

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 51, 0)));
        jPanel2.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 153, 0));
        jLabel2.setText("EVENT");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(40, 340, 170, 70);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 153, 0));
        jLabel4.setText("   MANAGEMENT SYSTEM");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(30, 390, 360, 60);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel6.setText("User Name:");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(260, 90, 100, 30);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel7.setText("Password:");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(260, 140, 100, 30);

        txtUserName.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtUserName.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtUserNameCaretUpdate(evt);
            }
        });
        txtUserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserNameActionPerformed(evt);
            }
        });
        jPanel2.add(txtUserName);
        txtUserName.setBounds(360, 90, 140, 30);

        btnLogin.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnLogin.setIcon(new javax.swing.ImageIcon("E:\\iProject\\EventManagement\\EventManagement\\src\\eventmanagement\\Images\\login_icon.png")); // NOI18N
        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        jPanel2.add(btnLogin);
        btnLogin.setBounds(380, 190, 100, 50);

        jPanel3.setBackground(new java.awt.Color(255, 153, 0));
        jPanel3.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 51, 0)));
        jPanel3.setLayout(null);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("EVENT MANAGEMENT SYSTEM");
        jPanel3.add(jLabel8);
        jLabel8.setBounds(70, 0, 240, 60);

        jLabel9.setIcon(new javax.swing.ImageIcon("E:\\iProject\\EventManagement\\EventManagement\\src\\eventmanagement\\Images\\1426575633_tmp_header_calendar.png")); // NOI18N
        jPanel3.add(jLabel9);
        jLabel9.setBounds(10, 10, 50, 40);

        jPanel2.add(jPanel3);
        jPanel3.setBounds(0, 0, 730, 60);

        jLabel3.setIcon(new javax.swing.ImageIcon("E:\\iProject\\EventManagement\\EventManagement\\src\\eventmanagement\\Images\\User-icon.png")); // NOI18N
        jPanel2.add(jLabel3);
        jLabel3.setBounds(0, 70, 240, 250);

        jLabel5.setIcon(new javax.swing.ImageIcon("E:\\iProject\\EventManagement\\EventManagement\\src\\eventmanagement\\Images\\Calendar.png")); // NOI18N
        jPanel2.add(jLabel5);
        jLabel5.setBounds(200, 310, 160, 170);

        jLabel10.setIcon(new javax.swing.ImageIcon("E:\\iProject\\EventManagement\\EventManagement\\src\\eventmanagement\\Images\\User Control Panel.png")); // NOI18N
        jPanel2.add(jLabel10);
        jLabel10.setBounds(480, 220, 240, 260);

        txtPassword.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtPasswordCaretUpdate(evt);
            }
        });
        jPanel2.add(txtPassword);
        txtPassword.setBounds(360, 140, 140, 30);

        lblPassword.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblPassword.setText("Required");
        jPanel2.add(lblPassword);
        lblPassword.setBounds(520, 140, 100, 30);

        lblUserName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblUserName.setText("Required");
        jPanel2.add(lblUserName);
        lblUserName.setBounds(520, 90, 100, 30);

        jLabel15.setIcon(new javax.swing.ImageIcon("E:\\iProject\\EventManagement\\EventManagement\\src\\eventmanagement\\Images\\calendar icon main.png")); // NOI18N
        jPanel2.add(jLabel15);
        jLabel15.setBounds(0, 60, 730, 430);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 730, 490);

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // User will be loged in and current frame will switch to All Buttons Frame       
        String u=null;
        String p=null;

        try 
        {
            ResultSet rs=EMS_Connection.st.executeQuery("select * from tbl_User where [User_Name]='"+txtUserName.getText()+"' and User_Password='"+txtPassword.getText()+"'");
            while(rs.next())
            {
                u=rs.getString(2);
                p=rs.getString(5);
            }
            if(u.equals(txtUserName.getText())&& p.equals(txtPassword.getText()))
            {               
                JOptionPane.showMessageDialog(this,"Welcome "+u);
                EMS_GetUserName.name=txtUserName.getText();                
                eventmanagementjframe g=new eventmanagementjframe();
                g.dispose();
                
                EMS_Allbuttons aa=new EMS_Allbuttons();
                aa.setVisible(true);
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
        
                if(lblUserName.getText().equals("INVALID") || lblPassword.getText().equals("INVALID"))
                {
                    JOptionPane.showMessageDialog(this, "Invalid User Name or Password");
                }
                   else if(lblUserName.getText().equals("Required") || lblPassword.getText().equals("Required"))
                    {
                        JOptionPane.showMessageDialog(this, "All fields are Required");
                    }
                    Resetfields();
    }//GEN-LAST:event_btnLoginActionPerformed
  

    private void txtUserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserNameActionPerformed
 
    private void txtUserNameCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtUserNameCaretUpdate
        // Validations for User Name field
         String s="^[a-zA-Z]{3,10}$";
         lblUserName.setText(EMS_Validation.validation(s, txtUserName.getText()));  
            if (txtUserName.getText().equals(""))
            {
                lblUserName.setText("Required");
            }                   
    }//GEN-LAST:event_txtUserNameCaretUpdate

    private void txtPasswordCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtPasswordCaretUpdate
        // Validations for User Password field
          String s="^[a-zA-Z,0-9,!,@,#]{5,30}$";
          lblPassword.setText(EMS_Validation.validation(s, txtPassword.getText()));
                if (txtPassword.getText().equals(""))
                {
                    lblPassword.setText("Required");
                }
    }//GEN-LAST:event_txtPasswordCaretUpdate

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblUserName;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUserName;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
