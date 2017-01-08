package com.altarix.users.service;

import com.altarix.users.dao.RoleDAO;
import com.altarix.users.data.Friend;
import com.altarix.users.data.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;

@Service
public class RoleService {
    @Autowired
    private RoleDAO roleDAO;

    @Transactional
    public void addRole(Role role){
        roleDAO.addRole(role);
    }

    @Transactional
    public Collection getAllRoles(){
        return roleDAO.getAllRoles();
    }

    @Transactional
    public void deleteRole(Role role){
        roleDAO.deleteRole(role);
    }
}
