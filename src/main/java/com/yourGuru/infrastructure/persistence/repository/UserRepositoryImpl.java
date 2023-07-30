package com.yourGuru.infrastructure.persistence.repository;

import com.yourGuru.domain.interfaces.UserRepository;
import com.yourGuru.domain.model.User;
import com.yourGuru.infrastructure.persistence.entities.UserEntity;
import com.yourGuru.infrastructure.persistence.mapper.UserMapper;
import com.yourGuru.infrastructure.persistence.interfaces.UserCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.stream.Collectors;

import java.util.List;
import java.util.Optional;
import java.util.stream.StreamSupport;

@Repository
public class UserRepositoryImpl implements UserRepository {
  @Autowired
  private UserCrudRepository userCrudRepository;
  @Autowired
  private UserMapper mapper;

  @Override
  public Optional<User> getOne(int id) {
    return userCrudRepository.findById(id).map(user -> mapper.toUser(user));
  }

  @Override
  public List<User> getAll() {
    Iterable<UserEntity> iteratorRepo = userCrudRepository.findAll();
    return StreamSupport.stream(iteratorRepo.spliterator(),false).map(user -> mapper.toUser(user)).toList();
  }

  @Override
  public List<User> getGamers() {
    return null;
  }

  @Override
  public List<User> getReaders() {
    return null;
  }

  @Override
  public List<User> getAudioVisuals() {
    return null;
  }

  @Override
  public User createOne(User user) {
    return null;
  }

  @Override
  public boolean deleteOne(int id) {
    return false;
  }

  @Override
  public User updateOne(User user) {
    return null;
  }
}
