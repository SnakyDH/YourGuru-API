package com.yourGuru.persistence.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Opinion {
    @Id
    private Integer id;
    private String info;
    private Integer rating;
    @Column(name = "id_item")
    private Integer idItem;
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
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
}
