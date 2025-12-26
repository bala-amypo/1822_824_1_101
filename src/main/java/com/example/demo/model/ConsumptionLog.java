package com.example.demo.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class ConsumptionLog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer consumedQuantity;
    private LocalDate consumedDate;

    @ManyToOne
    private StockRecord stockRecord;

    // getters/setters
    public Long getId(){ return id; }
    public void setId(Long id){ this.id = id; }

    public Integer getConsumedQuantity(){ return consumedQuantity; }
    public void setConsumedQuantity(Integer q){ this.consumedQuantity = q; }

    public LocalDate getConsumedDate(){ return consumedDate; }
    public void setConsumedDate(LocalDate d){ this.consumedDate = d; }

    public StockRecord getStockRecord(){ return stockRecord; }
    public void setStockRecord(StockRecord s){ this.stockRecord = s; }

    // builder
    public static Builder builder(){ return new Builder(); }
    public static class Builder {
        private final ConsumptionLog c = new ConsumptionLog();
        public Builder id(Long v){ c.setId(v); return this; }
        public Builder consumedQuantity(Integer v){ c.setConsumedQuantity(v); return this; }
        public Builder consumedDate(LocalDate v){ c.setConsumedDate(v); return this; }
        public ConsumptionLog build(){ return c; }
    }
}
