package com.example.demo.service;
import com.example.demo.entity.Product;
import java.util.List;

public interface ProductService{
    Product createProduct(Product prod);
    Product getProductid(Long id);
    List<Product> getAllProduct();
}