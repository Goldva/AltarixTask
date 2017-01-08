package com.altarix.users.dao;

import com.altarix.users.data.Friend;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public class FriendsDAOImpl implements FriendDAO {
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void addFriend(Friend friend) {
        sessionFactory.getCurrentSession().save(friend);
    }

    @Override
    public Collection getAllFriends() {
        return sessionFactory.getCurrentSession().createCriteria(Friend.class).list();
    }

    @Override
    public void deleteFriend(Friend friend) {
        sessionFactory.getCurrentSession().delete(friend);
    }
}
