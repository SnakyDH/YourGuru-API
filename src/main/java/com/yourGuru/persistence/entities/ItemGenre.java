package com.yourGuru.persistence.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "item_genre")
public class ItemGenre {
    @EmbeddedId
    private ItemGenrePK id;
    @ManyToOne
    @JoinColumn(name = "id_item", insertable = false, updatable = false)
    private Item item;
    @ManyToOne
    @JoinColumn(name = "id_genre", insertable = false,updatable = false)
    private Genre genre;
    public ItemGenrePK getId() {
        return id;
    }

    public void setId(ItemGenrePK id) {
        this.id = id;
    }
}
// realations -> @ManyToOne @JoinColumn