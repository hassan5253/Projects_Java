
package eventmanagement;

import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.awt.Color;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextField;


public class EMS_Modify extends javax.swing.JInternalFrame {


    Date d=new Date(-1); //Object of Date

    public EMS_Modify()
    {
        initComponents();
        
        EMS_Connection cn=new EMS_Connection(); //Object of Connection class
        getname(); //Calling of method for displaying user name 
        getid();  //Calling of method for displaying user id
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
                if (rs.next()) {
                    txtUserId.setText(rs.getString("User_Id"));                
                               }
        }
        catch (Exception ex)
        {
            System.out.println(ex);
        }
 }
 //End ofMethod for getting user id from database
    
    
 
public void findEvent() //Method for finding event by Event Title for updating and deleting event
{
        try
        {
            String query="select Event_Date,Event_Time,Event_Title,Event_Colour,Event_Description from tbl_Event where Event_Id='"+txtEventId.getText()+"'";
            ResultSet rs=EMS_Connection.st.executeQuery(query);
                if (rs.next()) {
                    txtDate.setDate(rs.getDate("Event_Date"));
                    txtTime.setText(rs.getString("Event_Time"));
                    txtTitle.setText(rs.getString("Event_Title"));
                    txtColor.setText(rs.getString("Event_Colour"));
                    txtDescription.setText(rs.getString("Event_Description"));     
                               }
                else 
                {
                JOptionPane.showMessageDialog(this, "Event not found");
                }
    }
    catch(Exception ex)
    {
        
        System.out.println(ex);
    }
 }
//End of Method for finding event by Event Id for updating and deleting event


public void ResetFields() //Method for resetting all the fields after updating or deleting an event
{
    txtEventId.setText("");
    txtDate.setDate(null);
    txtTime.setText("");
    txtTitle.setText("");
    txtColor.setText("");
    txtDescription.setText("");
}
//End of Method for resetting all the fields after updating or deleting an event
  

public void updateEvent() //Method for updating an event
{
        try 
        {
            String update="update tbl_Event set Event_Date='"+((JTextField) txtDate.getDateEditor().getUiComponent()).getText()+"',Event_Time='"+txtTime.getText()+"',Event_Title='"+txtTitle.getText()+"',Event_Colour='"+txtColor.getText()+"',Event_Description='"+txtDescription.getText()+"' where Event_ID='"+txtEventId.getText()+"'";
            EMS_Connection.st.executeUpdate(update);
            JOptionPane.showMessageDialog(this, "Record Updated");
            ResetFields();
        } 
        catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(this, "Update failed!");
        }
}
//End of Method for updating an event    
  

