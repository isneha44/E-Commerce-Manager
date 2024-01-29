package com.cypsolabs.productservice.controller;

import com.cypsolabs.productservice.entity.Product;
import com.cypsolabs.productservice.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/api/product")
@RequiredArgsConstructor
public class ProductController {

@Autowired
private final ProductService productService;


    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Product saveProduct(Product product) {
        return productService.saveProduct(product);

    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }


    @PostMapping("/{id}")
    public ResponseEntity<Optional<Product>> findById(@PathVariable String id) {
        UUID uuid = UUID.fromString(id);
       Optional<Product> product = productService.findById(id);

        if (product.isPresent()) {
            return ResponseEntity.ok(product);

        } else {
            return ResponseEntity.notFound().build();
        }
    }


}
