package com.example.demo.service.implementation;
import java.util.List;
import com.example.demo.service.ConsumptionLogService;
import org.springframework.stereotype.Service;
import com.example.demo.entity.consumptionlog;
import com.example.demo.repository.ConsumptionLogRepository;
import org.springframework.beans.factory.annotation.Autowired;
@Service
public class ConsumptionLogImplementation implements ConsumptionLogService {
    @Autowired
    private ConsumptionLogRepository obj;

  public consumptionlog createconsumptionlog(consumptionlog clog){
    return obj.save(clog);
  }
  public consumptionlog getconsumptionlogid(Long id){
    return obj.findById(id).orElse(null);
  }
  public List<consumptionlog>getAllconsumptionlogs(){
    return obj.findAll();
  }
}
 