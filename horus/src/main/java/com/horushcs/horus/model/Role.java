package com.horushcs.horus.model;

import lombok.NonNull;
import javax.persistence.Entity;
import javax.persistence.*;

@Entity
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "role_id")
    private Integer role_id;
    @Column(name = "name")
    private String name;
}
