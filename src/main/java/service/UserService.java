
package service;
import db.DBConnection;
//import jdk.internal.jimage.ImageStrings;
import model.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
public class UserService {

    public static  List<User> getAllUsers() throws SQLException {
        List<User> users = new ArrayList<>();
        Connection connection= DBConnection.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement("select * from user");
        ResultSet resultSet = preparedStatement.executeQuery();

        while(resultSet.next()){
            String name=resultSet.getString(2);
            String email=resultSet.getString("email");
            User user =new User(name,email);
           users.add(user);



        }
        return users;

    }
}



