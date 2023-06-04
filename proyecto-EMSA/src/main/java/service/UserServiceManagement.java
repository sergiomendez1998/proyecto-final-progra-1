package service;

import interfaces.CrudInterface;
import repositories.UserRepository;
import model.User;

import java.util.List;

public class UserServiceManagement implements CrudInterface {
    
    UserRepository userService = new UserRepository();
    
    public User validateLoginUser(String email, String password) {
        return userService.getUserByEmailAndPassword(email, password);
    }

    @Override
    public void create(Object object) {
           userService.insertUser((User) object);
    }

    @Override
    public List<?> read() {
        return userService.getAllUsers();
    }

    @Override
    public void update(Object object) {
           userService.updateUser((User) object);
    }

    @Override
    public void delete(int id) {
        userService.deleteUser(id);
    }
}
