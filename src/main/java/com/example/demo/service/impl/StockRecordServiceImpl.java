package com.example.demo.service.impl;

import org.springframework.stereotype.Service;

import com.example.demo.model.StockRecord;
import com.example.demo.repository.StockRecordRepository;
import com.example.demo.service.StockRecordService;

@Service
public class StockRecordServiceImpl implements StockRecordService {

    private final StockRecordRepository stockRecordRepository;

    public StockRecordServiceImpl(StockRecordRepository stockRecordRepository) {
        this.stockRecordRepository = stockRecordRepository;
    }

    @Override
    public StockRecord createStockRecord(StockRecord stockRecord) {

        boolean exists = stockRecordRepository
                .existsByProductIdAndWarehouseId(
                        stockRecord.getProduct().getId(),
                        stockRecord.getWarehouse().getId()
                );

        if (exists) {
            throw new RuntimeException("Stock record already exists");
        }

        return stockRecordRepository.save(stockRecord);
    }
}
