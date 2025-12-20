package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.PredictionRule;
import com.example.demo.repository.PredictionRuleRepository;

@Service
public class PredictionImplementation implements PredictionService {

    @Autowired
    private PredictionRuleRepository predictionRuleRepository;

    @Override
    public PredictionRule addPredictionRule(PredictionRule rule) {
        return predictionRuleRepository.save(rule);
    }

    @Override
    public List<PredictionRule> getAllPredictionRules() {
        return predictionRuleRepository.findAll();
    }

    @Override
    public PredictionRule getPredictionRuleById(Long id) {
        return predictionRuleRepository.findById(id).orElse(null);
    }

    @Override
    public void deletePredictionRuleById(Long id) {
        predictionRuleRepository.deleteById(id);
    }
}
