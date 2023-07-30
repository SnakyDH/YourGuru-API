package com.yourGuru.infrastructure.rest.controllers;

import com.yourGuru.application.UserService;
import com.yourGuru.domain.model.Rol;
import com.yourGuru.domain.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping()
    public ResponseEntity<List<User>> getUsers(){
        List<User> users = userService.getAll();
        return ResponseEntity.ok().body(users);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Optional<User>> getUserById(@PathVariable("id")int id){
        Optional<User> user = userService.getOne(id);
        return  ResponseEntity.ok().body(user);
    }

    @GetMapping("/gamers")
    public ResponseEntity<List<User>> getUsersGamers(){
        List<User> gamers = userService.getGamers();
        return ResponseEntity.ok().body(gamers);
    }
    /*@GetMapping("/readers")
    public ResponseEntity<List<User>> getUsersReaders(){
        userService.getReaders();
    }
    @GetMapping("/audiovisuals")
    public ResponseEntity<List<User>> getUsersAudioVisuals(){
        userService.getAudioVisuals();
    }
    @PostMapping("")
    public ResponseEntity<User> createUser(@RequestBody User user){
        userService.create(user);
    }
    @PatchMapping("/{id}")
    public ResponseEntity<User> updateUser(@RequestBody User user){
        userService.update(user);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<User> deleteUser(@PathVariable("id") int id){
        userService.delete(id);
    }*/
}
