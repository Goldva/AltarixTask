package com.altarix.users.data;

import javax.persistence.*;

@Entity
@Table(name = "friends")
public class Friend {
    @Id
    @Column(name = "friends_id")
    @SequenceGenerator(name = "friends_id_seq", sequenceName = "friends_id_seq")
    private long id;
    @Column(name = "user")
    private long user;
    @Column(name = "user_friends")
    private long userFriendId;

    @ManyToOne(optional=false)
    @JoinColumn(name="user",referencedColumnName="user_id", insertable=false, updatable=false)
    private User userActive;
    @ManyToOne(optional=false)
    @JoinColumn(name="user_friends",referencedColumnName="user_id", insertable=false, updatable=false)
    private User userFriend;

    public void setUser(long user) {
        this.user = user;
    }

    public void setUserFriendId(long userFriends) {
        this.userFriendId = userFriends;
    }

    public void setUserActive(User userFrom) {
        this.userActive = userFrom;
    }

    public long getId() {
        return id;
    }

    public long getUser() {
        return user;
    }

    public long getUserFriendId() {
        return userFriendId;
    }

    public User getUserActive() {
        return userActive;
    }

    public User getUserFriend() {
        return userFriend;
    }

    public void setUserFriend(User userTo) {
        this.userFriend = userTo;
    }
}
