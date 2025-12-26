package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import java.time.LocalDateTime;
import jakarta.validation.constraints.NotNull;
import jakarta.persistence.Column;
@Entity
public class Product{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id;
    @NotNull
    private String productName;
    @Column(unique=true)
    private String sku;
    private String category;
    private LocalDateTime createdAt;

    public long getId(){
        return id;
    }
    public void setId(long id){
        this.id=id;
    }
    public String getProductName(){
        return productName;
    }
    public void setProductName(String productName){
        this.productName=productName;
    }
    public String getSku(){
        return sku;
    }
    public void setSku(String sku){
        this.sku=sku;
    }
    public String getCategory(){
        return category;
    }
    public void setCategory(String category){
        this.category=category;
    }
    public LocalDateTime getCreatedAt(){
        return createdAt;
    }
    public void setCreatedAt(LocalDateTime createdAt){
        this.createdAt=createdAt;
    }
     public Product(long id,String productName,String sku, String category,LocalDateTime createdAt){
        this.id=id;
        this.productName=productName;
        this.sku=sku;
        this.category=category;
        this.createdAt=createdAt;
    }
    public Product(){

    }
}
