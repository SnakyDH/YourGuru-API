package com.yourGuru.infrastructure.persistence.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "type_item")
public class TypeEntity {
    @Id
    private Integer id;
    @Column(name = "type")
    private String name;
    @OneToMany(mappedBy = "type")
    private List<ItemEntity> items;
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
