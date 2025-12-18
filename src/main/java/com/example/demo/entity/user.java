package com.example.demo.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import java.time.LocalDateTime;
import jakarta.persistence.Column;
@Entity
public class user{
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
    public String getname(){
        return name;
    }
    public void setname(String name){
        this.name=name;
    }
    public String getemail(){
        return email;
    }
    public void setemail(String email){
        this.email=email;
    }
    public String getpassword(){
        return password;
    }
    public void setcategory(String password){
        this.password=password;
    }
    public LocalDateTime getcreatedAt(){
        return createdAt;
    }
    public void setcreatedAt(LocalDateTime createdAt){
        this.createdAt=createdAt;
    }

     public user(long id,String name,String email,String password,LocalDateTime createdAt){
        this.id=id;
        this.name=name;
        this.email=email;
        this.password=password;
        this.createdAt=createdAt;
    }
    public user(){

    }
}