
package eventmanagement;

import javax.swing.JOptionPane;
public class EMS_Allbuttons extends javax.swing.JFrame
{

    public EMS_Allbuttons() 
    {
        initComponents();
        EMS_Home hm=new EMS_Home(); //Object of Home frame
        jDesktopPane1.add(hm); //On frame load Home frame will be added on jDesktopPane1
        hm.show(); //Displaying Home frame
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnLogout = new javax.swing.JButton();
        btnMyEvents = new javax.swing.JButton();
        btnPrevious = new javax.swing.JButton();
        btnNewEvent = new javax.swing.JButton();
        btnModify = new javax.swing.JButton();
        btnReporting = new javax.swing.JButton();
        btnAlarmPanel = new javax.swing.JButton();
        btnAllEvents = new javax.swing.JButton();
        btnUserPanel1 = new javax.swing.JButton();
        btnHome1 = new javax.swing.JButton();
        jDesktopPane1 = new javax.swing.JDesktopPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(895, 600));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 153, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 102, 0)));
        jPanel1.setPreferredSize(new java.awt.Dimension(118, 600));
        jPanel1.setLayout(null);

        btnLogout.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnLogout.setIcon(new javax.swing.ImageIcon("E:\\iProject\\EventManagement\\EventManagement\\src\\eventmanagement\\Images\\logout.png")); // NOI18N
        btnLogout.setText("Logout");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });
        jPanel1.add(btnLogout);
        btnLogout.setBounds(0, 480, 133, 50);

        btnMyEvents.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnMyEvents.setIcon(new javax.swing.ImageIcon("E:\\iProject\\EventManagement\\EventManagement\\src\\eventmanagement\\Images\\my events icon.png")); // NOI18N
        btnMyEvents.setText("My Events");
        btnMyEvents.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMyEventsActionPerformed(evt);
            }
        });
        jPanel1.add(btnMyEvents);
        btnMyEvents.setBounds(0, 130, 133, 50);

        btnPrevious.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnPrevious.setIcon(new javax.swing.ImageIcon("E:\\iProject\\EventManagement\\EventManagement\\src\\eventmanagement\\Images\\back8.gif")); // NOI18N
        btnPrevious.setText("Previous");
        btnPrevious.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPreviousActionPerformed(evt);
            }
        });
        jPanel1.add(btnPrevious);
        btnPrevious.setBounds(0, 180, 133, 50);

        btnNewEvent.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnNewEvent.setIcon(new javax.swing.ImageIcon("E:\\iProject\\EventManagement\\EventManagement\\src\\eventmanagement\\Images\\new event.png")); // NOI18N
        btnNewEvent.setText("New Event");
        btnNewEvent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewEventActionPerformed(evt);
            }
        });
        jPanel1.add(btnNewEvent);
        btnNewEvent.setBounds(0, 230, 133, 50);

        btnModify.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnModify.setIcon(new javax.swing.ImageIcon("E:\\iProject\\EventManagement\\EventManagement\\src\\eventmanagement\\Images\\document-edit.png")); // NOI18N
        btnModify.setText("Modify");
        btnModify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifyActionPerformed(evt);
            }
        });
        jPanel1.add(btnModify);
        btnModify.setBounds(0, 280, 133, 50);

        btnReporting.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnReporting.setIcon(new javax.swing.ImageIcon("E:\\iProject\\EventManagement\\EventManagement\\src\\eventmanagement\\Images\\custom-reports.png")); // NOI18N
        btnReporting.setText("Reporting");
        btnReporting.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReportingActionPerformed(evt);
            }
        });
        jPanel1.add(btnReporting);
        btnReporting.setBounds(0, 330, 133, 50);

        btnAlarmPanel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnAlarmPanel.setIcon(new javax.swing.ImageIcon("E:\\iProject\\EventManagement\\EventManagement\\src\\eventmanagement\\Images\\alarm_button.png")); // NOI18N
        btnAlarmPanel.setText("Alarm Panel");
        btnAlarmPanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlarmPanelActionPerformed(evt);
            }
        });
        jPanel1.add(btnAlarmPanel);
        btnAlarmPanel.setBounds(0, 430, 133, 50);

        btnAllEvents.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnAllEvents.setIcon(new javax.swing.ImageIcon("E:\\iProject\\EventManagement\\EventManagement\\src\\eventmanagement\\Images\\event_calendar.png")); // NOI18N
        btnAllEvents.setText("All Events");
        btnAllEvents.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAllEventsActionPerformed(evt);
            }
        });
        jPanel1.add(btnAllEvents);
        btnAllEvents.setBounds(0, 80, 133, 50);

        btnUserPanel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnUserPanel1.setIcon(new javax.swing.ImageIcon("E:\\iProject\\EventManagement\\EventManagement\\src\\eventmanagement\\Images\\User panel.png")); // NOI18N
        btnUserPanel1.setText("User Panel");
        btnUserPanel1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUserPanel1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnUserPanel1);
        btnUserPanel1.setBounds(0, 380, 133, 50);

        btnHome1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnHome1.setIcon(new javax.swing.ImageIcon("E:\\iProject\\EventManagement\\EventManagement\\src\\eventmanagement\\Images\\home_basic_red.png")); // NOI18N
        btnHome1.setText("Home");
        btnHome1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHome1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnHome1);
        btnHome1.setBounds(0, 30, 133, 50);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 135, 570);

        jDesktopPane1.setPreferredSize(new java.awt.Dimension(740, 600));
        getContentPane().add(jDesktopPane1);
        jDesktopPane1.setBounds(136, 0, 749, 570);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMyEventsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMyEventsActionPerformed
       //Calling My Events frame on button click
        jDesktopPane1.removeAll();
        EMS_MyEvents me=new EMS_MyEvents();
        jDesktopPane1.add(me);
        me.show();
    }//GEN-LAST:event_btnMyEventsActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        //Calling Home frame on button click
      int a=JOptionPane.showConfirmDialog(this, "Are you sure you want to logout?","Logout Successfull",JOptionPane.YES_NO_OPTION);
        if (a==0)
        {
            this.dispose();
        }
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnPreviousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreviousActionPerformed
        //Calling Previous Events frame on button click
        jDesktopPane1.removeAll();
        EMS_Previous ps=new EMS_Previous();
        jDesktopPane1.add(ps);
        ps.show();
    }//GEN-LAST:event_btnPreviousActionPerformed

    private void btnNewEventActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewEventActionPerformed
        //Calling New Events frame on button click (Create New Event)
        jDesktopPane1.removeAll();
        EMS_NewEvent ne=new EMS_NewEvent();
        jDesktopPane1.add(ne);
        ne.show();
    }//GEN-LAST:event_btnNewEventActionPerformed

    private void btnModifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifyActionPerformed
        //Calling Modify frame on button click (Update/Delete Events)
        jDesktopPane1.removeAll();
        EMS_Modify my=new EMS_Modify();
        jDesktopPane1.add(my);
        my.show();
    }//GEN-LAST:event_btnModifyActionPerformed

    private void btnReportingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportingActionPerformed
        //Calling Reporting frame on button click (Generate Report)
        jDesktopPane1.removeAll();
        EMS_Reporting rg=new EMS_Reporting();
        jDesktopPane1.add(rg);
        rg.show();
    }//GEN-LAST:event_btnReportingActionPerformed

    private void btnAlarmPanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlarmPanelActionPerformed
        //Calling User Panel frame on button click (Change User Info/Change Password)
        jDesktopPane1.removeAll();
        AlarmTimerframe at=new AlarmTimerframe();
        jDesktopPane1.add(at);
        at.show();
    }//GEN-LAST:event_btnAlarmPanelActionPerformed

    private void btnAllEventsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAllEventsActionPerformed
        //Calling All Events frame on button click
        jDesktopPane1.removeAll();
        EMS_AllEvents ae=new EMS_AllEvents();
        jDesktopPane1.add(ae);
        ae.show();
    }//GEN-LAST:event_btnAllEventsActionPerformed

    private void btnUserPanel1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUserPanel1ActionPerformed
        // Calling User Panel frame on button click
        jDesktopPane1.removeAll();
        EMS_UserPanel up=new EMS_UserPanel();
        jDesktopPane1.add(up);
        up.show();
    }//GEN-LAST:event_btnUserPanel1ActionPerformed

    private void btnHome1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHome1ActionPerformed
        // Calling Home frame on button click
        jDesktopPane1.removeAll();
        EMS_Home hm=new EMS_Home();
        jDesktopPane1.add(hm);
        hm.show();
    }//GEN-LAST:event_btnHome1ActionPerformed

    public static void main(String args[]) {
       
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EMS_Allbuttons.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EMS_Allbuttons.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EMS_Allbuttons.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EMS_Allbuttons.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

       
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() 
            {
                new EMS_Allbuttons().setVisible(true);
            }
            }
            );
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlarmPanel;
    private javax.swing.JButton btnAllEvents;
    private javax.swing.JButton btnHome1;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnModify;
    private javax.swing.JButton btnMyEvents;
    private javax.swing.JButton btnNewEvent;
    private javax.swing.JButton btnPrevious;
    private javax.swing.JButton btnReporting;
    private javax.swing.JButton btnUserPanel1;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
