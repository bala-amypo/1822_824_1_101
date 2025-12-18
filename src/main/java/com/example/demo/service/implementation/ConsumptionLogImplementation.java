package com.example.demo.service.implementation;
import java.util.List;
import com.example.demo.service.ConsumptionLogService;
import org.springframework.stereotype.Service;
import com.example.demo.entity.consumptionlog;
import com.example.demo.repository.ConsumptionLogRepository;
import org.springframework.beans.factory.annotation.Autowired;
@Service
public class ConsumptionLogImplementation implements ConsumptionLogService{
  @Autowired
  ConsumptionLogRepository obj;

  public C creatuser(user user){
    return obj.save(user);
  }
  public user getuserid(Long id){
    return obj.findById(id).orElse(null);
  }
  public List<user>getAllusers(){
    return obj.findAll();
  }
}