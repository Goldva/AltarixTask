package dao;

import data.User;
import org.hibernate.Session;
//import util.HibernateUtil;

import java.sql.SQLException;
import java.util.Collection;
import java.util.List;

public class UserDAOImpl implements UserDAO {
    @Override
    public void addUser(User user) throws SQLException {
        Session session = null;
        try {
//            session = HibernateUtil.getSession();
            session.beginTransaction();
            session.save(user);
            session.getTransaction().commit();
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
    }

    @Override
    public void updateUser(User user) throws SQLException {
        Session session = null;
        try {
//            session = HibernateUtil.getSession();
            session.beginTransaction();
            session.update(user);
            session.getTransaction().commit();
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
    }

    @Override
    public User getUserById(Long userId) throws SQLException {
        Session session = null;
        try {
//            session = HibernateUtil.getSession();
            session.beginTransaction();
            User user = (User) session.get(User.class, userId);
            session.getTransaction().commit();
            return user;
        }
        finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
    }

    @Override
    public Collection getAllUsers() throws SQLException {
        Session session = null;
        List users;
        try {
//            session = HibernateUtil.getSession();
            session.beginTransaction();
            users = session.createCriteria(User.class).list();
            session.getTransaction().commit();
            return users;
        }
        finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
    }

    @Override
    public void deleteUser(User user) throws SQLException {
        Session session = null;
        try {
//            session = HibernateUtil.getSession();
            session.beginTransaction();
            session.delete(user);
            session.getTransaction().commit();
        }
        finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
    }
}
