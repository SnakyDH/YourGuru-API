package com.yourGuru.infrastructure.persistence.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "user")
public class UserEntity {
    @Id
    private Integer id;
    @Column(name = "username")
    private String userName;
    private String email;
    private String password;
    @Column(name = "id_user_rol")
    private Integer idUserRol;
    @ManyToOne
    @JoinColumn(name = "id_rol_user", insertable = false, updatable = false)
    private RolEntity rol;
    @OneToMany(mappedBy = "user", cascade = {CascadeType.ALL})
    private List<ItemEntity> items;

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

    public Integer getIdUserRol() {
        return idUserRol;
    }
    public void setIdUserRol(Integer idUserRol) {
        this.idUserRol = idUserRol;
    }
}
