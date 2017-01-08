package com.altarix.users.data;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;

/**
 * Created by Aleksei on 03.01.2017.
 */

@Entity
@Table (name = "message")
public class Message implements Serializable{
    @Id
    @Column(name = "mess_id")
    @SequenceGenerator(name = "message_id_seq", sequenceName = "message_id_seq")
    private long messId;
    @Column(name = "from_whom")
    private long fromWhomId;
    @Column(name = "to_whom")
    private long toWhomId;
    @Column(name = "date")
    private Date date;
    @Column(name = "theme")
    private String theme;
    @Column(name = "message")
    private String message;

    @ManyToOne(optional=false)
    @JoinColumn(name="from_whom",referencedColumnName="user_id", insertable=false, updatable=false)
    private User userFrom;
    @ManyToOne(optional=false)
    @JoinColumn(name="to_whom",referencedColumnName="user_id", insertable=false, updatable=false)
    private User userTo;

    public void setFromWhomId(long fromWhomId) {
        this.fromWhomId = fromWhomId;
    }

    public void setToWhomId(long toWhomId) {
        this.toWhomId = toWhomId;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setUserFrom(User user) {
        this.userFrom = user;
    }

    public void setUserTo(User userTo) {
        this.userTo = userTo;
    }

    public long getMessId() {
        return messId;
    }

    public long getFromWhomId() {
        return fromWhomId;
    }

    public long getToWhomId() {
        return toWhomId;
    }

    public Date getDate() {
        return date;
    }

    public String getTheme() {
        return theme;
    }

    public String getMessage() {
        return message;
    }

    public User getUserFrom() {
        return userFrom;
    }

    public User getUserTo() {
        return userTo;
    }
}
