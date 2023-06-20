package com.yourGuru.persistence.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

@Entity
public class Item {
    @Id
    private Integer id;
    private String title;
    @Column(name = "realease_data")
    private LocalDateTime realeaseDate;
    @Column(name = "created_at")
    private LocalDateTime createdAt;
    @Column(name = "updated_at")
    private LocalDateTime updatedAt;
    @Column(name="id_user")
    private Integer idUser;
    @Column(name="id_type_itemr")
    private Integer idType;
    @Column(name="id_description")
    private Integer idDescription;

}
