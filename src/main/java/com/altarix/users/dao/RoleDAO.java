package com.altarix.users.dao;

import com.altarix.users.data.Role;

import java.util.Collection;

public interface RoleDAO {
    public void addRole(Role role);

    public Collection getAllRoles();

    public void deleteRole(Role role);

}
