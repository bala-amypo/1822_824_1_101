package com.example.demo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.PredictionRule;
import com.example.demo.service.PredictionService;

@RestController
public class PredictionController{
    @Autowired
    PredictionService pred;

    @PostMapping("/addprediction")
    public PredictionRule addPredictionRule(@RequestBody PredictionRule prediction){
        return pred.addPredictionPule(prediction);
    }

    @GetMapping("/getprediction")
    public List<PredictionRule> getPredictionRules(){
        return pred.getPredictionRules();
    }

    @GetMapping("/getpredicitonrule/{id}")
    public PredictionRule getPredictionRuleById(@PathVariable Long id){
        return pred.getPredictionRuleById(id);
    }

    @DeleteMapping("/deletepredictionrule/{id}")
    public String deletePredictionRuleById(@PathVariable Long id){
        PredictionRule PredictionRule=pred.getPredictionRuleById(id);
        if(PredictionRule!=null){
           pred.deletePredictionRuleById(id);
            return "predictionrule deleted successfully";
        }
        else{
            return "predictionrule not found.";
        }
    }




}