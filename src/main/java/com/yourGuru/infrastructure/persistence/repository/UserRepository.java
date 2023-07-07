package com.yourGuru.infrastructure.persistence.repository;

import com.yourGuru.domain.interfaces.UserRepository;
import com.yourGuru.infrastructure.persistence.mapper.UserMapper;
import com.yourGuru.infrastructure.persistence.interfaces.UserCrudRepository;
import com.yourGuru.infrastructure.persistence.entities.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserRepository implements User {
    //Como implementa el repositorio del dominio, los metodos sobre escritos deben retornar objetos del dominio no de la base de datos
    // usando los metodos del mapper transformo los objetos en sentido de DB repository a objetos de dominio
    @Autowired
    private UserCrudRepository userCrudRepository;
    @Autowired
    private UserMapper mapper;
    public List<UserEntity> getAll(){ // used by service
        return (List<UserEntity>) userCrudRepository.findAll();
        // Query methods here the implementation and in interface that query -> userCrudRepository.findByIdCategoria();
    }
    // Good idea use Optional Class for a return or type of the method
}
