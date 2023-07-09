package com.yourGuru.infrastructure.persistence.interfaces;

import com.yourGuru.infrastructure.persistence.entities.OpinionEntity;
import org.springframework.data.repository.CrudRepository;

public interface OpinionCrudRepository extends CrudRepository<OpinionEntity,Integer> {
}
