
package eventmanagement;

import java.nio.file.Path;
import java.sql.ResultSet;
import java.util.Date;
import java.util.Hashtable;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;
import org.hsqldb.lib.HashMap;

public class EMS_Reporting extends javax.swing.JInternalFrame 
{
Date d=new Date(-1); //Object for current date
Date s=new Date(); //Object of date for previous date 
    
public EMS_Reporting()
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
    
 
 public void SearchEventsbyDate() //Method for searching upcoming events by Date
{
    try
    {
        DefaultTableModel obj=new DefaultTableModel();
        obj.addColumn("Event Id");
        obj.addColumn("Event Title");
        obj.addColumn("Event Date");
        obj.addColumn("Event Time");
        obj.addColumn("Event Colour");
        obj.addColumn("Event Description");
   

ResultSet rs=EMS_Connection.st.executeQuery("select Event_Id,User_Id,Event_Title,Event_Date,Event_Time,Event_Colour,Event_Description from tbl_Event where User_Id='"+txtUserId.getText()+"' and Event_Date between '"+((JTextField) txtCurrentDate.getDateEditor().getUiComponent()).getText()+"' and '"+((JTextField) txtComingsDate.getDateEditor().getUiComponent()).getText()+"' order by Event_Date asc");
        while (rs.next())
        {            
obj.addRow(new Object[]{rs.getInt("Event_Id"),rs.getString("Event_Title"),rs.getDate("Event_Date"),
rs.getString("Event_Time"),rs.getString("Event_Colour"),rs.getString("Event_Description")});
        }
        tableReporting.setModel(obj);
    }
    catch(Exception ex)
    {
       System.out.println(ex);
    }
    
}
 //End of Method for searching upcoming events by Date
 
