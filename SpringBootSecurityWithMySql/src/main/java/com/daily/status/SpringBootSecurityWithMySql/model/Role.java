package com.daily.status.SpringBootSecurityWithMySql.model;

import javax.persistence.*;

@Entity
@Table(name = "role1")
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "role_id")
    private int roleId;

    @Column(name = "role")
    private String role;

    public Role() {
    }

    public Role(int roleId, String role) {
        this.roleId = roleId;
        this.role = role;
    }

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
