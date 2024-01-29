package com.cypsolabs.productservice.entity;

import jakarta.persistence.*;
import lombok.*;


import java.lang.annotation.Documented;
import java.math.BigDecimal;
import java.util.UUID;



@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private  String name;
    private String description;
    private int qty;
    private BigDecimal price;
}
