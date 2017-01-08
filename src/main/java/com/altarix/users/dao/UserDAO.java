package com.altarix.users.dao;

import com.altarix.users.data.User;

import java.util.Collection;

public interface UserDAO {
    public void addUser(User user) ;

    public void updateUser(User user) ;

    public User findByUserName(String login);

    public User getUserById(Long userId) ;

    public Collection getAllUsers() ;

    public void deleteUser(User user) ;
}
