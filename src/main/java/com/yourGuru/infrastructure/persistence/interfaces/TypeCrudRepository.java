package com.yourGuru.infrastructure.persistence.interfaces;

import com.yourGuru.infrastructure.persistence.entities.TypeEntity;
import org.springframework.data.repository.CrudRepository;

public interface TypeCrudRepository extends CrudRepository<TypeEntity, Integer> {
}
