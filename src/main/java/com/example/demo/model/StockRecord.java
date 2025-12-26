package com.example.demo.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class StockRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer currentQuantity;
    private Integer reorderThreshold;
    private LocalDateTime lastUpdated;

    @ManyToOne
    private Product product;

    @ManyToOne
    private Warehouse warehouse;

    // getters/setters
    public Long getId(){ return id; }
    public void setId(Long id){ this.id = id; }

    public Integer getCurrentQuantity(){ return currentQuantity; }
    public void setCurrentQuantity(Integer q){ this.currentQuantity = q; }

    public Integer getReorderThreshold(){ return reorderThreshold; }
    public void setReorderThreshold(Integer t){ this.reorderThreshold = t; }

    public LocalDateTime getLastUpdated(){ return lastUpdated; }
    public void setLastUpdated(LocalDateTime t){ this.lastUpdated = t; }

    public Product getProduct(){ return product; }
    public void setProduct(Product p){ this.product = p; }

    public Warehouse getWarehouse(){ return warehouse; }
    public void setWarehouse(Warehouse w){ this.warehouse = w; }

    // builder
    public static Builder builder(){ return new Builder(); }
    public static class Builder {
        private final StockRecord s = new StockRecord();
        public Builder id(Long v){ s.setId(v); return this; }
        public Builder currentQuantity(Integer v){ s.setCurrentQuantity(v); return this; }
        public Builder reorderThreshold(Integer v){ s.setReorderThreshold(v); return this; }
        public Builder lastUpdated(LocalDateTime v){ s.setLastUpdated(v); return this; }
        public StockRecord build(){ return s; }
    }
}
