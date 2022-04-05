package com.horushcs.horus.model;


import lombok.NonNull;
import javax.persistence.*;
import java.util.Set;



@Entity
public class Permission {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long permission_id;

    @Column(unique = true)
    @NonNull
    private String name;


    public Permission() {
    }

    public Permission(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getPermission_id() {
        return permission_id;
    }

    public void setPermission_id(Long permission_id) {
        this.permission_id = permission_id;
    }
}
