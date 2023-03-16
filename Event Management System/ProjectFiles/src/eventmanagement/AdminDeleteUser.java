
package eventmanagement;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class AdminDeleteUser extends javax.swing.JInternalFrame 
{

public AdminDeleteUser() 
{
    initComponents();
    EMS_Connection cn=new EMS_Connection(); //Object of Connection Class
    AllUsers(); //Calling of method for displaying all users information
}

public void AllUsers() //Method for displaying all Users 
{
    try
    {
        DefaultTableModel obj=new DefaultTableModel();
 
   obj.addColumn("User Id");
   obj.addColumn("User Name");
   obj.addColumn("User Age");  
   obj.addColumn("User Email");
   obj.addColumn("User Password");
   

 ResultSet rs=EMS_Connection.st.executeQuery("select [User_Id],[User_Name],User_Age,User_Email,User_Password from tbl_User order by [User_Id] asc");
        
        while (rs.next()) 
        {            
    obj.addRow(new Object[]{rs.getInt("User_Id"),rs.getString("User_Name"),
    rs.getInt("User_Age"),rs.getString("User_Email"),rs.getString("User_Password")});
        }
    tableAdminDeleteUser.setModel(obj);
    }
    
    catch(Exception ex)
   {
       System.out.println(ex);
   }
    
}
//End of Method for displaying all Users


public void DeleteEvent() //Method for deleting a User
{
        try 
        {
            String delete="delete tbl_User where User_Id='"+txtUserId.getText()+"'";
            EMS_Connection.st.executeUpdate(delete);
            JOptionPane.showMessageDialog(this, "User Deleted");
            
        } 
        catch (Exception ex)
        {
            JOptionPane.showMessageDialog(this, "Delete failed!");
        }
}
//End of Method for deleting a User

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableAdminDeleteUser = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtUserId = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 102, 0)));
        setTitle("Delete User\n");
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

        jLabel10.setIcon(new javax.swing.ImageIcon("E:\\iProject\\EventManagement\\EventManagement\\src\\eventmanagement\\Images\\user_info_icon.png")); // NOI18N
        getContentPane().add(jLabel10);
        jLabel10.setBounds(220, 80, 130, 130);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel8.setText("User Information");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(360, 110, 240, 40);

        tableAdminDeleteUser.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tableAdminDeleteUser.setRowHeight(32);
        jScrollPane1.setViewportView(tableAdminDeleteUser);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 300, 700, 230);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel1.setText("User ID:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(250, 240, 80, 40);

        txtUserId.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        getContentPane().add(txtUserId);
        txtUserId.setBounds(330, 240, 70, 40);

        jButton2.setIcon(new javax.swing.ImageIcon("E:\\iProject\\EventManagement\\EventManagement\\src\\eventmanagement\\Images\\delete_icon.png")); // NOI18N
        jButton2.setText("Delete");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(410, 240, 110, 40);

        jLabel9.setIcon(new javax.swing.ImageIcon("E:\\iProject\\EventManagement\\EventManagement\\src\\eventmanagement\\Images\\calendar icon main.png")); // NOI18N
        getContentPane().add(jLabel9);
        jLabel9.setBounds(0, 84, 740, 480);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // Deleting a user by user id
        try{
        String s="^[0-9]{1,2}$";
        if (txtUserId.getText().matches(s)) 
        {
            ResultSet rs=EMS_Connection.st.executeQuery("select User_Id from tbl_User where User_Id='"+txtUserId.getText()+"'");
            if (rs.next())
            {
        int a=JOptionPane.showConfirmDialog(this, "Are you sure you want to delete this User","User Deleted",JOptionPane.YES_NO_OPTION);
        if (a==0)
        {
           DeleteEvent(); 
           AllUsers();
        }
        }
            else
            {
                JOptionPane.showMessageDialog(this, "User Id not found");
            }
        }
        
        else
        {
            JOptionPane.showMessageDialog(this, "Invalid User Id");
        }    
        }
        catch(Exception ex)
        {
            System.out.println(ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableAdminDeleteUser;
    private javax.swing.JTextField txtUserId;
    // End of variables declaration//GEN-END:variables
}
