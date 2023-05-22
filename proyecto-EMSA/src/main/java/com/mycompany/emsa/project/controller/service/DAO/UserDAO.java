package com.mycompany.emsa.project.controller.service.DAO;

import com.mycompany.emsa.project.connection.ConnectionDBA;
import com.mycompany.emsa.project.controller.service.model.User;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserDAO {
    public final String SELECT_ALL_USERS = "SELECT * FROM User";
    public final String SELECT_EMAIL_AND_PASSWORD = "SELECT * FROM User WHERE email = ? AND password = ?";
    public final String INSERT_USER = "INSERT INTO User (name,last_name,address,email,password,rol,status) VALUES (?,?,?,?,?,?,?)";
    public final String UPDATE_USER = "UPDATE User SET name =?,last_name =?,address =?,email =?,password =?,rol =?,status =? WHERE id =?";
    public final String DELETE_USER = "DELETE FROM User WHERE id =?";

    public User getUserByEmailAndPassword(String email, String password) {
       User user = null;
        try(Connection connection = ConnectionDBA.getConnection()){
            var preparedStatement = connection.prepareStatement(SELECT_EMAIL_AND_PASSWORD);
            preparedStatement.setString(1, email);
            preparedStatement.setString(2, password);
            var resultSet = preparedStatement.executeQuery();
            if(resultSet.next()){
                user = new User();
                getUserFromResultSet(resultSet, user);
            }
            preparedStatement.close();
            return user;


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public List<User> getAllUsers() {
        List<User> users = new ArrayList<>();
        try(Connection connection = ConnectionDBA.getConnection()){
            var preparedStatement = connection.prepareStatement(SELECT_ALL_USERS);
            var resultSet = preparedStatement.executeQuery();
            while(resultSet.next()){
                User user = new User();
                getUserFromResultSet(resultSet, user);
                users.add(user);
            }
            preparedStatement.close();
            return users;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void insertUser(User user) {
        user.setStatus(true);
        try(Connection connection = ConnectionDBA.getConnection()){
            var preparedStatement = connection.prepareStatement(INSERT_USER);
            preparedStatement.setString(1, user.getName());
            preparedStatement.setString(2, user.getLastName());
            preparedStatement.setString(3, user.getAddress());
            preparedStatement.setString(4, user.getEmail());
            preparedStatement.setString(5, user.getPassword());
            preparedStatement.setString(6, user.getRole());
            preparedStatement.setBoolean(7, user.getStatus());
            preparedStatement.executeUpdate();
            preparedStatement.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    private void getUserFromResultSet(ResultSet resultSet, User user) throws SQLException {
        user.setIdUser(resultSet.getInt("id"));
        user.setName(resultSet.getString("name"));
        user.setLastName(resultSet.getString("last_name"));
        user.setAddress(resultSet.getString("address"));
        user.setEmail(resultSet.getString("email"));
        user.setPassword(resultSet.getString("password"));
        user.setRole(resultSet.getString("rol"));
        user.setStatus(resultSet.getBoolean("status"));
    }
}