public void DeleteEvent() //Method for deleting an event
{
        try 
        {
            String delete="delete tbl_Event where Event_ID='"+txtEventId.getText()+"'";
            EMS_Connection.st.executeUpdate(delete);
            JOptionPane.showMessageDialog(this, "Event Deleted");
            ResetFields();
        } 
        catch (Exception ex)
        {
            JOptionPane.showMessageDialog(this, "Delete failed!");
        }
}
//End of Method for deleting an event

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnReset = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescription = new javax.swing.JTextArea();
        jLabel44 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btnUpdate = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        txtUserName = new javax.swing.JLabel();
        txtUserId = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtEventId = new javax.swing.JTextField();
        txtDate = new com.toedter.calendar.JDateChooser();
        txtTime = new javax.swing.JTextField();
        txtTitle = new javax.swing.JTextField();
        txtColor = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 102, 0)));
        setTitle("Modify Events");
        setPreferredSize(new java.awt.Dimension(750, 600));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel1.setText("Title:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(540, 200, 60, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel2.setText("Date:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(70, 200, 60, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel3.setText("Description:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(60, 410, 100, 30);

        jLabel4.setIcon(new javax.swing.ImageIcon("E:\\iProject\\EventManagement\\EventManagement\\src\\eventmanagement\\Images\\calendar_clock.png")); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(20, 280, 50, 60);

        jLabel8.setIcon(new javax.swing.ImageIcon("E:\\iProject\\EventManagement\\EventManagement\\src\\eventmanagement\\Images\\date_icon.png")); // NOI18N
        getContentPane().add(jLabel8);
        jLabel8.setBounds(20, 190, 50, 50);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel5.setText("Time:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(70, 290, 60, 30);

        jLabel6.setIcon(new javax.swing.ImageIcon("E:\\iProject\\EventManagement\\EventManagement\\src\\eventmanagement\\Images\\color_icon.png")); // NOI18N
        getContentPane().add(jLabel6);
        jLabel6.setBounds(480, 280, 50, 50);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eventmanagement/Images/Titles-icon.png"))); // NOI18N
        getContentPane().add(jLabel7);
        jLabel7.setBounds(480, 190, 60, 48);

        btnReset.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnReset.setIcon(new javax.swing.ImageIcon("E:\\iProject\\EventManagement\\EventManagement\\src\\eventmanagement\\Images\\reset icon.png")); // NOI18N
        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });
        getContentPane().add(btnReset);
        btnReset.setBounds(100, 500, 120, 40);

        btnDelete.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnDelete.setIcon(new javax.swing.ImageIcon("E:\\iProject\\EventManagement\\EventManagement\\src\\eventmanagement\\Images\\delete_icon.png")); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        getContentPane().add(btnDelete);
        btnDelete.setBounds(370, 500, 120, 40);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel9.setText("Color:");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(540, 290, 60, 30);

        txtDescription.setColumns(20);
        txtDescription.setRows(5);
        jScrollPane1.setViewportView(txtDescription);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(170, 380, 430, 90);

        jLabel44.setText("YYYY-MM-DD");
        getContentPane().add(jLabel44);
        jLabel44.setBounds(150, 230, 90, 14);

        jLabel10.setIcon(new javax.swing.ImageIcon("E:\\iProject\\EventManagement\\EventManagement\\src\\eventmanagement\\Images\\syllabus_icon.png")); // NOI18N
        getContentPane().add(jLabel10);
        jLabel10.setBounds(10, 400, 40, 60);

        btnUpdate.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnUpdate.setIcon(new javax.swing.ImageIcon("E:\\iProject\\EventManagement\\EventManagement\\src\\eventmanagement\\Images\\save_icon.png")); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        getContentPane().add(btnUpdate);
        btnUpdate.setBounds(230, 500, 130, 40);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("Event Id:");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(200, 100, 100, 40);

        jLabel12.setIcon(new javax.swing.ImageIcon("E:\\iProject\\EventManagement\\EventManagement\\src\\eventmanagement\\Images\\Student-id-128.png")); // NOI18N
        getContentPane().add(jLabel12);
        jLabel12.setBounds(140, 90, 50, 60);

        jButton4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon("E:\\iProject\\EventManagement\\EventManagement\\src\\eventmanagement\\Images\\folder-search.png")); // NOI18N
        jButton4.setText("Find");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(350, 100, 100, 40);

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

        jLabel35.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel35.setText("User Name:");
        jPanel5.add(jLabel35);
        jLabel35.setBounds(230, 20, 80, 30);

        jLabel36.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel36.setText("User Id:");
        jPanel5.add(jLabel36);
        jLabel36.setBounds(530, 20, 60, 30);

        txtUserName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel5.add(txtUserName);
        txtUserName.setBounds(310, 20, 90, 30);

        txtUserId.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel5.add(txtUserId);
        txtUserId.setBounds(590, 20, 100, 30);

        jLabel31.setIcon(new javax.swing.ImageIcon("E:\\iProject\\EventManagement\\EventManagement\\src\\eventmanagement\\Images\\1426575633_tmp_header_calendar.png")); // NOI18N
        jPanel5.add(jLabel31);
        jLabel31.setBounds(10, 10, 50, 60);

        jLabel37.setIcon(new javax.swing.ImageIcon("E:\\iProject\\EventManagement\\EventManagement\\src\\eventmanagement\\Images\\User.png")); // NOI18N
        jPanel5.add(jLabel37);
        jLabel37.setBounds(180, 10, 40, 40);

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

        jButton5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon("E:\\iProject\\EventManagement\\EventManagement\\src\\eventmanagement\\Images\\exit.png")); // NOI18N
        jButton5.setText("Exit");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(500, 500, 120, 40);
        getContentPane().add(jLabel13);
        jLabel13.setBounds(280, 180, 0, 190);

        jLabel14.setIcon(new javax.swing.ImageIcon("E:\\iProject\\EventManagement\\EventManagement\\src\\eventmanagement\\Images\\Icon-Note-Book.png")); // NOI18N
        getContentPane().add(jLabel14);
        jLabel14.setBounds(610, 360, 130, 120);
        getContentPane().add(txtEventId);
        txtEventId.setBounds(280, 100, 60, 40);
        getContentPane().add(txtDate);
        txtDate.setBounds(120, 200, 140, 30);
        getContentPane().add(txtTime);
        txtTime.setBounds(120, 290, 140, 30);

        txtTitle.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtTitleCaretUpdate(evt);
            }
        });
        getContentPane().add(txtTitle);
        txtTitle.setBounds(590, 200, 120, 30);

        txtColor.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtColorCaretUpdate(evt);
            }
        });
        getContentPane().add(txtColor);
        txtColor.setBounds(590, 290, 120, 30);

        jLabel15.setIcon(new javax.swing.ImageIcon("E:\\iProject\\EventManagement\\EventManagement\\src\\eventmanagement\\Images\\update_delete_icon.png")); // NOI18N
        getContentPane().add(jLabel15);
        jLabel15.setBounds(270, 180, 190, 180);

        jLabel16.setIcon(new javax.swing.ImageIcon("E:\\iProject\\EventManagement\\EventManagement\\src\\eventmanagement\\Images\\calendar icon main.png")); // NOI18N
        getContentPane().add(jLabel16);
        jLabel16.setBounds(0, 80, 740, 470);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        //Deleting an event on button click 
        int a=JOptionPane.showConfirmDialog(this, "Are you sure you want to delete this Event","Event Deleted",JOptionPane.YES_NO_OPTION);
        if (a==0) {
           DeleteEvent(); 
        }
      
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        //Updating an event on button click if giving conditions are matched   
        String s="(1[012]|[1-9]):[0-5][0-9]:[0-5][0-9](\\s)?(?i)(am|pm)";
        String a="^[a-zA-Z]{3,15}$";
        
        if (txtDate.getDate().after(d))
        {
           if(txtTime.getText().matches(s))
           { 
             if(txtColor.getText().matches(a))
             {  
               updateEvent();
             }
           
             else
             {
             JOptionPane.showMessageDialog(this, "Invalid Color");
             }
           }
           else
           {
           JOptionPane.showMessageDialog(this, "Please enter correct Time");
           }
        }
        else
        {
            JOptionPane.showMessageDialog(this, "Please enter Current/Coming Date");
        }
        
        
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // Finding an event by Event Id on button click
       String s="^[0-9]{1,2}$";
        if (txtEventId.getText().matches(s)) 
        {
            findEvent();
        }
        else
        {
            JOptionPane.showMessageDialog(rootPane, "Incorrect Event Title");
        }
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void txtTitleCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtTitleCaretUpdate

    }//GEN-LAST:event_txtTitleCaretUpdate

    private void txtColorCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtColorCaretUpdate

    }//GEN-LAST:event_txtColorCaretUpdate

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // Program will be exited on button click
        int a=JOptionPane.showConfirmDialog(this, "Are you sure you want to exit?","Exited",JOptionPane.YES_NO_OPTION);
            if (a==0) 
            {
                System.exit(1);
            }        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        //All fields will be reset on button click
        ResetFields();
    }//GEN-LAST:event_btnResetActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // Pdf file related to the frame will be open on button click
        try 
        {
            Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler "+"E:\\iProject\\EventManagement\\EventManagement\\src\\eventmanagement\\EMS_Modify.pdf");
        } 
        catch (Exception ex)
        {
            Logger.getLogger(EMS_AllEvents.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
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
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtColor;
    private com.toedter.calendar.JDateChooser txtDate;
    private javax.swing.JTextArea txtDescription;
    private javax.swing.JTextField txtEventId;
    private javax.swing.JTextField txtTime;
    private javax.swing.JTextField txtTitle;
    private javax.swing.JLabel txtUserId;
    private javax.swing.JLabel txtUserName;
    // End of variables declaration//GEN-END:variables
}
