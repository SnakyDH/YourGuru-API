package com.yourGuru.persistence.entities;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "item_genre")
public class ItemGenre {
    @EmbeddedId
    private ItemGenrePK id;
    public ItemGenrePK getId() {
        return id;
    }

    public void setId(ItemGenrePK id) {
        this.id = id;
    }
}
// realations -> @ManyToOne @JoinColumn