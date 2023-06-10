package service;

import interfaces.CrudInterface;
import repositories.UserRepository;
import model.User;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
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

    public List<User> getUsersFromTxtFile(String fileName) {
        List<User> users = new ArrayList<User>();
        File file = new File("C:\\Users\\SERGIO-MENDEZ\\Documents\\proyecto-final-progra-1\\proyecto-EMSA\\src\\main\\java\\views\\panels\\files\\"+fileName);

        if (!file.exists()) {
            throw new RuntimeException("File not found");
        }

       try {
           FileReader fileReader = new FileReader(file);
           BufferedReader bufferedReader = new BufferedReader(fileReader);
           String line;

           while ((line = bufferedReader.readLine()) != null) {
                String[] data = line.split(",");
                User user = new User();
                user.setName(data[0]);
                user.setLastName(data[1]);
                user.setPhoneNumber(data[2]);
                user.setAddress(data[3]);
                user.setEmail(data[4]);
                user.setPassword(data[5]);
                user.setRole(data[6]);
                user.setActive(data[7].equalsIgnoreCase("true"));
                users.add(user);
           }
       } catch (Exception e) {
           throw new RuntimeException(e);
       }
         return users;
    }
}
