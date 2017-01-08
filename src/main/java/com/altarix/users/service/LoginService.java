package com.altarix.users.service;

import com.altarix.users.dao.UserDAO;
import com.altarix.users.data.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;

@Service
public class LoginService {
    @Autowired
    private UserDAO userDAO;

    @Transactional
    public void addUser(User user){
        userDAO.addUser(user);
    }

    @Transactional
    public void updateUser(User user){
        userDAO.updateUser(user);
    }

    @Transactional
    public User getUserById(Long busId){
        return userDAO.getUserById(busId);
    }

    @Transactional
    public Collection getAllUsers(){
        return userDAO.getAllUsers();
    }

    @Transactional
    public void deleteUser(User user){
        userDAO.deleteUser(user);
    }

}
