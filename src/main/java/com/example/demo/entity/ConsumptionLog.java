package com.example.demo.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import java.time.LocalDateTime;
@Entity
public class ConsumptionLog{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private int consumedQuantity;
    private LocalDateTime consumedDate;

    public long getId(){
        return id;
    }
    public void setId(long id){
        this.id=id;
    }
    public int getconsumedQuantity(){
        return consumedQuantity;
    }
    public void setconsumedQuantity(int consumedQuantity){
        this.consumedQuantity=consumedQuantity;
    }
    public LocalDateTime getconsumedDate(){
        return consumedDate;
    }
    public void setconsumedDate(LocalDateTime consumedDate){
        this.consumedDate=consumedDate;
    }
     public ConsumptionLog(long id,int consumedQuantity,LocalDateTime consumedDate){
        this.id=id;
        this.consumedQuantity=consumedQuantity;
        this.consumedDate=consumedDate;
    }
    public ConsumptionLog(){

    }
   
}