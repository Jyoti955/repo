import db.DBConnection;
import service.usesevice;

import java.sql.Connection;
import java.sql.SQLException;


public class controller {
    public static void main(String[] args) {
       Connection connection=DBConnection.getConnection();
        try{
           usesevice.getAllUsers().forEach(user ->System.out.println(user));

        }catch (SQLException throwables){
            throwables.printStackTrace();
        }
    }

    }

