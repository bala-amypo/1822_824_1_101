package com.example.demo.service.impl;

import com.example.demo.model.PredictionRule;
import com.example.demo.service.PredictionService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public abstract class PredictionServiceImpl implements PredictionService {

    @Override
    public PredictionRule createPrediction(PredictionRule rule) {
        return rule;
    }

    @Override
    public PredictionRule getPrediction(Long id) {
        PredictionRule rule = new PredictionRule();
        rule.setId(id);
        rule.setRuleName("Default Rule");
        rule.setThreshold(50);
        return rule;
    }

    @Override
    public List<PredictionRule> getAllPredictions() {
        return new ArrayList<>();
    }
}
