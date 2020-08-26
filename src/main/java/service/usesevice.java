
package service;
import db.DBConnection;
//import jdk.internal.jimage.ImageStrings;
import model.user;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
public class usesevice{

    public static  List<user> getAllUsers() throws SQLException {
        Connection connection= DBConnection.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement("select*from user");
        ResultSet resultSet = preparedStatement.executeQuery();

        while(resultSet.next()){
            String name=resultSet.getString(2);
            String email=resultSet.getString("email");
            Users =new user(name,email);
           Users.add(user);



        }
        return Users;

    }
}



