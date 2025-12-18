package com.example.demo.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import java.time.LocalDateTime;
@Entity
public class predictionrule{
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
    public String getruleName(){
        return ruleName;
    }
    public void setruleName(String ruleName){
        this.ruleName=ruleName;
    }
    public int  getaverageDaysWindows(){
        return averageDaysWindow;
    }
    public void setaverageDaysWindow(int averageDaysWindow){
        this.averageDaysWindow=averageDaysWindow;
    }
    public int getmaxDailyUsage(){
        return maxDailyUsage;
    }
    public void setmaxDailyUsage(int maxDailyUsage){
        this.maxDailyUsage=maxDailyUsage;
    }
    public LocalDateTime getcreatedAt(){
        return createdAt;
    }
    public void setcreatedAt(LocalDateTime createdAt){
        this.createdAt=createdAt;
    }
     public predictionrule(long id,String ruleName,String averageDaysWindow,int maxDailyUsage, LocalDateTime createdAt){
        this.id=id;
        this.ruleName=ruleName;
        this.averageDaysWindow=averageDaysWindow;
        this.maxDailyUsage=maxDailyUsage;
        this.createdAt=createdAt;
    }
    public predictionrule(){

    }
}