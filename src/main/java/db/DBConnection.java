package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection{
    static Connection connection;
    static {
        try{
            Class.forName("com.mysql.cj.jdbc,Driver");

            connection= DriverManager.getConnection("jdbc:mysql//localhost:3306/jyoti","root" ,"jyoti@123");
           // connection=DriverManager.getConnection();
        }catch (SQLException | ClassNotFoundException ex){
            ex.printStackTrace();
        }
    }
    public static Connection getConnection(){
        return connection;
    }
    public static void close(){
        if(connection!=null){
            try{
                connection.close();
            }catch(SQLException throwables){
                throwables.printStackTrace();

            }

        }
    }
}