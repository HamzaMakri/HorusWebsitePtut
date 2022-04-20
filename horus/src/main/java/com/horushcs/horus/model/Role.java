package com.horushcs.horus.model;

import lombok.NonNull;
import javax.persistence.Entity;
import javax.persistence.*;
import java.util.Set;

@Entity
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "role_id")
    private Integer role_id;
    @Column(name = "name")
    private String name;

   

    @ManyToMany(cascade = CascadeType.MERGE)
    @JoinTable(name = "role_permission", joinColumns = @JoinColumn(name = "id_permission"), inverseJoinColumns = @JoinColumn(name = "id_role"))
    private Set<Permission> permissions;
    
    @ManyToMany(cascade = CascadeType.MERGE)
    @JoinTable(name = "user_role", joinColumns = @JoinColumn(name = "id_user"), inverseJoinColumns = @JoinColumn(name = "id_role"))
    private Set<User> users;

    
    
    public Role() {
    }

    public Role(String name) {
        this.name = name;
    }

    public Integer getRole_id() {
        return role_id;
    }

    public String getName() {
        return name;
    }

    public void setRole_id(Integer role_id) {
        this.role_id = role_id;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    public Set<Permission> getPermissions() {
        return permissions;
    }

    public void setPermissions(Set<Permission> permissions) {
        this.permissions = permissions;
    }

    public Set<User> getUsers() {
        return users;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }
    
    
    
    
    
}
