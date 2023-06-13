package repositories;

import connection.ConnectionDBA;
import model.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserRepository {
    
    private PreparedStatement preparedStatement = null;
    private final String SELECT_ALL_USERS = "select * from users";
    private final String SELECT_USER_LOGIN= "SELECT * FROM users WHERE email = ? AND password = ?";
    private final String INSERT_USER = "INSERT INTO users (name,last_name,phone_number,address,email,password,rol,active) VALUES (?,?,?,?,?,?,?,?)";
    private final String UPDATE_USER = "UPDATE users SET name =?,last_name =?,phone_number =?,address =?,email =?,password =?,rol =?,active =? WHERE id =?";
    private final String DELETE_USER = "DELETE FROM users WHERE id =?";

    public User getUserByEmailAndPassword(String email, String password) {
       User user = new User();
        try(Connection connection = ConnectionDBA.getConnection()){
            preparedStatement = connection.prepareStatement(SELECT_USER_LOGIN);
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
            preparedStatement = connection.prepareStatement(SELECT_ALL_USERS);
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
        user.setActive(true);
        try(Connection connection = ConnectionDBA.getConnection()){
            preparedStatement = connection.prepareStatement(INSERT_USER);
            setValuesToPreparedStatement(user, preparedStatement,false);
            preparedStatement.executeUpdate();
            preparedStatement.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }



    public  void updateUser(User user) {
        try(Connection connection = ConnectionDBA.getConnection()){
            preparedStatement = connection.prepareStatement(UPDATE_USER);
            setValuesToPreparedStatement(user, preparedStatement,true);
            preparedStatement.executeUpdate();
            preparedStatement.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public void deleteUser(int id) {
        try(Connection connection = ConnectionDBA.getConnection()){
            preparedStatement = connection.prepareStatement(DELETE_USER);
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();
            preparedStatement.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    private void getUserFromResultSet(ResultSet resultSet, User user) throws SQLException {
        user.setIdUser(resultSet.getInt("id_user"));
        user.setName(resultSet.getString("name"));
        user.setLastName(resultSet.getString("last_name"));
        user.setPhoneNumber(resultSet.getString("phone_number"));
        user.setAddress(resultSet.getString("address"));
        user.setEmail(resultSet.getString("email"));
        user.setPassword(resultSet.getString("password"));
        user.setRole(resultSet.getString("rol"));
        user.setActive(resultSet.getBoolean("active"));
    }
    private static void setValuesToPreparedStatement(User user, PreparedStatement preparedStatement,boolean isIDRequired) throws SQLException {
        preparedStatement.setString(1, user.getName());
        preparedStatement.setString(2, user.getLastName());
        preparedStatement.setString(3, user.getPhoneNumber());
        preparedStatement.setString(4, user.getAddress());
        preparedStatement.setString(5, user.getEmail());
        preparedStatement.setString(6, user.getPassword());
        preparedStatement.setString(7, user.getRole());
        preparedStatement.setBoolean(8, user.getActive());
        if(isIDRequired){
            preparedStatement.setInt(9, user.getIdUser());
        }
    }
}
