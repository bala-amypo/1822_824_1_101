package com.example.demo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.predictionrule;
import com.example.demo.service.PredictionService;

@RestController
public class PredictionController{
    @Autowired
    PredictionService pred;

    @PostMapping("/addprediction")
    public predictionrule addpredictionrule(@RequestBody predictionrule prediction){
        return pred.addpredictionrule();
    }

    @GetMapping("/getwarehouse")
    public List<warehouse> getwarehouses(){
        return ware.getwarehouses();
    }

    @GetMapping("/getwarehouse/{id}")
    public warehouse getwarehouseById(@PathVariable Long id){
        return ware.getwarehouseById(id);
    }

    @DeleteMapping("/deletewarehouse/{id}")
    public String deletewarehouseById(@PathVariable Long id){
        warehouse warehouse=warer.getwarehouseById(id);
        if(warehouse!=null){
            prod.deletewarehouseById(id);
            return "warehouse deleted successfully";
        }
        else{
            return "warehouse not found.";
        }
    }


}