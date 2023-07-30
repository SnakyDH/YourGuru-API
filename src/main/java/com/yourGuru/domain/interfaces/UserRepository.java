package com.yourGuru.domain.interfaces;

import com.yourGuru.domain.model.User;
import java.util.List;
import java.util.Optional;

public interface UserRepository {
    Optional<User> getOne(int id);
    List<User> getAll();
    List<User> getAllByRol(int rolID);
    User createOne(User user);
    boolean deleteOne(int id);
    User updateOne(User user);
}
