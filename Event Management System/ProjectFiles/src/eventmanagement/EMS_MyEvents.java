
package eventmanagement;

import java.sql.ResultSet;
import java.util.Date;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextField;


public class EMS_MyEvents extends javax.swing.JInternalFrame
{
   Date d=new Date(); //Object for current date
 
public EMS_MyEvents() 
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
   

ResultSet rs=EMS_Connection.st.executeQuery("select Event_Id,User_Id,Event_Title,Event_Date,Event_Time,Event_Colour,Event_Description from tbl_Event where User_Id='"+txtUserId.getText()+"' and Event_Date between '"+((JTextField) txtCurrentDate.getDateEditor().getUiComponent()).getText()+"' and '"+((JTextField) txtComingDate.getDateEditor().getUiComponent()).getText()+"' order by Event_Date asc");
        while (rs.next())
        {            
obj.addRow(new Object[]{rs.getInt("Event_Id"),rs.getString("Event_Title"),rs.getDate("Event_Date"),
rs.getString("Event_Time"),rs.getString("Event_Colour"),rs.getString("Event_Description")});
        }
        tableMyEvents.setModel(obj);
    }
    catch(Exception ex)
    {
       System.out.println(ex);
    }
    
}
//End of Method for searching upcoming events by Date   
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jInternalFrame2 = new javax.swing.JInternalFrame();
        jPanel4 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        btnSearchEvent = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableMyEvents = new javax.swing.JTable();
        jLabel46 = new javax.swing.JLabel();
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
        jButton7 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        txtCurrentDate = new com.toedter.calendar.JDateChooser();
        txtComingDate = new com.toedter.calendar.JDateChooser();
        jLabel45 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 102, 0)));
        setTitle("My Events");
        setPreferredSize(new java.awt.Dimension(750, 600));
        getContentPane().setLayout(null);

        jInternalFrame1.setBackground(new java.awt.Color(204, 204, 204));
        jInternalFrame1.setPreferredSize(new java.awt.Dimension(750, 600));
        jInternalFrame1.getContentPane().setLayout(null);

        jPanel3.setBackground(new java.awt.Color(255, 153, 0));
        jPanel3.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 51, 0)));
        jPanel3.setLayout(null);
        jPanel3.add(jLabel9);
        jLabel9.setBounds(10, 10, 50, 90);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Event");
        jPanel3.add(jLabel1);
        jLabel1.setBounds(70, 30, 60, 17);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Management");
        jPanel3.add(jLabel2);
        jLabel2.setBounds(70, 50, 80, 17);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("System");
        jPanel3.add(jLabel3);
        jLabel3.setBounds(70, 70, 70, 17);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setText("Exit");
        jPanel3.add(jButton1);
        jButton1.setBounds(590, 10, 100, 40);

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jButton2.setText("Logout");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2);
        jButton2.setBounds(590, 60, 100, 40);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("User Name:");
        jPanel3.add(jLabel4);
        jLabel4.setBounds(290, 20, 80, 20);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("User Id:");
        jPanel3.add(jLabel5);
        jLabel5.setBounds(290, 60, 60, 30);

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel3.add(jTextField1);
        jTextField1.setBounds(380, 20, 130, 30);

        jTextField2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel3.add(jTextField2);
        jTextField2.setBounds(380, 60, 130, 30);
        jPanel3.add(jLabel6);
        jLabel6.setBounds(250, 10, 40, 40);
        jPanel3.add(jLabel7);
        jLabel7.setBounds(250, 60, 40, 30);

        jInternalFrame1.getContentPane().add(jPanel3);
        jPanel3.setBounds(0, 0, 720, 110);
        jInternalFrame1.getContentPane().add(jLabel8);
        jLabel8.setBounds(0, 110, 90, 100);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Current Date:");
        jInternalFrame1.getContentPane().add(jLabel10);
        jLabel10.setBounds(100, 130, 90, 30);
        jInternalFrame1.getContentPane().add(jTextField3);
        jTextField3.setBounds(190, 130, 100, 30);
        jInternalFrame1.getContentPane().add(jLabel11);
        jLabel11.setBounds(360, 110, 130, 100);

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("Current Time:");
        jInternalFrame1.getContentPane().add(jLabel12);
        jLabel12.setBounds(490, 130, 90, 20);

        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        jInternalFrame1.getContentPane().add(jTextField4);
        jTextField4.setBounds(590, 130, 110, 30);

        jTable1.setAutoCreateRowSorter(true);
        jTable1.setBorder(new javax.swing.border.MatteBorder(null));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        jInternalFrame1.getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 400, 700, 110);
        jInternalFrame1.getContentPane().add(jLabel13);
        jLabel13.setBounds(110, 220, 0, 150);
        jInternalFrame1.getContentPane().add(jLabel16);
        jLabel16.setBounds(450, 210, 160, 170);
        jInternalFrame1.getContentPane().add(jLabel15);
        jLabel15.setBounds(0, 110, 720, 420);

        getContentPane().add(jInternalFrame1);
        jInternalFrame1.setBounds(360, 254, 0, 0);

        jInternalFrame2.setBackground(new java.awt.Color(204, 204, 204));
        jInternalFrame2.setPreferredSize(new java.awt.Dimension(750, 600));
        jInternalFrame2.getContentPane().setLayout(null);

        jPanel4.setBackground(new java.awt.Color(255, 153, 0));
        jPanel4.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 51, 0)));
        jPanel4.setLayout(null);
        jPanel4.add(jLabel14);
        jLabel14.setBounds(10, 10, 50, 90);

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel17.setText("Event");
        jPanel4.add(jLabel17);
        jLabel17.setBounds(70, 30, 60, 17);

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel18.setText("Management");
        jPanel4.add(jLabel18);
        jLabel18.setBounds(70, 50, 80, 17);

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel19.setText("System");
        jPanel4.add(jLabel19);
        jLabel19.setBounds(70, 70, 70, 17);

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton3.setText("Exit");
        jPanel4.add(jButton3);
        jButton3.setBounds(590, 10, 100, 40);

        jButton4.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jButton4.setText("Logout");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton4);
        jButton4.setBounds(590, 60, 100, 40);

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel20.setText("User Name:");
        jPanel4.add(jLabel20);
        jLabel20.setBounds(290, 20, 80, 20);

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel21.setText("User Id:");
        jPanel4.add(jLabel21);
        jLabel21.setBounds(290, 60, 60, 30);

        jTextField5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        jPanel4.add(jTextField5);
        jTextField5.setBounds(380, 20, 130, 30);

        jTextField6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel4.add(jTextField6);
        jTextField6.setBounds(380, 60, 130, 30);
        jPanel4.add(jLabel22);
        jLabel22.setBounds(250, 10, 40, 40);
        jPanel4.add(jLabel23);
        jLabel23.setBounds(250, 60, 40, 30);

        jInternalFrame2.getContentPane().add(jPanel4);
        jPanel4.setBounds(0, 0, 720, 110);
        jInternalFrame2.getContentPane().add(jLabel24);
        jLabel24.setBounds(0, 110, 90, 100);

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel25.setText("Current Date:");
        jInternalFrame2.getContentPane().add(jLabel25);
        jLabel25.setBounds(100, 130, 90, 30);
        jInternalFrame2.getContentPane().add(jTextField7);
        jTextField7.setBounds(190, 130, 100, 30);
        jInternalFrame2.getContentPane().add(jLabel26);
        jLabel26.setBounds(360, 110, 130, 100);

        jLabel27.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel27.setText("Current Time:");
        jInternalFrame2.getContentPane().add(jLabel27);
        jLabel27.setBounds(490, 130, 90, 20);

        jTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField8ActionPerformed(evt);
            }
        });
        jInternalFrame2.getContentPane().add(jTextField8);
        jTextField8.setBounds(590, 130, 110, 30);

        jTable2.setAutoCreateRowSorter(true);
        jTable2.setBorder(new javax.swing.border.MatteBorder(null));
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable2);

        jInternalFrame2.getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(10, 400, 700, 110);
        jInternalFrame2.getContentPane().add(jLabel28);
        jLabel28.setBounds(110, 220, 0, 150);
        jInternalFrame2.getContentPane().add(jLabel29);
        jLabel29.setBounds(450, 210, 160, 170);
        jInternalFrame2.getContentPane().add(jLabel30);
        jLabel30.setBounds(0, 110, 720, 420);

        getContentPane().add(jInternalFrame2);
        jInternalFrame2.setBounds(360, 254, 0, 0);
        getContentPane().add(jLabel39);
        jLabel39.setBounds(50, 160, 0, 60);
        getContentPane().add(jLabel40);
        jLabel40.setBounds(50, 90, 0, 60);

        jLabel41.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel41.setText("To (Coming Date):");
        getContentPane().add(jLabel41);
        jLabel41.setBounds(100, 170, 120, 30);

        jLabel42.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel42.setText("From (Current Date):");
        getContentPane().add(jLabel42);
        jLabel42.setBounds(100, 100, 140, 30);

        jLabel43.setText("YYYY-MM-DD");
        getContentPane().add(jLabel43);
        jLabel43.setBounds(280, 200, 110, 14);

        jLabel44.setText("YYYY-MM-DD");
        getContentPane().add(jLabel44);
        jLabel44.setBounds(280, 130, 110, 14);

        btnSearchEvent.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnSearchEvent.setIcon(new javax.swing.ImageIcon("E:\\iProject\\EventManagement\\EventManagement\\src\\eventmanagement\\Images\\folder-search.png")); // NOI18N
        btnSearchEvent.setText("Search Events");
        btnSearchEvent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchEventActionPerformed(evt);
            }
        });
        getContentPane().add(btnSearchEvent);
        btnSearchEvent.setBounds(470, 130, 150, 40);

        tableMyEvents.setAutoCreateRowSorter(true);
        tableMyEvents.setBorder(new javax.swing.border.MatteBorder(null));
        tableMyEvents.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tableMyEvents.setModel(new javax.swing.table.DefaultTableModel(
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
        tableMyEvents.setRowHeight(25);
        jScrollPane3.setViewportView(tableMyEvents);

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(20, 340, 710, 150);

        jLabel46.setIcon(new javax.swing.ImageIcon("E:\\iProject\\EventManagement\\EventManagement\\src\\eventmanagement\\Images\\MasterCalendarIcon.png")); // NOI18N
        getContentPane().add(jLabel46);
        jLabel46.setBounds(40, 230, 410, 240);

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

        jButton7.setIcon(new javax.swing.ImageIcon("E:\\iProject\\EventManagement\\EventManagement\\src\\eventmanagement\\Images\\help.jpg")); // NOI18N
        jButton7.setText("Help");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton7);
        jButton7.setBounds(640, 20, 90, 41);

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
        jButton5.setBounds(610, 500, 120, 40);
        getContentPane().add(txtCurrentDate);
        txtCurrentDate.setBounds(240, 100, 160, 30);
        getContentPane().add(txtComingDate);
        txtComingDate.setBounds(240, 170, 160, 30);

        jLabel45.setIcon(new javax.swing.ImageIcon("E:\\iProject\\EventManagement\\EventManagement\\src\\eventmanagement\\Images\\my events icon.png")); // NOI18N
        getContentPane().add(jLabel45);
        jLabel45.setBounds(40, 160, 50, 60);

        jLabel47.setIcon(new javax.swing.ImageIcon("E:\\iProject\\EventManagement\\EventManagement\\src\\eventmanagement\\Images\\my events icon.png")); // NOI18N
        getContentPane().add(jLabel47);
        jLabel47.setBounds(40, 90, 50, 60);

        jLabel49.setIcon(new javax.swing.ImageIcon("E:\\iProject\\EventManagement\\EventManagement\\src\\eventmanagement\\Images\\pin-pinterest.png")); // NOI18N
        getContentPane().add(jLabel49);
        jLabel49.setBounds(470, 210, 160, 170);

        jLabel50.setIcon(new javax.swing.ImageIcon("E:\\iProject\\EventManagement\\EventManagement\\src\\eventmanagement\\Images\\calendar icon main.png")); // NOI18N
        getContentPane().add(jLabel50);
        jLabel50.setBounds(0, 80, 740, 460);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField8ActionPerformed

    private void btnSearchEventActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchEventActionPerformed
        // Searching events on button click if given conditions are matched
        if(((JTextField)txtCurrentDate.getDateEditor().getUiComponent()).getText().isEmpty() || ((JTextField)txtComingDate.getDateEditor().getUiComponent()).getText().isEmpty()) 
        {
            JOptionPane.showMessageDialog(this, "Date should be filled");
        } 
       
       
        else if (txtCurrentDate.getDate().after(d) && txtComingDate.getDate().after(d))
        {
            SearchEventsbyDate();
        } 
        else 
        {
            JOptionPane.showMessageDialog(this, "Please enter Current/Coming Date");
            
                    
        }
    }//GEN-LAST:event_btnSearchEventActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
     // Program will be exited on button click
        int a=JOptionPane.showConfirmDialog(this, "Are you sure you want to exit?","Exited",JOptionPane.YES_NO_OPTION);
            if (a==0) 
            {
                System.exit(1);
            }        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // Pdf file related to the frame will be open on button click
        try 
        {
            Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler "+"E:\\iProject\\EventManagement\\EventManagement\\src\\eventmanagement\\EMS_MyEvents.pdf");
        } 
        catch (Exception ex)
        {
            System.out.println(ex);
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSearchEvent;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton7;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JInternalFrame jInternalFrame2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
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
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTable tableMyEvents;
    private com.toedter.calendar.JDateChooser txtComingDate;
    private com.toedter.calendar.JDateChooser txtCurrentDate;
    private javax.swing.JLabel txtUserId;
    private javax.swing.JLabel txtUserName;
    // End of variables declaration//GEN-END:variables
}
