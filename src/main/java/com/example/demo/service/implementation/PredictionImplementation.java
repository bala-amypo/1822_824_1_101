package com.example.demo.service.implementation;
import java.util.List;
import com.example.demo.service.PredictionService;
import org.springframework.stereotype.Service;
import com.example.demo.entity.predictionrule;
import com.example.demo.repository.PredictionRuleRepository;
import org.springframework.beans.factory.annotation.Autowired;
@Service
public class PredictionImplementation implements PredictionService{
  @Autowired
  private PredictionRuleRepository obj;

  public predictionrule createpredictionrule(predictionrule pred){
    return obj.save(pred);
  }
  public predictionrule getpredictionruleid(Long id){
    return obj.findById(id).orElse(null);
  }
  public List<predictionrule>getAllpredictionrules(){
    return obj.findAll();
  }
}