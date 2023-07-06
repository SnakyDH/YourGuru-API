package com.yourGuru.persistence.entities;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

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
    @ManyToOne
    @JoinColumn(name = "id_user", insertable = false, updatable = false)
    private User user;
    @ManyToOne
    @JoinColumn(name="id_type_item", insertable = false, updatable = false)
    private Type type;
    @Column(name="id_description")
    private Integer idDescription;
    @OneToMany(mappedBy = "item")
    private List<Opinion> opinions;
    @OneToMany(mappedBy = "genre")
    private List<ItemGenre> genres;
}
