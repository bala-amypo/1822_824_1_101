package com.example.demo.service.impl;

import com.example.demo.model.ConsumptionLog;
import com.example.demo.service.ConsumptionLogService;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class ConsumptionLogServiceImpl implements ConsumptionLogService {

    @Override
    public ConsumptionLog logConsumption(Long stockRecordId, ConsumptionLog log) {

        if (log.getConsumedDate() != null && log.getConsumedDate().isAfter(LocalDate.now())) {
            throw new IllegalArgumentException("consumedDate cannot be future");
        }

        if (log.getConsumedDate() == null) {
            log.setConsumedDate(LocalDate.now());
        }

        return log;
    }

    @Override
    public List<ConsumptionLog> getLogsByStockRecord(Long stockRecordId) {
        return new ArrayList<>();
    }
}
