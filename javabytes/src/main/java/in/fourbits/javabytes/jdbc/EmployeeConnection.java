/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package in.fourbits.javabytes.jdbc;

import com.sun.rowset.JdbcRowSetImpl;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.sql.RowSet;
import javax.sql.rowset.JdbcRowSet;



/**
 *
 * @author Suraj
 */
public class EmployeeConnection {
    
    public static void createConnection() throws ClassNotFoundException, SQLException {
        // Add mysql JDBC driver lib 
        //Class.forName("com.mysql.jdbc.Driver");
        Double d;
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/dbjsfhibernate", "root", "root");        
        Statement statement = connection.createStatement();
        statement.execute("insert into tblemployee (fldemployeeName, fldaddress, fldcontactNo) values('from stmt', 'class','123123')");        
        ResultSet resultSet= statement.executeQuery("select * from tblemployee");
        while(resultSet!=null && resultSet.next())
        {
            System.out.println(" id --> "+resultSet.getInt(1)+ " name ---> "+resultSet.getString(2));
        }
        
         JdbcRowSetImpl jdbcRowSetImpl = new JdbcRowSetImpl(resultSet);
         //JdbcRowSet jdbcRowSet = JdbcRowSetImpl();
    }
    
    public static void main(String[] args) {
        try {
        createConnection();    
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    
}
