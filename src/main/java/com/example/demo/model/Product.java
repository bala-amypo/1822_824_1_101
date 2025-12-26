package com.example.demo.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String productName;
    private String sku;
    private String category;
    private LocalDateTime createdAt;

    // -------- getters & setters --------
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

    // -------- MANUAL BUILDER --------
    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final Product p = new Product();

        public Builder id(Long id) { p.setId(id); return this; }
        public Builder productName(String v) { p.setProductName(v); return this; }
        public Builder sku(String v) { p.setSku(v); return this; }
        public Builder category(String v) { p.setCategory(v); return this; }
        public Builder createdAt(LocalDateTime v) { p.setCreatedAt(v); return this; }

        public Product build() { return p; }
    }
}
