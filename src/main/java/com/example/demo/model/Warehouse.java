package com.example.demo.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import java.time.LocalDateTime;
import jakarta.persistence.Column;
import jakarta.validation.constraints.NotNull;
@Entity
public class Warehouse{
   @Id
   @GeneratedValue(strategy=GenerationType.IDENTITY)
   private long id;
   @Column(unique=true)
   private String warehouseName;
   @NotNull
   private String location; 
   private LocalDateTime createdAt;

   public long getId(){
        return id;
    }
    public void setId(long id){
        this.id=id;
    }
    public String getWarehouseName(){
        return warehouseName;
    }
    public void setWarehouseName(String warehouseName){
        this.warehouseName=warehouseName;
    }
    public String getLocation(){
        return location;
    }
    public void setLocation(String location){
        this.location=location;
    }
    public LocalDateTime getCreatedAt(){
        return createdAt;
    }
    public void setCreatedAt(LocalDateTime createdAt){
        this.createdAt=createdAt;
    }

    public Warehouse(long id,String warehouseName,String location,LocalDateTime createdAt){
        this.id=id;
        this.warehouseName=warehouseName;
        this.location=location;
        this.createdAt=createdAt;
    }
    public Warehouse(){

    }
}





User:
package com.example.demo.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import java.time.LocalDateTime;
import jakarta.persistence.Column;
@Entity
public class User{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id;
    private String name;
    @Column(unique=true)
    private String email;
    private String password;
    private LocalDateTime createdAt;

    public long getId(){
        return id;
    }
    public void setId(long id){
        this.id=id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public String getPassword(){
        return password;
    }
    public void setPassword(String password){
        this.password=password;
    }
    public LocalDateTime getCreatedAt(){
        return createdAt;
    }
    public void setCreatedAt(LocalDateTime createdAt){
        this.createdAt=createdAt;
    }

     public User(long id,String name,String email,String password,LocalDateTime createdAt){
        this.id=id;
        this.name=name;
        this.email=email;
        this.password=password;
        this.createdAt=createdAt;
    }
    public User(){

    }
}


PredictionRule:
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
