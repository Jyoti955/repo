import db.DBConnection;
import service.UserService;

import java.sql.Connection;
import java.sql.SQLException;


public class Controller {
    public static void main(String[] args) {
       Connection connection=DBConnection.getConnection();
        try{
           UserService.getAllUsers().forEach(user ->System.out.println(user));

        }catch (SQLException throwables){
            throwables.printStackTrace();
        }
    }

    }

