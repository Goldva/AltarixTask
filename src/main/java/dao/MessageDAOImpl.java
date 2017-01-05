package dao;

import data.Message;
import org.hibernate.Session;
import util.HibernateUtil;

import java.sql.SQLException;
import java.util.Collection;
import java.util.List;


public class MessageDAOImpl implements MessageDAO {
    @Override
    public void addMessage(Message message) throws SQLException {
        Session session = null;
        try {
            session = HibernateUtil.getSession();
            session.beginTransaction();
            session.save(message);
            session.getTransaction().commit();
        }finally {
            if (session != null && session.isOpen()){
                session.close();
            }
        }
    }

    @Override
    public void updateMessage(Message message) throws SQLException {

    }

    @Override
    public Message getMessageById(Long message_id) throws SQLException {
        Session session = null;
        try {
            session = HibernateUtil.getSession();
            session.beginTransaction();
            Message message = (Message) session.get(Message.class, message_id);
            session.getTransaction().commit();
            return message;
        } finally {
            if (session != null && session.isOpen()){
                session.close();
            }
        }
    }

    @Override
    public Collection getAllMessages() throws SQLException {
        Session session = null;
        List list;
        try {
            session = HibernateUtil.getSession();
            session.beginTransaction();
            list =  session.createCriteria(Message.class).list();
            session.getTransaction().commit();
            return list;
        } finally {
            if (session != null && session.isOpen()){
                session.close();
            }
        }
    }

    @Override
    public void deleteMessage(Message message) throws SQLException {
        Session session = null;
        try {
            session = HibernateUtil.getSession();
            session.beginTransaction();
            session.delete(message);
            session.getTransaction().commit();
        }finally {
            if (session != null && session.isOpen()){
                session.close();
            }
        }

    }
}
