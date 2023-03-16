
package eventmanagement;

import java.awt.TextArea;
import static java.lang.Thread.sleep;
import java.sql.Array;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.util.Date;
import java.util.Locale;
import java.util.ArrayList;
import java.util.List;
import sun.invoke.empty.Empty;
import java.io.File;
import java.io.InputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;
import java.io.*;
import javax.swing.table.DefaultTableModel;
import sun.audio.*;
import sun.security.rsa.RSACore;


public class AlarmTimerframe extends javax.swing.JInternalFrame 
{
  Date d=new Date(); //Object of date
  
public AlarmTimerframe()
{
        initComponents();
        EMS_Connection cn=new EMS_Connection(); //Object of connection class       
        getname(); //Calling of method for displaying user name 
        getid(); //Calling of method for displaying user id 
        mytime(); ////Calling of method for displaying clock timer and date on frame 
}


    
      
public void getname() //Method for displaying user name from login frame
 {
    txtUserName.setText(EMS_GetUserName.name);
 }
 
 //End of Method for displaying user name from login frame
 
 
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

    public void  mytime() //Method for displaying timer and date on frame
    {   
         
        Thread t=new Thread()
    {
    
    public void run()
    {
    
    for(;;)
    {
    Calendar c=Calendar.getInstance();
    
    int yy=c.get(Calendar.YEAR);
    int mm=c.get(Calendar.MONTH)+1;
    int day=c.get(Calendar.DAY_OF_MONTH);
    int hh=c.get(Calendar.HOUR);
    int m=c.get(Calendar.MINUTE);
    int ss=c.get(Calendar.SECOND);
    int ampm=c.get(Calendar.AM_PM);
    
   
   lbldate.setText(yy+"-"+0 +mm+"-"+0+day);
   if(ampm == 1)
                 {
                     lbltime.setText(hh+":"+m+":"+ss + " PM"); 
                 }
   else
                 {
                     lbltime.setText(hh+":"+m+":"+ss + " AM"); 
                 }
         
       
        try {
                    sleep(100);
              
                   try
                   {
    ResultSet rs=EMS_Connection.st.executeQuery("select Event_Id,[User_Id],Event_Date,Event_Time,Event_Title,Event_Colour,Event_Description from tbl_Event where Event_Date = CONVERT(VARCHAR(10),GETDATE(),121) and Event_Time = '"+lbltime.getText()+"'");
        if (rs.next()) 
        {                       
            AlarmReminder ar=new AlarmReminder();
            ar.play();

            JOptionPane.showMessageDialog(rootPane, "Reminder"+"  ("+rs.getString("Event_Title")+")");
            
        }

    }
    catch(Exception ex){
        System.out.println(ex);
    }
    
    }              
    
    catch (InterruptedException ex) 
    {
        Logger.getLogger(EventManagement.class.getName()).log(Level.SEVERE, null, ex);
    }
    }
 
    }
    };
        
    
     t.start();

    }
    //Method for displaying timer and date on frame
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        eventmanagementSignUp1 = new eventmanagement.EventmanagementSignUp();
        lbldate = new javax.swing.JLabel();
        lbltime = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        txtUserId = new javax.swing.JLabel();
        txtUserName = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        eventmanagementSignUp1.setVisible(true);

        setTitle("Alarm Reminder");
        setPreferredSize(new java.awt.Dimension(750, 600));
        getContentPane().setLayout(null);

        lbldate.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getContentPane().add(lbldate);
        lbldate.setBounds(570, 150, 120, 30);

        lbltime.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getContentPane().add(lbltime);
        lbltime.setBounds(570, 100, 120, 40);

        jPanel5.setBackground(new java.awt.Color(255, 153, 0));
        jPanel5.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 51, 0)));
        jPanel5.setLayout(null);

        jLabel31.setIcon(new javax.swing.ImageIcon("E:\\iProject\\EventManagement\\EventManagement\\src\\eventmanagement\\Images\\1426575633_tmp_header_calendar.png")); // NOI18N
        jPanel5.add(jLabel31);
        jLabel31.setBounds(10, 10, 50, 60);

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

        jLabel37.setIcon(new javax.swing.ImageIcon("E:\\iProject\\EventManagement\\EventManagement\\src\\eventmanagement\\Images\\User.png")); // NOI18N
        jPanel5.add(jLabel37);
        jLabel37.setBounds(180, 10, 40, 40);

        jLabel38.setIcon(new javax.swing.ImageIcon("E:\\iProject\\EventManagement\\EventManagement\\src\\eventmanagement\\Images\\ID-icon.png")); // NOI18N
        jPanel5.add(jLabel38);
        jLabel38.setBounds(480, 20, 40, 30);

        txtUserId.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel5.add(txtUserId);
        txtUserId.setBounds(590, 20, 100, 30);

        txtUserName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel5.add(txtUserName);
        txtUserName.setBounds(310, 20, 110, 30);

        getContentPane().add(jPanel5);
        jPanel5.setBounds(0, 0, 740, 80);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Time:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(510, 110, 60, 20);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Date:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(510, 150, 70, 30);

        jLabel3.setIcon(new javax.swing.ImageIcon("E:\\iProject\\EventManagement\\EventManagement\\src\\eventmanagement\\Images\\0164_alarm_clock_orange.png")); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 90, 460, 420);

        jLabel5.setIcon(new javax.swing.ImageIcon("E:\\iProject\\EventManagement\\EventManagement\\src\\eventmanagement\\Images\\calendar icon main.png")); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, 84, 740, 450);

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private eventmanagement.EventmanagementSignUp eventmanagementSignUp1;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel lbldate;
    private javax.swing.JLabel lbltime;
    private javax.swing.JLabel txtUserId;
    private javax.swing.JLabel txtUserName;
    // End of variables declaration//GEN-END:variables
}
