package com.yourGuru.persistence.crud;

import com.yourGuru.persistence.entities.User;
import org.springframework.data.repository.CrudRepository;

public interface UserCrudRepository extends CrudRepository<User,Integer> {

}
