package com.example.demo.service;
import com.example.demo.entity.product;
import java.util.List;

public interface ProductService{
    product createproduct(product prod);
    product getproductid(Long id);
    List<product> getAllproduct();
}