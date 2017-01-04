package data;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;
import java.util.List;

/**
 * Created by Aleksei on 03.01.2017.
 */

@Entity
@Table (name = "message")
public class Message implements Serializable{
    @Id
    @Column(name = "mess_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;
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


    public long getId() {
        return id;
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

}
