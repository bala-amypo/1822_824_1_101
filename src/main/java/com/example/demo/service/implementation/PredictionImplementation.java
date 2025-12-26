package com.example.demo.service.implementation;

import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.entity.ConsumptionLog;
import com.example.demo.entity.PredictionRule;
import com.example.demo.entity.StockRecord;
import com.example.demo.repository.ConsumptionLogRepository;
import com.example.demo.repository.PredictionRuleRepository;
import com.example.demo.repository.StockRecordRepository;
import com.example.demo.service.PredictionService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class PredictionImplementation implements PredictionService {

    private final PredictionRuleRepository ruleRepository;
    private final StockRecordRepository stockRecordRepository;
    private final ConsumptionLogRepository logRepository;

    @Override
    public PredictionRule createRule(PredictionRule rule) {

        if (rule.getAverageDaysWindow() <= 0) {
            throw new IllegalArgumentException("averageDaysWindow must be > 0");
        }

        if (rule.getMinDailyUsage() > rule.getMaxDailyUsage()) {
            throw new IllegalArgumentException("minDailyUsage must be <= maxDailyUsage");
        }

        ruleRepository.findByRuleName(rule.getRuleName())
                .ifPresent(r -> {
                    throw new IllegalArgumentException("ruleName already exists");
                });

        rule.setCreatedAt(LocalDateTime.now());
        return ruleRepository.save(rule);
    }

    @Override
    public List<PredictionRule> getAllRules() {
        return ruleRepository.findAll();
    }

    @Override
    public LocalDate predictRestockDate(Long stockRecordId) {

        StockRecord record = stockRecordRepository.findById(stockRecordId)
                .orElseThrow(() -> new ResourceNotFoundException("StockRecord not found"));

        List<ConsumptionLog> logs = logRepository.findByStockRecordId(stockRecordId);

        if (logs.isEmpty()) {
            return LocalDate.now().plusDays(30);
        }

        int avgUsage = logs.stream()
                .mapToInt(ConsumptionLog::getConsumedQuantity)
                .sum() / logs.size();

        int remaining = record.getCurrentQuantity() - record.getReorderThreshold();

        int days = remaining / Math.max(avgUsage, 1);

        return LocalDate.now().plusDays(days);
    }
}
