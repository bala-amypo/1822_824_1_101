package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.ConsumptionLog;
import com.example.demo.repository.ConsumptionLogRepository;

@Service
public class ConsumptionLogImplementation implements ConsumptionLogService {

    @Autowired
    private ConsumptionLogRepository consumptionLogRepository;

    @Override
    public ConsumptionLog addConsumptionLog(ConsumptionLog log) {
        return consumptionLogRepository.save(log);
    }

    @Override
    public List<ConsumptionLog> getAllConsumptionLogs() {
        return consumptionLogRepository.findAll();
    }

    @Override
    public ConsumptionLog getConsumptionLogById(Long id) {
        return consumptionLogRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteConsumptionLogById(Long id) {
        consumptionLogRepository.deleteById(id);
    }
}
