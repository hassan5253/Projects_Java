
package eventmanagement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JTextField;
import java.util.TimeZone;
import javax.swing.UIManager;

public class EMS_NewEvent extends javax.swing.JInternalFrame
{
Date d=new Date(-1); //Object of Date

public EMS_NewEvent()
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
                if (rs.next())
                {
                txtUserId.setText(rs.getString("User_Id"));
                }
        }
        catch (Exception ex)
        {
            System.out.println(ex);
        }
}
//End of Method for getting user id from database  
   

public void ResetFields() //Method for reseting all the fields as soon as event is created
{
    txtDate.setDate(null);
    txtTime.setText("");
    txtTitle.setText("");
    txtColor.setText("");
    txtDescription.setText("");
}
//End of Method for reseting all the fields as soon as event is created


public void CreateEvent() //Method for creating an event
{
    try 
    {
           String sql="insert into tbl_Event values('"+txtUserId.getText()+"','"+((JTextField) txtDate.getDateEditor().getUiComponent()).getText()+"','"+txtTime.getText()+"','"+txtTitle.getText()+"','"+txtColor.getText()+"','"+txtDescription.getText()+"')";
           EMS_Connection.st.executeUpdate(sql);
           JOptionPane.showMessageDialog(this,"Event Created");
           ResetFields();

    } 
    catch (Exception ex)
    {
        System.out.println(ex);
    }
        
}
//End of Method for creating an event



    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        txtUserName = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        txtUserId = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnReset = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        txtTitle = new javax.swing.JTextField();
        txtTime = new javax.swing.JTextField();
        txtColor = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescription = new javax.swing.JTextArea();
        txtDate = new com.toedter.calendar.JDateChooser();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 102, 0)));
        setTitle("Create New Event");
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

        jLabel31.setIcon(new javax.swing.ImageIcon("E:\\iProject\\EventManagement\\EventManagement\\src\\eventmanagement\\Images\\1426575633_tmp_header_calendar.png")); // NOI18N
        jPanel5.add(jLabel31);
        jLabel31.setBounds(10, 10, 50, 60);

        jLabel37.setIcon(new javax.swing.ImageIcon("E:\\iProject\\EventManagement\\EventManagement\\src\\eventmanagement\\Images\\User.png")); // NOI18N
        jPanel5.add(jLabel37);
        jLabel37.setBounds(180, 10, 40, 40);

        jLabel38.setIcon(new javax.swing.ImageIcon("E:\\iProject\\EventManagement\\EventManagement\\src\\eventmanagement\\Images\\ID-icon.png")); // NOI18N
        jPanel5.add(jLabel38);
        jLabel38.setBounds(480, 20, 40, 30);

        txtUserId.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel5.add(txtUserId);
        txtUserId.setBounds(590, 20, 60, 30);

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

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel1.setText("Title:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(560, 100, 60, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel2.setText("Date:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(70, 100, 60, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel3.setText("Description:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(60, 320, 100, 30);

        jLabel4.setIcon(new javax.swing.ImageIcon("E:\\iProject\\EventManagement\\EventManagement\\src\\eventmanagement\\Images\\calendar_clock.png")); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(20, 180, 50, 60);

        jLabel8.setIcon(new javax.swing.ImageIcon("E:\\iProject\\EventManagement\\EventManagement\\src\\eventmanagement\\Images\\date_icon.png")); // NOI18N
        getContentPane().add(jLabel8);
        jLabel8.setBounds(20, 90, 50, 50);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel5.setText("Time:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(70, 190, 70, 30);

        jLabel6.setIcon(new javax.swing.ImageIcon("E:\\iProject\\EventManagement\\EventManagement\\src\\eventmanagement\\Images\\color_icon.png")); // NOI18N
        getContentPane().add(jLabel6);
        jLabel6.setBounds(500, 180, 50, 50);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eventmanagement/Images/Titles-icon.png"))); // NOI18N
        getContentPane().add(jLabel7);
        jLabel7.setBounds(500, 90, 60, 48);

        btnReset.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnReset.setIcon(new javax.swing.ImageIcon("E:\\iProject\\EventManagement\\EventManagement\\src\\eventmanagement\\Images\\reset icon.png")); // NOI18N
        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });
        getContentPane().add(btnReset);
        btnReset.setBounds(210, 420, 120, 40);

        btnSave.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnSave.setIcon(new javax.swing.ImageIcon("E:\\iProject\\EventManagement\\EventManagement\\src\\eventmanagement\\Images\\save_icon.png")); // NOI18N
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        getContentPane().add(btnSave);
        btnSave.setBounds(370, 420, 120, 40);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel9.setText("Color:");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(550, 190, 60, 30);

        jLabel44.setText("YYYY-MM-DD");
        getContentPane().add(jLabel44);
        jLabel44.setBounds(150, 130, 80, 14);

        jLabel10.setIcon(new javax.swing.ImageIcon("E:\\iProject\\EventManagement\\EventManagement\\src\\eventmanagement\\Images\\syllabus_icon.png")); // NOI18N
        getContentPane().add(jLabel10);
        jLabel10.setBounds(10, 310, 40, 60);

        jLabel11.setIcon(new javax.swing.ImageIcon("E:\\iProject\\EventManagement\\EventManagement\\src\\eventmanagement\\Images\\1426576342_tmp_event_calendar.png")); // NOI18N
        getContentPane().add(jLabel11);
        jLabel11.setBounds(240, 80, 220, 180);

        jLabel12.setIcon(new javax.swing.ImageIcon("E:\\iProject\\EventManagement\\EventManagement\\src\\eventmanagement\\Images\\Highlightmarker-red.png")); // NOI18N
        getContentPane().add(jLabel12);
        jLabel12.setBounds(540, 290, 200, 240);

        jButton5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon("E:\\iProject\\EventManagement\\EventManagement\\src\\eventmanagement\\Images\\exit.png")); // NOI18N
        jButton5.setText("Exit");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(290, 480, 120, 40);
        getContentPane().add(jLabel13);
        jLabel13.setBounds(50, 400, 140, 0);
        getContentPane().add(txtTitle);
        txtTitle.setBounds(610, 100, 100, 30);
        getContentPane().add(txtTime);
        txtTime.setBounds(120, 190, 140, 30);
        getContentPane().add(txtColor);
        txtColor.setBounds(610, 190, 100, 30);

        txtDescription.setColumns(20);
        txtDescription.setRows(5);
        jScrollPane1.setViewportView(txtDescription);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(170, 300, 400, 70);
        getContentPane().add(txtDate);
        txtDate.setBounds(120, 100, 140, 30);

        jLabel14.setIcon(new javax.swing.ImageIcon("E:\\iProject\\EventManagement\\EventManagement\\src\\eventmanagement\\Images\\candy_clock.png")); // NOI18N
        getContentPane().add(jLabel14);
        jLabel14.setBounds(40, 400, 120, 130);

        jLabel15.setIcon(new javax.swing.ImageIcon("E:\\iProject\\EventManagement\\EventManagement\\src\\eventmanagement\\Images\\calendar icon main.png")); // NOI18N
        getContentPane().add(jLabel15);
        jLabel15.setBounds(0, 80, 740, 450);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        //Creating an event on button click if give conditions are matched
        String s="(1[012]|[1-9]):[0-5][0-9]:[0-5][0-9](\\s)?(?i)(am|pm)";
        String a="^[a-zA-Z]{3,15}$";
        
            if (txtDate.getDate().after(d)) 
            {
                if (txtTime.getText().matches(s))
                {
                    if(txtColor.getText().matches(a))
                    { 
                       if(txtTitle.getText().matches(a)) 
                       {
                        CreateEvent();
                       }
                       else
                    {
                        JOptionPane.showMessageDialog(this, "Invalid Title");
                    }
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(this, "Invalid Color");
                    }
                }
                else
                {
                    JOptionPane.showMessageDialog(this, "Please enter current/coming Time");
                } 
            
            }
            else
            {
                JOptionPane.showMessageDialog(this, "Please enter correct Date");
            }
            
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        // All fields will be set to null on button click
        ResetFields();
    }//GEN-LAST:event_btnResetActionPerformed

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
            Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler "+"E:\\iProject\\EventManagement\\EventManagement\\src\\eventmanagement\\EMS_NewEvent.pdf");
        } 
        catch (Exception ex)
        {
            System.out.println(ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
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
    private javax.swing.JTextField txtTime;
    private javax.swing.JTextField txtTitle;
    private javax.swing.JLabel txtUserId;
    private javax.swing.JLabel txtUserName;
    // End of variables declaration//GEN-END:variables
}
