package com.example.demo.service.impl;

import com.example.demo.model.Product;
import com.example.demo.service.ProductService;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Override
    public Product createProduct(Product product) {
        product.setCreatedAt(LocalDateTime.now());
        return product;
    }

    @Override
    public Product getProduct(Long id) {
        Product product = new Product();
        product.setId(id);
        product.setProductName("Dummy Product");
        product.setSku("DUMMY-SKU");
        product.setCreatedAt(LocalDateTime.now());
        return product;
    }

    @Override
    public List<Product> getAllProducts() {
        return new ArrayList<>();
    }
}
