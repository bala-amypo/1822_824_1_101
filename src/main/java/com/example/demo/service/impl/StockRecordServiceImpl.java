package com.example.demo.service.impl;

import java.util.List;

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

    // 🔥 THIS METHOD WAS MISSING — idhaan error kaaranam
    @Override
    public List<StockRecord> getRecordsBy_product(Long productId) {
        return stockRecordRepository.findByProductId(productId);
    }
}
