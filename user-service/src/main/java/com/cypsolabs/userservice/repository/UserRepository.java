package com.cypsolabs.userservice.repository;

import com.cypsolabs.userservice.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface UserRepository extends MongoRepository<User, String> {
    Optional<User> findById(String id);
}
