package com.yourGuru.infrastructure.persistence.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import java.util.List;

@Entity
@Table(name = "genre")
public class GenreEntity {
    @Id
    private Integer id;
    private String name;
    @OneToMany(mappedBy = "genre")
    private List<ItemGenreEntity> items;
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

    public List<ItemGenreEntity> getItems() {
        return items;
    }

    public void setItems(List<ItemGenreEntity> items) {
        this.items = items;
    }
}
