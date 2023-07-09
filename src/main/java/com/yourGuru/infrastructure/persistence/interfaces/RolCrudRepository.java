package com.yourGuru.infrastructure.persistence.interfaces;

import com.yourGuru.infrastructure.persistence.entities.RolEntity;
import org.springframework.data.repository.CrudRepository;

public interface RolCrudRepository extends CrudRepository<RolEntity,Integer> {
}
