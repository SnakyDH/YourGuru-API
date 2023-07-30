package com.yourGuru.infrastructure.persistence.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "item_state")
public class StateEntity {
    @Id
    private Integer id;
    @Column(name = "state")
    private String text;
    @OneToMany(mappedBy = "state", cascade = {CascadeType.ALL})
    private List<ItemEntity> items;
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public List<ItemEntity> getItems() {
        return items;
    }

    public void setItems(List<ItemEntity> items) {
        this.items = items;
    }
}
