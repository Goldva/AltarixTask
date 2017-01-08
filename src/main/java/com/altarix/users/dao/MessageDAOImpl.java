package com.altarix.users.dao;

import com.altarix.users.data.Message;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.util.Collection;

@Repository
public class MessageDAOImpl implements MessageDAO {
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void addMessage(Message message) {
        sessionFactory.getCurrentSession().save(message);
    }

    @Override
    public Message getMessageById(long messageId) {
        return (Message) sessionFactory.getCurrentSession().get(Message.class, messageId);
    }

    @Override
    public Collection getAllMessages() {
        return sessionFactory.getCurrentSession().createCriteria(Message.class).list();
    }

    @Override
    public void deleteMessage(Message message) {                                            //TODO: �� id
        sessionFactory.getCurrentSession().delete(message);
    }
}
