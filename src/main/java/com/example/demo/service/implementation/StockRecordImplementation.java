package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.StockRecord;
import com.example.demo.repository.StockRecordRepository;

@Service
public class StockRecordImplementation implements StockRecordService {

    @Autowired
    private StockRecordRepository stockRecordRepository;

    @Override
    public StockRecord addStockRecord(StockRecord stockRecord) {
        return stockRecordRepository.save(stockRecord);
    }

    @Override
    public List<StockRecord> getAllStockRecords() {
        return stockRecordRepository.findAll();
    }

    @Override
    public StockRecord getStockRecordById(Long id) {
        return stockRecordRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteStockRecordById(Long id) {
        stockRecordRepository.deleteById(id);
    }
}
