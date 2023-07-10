package com.yourGuru.infrastructure.persistence.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "user_rol")
public class RolEntity {
    @Id
    private Integer id;
    private String rol;
    @OneToMany(mappedBy = "rol", cascade = {CascadeType.ALL})
    private List<UserEntity> users;
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
}
