package com.example.demo.service;
import 
public interface ConsumptionLogService{
    consumptionlog createconsumptionlog(consumptionlog conslog);
    consumptionlog getconsumptionlogid(Long id);
    List<consumptionlog> getAllconsumptionlog();
}