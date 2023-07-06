package com.yourGuru.persistence.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class User {
    @Id
    private Integer id;
    @Column(name = "username")
    private String userName;
    private String email;
    private String password;
    @OneToOne
    @JoinColumn(name = "id_rol_user", insertable = false, updatable = false)
    private Rol rol;
    @OneToMany(mappedBy = "user")
    private List<Item> items;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }
}
