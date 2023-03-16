
package eventmanagement;

import java.io.IOException;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class EMS_AllEvents extends javax.swing.JInternalFrame {

    
    public EMS_AllEvents() 
    {
       initComponents();
       EMS_Connection cn=new EMS_Connection(); //Object of Connection class  
       getname(); //Calling of method for displaying user name 
       getid();  //Calling of method for displaying user id
       AllEvents(); //Caliing AllEvents Method

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
            
                if (rs.next()) {
                    txtUserId.setText(rs.getString("User_Id"));
                               }
        } 
        catch (Exception ex)
        {
            System.out.println(ex);
        }
 }
   //End of Method for getting user id from database

    

public void AllEvents() //Method for displaying all events in EMS_AllEvents.java frame
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
   

 ResultSet rs=EMS_Connection.st.executeQuery("select Event_Id,[User_Id],Event_Date,Event_Title,Event_Time,Event_Colour,Event_Description from tbl_Event where User_Id='"+txtUserId.getText()+"' order by Event_Date asc");
        
        while (rs.next()) 
        {            
    obj.addRow(new Object[]{rs.getInt("Event_Id"),rs.getInt("User_Id"),rs.getDate("Event_Date"),rs.getString("Event_Title"),
    rs.getString("Event_Time"),rs.getString("Event_Colour"),rs.getString("Event_Description")});
        }
    tableAllEvents.setModel(obj);
    }
    
    catch(Exception ex)
   {
       System.out.println(ex);
   }
    
}
    //End of Method for displaying all events in EMS_AllEvents.java frame
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
        jScrollPane1 = new javax.swing.JScrollPane();
        tableAllEvents = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setTitle("All Events");
        setPreferredSize(new java.awt.Dimension(750, 600));
        getContentPane().setLayout(null);

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
        jPanel5.add(txtUserName);
        txtUserName.setBounds(310, 20, 100, 30);

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

        tableAllEvents.setAutoCreateRowSorter(true);
        tableAllEvents.setBorder(new javax.swing.border.MatteBorder(null));
        tableAllEvents.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tableAllEvents.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
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
        tableAllEvents.setRowHeight(30);
        tableAllEvents.setRowSelectionAllowed(false);
        jScrollPane1.setViewportView(tableAllEvents);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 180, 700, 340);

        jLabel2.setIcon(new javax.swing.ImageIcon("E:\\iProject\\EventManagement\\EventManagement\\src\\eventmanagement\\Images\\big-calendar-icon.png")); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(70, 90, 630, 180);

        jLabel3.setIcon(new javax.swing.ImageIcon("E:\\iProject\\EventManagement\\EventManagement\\src\\eventmanagement\\Images\\calendar icon main.png")); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(-6, 80, 750, 450);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       // Pdf file related to the frame will be open on button click
        try 
        {
            Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler "+"E:\\iProject\\EventManagement\\EventManagement\\src\\eventmanagement\\EMS_AllEvents.pdf");
        } 
        catch (IOException ex) 
        {
            Logger.getLogger(EMS_AllEvents.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
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
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableAllEvents;
    private javax.swing.JLabel txtUserId;
    private javax.swing.JLabel txtUserName;
    // End of variables declaration//GEN-END:variables
}
