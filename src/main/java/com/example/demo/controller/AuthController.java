package com.example.demo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.user;
import com.example.demo.service.UserService;

@RestController
public class AuthController{
    @Autowired
    UserService clog;

    @PostMapping("/addconsumptionlog")
    public consumptionlog addconsumptionlog(@RequestBody consumptionlog conslog){
        return clog.addconsumptionlog(conslog);
    }

    @GetMapping("/getconsuptionlog")
    public List<consumptionlog> getconsumptionlogs(){
        return clog.getconsumptionlogs();
    }

    @GetMapping("/getconsumptionlog/{id}")
    public consumptionlog getconsumptionlogById(@PathVariable Long id){
        return clog.getconsumptionlogById(id);
    }

    @DeleteMapping("/deleteconsumptionlog/{id}")
    public String deleteconsumptionlogById(@PathVariable Long id){
        consumptionlog consumptionlog=clog.getconsumptionlogById(id);
        if(consumptionlog!=null){
           clog.deleteconsumptionlogById(id);
            return "consumptionlog deleted successfully";
        }
        else{
            return "consumptionlog not found.";
        }
    }


}