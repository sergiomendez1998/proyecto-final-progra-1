package service;

import interfaces.CrudInterface;
import repositories.UserRepository;
import model.User;

import java.util.List;

public class UserServiceManagement implements CrudInterface {
    
    UserRepository userRepository = new UserRepository();
    
    public User validateLoginUser(String email, String password) {
        return userRepository.getUserByEmailAndPassword(email, password);
    }

    @Override
    public void executeCreate(Object object) {
           userRepository.insertUser((User) object);
    }

    @Override
    public List<?> executeReadAll() {
        return userRepository.getAllUsers();
    }

    @Override
    public void executeUpdate(Object object) {
           userRepository.updateUser((User) object);
    }

    @Override
    public void executeDelete(int id) {
        userRepository.deleteUser(id);
    }

    @Override
    public void executeRead(int id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
