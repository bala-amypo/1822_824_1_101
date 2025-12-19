package com.example.demo.service.implementation;
import java.util.List;
import com.example.demo.service.ConsumptionLogService;
import org.springframework.stereotype.Service;
import com.example.demo.entity.ConsumptionLog;
import com.example.demo.repository.ConsumptionLogRepository;
import org.springframework.beans.factory.annotation.Autowired;
@Service
public abstract class ConsumptionLogImplementation implements ConsumptionLogService {
    @Autowired
    private ConsumptionLogRepository obj;

  public ConsumptionLog createConsumptionLog(ConsumptionLog clog){
    return obj.save(clog);
  }
  public ConsumptionLog getConsumptionLogid(Long id){
    return obj.findById(id).orElse(null);
  }
  public List<ConsumptionLog>getAllConsumptionLogs(){
    return obj.findAll();
  }
}
 