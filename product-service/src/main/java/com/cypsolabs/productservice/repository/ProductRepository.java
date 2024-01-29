package com.cypsolabs.productservice.repository;

import com.cypsolabs.productservice.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProductRepository extends JpaRepository<Product,String> {

    Optional<Product> findById(String id);
}
