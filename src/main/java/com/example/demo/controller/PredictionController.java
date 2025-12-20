package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.PredictionRule;
import com.example.demo.service.PredictionService;

@RestController
@RequestMapping("/predictionrules")
public class PredictionController {

    @Autowired
    private PredictionService predictionService;

    // CREATE
    @PostMapping
    public PredictionRule addPredictionRule(@RequestBody PredictionRule rule) {
        return predictionService.addPredictionRule(rule);
    }

    // READ ALL
    @GetMapping
    public List<PredictionRule> getAllPredictionRules() {
        return predictionService.getAllPredictionRules();
    }

    // READ BY ID
    @GetMapping("/{id}")
    public PredictionRule getPredictionRuleById(@PathVariable Long id) {
        return predictionService.getPredictionRuleById(id);
    }

    // DELETE
    @DeleteMapping("/{id}")
    public String deletePredictionRule(@PathVariable Long id) {
        predictionService.deletePredictionRuleById(id);
        return "Prediction rule deleted successfully";
    }
}
