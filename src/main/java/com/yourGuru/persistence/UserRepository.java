package com.yourGuru.persistence;

import com.yourGuru.persistence.crud.UserCrudRepository;
import com.yourGuru.persistence.entities.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserRepository {
    private UserCrudRepository userCrudRepository;

    public List<User> getAll(){
        return (List<User>) userCrudRepository.findAll();
        // Query methots here the implementation and in interface that consulta -> findByIdCategoria
    }
}
