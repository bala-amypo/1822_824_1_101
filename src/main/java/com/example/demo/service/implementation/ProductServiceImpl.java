package com.example.demo.service.impl;

import com.example.demo.model.Product;
import com.example.demo.service.ProductService;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Service("productServiceImpl")
public abstract class ProductServiceImpl implements ProductService {

    @Override
    public Product createProduct(Product product) {
        product.setCreatedAt(LocalDateTime.now());
        return product;
    }

    @Override
    public Product getProduct(Long id) {
        Product product = new Product();   // normal object creation
        product.setId(id);
        product.setProductName("Dummy");
        product.setSku("DUMMY-SKU");
        return product;
    }

    @Override
    public List<Product> getAllProducts() {
        return new ArrayList<>();
    }
}
