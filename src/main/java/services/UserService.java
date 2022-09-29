package services;

import dao.UserDao;
import models.Auto;
import models.User;

import java.util.ArrayList;
import java.util.List;

public class UserService {
    private UserDao userDao = new UserDao();

    public UserService() {

    }

    public User findUser(int id) {
        return userDao.findById(id);
    }

    public void save(User user) {
        userDao.save(user);
    }

    public void delete(User user) {
        userDao.delete(user);
    }

    public void updateUser(User user) {
        userDao.update(user);
    }

    public ArrayList<User> findAllUsers() {
        return userDao.findAll();
    }

    public Auto findAutoById(int id) {
        return userDao.findAutoById(id);
    }
}
