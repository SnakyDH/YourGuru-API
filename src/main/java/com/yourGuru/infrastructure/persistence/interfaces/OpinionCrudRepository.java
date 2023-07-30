package com.yourGuru.infrastructure.persistence.interfaces;

import com.yourGuru.infrastructure.persistence.entities.ReviewEntity;
import org.springframework.data.repository.CrudRepository;

public interface OpinionCrudRepository extends CrudRepository<ReviewEntity,Integer> {
}
