package com.yourGuru.infrastructure.persistence.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "item_genre")
public class ItemGenreEntity {
    @EmbeddedId
    private ItemGenrePK id;
    @ManyToOne
    @JoinColumn(name = "id_item", insertable = false, updatable = false)
    private ItemEntity item;
    @ManyToOne
    @JoinColumn(name = "id_genre", insertable = false,updatable = false)
    private GenreEntity genre;
    public ItemGenrePK getId() {
        return id;
    }

    public void setId(ItemGenrePK id) {
        this.id = id;
    }

    public ItemEntity getItem() {
        return item;
    }

    public void setItem(ItemEntity item) {
        this.item = item;
    }

    public GenreEntity getGenre() {
        return genre;
    }

    public void setGenre(GenreEntity genre) {
        this.genre = genre;
    }
}
