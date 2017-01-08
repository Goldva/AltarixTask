package com.altarix.users.data;

import javax.persistence.*;

@Entity
@Table(name = "roles")
public class Role {
    @Id
    @Column(name = "role_id")
    @SequenceGenerator(name = "role_id_seq", sequenceName = "role_id_seq")
    private long id;
    @Column(name = "role")
    private String role;

    public void setRole(String role) {
        this.role = role;
    }

    public long getId() {
        return id;
    }

    public String getRole() {
        return role;
    }
}
