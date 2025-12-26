package com.example.demo.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Warehouse {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String warehouseName;
    private String location;
    private LocalDateTime createdAt;

    // getters/setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getWarehouseName() { return warehouseName; }
    public void setWarehouseName(String warehouseName) { this.warehouseName = warehouseName; }

    public String getLocation() { return location; }
    public void setLocation(String location) { this.location = location; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    // builder
    public static Builder builder() { return new Builder(); }
    public static class Builder {
        private final Warehouse w = new Warehouse();
        public Builder id(Long v){ w.setId(v); return this; }
        public Builder warehouseName(String v){ w.setWarehouseName(v); return this; }
        public Builder location(String v){ w.setLocation(v); return this; }
        public Builder createdAt(LocalDateTime v){ w.setCreatedAt(v); return this; }
        public Warehouse build(){ return w; }
    }
}
