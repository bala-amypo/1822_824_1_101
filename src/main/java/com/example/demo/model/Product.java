package com.example.demo.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import java.time.LocalDateTime;

@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Product name is mandatory")
    private String productName;

    @NotBlank(message = "SKU is mandatory")
    private String sku;

    private String category;

    private LocalDateTime createdAt;

    // Getters & setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getProductName() { return productName; }
    public void setProductName(String productName) { this.productName = productName; }

    public String getSku() { return sku; }
    public void setSku(String sku) { this.sku = sku; }

    public String getCategory() { return category; }
    public void setCategory(String category) { this.category = category; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    // Builder pattern (optional)
    public static ProductBuilder builder() { return new ProductBuilder(); }

    public static class ProductBuilder {
        private Product p = new Product();

        public ProductBuilder id(Long id) { p.setId(id); return this; }
        public ProductBuilder productName(String name) { p.setProductName(name); return this; }
        public ProductBuilder sku(String sku) { p.setSku(sku); return this; }
        public ProductBuilder category(String cat) { p.setCategory(cat); return this; }
        public ProductBuilder createdAt(LocalDateTime dt) { p.setCreatedAt(dt); return this; }
        public Product build() { return p; }
    }
}
