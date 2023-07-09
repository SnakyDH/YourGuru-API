package com.yourGuru.infrastructure.persistence.interfaces;

import com.yourGuru.infrastructure.persistence.entities.DescriptionEntity;
import org.springframework.data.repository.CrudRepository;

public interface DesciptionCrudRepository extends CrudRepository<DescriptionEntity,Integer> {
}
