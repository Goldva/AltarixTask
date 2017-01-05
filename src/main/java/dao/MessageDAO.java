package dao;

import data.Message;
import data.User;

import java.sql.SQLException;
import java.util.Collection;

public interface MessageDAO {
    public void addMessage(Message message);

    public void updateMessage(Message message) throws SQLException;

    public Message getMessageById(long message_id);

    public Collection getAllMessages();

    public void deleteMessage(Message message);
}
