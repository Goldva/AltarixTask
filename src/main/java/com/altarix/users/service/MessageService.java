package com.altarix.users.service;

import com.altarix.users.dao.MessageDAO;
import com.altarix.users.data.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;

@Service
public class MessageService {
    @Autowired
    private MessageDAO messageDAO;

    @Transactional
    public void addMessage(Message message) {
        messageDAO.addMessage(message);
    }

    @Transactional
    public Message getMessageById(long id){
        return messageDAO.getMessageById(id);
    }

    @Transactional
    public Collection getMessages(){
        return messageDAO.getAllMessages();
    }
    @Transactional
    public void deleteMessage(Message message){
        messageDAO.deleteMessage(message);
    }
}
