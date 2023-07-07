package com.yourGuru.infrastructure.persistence.entities;

import jakarta.persistence.Id;

public class RolEntity {
    @Id
    private Integer id;
    private String rol;

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
