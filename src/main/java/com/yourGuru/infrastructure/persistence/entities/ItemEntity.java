package com.yourGuru.infrastructure.persistence.entities;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
public class ItemEntity {
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
    private UserEntity user;
    @ManyToOne
    @JoinColumn(name="id_type_item", insertable = false, updatable = false)
    private TypeEntity type;
    @Column(name="id_description")
    private Integer idDescription;
    @OneToMany(mappedBy = "item")
    private List<OpinionEntity> opinions;
    @OneToMany(mappedBy = "genre")
    private List<ItemGenreEntity> genres;
}
