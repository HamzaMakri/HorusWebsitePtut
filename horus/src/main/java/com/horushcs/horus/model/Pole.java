
package com.horushcs.horus.model;

import lombok.NonNull;
import javax.persistence.Entity;
import javax.persistence.*;
import java.util.Set;


@Entity
public class Pole {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pole_id")
    private Integer pole_id;
    @Column(name = "name")
    private String name;

    
    @ManyToMany(cascade = CascadeType.MERGE)
    @JoinTable(name = "role_pole", joinColumns = @JoinColumn(name = "pole_id"), inverseJoinColumns = @JoinColumn(name = "role_id"))
    private Set<Role> roles;

    public Pole() {
    }

    public Pole(String name) {
        this.name = name;
    }

    public Integer getPole_id() {
        return pole_id;
    }

    public void setPole_id(Integer pole_id) {
        this.pole_id = pole_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }

   

    
}
