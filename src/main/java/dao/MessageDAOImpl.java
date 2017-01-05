package dao;

import data.Message;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
//import util.HibernateUtil;

import java.sql.SQLException;
import java.util.Collection;
import java.util.List;

@Repository
public class MessageDAOImpl implements MessageDAO {
    @Autowired
    private SessionFactory session;

    @Override
    public void addMessage(Message message) {
//        Session session = null;
//        try {
//            session = HibernateUtil.getSession();
//            session.beginTransaction();
            session.getCurrentSession().save(message);
//            session.getTransaction().commit();
//        }finally {
//            if (session != null && session.isOpen()){
//                session.close();
//            }
//        }
    }

    @Override
    public void updateMessage(Message message) throws SQLException {

    }

    @Override
    public Message getMessageById(long message_id) {
//        Session session = null;
//        try {
//            session = HibernateUtil.getSession();
//            session.beginTransaction();
            Message message = (Message) session.getCurrentSession().get(Message.class, message_id);
//            session.getTransaction().commit();
            return message;
//        } finally {
//            if (session != null && session.isOpen()){
//                session.close();
//            }
//        }
    }

    @Override
    public Collection getAllMessages() {
//        Session session = null;
//        List list;
//        try {
//            session = HibernateUtil.getSession();
//            session.beginTransaction();
//            list =  session.createCriteria(Message.class).list();
//            session.getTransaction().commit();
            return session.getCurrentSession().createCriteria(Message.class).list();
//        } finally {
//            if (session != null && session.isOpen()){
//                session.close();
//            }
//        }
    }

    @Override
    public void deleteMessage(Message message) {                                            //TODO: �� id
//        Session session = null;
//        try {
//            session = HibernateUtil.getSession();
//            session.beginTransaction();
            session.getCurrentSession().delete(message);
//            session.getTransaction().commit();
//        }finally {
//            if (session != null && session.isOpen()){
//                session.close();
//            }
//        }

    }
}
