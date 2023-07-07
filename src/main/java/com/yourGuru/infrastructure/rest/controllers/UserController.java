package com.yourGuru.infrastructure.rest.controllers;

import com.yourGuru.application.UserService;
import com.yourGuru.domain.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/ruta/{id}")
    public ResponseEntity<List<User>> getUserById(@PathVariable("id") int id){
        return ResponseEntity.of(userService.getById(), HttpStatus.OK);
    }
    @PostMapping("/ruta/")
    public Optional<List<User>> getUserById(@RequestBody User user){
        return userService.getById();
    }
}
