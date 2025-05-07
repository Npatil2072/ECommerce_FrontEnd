package com.commerce.controller;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.stereotype.Component;

import com.commerce.model.Category;
import com.commerce.model.Product;
import com.commerce.repo.ProductRepository;

import jakarta.annotation.PostConstruct;

@Component
public class ProductDataLoader {

    private final ProductRepository productRepository;

    public ProductDataLoader(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @PostConstruct
    public void loadData() {
        List<Product> products = List.of(
            new Product(0, "iPhone 13", "Latest Apple phone", new BigDecimal("799.99"), "Apple", Category.ELECTRONICS, "https://images.pexels.com/photos/5082582/pexels-photo-5082582.jpeg?auto=compress&cs=tinysrgb&w=600&h=600&fit=crop"),
            new Product(0, "MacBook Pro", "Apple laptop", new BigDecimal("1299.99"), "Apple", Category.ELECTRONICS, "https://images.pexels.com/photos/812264/pexels-photo-812264.jpeg?auto=compress&cs=tinysrgb&w=600&h=600&fit=crop"),
            new Product(0, "Samsung Galaxy S22", "Flagship Samsung smartphone", new BigDecimal("749.99"), "Samsung", Category.ELECTRONICS, "https://images.pexels.com/photos/4387779/pexels-photo-4387779.jpeg?auto=compress&cs=tinysrgb&w=600&h=600&fit=crop"),
            new Product(0, "Dell XPS 13", "Compact and powerful laptop", new BigDecimal("999.99"), "Dell", Category.ELECTRONICS, "https://images.pexels.com/photos/18105/pexels-photo.jpg?auto=compress&cs=tinysrgb&w=600&h=600&fit=crop"),
            new Product(0, "Sony WH-1000XM5", "Noise cancelling headphones", new BigDecimal("349.99"), "Sony", Category.ELECTRONICS, "https://images.pexels.com/photos/3945667/pexels-photo-3945667.jpeg?auto=compress&cs=tinysrgb&w=600&h=600&fit=crop"),
            new Product(0, "Apple Watch Series 8", "Smartwatch with fitness tracking", new BigDecimal("399.99"), "Apple", Category.ELECTRONICS, "https://images.pexels.com/photos/437037/pexels-photo-437037.jpeg?auto=compress&cs=tinysrgb&w=600&h=600&fit=crop"),
            new Product(0, "Nike Air Max 270", "Comfortable and stylish sneakers", new BigDecimal("149.99"), "Nike", Category.FASHION, "https://images.pexels.com/photos/6382746/pexels-photo-6382746.jpeg?auto=compress&cs=tinysrgb&w=600&h=600&fit=crop"),
            new Product(0, "Adidas Ultraboost", "High performance running shoes", new BigDecimal("179.99"), "Adidas", Category.FASHION, "https://images.pexels.com/photos/6382749/pexels-photo-6382749.jpeg?auto=compress&cs=tinysrgb&w=600&h=600&fit=crop"),
            new Product(0, "Canon EOS R10", "Mirrorless digital camera", new BigDecimal("979.99"), "Canon", Category.ELECTRONICS, "https://images.pexels.com/photos/90946/pexels-photo-90946.jpeg?auto=compress&cs=tinysrgb&w=600&h=600&fit=crop"),
            new Product(0, "LG 55 OLED TV", "High-definition smart television", new BigDecimal("1199.99"), "LG", Category.ELECTRONICS, "https://images.pexels.com/photos/5721908/pexels-photo-5721908.jpeg?auto=compress&cs=tinysrgb&w=600&h=600&fit=crop"),
            new Product(0, "KitchenAid Mixer", "Stand mixer for baking and cooking", new BigDecimal("499.99"), "KitchenAid", Category.HOME_APPLIANCES, "https://images.pexels.com/photos/6214477/pexels-photo-6214477.jpeg?auto=compress&cs=tinysrgb&w=600&h=600&fit=crop"),
            new Product(0, "Dyson V15 Vacuum", "Powerful cordless vacuum cleaner", new BigDecimal("699.99"), "Dyson", Category.HOME_APPLIANCES, "https://images.pexels.com/photos/7444649/pexels-photo-7444649.jpeg?auto=compress&cs=tinysrgb&w=600&h=600&fit=crop"),
            new Product(0, "Fitbit Charge 5", "Fitness tracker with heart rate monitor", new BigDecimal("129.99"), "Fitbit", Category.ELECTRONICS, "https://images.pexels.com/photos/376464/pexels-photo-376464.jpeg?auto=compress&cs=tinysrgb&w=600&h=600&fit=crop"),
            new Product(0, "Sony PlayStation 5", "Next-gen gaming console", new BigDecimal("499.99"), "Sony", Category.GAMING, "https://images.pexels.com/photos/7747313/pexels-photo-7747313.jpeg?auto=compress&cs=tinysrgb&w=600&h=600&fit=crop"),
            new Product(0, "Xbox Series X", "High performance gaming console", new BigDecimal("499.99"), "Microsoft", Category.GAMING, "https://images.pexels.com/photos/6878084/pexels-photo-6878084.jpeg?auto=compress&cs=tinysrgb&w=600&h=600&fit=crop"),
            new Product(0, "Logitech MX Master 3", "Advanced wireless mouse", new BigDecimal("99.99"), "Logitech", Category.ELECTRONICS, "https://images.pexels.com/photos/2115257/pexels-photo-2115257.jpeg?auto=compress&cs=tinysrgb&w=600&h=600&fit=crop"),
            new Product(0, "HP Envy Printer", "All-in-one wireless printer", new BigDecimal("179.99"), "HP", Category.ELECTRONICS, "https://images.pexels.com/photos/2582937/pexels-photo-2582937.jpeg?auto=compress&cs=tinysrgb&w=600&h=600&fit=crop"),
            new Product(0, "Samsung Galaxy Tab S8", "High-end Android tablet", new BigDecimal("699.99"), "Samsung", Category.ELECTRONICS, "https://images.pexels.com/photos/1334597/pexels-photo-1334597.jpeg?auto=compress&cs=tinysrgb&w=600&h=600&fit=crop"),
            new Product(0, "Google Nest Thermostat", "Smart thermostat for home", new BigDecimal("129.99"), "Google", Category.HOME_APPLIANCES, "https://images.pexels.com/photos/356056/pexels-photo-356056.jpeg?auto=compress&cs=tinysrgb&w=600&h=600&fit=crop"),
            new Product(0, "Beats Studio Buds", "Wireless noise-cancelling earbuds", new BigDecimal("149.99"), "Beats", Category.ELECTRONICS, "https://images.pexels.com/photos/7156886/pexels-photo-7156886.jpeg?auto=compress&cs=tinysrgb&w=600&h=600&fit=crop"),
            new Product(0, "ASUS ROG Gaming Laptop", "High-performance laptop for gaming", new BigDecimal("1599.99"), "ASUS", Category.GAMING, "https://images.pexels.com/photos/7990918/pexels-photo-7990918.jpeg?auto=compress&cs=tinysrgb&w=600&h=600&fit=crop")
        );

        productRepository.saveAll(products);
    }
}
