package com.cypsolabs.userservice.controller;

import com.cypsolabs.userservice.entity.User;
import com.cypsolabs.userservice.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/api/user")
@RequiredArgsConstructor
public class UserController {

    @Autowired
    private final UserService userService;

    @GetMapping
    @ResponseStatus(HttpStatus.CREATED)
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public User saveUser(User user) {
        return userService.saveUser(user);
    }

    @PostMapping("/{id}")

    public ResponseEntity<Optional<User>> findById(@PathVariable String id) {
        UUID uuid = UUID.fromString(id);
        Optional<User> user = userService.findById(id);

        if (user.isPresent()) {
            return ResponseEntity.ok(user);

        } else {
            return ResponseEntity.notFound().build();
        }

    }
}



