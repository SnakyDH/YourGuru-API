package com.yourGuru.infrastructure.persistence.interfaces;

import com.yourGuru.domain.interfaces.UserRepository;
import com.yourGuru.domain.model.User;
import com.yourGuru.infrastructure.persistence.entities.UserEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface UserCrudRepository extends CrudRepository<UserEntity,Integer> {
  public Iterable<UserEntity> findAllByIdUserRol(int idRol);
}
