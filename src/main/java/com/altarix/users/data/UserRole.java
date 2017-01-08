//package com.altarix.users.data;
//
//import javax.persistence.*;
//
//
//@Entity
//@Table(name = "user_roles")
//public class UserRole{
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "my_user_roles_id_seq")
//    @SequenceGenerator(name = "my_user_roles_id_seq", sequenceName = "user_roles_id_seq")
//    @Column(name = "user_role_id", unique = true, nullable = false)
//    private Integer userRoleId;
//    private User user;
//    @Column(name = "role", nullable = false)
//    private String role;
//
//    public Integer getUserRoleId() {
//        return this.userRoleId;
//    }
//
//    public void setUserRoleId(Integer userRoleId) {
//        this.userRoleId = userRoleId;
//    }
//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "login", nullable = false)
//
//    public User getUser() {
//        return this.user;
//    }
//
//    public void setUser(User user) {
//        this.user = user;
//    }
//
//    public String getRole() {
//        return this.role;
//    }
//
//    public void setRole(String role) {
//        this.role = role;
//    }
//
//}