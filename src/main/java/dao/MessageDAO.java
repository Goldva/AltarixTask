package dao;

import data.Message;
import data.User;

import java.sql.SQLException;
import java.util.Collection;

public interface MessageDAO {
    public void addMessage(Message message) throws SQLException;

    public void updateMessage(Message message) throws SQLException;

    public Message getMessageById(Long message_id) throws SQLException;

    public Collection getAllMessages() throws SQLException;

    public void deleteMessage(Message message) throws SQLException;
}
