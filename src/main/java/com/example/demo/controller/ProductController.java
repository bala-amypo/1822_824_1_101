package com.example.demo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.product;
import com.example.demo.service.ProductService;

@RestController
public class ProductController{
    @Autowired
    ProductService prod;

    @PostMapping("/addProducts")
    public product addProducts(@RequestBody product product){
        return prod.addProducts(product);
    }

    @GetMapping("/getProducts")
    public List<product> getProducts(){
        return prod.getProducts();
    }

    @GetMapping("/getProduct/{id}")
    public product getProductById(@PathVariable Long id){
        return prod.getProductById(id);
    }

    @DeleteMapping("/deleteProduct/{id}")
    public String deleteProductById(@PathVariable Long id){
        product product=prod.getProductById(id);
        if(product!=null){
            prod.deleteProductById(id);
            return "Product deleted successfully";
        }
        else{
            return "Product not found.";
        }
    }


}