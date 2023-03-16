
package eventmanagement;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public final class EventmanagementSignUp extends javax.swing.JInternalFrame 
{

public EventmanagementSignUp()
{
    initComponents();
        
    EMS_Connection cn=new EMS_Connection(); //Object of Connection class
    getid();  //Calling of method for displaying user id
}

    
  
public void getid() //Method for getting user id from database
{
    try
    {
       String s="";
       ResultSet rs=EMS_Connection.st.executeQuery("select max([User_Id]) from tbl_User");
            if (rs.next())
            {
                s=Integer.toString(rs.getInt(1)+1);
            }
            lblId.setText(s);
        
    }
    catch(Exception ex)
    {
        System.out.println(ex);
    }
}
//End of Method for getting user id from database 

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        btnReset = new javax.swing.JButton();
        btnSignUp = new javax.swing.JButton();
        txtName = new javax.swing.JTextField();
        txtAge = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        txtConfirmPass = new javax.swing.JPasswordField();
        lblName = new javax.swing.JLabel();
        lblAge = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        lblConfirmPass = new javax.swing.JLabel();
        lblId = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 204));
        setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 102, 0)));
        setTitle("SignUp Here");
        setMinimumSize(new java.awt.Dimension(77, 31));
        setPreferredSize(new java.awt.Dimension(750, 600));
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameActivated(evt);
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });
        getContentPane().setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 153, 0)));
        jPanel1.setLayout(null);

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

        jPanel1.add(jPanel3);
        jPanel3.setBounds(0, 0, 720, 60);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 153, 0));
        jLabel2.setText("EVENT");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(50, 350, 170, 70);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 153, 0));
        jLabel4.setText("   MANAGEMENT SYSTEM");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(70, 410, 360, 50);

        jLabel5.setIcon(new javax.swing.ImageIcon("E:\\iProject\\EventManagement\\EventManagement\\src\\eventmanagement\\Images\\Calendar.png")); // NOI18N
        jPanel1.add(jLabel5);
        jLabel5.setBounds(550, 320, 160, 160);

        jLabel3.setIcon(new javax.swing.ImageIcon("E:\\iProject\\EventManagement\\EventManagement\\src\\eventmanagement\\Images\\sign-up-icon.png")); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(0, 60, 250, 210);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Name:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(280, 130, 90, 20);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Age:");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(280, 170, 90, 20);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Email:");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(280, 210, 90, 20);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Password:");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(280, 250, 80, 20);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Confirm Password:");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(280, 290, 120, 20);

        btnReset.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnReset.setIcon(new javax.swing.ImageIcon("E:\\iProject\\EventManagement\\EventManagement\\src\\eventmanagement\\Images\\reset icon.png")); // NOI18N
        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });
        jPanel1.add(btnReset);
        btnReset.setBounds(300, 340, 110, 40);

        btnSignUp.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnSignUp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eventmanagement/Images/sign_up.png"))); // NOI18N
        btnSignUp.setText("Sign Up");
        btnSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignUpActionPerformed(evt);
            }
        });
        jPanel1.add(btnSignUp);
        btnSignUp.setBounds(430, 340, 110, 40);

        txtName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtName.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtNameCaretUpdate(evt);
            }
        });
        jPanel1.add(txtName);
        txtName.setBounds(420, 120, 140, 30);

        txtAge.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtAge.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtAgeCaretUpdate(evt);
            }
        });
        jPanel1.add(txtAge);
        txtAge.setBounds(420, 160, 140, 30);

        txtEmail.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtEmail.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtEmailCaretUpdate(evt);
            }
        });
        jPanel1.add(txtEmail);
        txtEmail.setBounds(420, 200, 140, 30);

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel12.setText("Your User Id is:");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(440, 60, 120, 40);

        jLabel13.setIcon(new javax.swing.ImageIcon("E:\\iProject\\EventManagement\\EventManagement\\src\\eventmanagement\\Images\\ID-icon.png")); // NOI18N
        jPanel1.add(jLabel13);
        jLabel13.setBounds(400, 60, 40, 40);

        txtPassword.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtPasswordCaretUpdate(evt);
            }
        });
        jPanel1.add(txtPassword);
        txtPassword.setBounds(420, 240, 140, 30);

        txtConfirmPass.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtConfirmPassCaretUpdate(evt);
            }
        });
        jPanel1.add(txtConfirmPass);
        txtConfirmPass.setBounds(420, 280, 140, 30);

        lblName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblName.setText("Required");
        jPanel1.add(lblName);
        lblName.setBounds(570, 120, 90, 30);

        lblAge.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblAge.setText("Required");
        jPanel1.add(lblAge);
        lblAge.setBounds(570, 160, 90, 30);

        lblEmail.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblEmail.setText("Required");
        jPanel1.add(lblEmail);
        lblEmail.setBounds(570, 200, 90, 30);

        lblPassword.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblPassword.setText("Required");
        jPanel1.add(lblPassword);
        lblPassword.setBounds(570, 240, 90, 30);

        lblConfirmPass.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblConfirmPass.setText("Required");
        jPanel1.add(lblConfirmPass);
        lblConfirmPass.setBounds(570, 280, 90, 30);

        lblId.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jPanel1.add(lblId);
        lblId.setBounds(560, 60, 40, 40);

        jLabel15.setIcon(new javax.swing.ImageIcon("E:\\iProject\\EventManagement\\EventManagement\\src\\eventmanagement\\Images\\calendar icon main.png")); // NOI18N
        jPanel1.add(jLabel15);
        jLabel15.setBounds(0, 60, 720, 420);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 720, 480);
        getContentPane().add(jLabel14);
        jLabel14.setBounds(0, 60, 720, 420);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignUpActionPerformed
        // information will be saved in database on button click if given conditions are matched    
    try{
        if (lblName.getText().equals("VALID") && lblAge.getText().equals("VALID") && lblEmail.getText().equals("VALID") && lblPassword.getText().equals("VALID") && lblConfirmPass.getText().equals("MATCHED"))
        {    
            ResultSet rs=EMS_Connection.st.executeQuery("select User_Name from tbl_User where User_Name='"+txtName.getText()+"'");
            if (rs.next())
            {
                JOptionPane.showMessageDialog(this, "Username already exists");
            }
            else
            {     
            EMS_Connection.st.executeUpdate("insert into tbl_User values('"+lblId.getText()+"','"+txtName.getText()+"','"+txtAge.getText()+"','"+txtEmail.getText()+"','"+txtPassword.getText()+"')");
            JOptionPane.showMessageDialog(null,"Sign Up Successful");
            this.hide();
            EventmanagementLogin ln=new EventmanagementLogin();
            eventmanagementjframe jf=new eventmanagementjframe();
            jf.add(ln);
            ln.show();
            }
        }
        else
        {
        JOptionPane.showMessageDialog(this, "Please enter correct information");
        }
    }
        catch (Exception ex)
            {
                System.out.println(ex.getMessage());
            }    
                if (lblName.getText().equals("Required") || lblAge.getText().equals("Required") || lblEmail.getText().equals("Required") || lblPassword.getText().equals("Required") || lblConfirmPass.getText().equals("Required"))
                {
                    JOptionPane.showMessageDialog(this, "All fields are Required");
                }   
    }//GEN-LAST:event_btnSignUpActionPerformed

    private void txtNameCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtNameCaretUpdate
        // Validations for User Name field
         String s="^[a-zA-Z]{3,10}$";
         lblName.setText(EMS_Validation.validation(s, txtName.getText())); 
            if (txtName.getText().equals(""))
            {
                lblName.setText("Required");
            }     
    }//GEN-LAST:event_txtNameCaretUpdate

    private void txtAgeCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtAgeCaretUpdate
         // Validations for User Age field
         String s="^[0-9]{1,2}$";
         lblAge.setText(EMS_Validation.validation(s, txtAge.getText())); 
            if (txtAge.getText().equals(""))
            {
                lblAge.setText("Required");
            }
    }//GEN-LAST:event_txtAgeCaretUpdate

    private void txtEmailCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtEmailCaretUpdate
       // Validations for User Email field
        String s="^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{3,})$";
        lblEmail.setText(EMS_Validation.validation(s, txtEmail.getText()));

            if (txtEmail.getText().equals(""))
            {
                lblEmail.setText("Required");
            }
    }//GEN-LAST:event_txtEmailCaretUpdate

    private void txtPasswordCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtPasswordCaretUpdate
        // Validations for Password field
         String s="^[a-zA-Z,0-9,@,!,#]{5,30}$";
         lblPassword.setText(EMS_Validation.validation(s, txtPassword.getText()));      
            if (txtPassword.getText().equals(""))
            {
                lblPassword.setText("Required");
            }
    }//GEN-LAST:event_txtPasswordCaretUpdate

    private void txtConfirmPassCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtConfirmPassCaretUpdate
        // Validations for Confirm Password field
        if (txtConfirmPass.getText().matches(txtPassword.getText()))
        {
            lblConfirmPass.setText("MATCHED");
        } 
        else 
        {
            lblConfirmPass.setText("INVALID");
        }
        
            if (txtConfirmPass.getText().equals(""))
            {
                lblConfirmPass.setText("Required");
            }
    }//GEN-LAST:event_txtConfirmPassCaretUpdate

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        // All Fields will be reset on button click
       
        txtName.setText("");                lblName.setText("");
        txtAge.setText("");                 lblAge.setText("");
        txtEmail.setText("");               lblEmail.setText("");
        txtPassword.setText("");            lblPassword.setText("");
        txtConfirmPass.setText("");         lblConfirmPass.setText("");
        
    }//GEN-LAST:event_btnResetActionPerformed

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated

    }//GEN-LAST:event_formInternalFrameActivated

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSignUp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
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
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblConfirmPass;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JTextField txtAge;
    private javax.swing.JPasswordField txtConfirmPass;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtName;
    private javax.swing.JPasswordField txtPassword;
    // End of variables declaration//GEN-END:variables
}
