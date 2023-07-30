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
    @OneToOne
    private DescriptionEntity description;
    @ManyToOne
    @JoinColumn(name="id_item_type", insertable = false, updatable = false)
    private TypeEntity type;
    @ManyToOne
    @JoinColumn(name = "id_item_state",insertable = false, updatable = false)
    private StateEntity state;
    @OneToMany(mappedBy = "item")
    private List<ReviewEntity> opinions;
    @OneToMany(mappedBy = "item")
    private List<ItemGenreEntity> items;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDateTime getRealeaseDate() {
        return realeaseDate;
    }

    public void setRealeaseDate(LocalDateTime realeaseDate) {
        this.realeaseDate = realeaseDate;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public int getIdDescription() {
        return idDescription;
    }

    public void setIdDescription(int idDescription) {
        this.idDescription = idDescription;
    }

    public int getIdItemType() {
        return idItemType;
    }

    public void setIdItemType(int idItemType) {
        this.idItemType = idItemType;
    }

    public int getIdItemState() {
        return idItemState;
    }

    public void setIdItemState(int idItemState) {
        this.idItemState = idItemState;
    }

    public UserEntity getUser() {
        return user;
    }

    public void setUser(UserEntity user) {
        this.user = user;
    }

    public DescriptionEntity getDescription() {
        return description;
    }

    public void setDescription(DescriptionEntity description) {
        this.description = description;
    }

    public TypeEntity getType() {
        return type;
    }

    public void setType(TypeEntity type) {
        this.type = type;
    }

    public StateEntity getState() {
        return state;
    }

    public void setState(StateEntity state) {
        this.state = state;
    }

    public List<ReviewEntity> getOpinions() {
        return opinions;
    }

    public void setOpinions(List<ReviewEntity> opinions) {
        this.opinions = opinions;
    }

    public List<ItemGenreEntity> getItems() {
        return items;
    }

    public void setItems(List<ItemGenreEntity> items) {
        this.items = items;
    }
}
