
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

import java.sql.*;
import javax.swing.JOptionPane;

public class javaconnect {
    Connection conn;
    
    public static Connection ConnecrDb(){
        try{
            Class.forName("org.sqlite.JDBC");
            Connection conn=DriverManager.getConnection("jdbc:sqlite:E:\\Book Shop System\\BookShopSystem.sqlite");
            return conn;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
}
