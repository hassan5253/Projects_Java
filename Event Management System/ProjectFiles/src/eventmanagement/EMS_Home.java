
package eventmanagement;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.WindowEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JRootPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.xml.bind.annotation.XmlElement;


public class EMS_Home extends javax.swing.JInternalFrame 
{

    public EMS_Home() 
    {
        initComponents();
        
        EMS_Connection ad=new EMS_Connection(); //Object of Connection class  
        getname(); //Calling of method for displaying user name 
        getid();  //Calling of method for displaying user id 
        Top3Events(); //Calling of method for displaying upcoming top 3 events on Home frame
        
    }
    
public void Top3Events() //Method for displaying upcoming top 3 events within next 7 days
{
        try
        {
            DefaultTableModel obj=new DefaultTableModel();
   
   obj.addColumn("Event Id");
   obj.addColumn("User Id");
   obj.addColumn("Event Date");
   obj.addColumn("Event Title");  
   obj.addColumn("Event Time");
   obj.addColumn("Event Colour");
   obj.addColumn("Event Description");
   
   Date d=new Date();
        
        Date datebefore = new Date(d.getTime() -1 * 24 * 3600 * 1000);
        Date dateAfter = new Date(d.getTime() +7 * 24 * 3600 * 1000);
        String bDate= new SimpleDateFormat().format(datebefore);
        String aDate= new SimpleDateFormat().format(dateAfter);

 ResultSet rs=EMS_Connection.st.executeQuery("select Event_Id,[User_Id],Event_Date,Event_Title,Event_Time,Event_Colour,Event_Description from tbl_Event where User_Id='"+txtUserId.getText()+"' and Event_Date between '"+bDate+"' and '"+aDate+"' order by Event_Date asc");
        while (rs.next()) {            
 obj.addRow(new Object[]{rs.getInt("Event_Id"),rs.getInt("User_Id"),rs.getDate("Event_Date"),rs.getString("Event_Title"),
 rs.getString("Event_Time"),rs.getString("Event_Colour"),rs.getString("Event_Description")});
                          }
   tableHome.setModel(obj);
        }
         catch(Exception ex)
         {
            System.out.println(ex);
         }
    
}
//End of Method for displaying upcoming top 3 events within next 7 days
    
   
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


 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel14 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableHome = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
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
        jButton1 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 204));
        setTitle("Home");
        setFocusCycleRoot(false);
        setFocusable(false);
        setPreferredSize(new java.awt.Dimension(750, 600));
        setVerifyInputWhenFocusTarget(false);
        getContentPane().setLayout(null);

        tableHome.setAutoCreateRowSorter(true);
        tableHome.setBorder(new javax.swing.border.MatteBorder(null));
        tableHome.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tableHome.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Event Id", "Title", "Date", "Time", "Colour", "Description"
            }
        ));
        tableHome.setRowHeight(34);
        tableHome.setRowSelectionAllowed(false);
        jScrollPane1.setViewportView(tableHome);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(0, 270, 740, 200);
        getContentPane().add(jLabel13);
        jLabel13.setBounds(110, 200, 0, 150);

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

        jButton5.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon("E:\\iProject\\EventManagement\\EventManagement\\src\\eventmanagement\\Images\\exit.png")); // NOI18N
        jButton5.setText("Exit");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(610, 480, 120, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon("E:\\iProject\\EventManagement\\EventManagement\\src\\eventmanagement\\Images\\calendar (1).png")); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-90, 80, 840, 220);

        jLabel2.setIcon(new javax.swing.ImageIcon("E:\\iProject\\EventManagement\\EventManagement\\src\\eventmanagement\\Images\\calendar icon main.png")); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 80, 740, 450);

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler "+"E:\\iProject\\EventManagement\\EventManagement\\src\\eventmanagement\\EMS_Home.pdf");
        } catch (Exception ex) {
            Logger.getLogger(EMS_AllEvents.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableHome;
    private javax.swing.JLabel txtUserId;
    private javax.swing.JLabel txtUserName;
    // End of variables declaration//GEN-END:variables

    
}
