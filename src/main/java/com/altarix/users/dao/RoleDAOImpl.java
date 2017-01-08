package com.altarix.users.dao;

import com.altarix.users.data.Role;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public class RoleDAOImpl implements RoleDAO{
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void addRole(Role role) {
        sessionFactory.getCurrentSession().save(role);
    }

    @Override
    public Collection getAllRoles() {
        return sessionFactory.getCurrentSession().createCriteria(Role.class).list();
    }

    @Override
    public void deleteRole(Role role) {
        sessionFactory.getCurrentSession().delete(role);
    }
}
