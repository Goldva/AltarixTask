package com.altarix.users.service;

import com.altarix.users.dao.FriendDAO;
import com.altarix.users.data.Friend;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;

@Service
public class FriendService {
    @Autowired
    private FriendDAO friendDAO;

    @Transactional
    public void addFriend(Friend friend){
        friendDAO.addFriend(friend);
    }

    @Transactional
    public Collection getAllFriends(){
        return friendDAO.getAllFriends();
    }

    @Transactional
    public void deleteFriend(Friend friend){
        friendDAO.deleteFriend(friend);
    }
}
