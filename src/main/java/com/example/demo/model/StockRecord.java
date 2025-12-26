
package com.example.demo.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import java.time.LocalDateTime;
@Entity
public class StockRecord{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id;
    private int currentQuantity;
    private int reorderThreshold;
    private LocalDateTime lastUpdated;

    public long getId(){
        return id;
    }
    public void setId(long id){
        this.id=id;
    }
    public int getCurrentQuantity(){
        return currentQuantity;
    }
    public void setCurrentQuantity(int currentQuantity){
        this.currentQuantity=currentQuantity;
    }
    public int getReorderThreshold(){
        return reorderThreshold;
    }
    public void setReorderThreshold(int reorderThreshold){
        this.reorderThreshold=reorderThreshold;
    }
    public LocalDateTime getLastUpdated(){
        return lastUpdated;
    }
    public void setLastUpdated(LocalDateTime lastUpdated){
        this.lastUpdated=lastUpdated;
    }
    public StockRecord(){
        
    }
    
}