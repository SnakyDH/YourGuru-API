package com.yourGuru.infrastructure.persistence.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "review")
public class ReviewEntity {
    @Id
    private Integer id;
    private String comment;
    private Integer rating;
    @Column(name ="id_item")
    private Integer idItem;
    @ManyToOne
    @JoinColumn(name="id_item", insertable = false, updatable = false)
    private ItemEntity item;
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getComment() {
        return comment;
    }
    public void setComment(String comment) {
        this.comment = comment;
    }
    public Integer getRating() {
        return rating;
    }
    public void setRating(Integer rating) {
        this.rating = rating;
    }
    public Integer getIdItem() {
        return idItem;
    }
    public void setIdItem(Integer idItem) {
        this.idItem = idItem;
    }
    public ItemEntity getItem() {
        return item;
    }
    public void setItem(ItemEntity item) {
        this.item = item;
    }
}
