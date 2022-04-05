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

    @Column(name = "truc")
    private String truc;

    @ManyToMany(cascade = CascadeType.MERGE)
    @JoinTable(name = "role_permission", joinColumns = @JoinColumn(name = "id_permission"), inverseJoinColumns = @JoinColumn(name = "id_role"))
    private Set<Permission> permissions;

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

    public String getTruc() {
        return truc;
    }

    public void setTruc(String truc) {
        this.truc = truc;
    }

    public Set<Permission> getPermissions() {
        return permissions;
    }

    public void setPermissions(Set<Permission> permissions) {
        this.permissions = permissions;
    }
}
