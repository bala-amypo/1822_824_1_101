package com.example.demo.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class PredictionRule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String ruleName;
    private int averageDaysWindow;
    private int minDailyUsage;
    private int maxDailyUsage;
    private LocalDateTime createdAt;

    // getters/setters
    public Long getId(){ return id; }
    public void setId(Long id){ this.id = id; }

    public String getRuleName(){ return ruleName; }
    public void setRuleName(String v){ this.ruleName = v; }

    public int getAverageDaysWindow(){ return averageDaysWindow; }
    public void setAverageDaysWindow(int v){ this.averageDaysWindow = v; }

    public int getMinDailyUsage(){ return minDailyUsage; }
    public void setMinDailyUsage(int v){ this.minDailyUsage = v; }

    public int getMaxDailyUsage(){ return maxDailyUsage; }
    public void setMaxDailyUsage(int v){ this.maxDailyUsage = v; }

    public LocalDateTime getCreatedAt(){ return createdAt; }
    public void setCreatedAt(LocalDateTime v){ this.createdAt = v; }

    // builder
    public static Builder builder(){ return new Builder(); }
    public static class Builder {
        private final PredictionRule r = new PredictionRule();
        public Builder id(Long v){ r.setId(v); return this; }
        public Builder ruleName(String v){ r.setRuleName(v); return this; }
        public Builder averageDaysWindow(int v){ r.setAverageDaysWindow(v); return this; }
        public Builder minDailyUsage(int v){ r.setMinDailyUsage(v); return this; }
        public Builder maxDailyUsage(int v){ r.setMaxDailyUsage(v); return this; }
        public Builder createdAt(LocalDateTime v){ r.setCreatedAt(v); return this; }
        public PredictionRule build(){ return r; }
    }
}
