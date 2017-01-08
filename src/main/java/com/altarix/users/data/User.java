package com.altarix.users.data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "users")
public class User implements Serializable{
    @Id
    @Column(name = "user_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "my_user_id_seq")
    @SequenceGenerator(name = "my_user_id_seq", sequenceName = "user_id_seq")
    private long id;
    @Column(name = "surname", length = 100)
    private String surname;
    @Column(name = "firstname", length = 100)
    private String firstname;
    @Column(name = "middlename", length = 100)
    private String middlename;
    @Column(unique = true, length = 100)
    private String email;
    @Column(unique = true, length = 100)
    private String login;
    @Column(name = "password",length = 200)
    private String password;
    @Column(name = "role_id")
    private long role_id = 2;
    @ManyToOne(optional=false)
    @JoinColumn(name="role_id",referencedColumnName="role_id", insertable=false, updatable=false)
    private Role role;

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setMiddlename(String middlename) {
        this.middlename = middlename;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setRole_id(long role) {
        this.role_id = role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public long getId() {
        return id;
    }

    public String getSurname() {
        return surname;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getMiddlename() {
        return middlename;
    }

    public String getEmail() {
        return email;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public long getRole_id() {
        return role_id;
    }

    public Role getRole() {
        return role;
    }
}
