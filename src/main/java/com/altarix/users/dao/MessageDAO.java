package com.altarix.users.dao;

import com.altarix.users.data.Message;
import com.altarix.users.data.User;

import java.util.Collection;

public interface MessageDAO {
    public void addMessage(Message message);

    public Message getMessageById(long messageId);

    public Collection getAllMessages();

    public void deleteMessage(Message message);
}
