package com.yourGuru.infrastructure.persistence.interfaces;

import com.yourGuru.infrastructure.persistence.entities.GenreEntity;
import org.springframework.data.repository.CrudRepository;

public interface GenreCrudRepository extends CrudRepository<GenreEntity,Integer> {
}
