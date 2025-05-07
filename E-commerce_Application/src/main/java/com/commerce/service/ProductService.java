package com.commerce.service;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.commerce.model.Product;
import com.commerce.repo.ProductRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepository repo;

    public List<Product> getAll(String search) {
        if (search != null && !search.isEmpty()) {
            return repo.search(search);
        }
        return repo.findAll();
    }

    public Product getById(int id) {
        return repo.findById(id).orElseThrow(() -> new RuntimeException("Product not found"));
    }
}
