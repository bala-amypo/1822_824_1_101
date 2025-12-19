package com.example.demo.service;
import com.example.demo.entity.ConsumptionLog;
import java.util.List;

public interface ConsumptionLogService{
    ConsumptionLog createConsumptionLog(ConsumptionLog conslog);
    ConsumptionLog getConsumptionLogid(Long id);
    List<ConsumptionLog> getAllConsumptionLog();
}