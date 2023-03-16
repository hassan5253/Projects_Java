
package eventmanagement;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class EMS_UserPanel extends javax.swing.JInternalFrame {

   
   
    public EMS_UserPanel()
    {
        initComponents();
        
        EMS_Connection cn=new EMS_Connection(); //Object of Connection class
        getname(); //Calling of method for displaying user name 
        getid();  //Calling of method for displaying user id
        UserInfo(); // Calling of method for displaying user info 
    }
    
public void getname() //Method for getting user name from login frame
{
    txtUserName.setText(EMS_GetUserName.name);
}
//End of Method for getting user name from login frame


public void getid() //Method for getting user id from database
{
      try 
      {
            String id="select User_Id from tbl_User where User_Name='"+txtUserName.getText()+"'";
            ResultSet rs=EMS_Connection.st.executeQuery(id);
                if (rs.next()) 
                {
                    txtUserIdheader.setText(rs.getString("User_Id"));              
                }
      } 
      catch (Exception ex) 
      {
            System.out.println(ex);
      }
}
//End of Method for getting user id from database   
    
    
public void UserInfo() //Method for displaying user information from database in User Panel 
{
    try
    {
        String query="select User_Name,User_Age,User_Email from tbl_User where User_Id='"+txtUserIdheader.getText()+"'";
        ResultSet rs=EMS_Connection.st.executeQuery(query);
            if (rs.next()) 
            {
                txtName.setText(rs.getString("User_Name"));
                txtAge.setText(rs.getString("User_Age"));
                txtEmail.setText(rs.getString("User_Email"));                       
            }
            else 
            {
                JOptionPane.showMessageDialog(this, "User Info not found");
            }
    }
    catch(Exception ex)
    {
        
        System.out.println(ex);
    }
 }
//End of Method for displaying user information from database in User Panel


public void ResetFields() //Method for resetting fields of user info
{
     txtName.setText("");
     txtAge.setText("");
     txtEmail.setText("");
}
//End of Method for resetting fields of user info     
     

public void UpdateUserInfo() //Method for ubdating User Information
{
         
   try 
   {
            String updateInfo="update tbl_User set User_Name='"+txtName.getText()+"',User_Age='"+txtAge.getText()+"',User_Email='"+txtEmail.getText()+"' where User_ID='"+txtUserIdheader.getText()+"'";
            EMS_Connection.st.executeUpdate(updateInfo);
            JOptionPane.showMessageDialog(this, "Record Updated");
            ResetFields();
   } 
   catch (SQLException ex) 
   {
            JOptionPane.showMessageDialog(this, "Update failed!");
   }
       
}
//End of Method for ubdating User Information     
     
public void ResetPassFields() //Method for reseting Password field
{
     txtOldPass.setText("");
     txtNewPass.setText("");
     txtConfirmPass.setText("");
}
//End of Method for reseting Password field


public void ChangePass() //Method for changing password in user panel frame
{    
    try 
    {
        ResultSet rs=EMS_Connection.st.executeQuery("select User_Password from tbl_User where User_Id='"+txtUserIdheader.getText()+"' and User_Password='"+txtOldPass.getText()+"'");
        if (rs.next())
        {
            String changepass="update tbl_User set User_Password='"+txtNewPass.getText()+"' where User_ID='"+txtUserIdheader.getText()+"'";
            EMS_Connection.st.executeUpdate(changepass);
            JOptionPane.showMessageDialog(this, "Password Changed");
            ResetPassFields();
        }
        else
        {
            JOptionPane.showMessageDialog(this, "Enter correct Old Password");
        }
    }
    catch (Exception ex)
    {
        JOptionPane.showMessageDialog(this, "Password Change Unsuccessfull!");
    }
}
//End of Method for changing password in user panel frame   

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtAge = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtOldPass = new javax.swing.JPasswordField();
        txtNewPass = new javax.swing.JPasswordField();
        txtConfirmPass = new javax.swing.JPasswordField();
        btnChangePass = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        txtUserName = new javax.swing.JLabel();
        txtUserIdheader = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jLabel45 = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 102, 0)));
        setTitle("User Panel");
        setPreferredSize(new java.awt.Dimension(750, 600));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Name:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 270, 70, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Age:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 320, 70, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Email:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 370, 70, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Change Password");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(560, 130, 180, 40);

        txtEmail.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtEmailCaretUpdate(evt);
            }
        });
        getContentPane().add(txtEmail);
        txtEmail.setBounds(90, 370, 130, 30);
        getContentPane().add(txtName);
        txtName.setBounds(90, 270, 130, 30);
        getContentPane().add(txtAge);
        txtAge.setBounds(90, 320, 130, 30);

        btnSave.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnSave.setIcon(new javax.swing.ImageIcon("E:\\iProject\\EventManagement\\EventManagement\\src\\eventmanagement\\Images\\save_icon.png")); // NOI18N
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        getContentPane().add(btnSave);
        btnSave.setBounds(80, 440, 120, 40);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Confirm Password:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(470, 370, 140, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Old Password:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(480, 270, 120, 20);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("New Password:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(480, 320, 120, 30);

        txtOldPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOldPassActionPerformed(evt);
            }
        });
        getContentPane().add(txtOldPass);
        txtOldPass.setBounds(610, 270, 120, 30);
        getContentPane().add(txtNewPass);
        txtNewPass.setBounds(610, 320, 120, 30);
        getContentPane().add(txtConfirmPass);
        txtConfirmPass.setBounds(610, 370, 120, 30);

        btnChangePass.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnChangePass.setIcon(new javax.swing.ImageIcon("E:\\iProject\\EventManagement\\EventManagement\\src\\eventmanagement\\Images\\reset icon.png")); // NOI18N
        btnChangePass.setText("Change Password");
        btnChangePass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangePassActionPerformed(evt);
            }
        });
        getContentPane().add(btnChangePass);
        btnChangePass.setBounds(540, 440, 177, 40);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("User Information");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(150, 130, 160, 40);

        jLabel9.setIcon(new javax.swing.ImageIcon("E:\\iProject\\EventManagement\\EventManagement\\src\\eventmanagement\\Images\\change_pass_icon.png")); // NOI18N
        getContentPane().add(jLabel9);
        jLabel9.setBounds(430, 100, 130, 130);

        jLabel10.setIcon(new javax.swing.ImageIcon("E:\\iProject\\EventManagement\\EventManagement\\src\\eventmanagement\\Images\\user_info_icon.png")); // NOI18N
        getContentPane().add(jLabel10);
        jLabel10.setBounds(20, 90, 120, 140);

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
        jLabel33.setBounds(70, 30, 110, 17);

        jLabel34.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel34.setText("System");
        jPanel5.add(jLabel34);
        jLabel34.setBounds(70, 50, 70, 17);

        jLabel35.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel35.setText("User Name:");
        jPanel5.add(jLabel35);
        jLabel35.setBounds(250, 20, 80, 30);

        jLabel36.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel36.setText("User Id:");
        jPanel5.add(jLabel36);
        jLabel36.setBounds(530, 20, 60, 30);

        txtUserName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel5.add(txtUserName);
        txtUserName.setBounds(330, 20, 90, 30);

        txtUserIdheader.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel5.add(txtUserIdheader);
        txtUserIdheader.setBounds(590, 20, 100, 30);

        jLabel31.setIcon(new javax.swing.ImageIcon("E:\\iProject\\EventManagement\\EventManagement\\src\\eventmanagement\\Images\\1426575633_tmp_header_calendar.png")); // NOI18N
        jPanel5.add(jLabel31);
        jLabel31.setBounds(10, 10, 50, 60);

        jLabel37.setIcon(new javax.swing.ImageIcon("E:\\iProject\\EventManagement\\EventManagement\\src\\eventmanagement\\Images\\User.png")); // NOI18N
        jPanel5.add(jLabel37);
        jLabel37.setBounds(200, 10, 40, 40);

        jLabel38.setIcon(new javax.swing.ImageIcon("E:\\iProject\\EventManagement\\EventManagement\\src\\eventmanagement\\Images\\ID-icon.png")); // NOI18N
        jPanel5.add(jLabel38);
        jLabel38.setBounds(480, 20, 40, 30);

        jButton1.setIcon(new javax.swing.ImageIcon("E:\\iProject\\EventManagement\\EventManagement\\src\\eventmanagement\\Images\\help.jpg")); // NOI18N
        jButton1.setText("Help");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton1);
        jButton1.setBounds(640, 20, 90, 41);

        getContentPane().add(jPanel5);
        jPanel5.setBounds(0, 0, 740, 80);

        jLabel11.setIcon(new javax.swing.ImageIcon("E:\\iProject\\EventManagement\\EventManagement\\src\\eventmanagement\\Images\\ControlPanel.png")); // NOI18N
        getContentPane().add(jLabel11);
        jLabel11.setBounds(220, 240, 250, 260);

        jButton5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon("E:\\iProject\\EventManagement\\EventManagement\\src\\eventmanagement\\Images\\exit.png")); // NOI18N
        jButton5.setText("Exit");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(310, 500, 130, 40);

        jLabel45.setIcon(new javax.swing.ImageIcon("E:\\iProject\\EventManagement\\EventManagement\\src\\eventmanagement\\Images\\calendar icon main.png")); // NOI18N
        getContentPane().add(jLabel45);
        jLabel45.setBounds(0, 80, 740, 470);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        //Changes will be saved if given conditions are matched
        String s="^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{3,})$";
        String a="^[0-9]{1,2}$";
        String b="^[a-zA-Z]{3,10}$";
         if (txtEmail.getText().matches(s)) {
             if (txtAge.getText().matches(a)) {
                 if (txtName.getText().matches(b)) {
            UpdateUserInfo();
                 }
                 else{
                 JOptionPane.showMessageDialog(this, "Insert correct Name");
                 }
             }
             else{
             JOptionPane.showMessageDialog(this, "Insert correct Age");
             }
        }
         else{
         JOptionPane.showMessageDialog(this, "Insert correct Email Id");
         }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void txtOldPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOldPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOldPassActionPerformed

    private void btnChangePassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangePassActionPerformed
        // Password will be changed if given conditions are matched
          String s="^[a-zA-Z,0-9,@,!,#]{5,30}$";
          if (txtNewPass.getText().matches(s) && txtConfirmPass.getText().matches(txtNewPass.getText())) {
            ChangePass();
        }
          else{
         JOptionPane.showMessageDialog(this, "Insert correct Password");
         }
    }//GEN-LAST:event_btnChangePassActionPerformed

    private void txtEmailCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtEmailCaretUpdate

    }//GEN-LAST:event_txtEmailCaretUpdate

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // Program will be exited on button click
        int a=JOptionPane.showConfirmDialog(this, "Are you sure you want to exit?","Exited",JOptionPane.YES_NO_OPTION);
            if (a==0) 
            {
                System.exit(1);
            }        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // Pdf file related to the frame will be open on button click
        try 
        {
            Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler "+"E:\\iProject\\EventManagement\\EventManagement\\src\\eventmanagement\\EMS_UserPanel.pdf");
        } 
        catch (Exception ex)
        {
            System.out.println(ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChangePass;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTextField txtAge;
    private javax.swing.JPasswordField txtConfirmPass;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtName;
    private javax.swing.JPasswordField txtNewPass;
    private javax.swing.JPasswordField txtOldPass;
    private javax.swing.JLabel txtUserIdheader;
    private javax.swing.JLabel txtUserName;
    // End of variables declaration//GEN-END:variables
}
