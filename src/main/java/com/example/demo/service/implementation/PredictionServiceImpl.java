package com.example.demo.service.impl;

import com.example.demo.model.PredictionRule;
import com.example.demo.service.PredictionService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PredictionServiceImpl implements PredictionService {

    public PredictionRule createRule(PredictionRule rule){ return rule; }
    public List<PredictionRule> getAllRules(){ return new ArrayList<>(); }

    public LocalDate predictRestockDate(Long productId){
        return LocalDate.now().plusDays(5);
    }
}
