package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.ConsumptionLog;

public interface ConsumptionLogService {

    ConsumptionLog addConsumptionLog(ConsumptionLog log);

    List<ConsumptionLog> getAllConsumptionLogs();

    ConsumptionLog getConsumptionLogById(Long id);

    void deleteConsumptionLogById(Long id);
}