 public void SearchPreviousEvents() //Method for searching previous events by date
{
    try
    {
        DefaultTableModel obj=new DefaultTableModel();
        obj.addColumn("Event Id");
        obj.addColumn("Event Title");
        obj.addColumn("Event Date");
        obj.addColumn("Event Time");
        obj.addColumn("Event Colour");
        obj.addColumn("Event Description");
   

ResultSet rs=EMS_Connection.st.executeQuery("select Event_Id,User_Id,Event_Title,Event_Date,Event_Time,Event_Colour,Event_Description from tbl_Event where User_Id='"+txtUserId.getText()+"' and Event_Date between '"+((JTextField) txtPreviousDate.getDateEditor().getUiComponent()).getText()+"' and '"+((JTextField) txtCurrentDate1.getDateEditor().getUiComponent()).getText()+"' order by Event_Date asc");
        while (rs.next())
        {            
obj.addRow(new Object[]{rs.getInt("Event_Id"),rs.getString("Event_Title"),rs.getDate("Event_Date"),
rs.getString("Event_Time"),rs.getString("Event_Colour"),rs.getString("Event_Description")});
        }
        tableReporting.setModel(obj);
    }
   catch(Exception ex)
   {
       System.out.println(ex);
   }   
}
//End of Method for searching previous events by date 
 
 
 @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
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
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel47 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        txtCurrentDate = new com.toedter.calendar.JDateChooser();
        btnSearchUpcomingEvent = new javax.swing.JButton();
        txtComingsDate = new com.toedter.calendar.JDateChooser();
        jLabel41 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableReporting = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        txtPreviousDate = new com.toedter.calendar.JDateChooser();
        txtCurrentDate1 = new com.toedter.calendar.JDateChooser();
        btnSearchEvents = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 102, 0)));
        setTitle("Reporting");
        setPreferredSize(new java.awt.Dimension(750, 600));
        getContentPane().setLayout(null);
        getContentPane().add(jLabel39);
        jLabel39.setBounds(20, 160, 0, 60);
        getContentPane().add(jLabel40);
        jLabel40.setBounds(20, 90, 0, 60);

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

        jButton4.setIcon(new javax.swing.ImageIcon("E:\\iProject\\EventManagement\\EventManagement\\src\\eventmanagement\\Images\\help.jpg")); // NOI18N
        jButton4.setText("Help");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton4);
        jButton4.setBounds(640, 20, 90, 41);

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
        jButton5.setBounds(180, 490, 120, 40);

        jButton1.setIcon(new javax.swing.ImageIcon("E:\\iProject\\EventManagement\\EventManagement\\src\\eventmanagement\\Images\\custom-reports.png")); // NOI18N
        jButton1.setText("Event Report ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(310, 490, 140, 40);

        jLabel47.setIcon(new javax.swing.ImageIcon("E:\\iProject\\EventManagement\\EventManagement\\src\\eventmanagement\\Images\\my events icon.png")); // NOI18N
        getContentPane().add(jLabel47);
        jLabel47.setBounds(10, 80, 50, 60);

        jLabel42.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel42.setText("From (Current Date):");
        getContentPane().add(jLabel42);
        jLabel42.setBounds(50, 90, 140, 30);
        getContentPane().add(txtCurrentDate);
        txtCurrentDate.setBounds(190, 90, 160, 30);

        btnSearchUpcomingEvent.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnSearchUpcomingEvent.setIcon(new javax.swing.ImageIcon("E:\\iProject\\EventManagement\\EventManagement\\src\\eventmanagement\\Images\\folder-search.png")); // NOI18N
        btnSearchUpcomingEvent.setText("Search Events");
        btnSearchUpcomingEvent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchUpcomingEventActionPerformed(evt);
            }
        });
        getContentPane().add(btnSearchUpcomingEvent);
        btnSearchUpcomingEvent.setBounds(110, 210, 150, 40);
        getContentPane().add(txtComingsDate);
        txtComingsDate.setBounds(190, 160, 160, 30);

        jLabel41.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel41.setText("To (Coming Date):");
        getContentPane().add(jLabel41);
        jLabel41.setBounds(50, 160, 120, 30);

        jLabel45.setIcon(new javax.swing.ImageIcon("E:\\iProject\\EventManagement\\EventManagement\\src\\eventmanagement\\Images\\my events icon.png")); // NOI18N
        getContentPane().add(jLabel45);
        jLabel45.setBounds(10, 150, 50, 60);

        tableReporting.setAutoCreateRowSorter(true);
        tableReporting.setBorder(new javax.swing.border.MatteBorder(null));
        tableReporting.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tableReporting.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Event Id", "Title", "Date", "Time", "Colour", "Description"
            }
        ));
        tableReporting.setRowHeight(25);
        jScrollPane3.setViewportView(tableReporting);

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(10, 260, 720, 210);

        jLabel2.setIcon(new javax.swing.ImageIcon("E:\\iProject\\EventManagement\\EventManagement\\src\\eventmanagement\\Images\\my events icon.png")); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(400, 140, 40, 60);

        jLabel3.setIcon(new javax.swing.ImageIcon("E:\\iProject\\EventManagement\\EventManagement\\src\\eventmanagement\\Images\\my events icon.png")); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(400, 90, 40, 40);

        jLabel43.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel43.setText("From (Current Date):");
        getContentPane().add(jLabel43);
        jLabel43.setBounds(440, 90, 140, 30);

        jLabel44.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel44.setText("To (Previous Date):");
        getContentPane().add(jLabel44);
        jLabel44.setBounds(440, 150, 120, 30);
        getContentPane().add(txtPreviousDate);
        txtPreviousDate.setBounds(580, 150, 150, 30);
        getContentPane().add(txtCurrentDate1);
        txtCurrentDate1.setBounds(580, 90, 150, 30);

        btnSearchEvents.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnSearchEvents.setIcon(new javax.swing.ImageIcon("E:\\iProject\\EventManagement\\EventManagement\\src\\eventmanagement\\Images\\folder-search.png")); // NOI18N
        btnSearchEvents.setText("Search Events");
        btnSearchEvents.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchEventsActionPerformed(evt);
            }
        });
        getContentPane().add(btnSearchEvents);
        btnSearchEvents.setBounds(460, 210, 150, 40);

        jButton3.setIcon(new javax.swing.ImageIcon("E:\\iProject\\EventManagement\\EventManagement\\src\\eventmanagement\\Images\\custom-reports.png")); // NOI18N
        jButton3.setText("Previous Event");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(460, 490, 150, 40);

        jLabel4.setIcon(new javax.swing.ImageIcon("E:\\iProject\\EventManagement\\EventManagement\\src\\eventmanagement\\Images\\calendar icon main.png")); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 80, 740, 470);

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
        // Generating Upcoming event report on jasper report on button click
        Hashtable param=new Hashtable();
        
        param.put("parameterEvent", ((JTextField)txtCurrentDate.getDateEditor().getUiComponent()).getText());
        param.put("parameterEvent1", ((JTextField)txtComingsDate.getDateEditor().getUiComponent()).getText());
        try
        {
        String path="E:\\iProject\\EventManagement\\EventManagement\\src\\eventmanagement\\Report\\reportevent.jrxml";
        
        JasperReport jr=JasperCompileManager.compileReport(path);
        JasperPrint jp=JasperFillManager.fillReport(jr, param,EMS_Connection.xc);
        JasperViewer.viewReport(jp);
        }
        catch(Exception ex)
        {
            System.out.println(ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnSearchUpcomingEventActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchUpcomingEventActionPerformed
        // Searching events on button click if given conditions are matched
        if(((JTextField)txtCurrentDate.getDateEditor().getUiComponent()).getText().isEmpty() || ((JTextField)txtComingsDate.getDateEditor().getUiComponent()).getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Date should be filled");
        }

        else if (txtCurrentDate.getDate().after(d) && txtComingsDate.getDate().after(d))
        {
            SearchEventsbyDate();
        }
        else
        {
            JOptionPane.showMessageDialog(this, "Please enter Current/Coming Date");

        }
    }//GEN-LAST:event_btnSearchUpcomingEventActionPerformed

    private void btnSearchEventsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchEventsActionPerformed
        // Searching events on button click if given conditions are matched

        if(((JTextField)txtCurrentDate1.getDateEditor().getUiComponent()).getText().isEmpty() || ((JTextField)txtPreviousDate.getDateEditor().getUiComponent()).getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Date should be filled");
        }

        else if (txtCurrentDate1.getDate().after(s) && txtPreviousDate.getDate().before(s))
        {
            SearchPreviousEvents();
        }

        else
        {
            JOptionPane.showMessageDialog(this, "Please enter Previous Date");
        }

    }//GEN-LAST:event_btnSearchEventsActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // Generating Previous event report on jasper report on button click
        Hashtable param=new Hashtable();
                
        
        param.put("parameter1", ((JTextField)txtPreviousDate.getDateEditor().getUiComponent()).getText());
        param.put("parameter2", ((JTextField)txtCurrentDate1.getDateEditor().getUiComponent()).getText());
        try
        {
        String path="E:\\iProject\\EventManagement\\EventManagement\\src\\eventmanagement\\Report\\reportprevEvents.jrxml";
        
        JasperReport jr=JasperCompileManager.compileReport(path);
        JasperPrint jp=JasperFillManager.fillReport(jr, param,EMS_Connection.xc);
        JasperViewer.viewReport(jp);
        }
        catch(Exception ex)
        {
            System.out.println(ex);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // Pdf file related to the frame will be open on button click
        try 
        {
            Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler "+"E:\\iProject\\EventManagement\\EventManagement\\src\\eventmanagement\\EMS_Reporting.pdf");
        } 
        catch (Exception ex)
        {
            System.out.println(ex);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSearchEvents;
    private javax.swing.JButton btnSearchUpcomingEvent;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
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
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tableReporting;
    private com.toedter.calendar.JDateChooser txtComingsDate;
    private com.toedter.calendar.JDateChooser txtCurrentDate;
    private com.toedter.calendar.JDateChooser txtCurrentDate1;
    private com.toedter.calendar.JDateChooser txtPreviousDate;
    private javax.swing.JLabel txtUserId;
    private javax.swing.JLabel txtUserName;
    // End of variables declaration//GEN-END:variables
}
