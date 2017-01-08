package com.altarix.users.dao;

import com.altarix.users.data.Friend;

import java.util.Collection;

public interface FriendDAO {
    public void addFriend(Friend friend);

    public Collection getAllFriends();

    public void deleteFriend(Friend friend);
}
