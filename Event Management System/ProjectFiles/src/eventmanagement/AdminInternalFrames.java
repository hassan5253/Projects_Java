
package eventmanagement;

import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class AdminInternalFrames extends javax.swing.JInternalFrame 
{

    
public AdminInternalFrames() 
{
        initComponents();
        EMS_Connection cn=new EMS_Connection(); //Object of Connection class
        AllEvents(); //Calling of method for displaying all events
}

public void AllEvents() //Method for displaying all events 
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
   

 ResultSet rs=EMS_Connection.st.executeQuery("select Event_Id,[User_Id],Event_Date,Event_Title,Event_Time,Event_Colour,Event_Description from tbl_Event order by Event_Date asc");
        
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
    //End of Method for displaying all events 
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableAllEvents = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setTitle("Admin>All Upcoming Events\n");
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
        jScrollPane1.setBounds(20, 180, 700, 370);

        jLabel2.setIcon(new javax.swing.ImageIcon("E:\\iProject\\EventManagement\\EventManagement\\src\\eventmanagement\\Images\\big-calendar-icon.png")); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(70, 90, 630, 180);

        jLabel8.setIcon(new javax.swing.ImageIcon("E:\\iProject\\EventManagement\\EventManagement\\src\\eventmanagement\\Images\\calendar icon main.png")); // NOI18N
        getContentPane().add(jLabel8);
        jLabel8.setBounds(0, 84, 740, 480);

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableAllEvents;
    // End of variables declaration//GEN-END:variables
}
