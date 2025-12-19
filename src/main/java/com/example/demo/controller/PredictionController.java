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
        return pred.addpredictionrule(prediction);
    }

    @GetMapping("/getprediction")
    public List<predictionrule> getpredictionrules(){
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
            return "warehouse not found.";
        }
    }


}