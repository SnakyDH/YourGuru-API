package com.yourGuru.infrastructure.persistence.interfaces;

import com.yourGuru.infrastructure.persistence.entities.ItemEntity;
import org.springframework.data.repository.CrudRepository;

public interface ItemCrudRepository extends CrudRepository<ItemEntity,Integer> {
}
