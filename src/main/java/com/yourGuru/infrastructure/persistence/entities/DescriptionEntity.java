package com.yourGuru.infrastructure.persistence.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "description")
public class DescriptionEntity {
    @Id
    private Integer id;
    @Column(name = "description")
    private String text;

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
}
