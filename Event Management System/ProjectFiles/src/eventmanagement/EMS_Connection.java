
package eventmanagement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.sql.*;
import javax.swing.JOptionPane;

public class EMS_Connection //Creating Connection Class
{
   
    public static Connection xc;
    public static Statement st;

    public EMS_Connection() //Constructor Of Connection Class
    { 
        try
        {       
        Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
        xc=DriverManager.getConnection("jdbc:odbc:con","sa","123");
        st=xc.createStatement();
        }
        catch(Exception ex)
        {
            System.out.println(ex);
        }
    }
                //End of Constructor Of Connection Class
}
//End of Creating Connection Class