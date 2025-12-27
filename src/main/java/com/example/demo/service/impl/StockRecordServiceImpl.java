package com.example.demo.service.impl;

import com.example.demo.model.StockRecord;
import com.example.demo.service.StockRecordService;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Collections;
import java.util.List;

@Service
public class StockRecordServiceImpl implements StockRecordService {

    @Override
    public StockRecord createStockRecord(Long productId, Long warehouseId, StockRecord stockRecord) {
        stockRecord.setLastUpdated(LocalDateTime.now());
        return stockRecord;
    }

    @Override
    public StockRecord getStockRecord(Long id) {
        StockRecord sr = new StockRecord();
        sr.setId(id);
        sr.setCurrentQuantity(0);
        sr.setReorderThreshold(0);
        return sr;
    }

    @Override
    public List<StockRecord> getRecordsBy_product(Long productId) {
        return Collections.emptyList();
    }
}
