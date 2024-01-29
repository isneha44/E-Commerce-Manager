package com.cypsolabs.userservice.service;

import com.cypsolabs.userservice.entity.User;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface UserService {
    User saveUser(User user);
    List<User> getAllUsers();

    Optional<User> findById(String id);
}
