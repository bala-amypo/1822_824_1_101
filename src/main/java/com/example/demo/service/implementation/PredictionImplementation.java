package com.example.demo.service.implementation;
import java.util.List;
import com.example.demo.service.PredictionService;
import org.springframework.stereotype.Service;
import com.example.demo.entity.PredictionRule;
import com.example.demo.repository.PredictionRuleRepository;
import org.springframework.beans.factory.annotation.Autowired;
@Service
public  abstract class PredictionImplementation implements PredictionService{
  @Autowired
  private PredictionRuleRepository obj;

  public PredictionRule createPredictionRule(PredictionRule pred){
    return obj.save(pred);
  }
  public PredictionRule getPredictionRuleid(Long id){
    return obj.findById(id).orElse(null);
  }
  public List<Predictionrule>getAllPredictionRules(){
    return obj.findAll();
  }
}