package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.PredictionRule;

public interface PredictionService {

    PredictionRule addPredictionRule(PredictionRule rule);

    List<PredictionRule> getAllPredictionRules();

    PredictionRule getPredictionRuleById(Long id);

    void deletePredictionRuleById(Long id);
}
