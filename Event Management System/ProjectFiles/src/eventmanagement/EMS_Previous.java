
package eventmanagement;

import java.sql.ResultSet;
import java.util.Date;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextField;



public class EMS_Previous extends javax.swing.JInternalFrame
{
    Date d=new Date(-1); //Object of date for current date
    Date s=new Date(); //Object of date for previous date 

    public EMS_Previous() 
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
   

ResultSet rs=EMS_Connection.st.executeQuery("select Event_Id,User_Id,Event_Title,Event_Date,Event_Time,Event_Colour,Event_Description from tbl_Event where User_Id='"+txtUserId.getText()+"' and Event_Date between '"+((JTextField) txtPreviousDate.getDateEditor().getUiComponent()).getText()+"' and '"+((JTextField) txtCurrentDate.getDateEditor().getUiComponent()).getText()+"' order by Event_Date asc");
        while (rs.next())
        {            
obj.addRow(new Object[]{rs.getInt("Event_Id"),rs.getString("Event_Title"),rs.getDate("Event_Date"),
rs.getString("Event_Time"),rs.getString("Event_Colour"),rs.getString("Event_Description")});
        }
        tablePreviousEvents.setModel(obj);
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
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        btnSearchEvents = new javax.swing.JButton();
        jLabel43 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablePreviousEvents = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
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
        jButton5 = new javax.swing.JButton();
        txtCurrentDate = new com.toedter.calendar.JDateChooser();
        txtPreviousDate = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 102, 0)));
        setTitle("Previous Events");
        setPreferredSize(new java.awt.Dimension(750, 600));
        getContentPane().setLayout(null);
        getContentPane().add(jLabel39);
        jLabel39.setBounds(50, 160, 0, 60);
        getContentPane().add(jLabel40);
        jLabel40.setBounds(50, 90, 0, 60);

        jLabel41.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel41.setText("To (Previous Date):");
        getContentPane().add(jLabel41);
        jLabel41.setBounds(100, 170, 120, 30);

        jLabel42.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel42.setText("From (Current Date):");
        getContentPane().add(jLabel42);
        jLabel42.setBounds(100, 100, 140, 30);

        jLabel44.setText("YYYY-MM-DD");
        getContentPane().add(jLabel44);
        jLabel44.setBounds(280, 130, 110, 14);

        btnSearchEvents.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnSearchEvents.setIcon(new javax.swing.ImageIcon("E:\\iProject\\EventManagement\\EventManagement\\src\\eventmanagement\\Images\\folder-search.png")); // NOI18N
        btnSearchEvents.setText("Search Events");
        btnSearchEvents.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchEventsActionPerformed(evt);
            }
        });
        getContentPane().add(btnSearchEvents);
        btnSearchEvents.setBounds(470, 130, 150, 40);

        jLabel43.setText("YYYY-MM-DD");
        getContentPane().add(jLabel43);
        jLabel43.setBounds(280, 200, 110, 14);

        tablePreviousEvents.setAutoCreateRowSorter(true);
        tablePreviousEvents.setBorder(new javax.swing.border.MatteBorder(null));
        tablePreviousEvents.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Event Id", "Title", "Date", "Time", "Colour", "Description"
            }
        ));
        tablePreviousEvents.setRowHeight(25);
        jScrollPane3.setViewportView(tablePreviousEvents);

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(20, 340, 710, 140);

        jLabel1.setIcon(new javax.swing.ImageIcon("E:\\iProject\\EventManagement\\EventManagement\\src\\eventmanagement\\Images\\MasterCalendarIcon.png")); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(30, 240, 410, 240);

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
        jPanel5.setBounds(0, 0, 750, 80);

        jButton5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon("E:\\iProject\\EventManagement\\EventManagement\\src\\eventmanagement\\Images\\exit.png")); // NOI18N
        jButton5.setText("Exit");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(610, 490, 120, 40);
        getContentPane().add(txtCurrentDate);
        txtCurrentDate.setBounds(240, 100, 150, 30);
        getContentPane().add(txtPreviousDate);
        txtPreviousDate.setBounds(240, 170, 150, 30);

        jLabel2.setIcon(new javax.swing.ImageIcon("E:\\iProject\\EventManagement\\EventManagement\\src\\eventmanagement\\Images\\my events icon.png")); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(40, 160, 40, 50);

        jLabel3.setIcon(new javax.swing.ImageIcon("E:\\iProject\\EventManagement\\EventManagement\\src\\eventmanagement\\Images\\my events icon.png")); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(40, 100, 40, 40);

        jLabel49.setIcon(new javax.swing.ImageIcon("E:\\iProject\\EventManagement\\EventManagement\\src\\eventmanagement\\Images\\pin-pinterest.png")); // NOI18N
        getContentPane().add(jLabel49);
        jLabel49.setBounds(470, 210, 160, 170);

        jLabel4.setIcon(new javax.swing.ImageIcon("E:\\iProject\\EventManagement\\EventManagement\\src\\eventmanagement\\Images\\calendar icon main.png")); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 84, 750, 450);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchEventsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchEventsActionPerformed
        // Searching events on button click if given conditions are matched
 
  if(((JTextField)txtCurrentDate.getDateEditor().getUiComponent()).getText().isEmpty() || ((JTextField)txtPreviousDate.getDateEditor().getUiComponent()).getText().isEmpty()) 
  {
        JOptionPane.showMessageDialog(this, "Date should be filled");
  }     
        
        else if (txtCurrentDate.getDate().after(s) && txtPreviousDate.getDate().before(s))
        {
            SearchPreviousEvents();
        } 

            else 
            {
                JOptionPane.showMessageDialog(this, "Please enter Previous Date");        
            }
        
    }//GEN-LAST:event_btnSearchEventsActionPerformed

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
            Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler "+"E:\\iProject\\EventManagement\\EventManagement\\src\\eventmanagement\\EMS_PreviousEvents.pdf");
        } 
        catch (Exception ex)
        {
            System.out.println(ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSearchEvents;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton5;
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
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tablePreviousEvents;
    private com.toedter.calendar.JDateChooser txtCurrentDate;
    private com.toedter.calendar.JDateChooser txtPreviousDate;
    private javax.swing.JLabel txtUserId;
    private javax.swing.JLabel txtUserName;
    // End of variables declaration//GEN-END:variables
}
