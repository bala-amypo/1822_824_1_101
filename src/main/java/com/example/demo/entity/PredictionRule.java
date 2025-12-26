package com.example.demo.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import java.time.LocalDateTime;
import jakarta.persistence.Column;
@Entity
public class PredictionRule{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id;
    @Column(unique=true)
    private String ruleName;
    private int averageDaysWindow;
    private int maxDailyUsage;
    private LocalDateTime createdAt;

    public long getId(){
        return id;
    }
    public void setId(long id){
        this.id=id;
    }
    public String getRuleName(){
        return ruleName;
    }
    public void setRuleName(String ruleName){
        this.ruleName=ruleName;
    }
    public int  getAverageDaysWindows(){
        return averageDaysWindow;
    }
    public void setAverageDaysWindow(int averageDaysWindow){
        this.averageDaysWindow=averageDaysWindow;
    }
    public int getMaxDailyUsage(){
        return maxDailyUsage;
    }
    public void setMaxDailyUsage(int maxDailyUsage){
        this.maxDailyUsage=maxDailyUsage;
    }
    public LocalDateTime getCreatedAt(){
        return createdAt;
    }
    public void setCreatedAt(LocalDateTime createdAt){
        this.createdAt=createdAt;
    }
     public PredictionRule(long id,String ruleName,int averageDaysWindow,int maxDailyUsage, LocalDateTime createdAt){
        this.id=id;
        this.ruleName=ruleName;
        this.averageDaysWindow=averageDaysWindow;
        this.maxDailyUsage=maxDailyUsage;
        this.createdAt=createdAt;
    }
    public PredictionRule(){

    }
}
