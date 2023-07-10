package com.yourGuru.infrastructure.persistence.entities;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "item")
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
    @Column(name = "id_user")
    private int idUser;
    @Column(name = "id_description")
    private int idDescription;
    @Column(name = "id_item_type")
    private int idItemType;
    @Column(name = "id_item_state")
    private int idItemState;
    @ManyToOne
    @JoinColumn(name = "id_user", insertable = false, updatable = false)
    private UserEntity user;
    // todo: verificar one to one relation
    @OneToOne
    private DescriptionEntity description;
    @ManyToOne
    @JoinColumn(name="id_item_type", insertable = false, updatable = false)
    private TypeEntity type;
    // todo: stateEntity
    @ManyToOne
    @JoinColumn(name = "id_item_state",insertable = false, updatable = false)
    private StateEntity state;
    @OneToMany(mappedBy = "item")
    private List<ReviewEntity> opinions;
    @OneToMany(mappedBy = "genre")
    private List<ItemGenreEntity> genres;

}
