package com.example.demo.model;
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







