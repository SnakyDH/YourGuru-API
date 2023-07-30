package com.yourGuru.application;

import com.yourGuru.domain.interfaces.UserRepository;
import com.yourGuru.domain.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public void create(User user){
        System.out.println("CREATE");
        System.out.println(user.toString());
        userRepository.createOne(user);
    }
    public Optional<User> getOne(int id){
        System.out.println(userRepository.getOne(id));
        return userRepository.getOne(id);
    }
    public List<User> getAll(){
        return userRepository.getAll();
    }
    public void getGamers(){
        // todo:
    }
    public void getReaders(){
        // todo:
    }
    public void getAudioVisuals(){
        // todo:
    }
    public User update(User user){
        return userRepository.updateOne(user);
    }
    public boolean delete(int id){
        return getOne(id).map(user -> {
            userRepository.deleteOne(id);
            return true;
        }).orElse(false);
    }
}
