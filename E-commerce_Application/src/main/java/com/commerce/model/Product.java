package com.commerce.model;

import java.math.BigDecimal;
//import com.commerce.model.Category;
import com.commerce.model.Category;

import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    @Id
    @GeneratedValue
    private int id;

    @Column(nullable = false)
    private String name;
    @Column(length = 1000)
    private String description;
    private BigDecimal price;
    private String brand;

    @Enumerated(EnumType.STRING)
    private Category category;
//    private String category;
    private String imageUrl;
}
