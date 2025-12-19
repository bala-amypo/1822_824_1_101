package com.example.demo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.consumptionlog;
import com.example.demo.service.ConsumptionLogService;

@RestController
public class ConsumptionLogController{
    @Autowired
    consumptionLogService clog;

    @PostMapping("/addconsumptionlog")
    public consumptionlog addconsumptionlog(@RequestBody consumptionlog conslog){
        return clog.addconsumptionlog(conslog);
    }

    @GetMapping("/getconsuptionlog")
    public List<consumptionlog> getpredictionrules(){
        return pred.getpredictionrules();
    }

    @GetMapping("/getpredicitonrule/{id}")
    public predictionrule getpredictionruleById(@PathVariable Long id){
        return pred.getpredictionruleById(id);
    }

    @DeleteMapping("/deletepredictionrule/{id}")
    public String deletepredictionruleById(@PathVariable Long id){
        predictionrule predictionrule=pred.getpredictionruleById(id);
        if(predictionrule!=null){
           pred.deletepredictionruleById(id);
            return "predictionrule deleted successfully";
        }
        else{
            return "predictionrule not found.";
        }
    }


}