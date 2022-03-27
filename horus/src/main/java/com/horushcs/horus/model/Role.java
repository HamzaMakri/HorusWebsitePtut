package com.horushcs.horus.model;

import lombok.NonNull;
import javax.persistence.Entity;
import javax.persistence.*;

@Entity
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "role_id")
    private Integer role_id;
    @Column(name = "name")
    private String name;

    public Integer getRole_id() {
        return role_id;
    }

    public String getName() {
        return name;
    }
}
