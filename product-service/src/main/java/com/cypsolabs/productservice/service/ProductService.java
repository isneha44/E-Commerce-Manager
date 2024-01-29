package com.cypsolabs.productservice.service;

import com.cypsolabs.productservice.entity.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {
    Product saveProduct(Product product);
    List<Product> getAllProducts();

    Optional<Product> findById(String id);
}
