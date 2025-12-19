package com.example.demo.service;
import com.example.demo.entity.PredictionRule;
import java.util.List;

public interface PredictionService{
    PredictionRule createPredictionRule(PredictionRule prerule);
    PredictionRule getPredictionRuleid(Long id);
    List<PredictionRule> getAllPredictionRule();
}