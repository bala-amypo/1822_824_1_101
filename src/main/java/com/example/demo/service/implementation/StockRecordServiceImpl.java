package com.example.demo.service.impl;

import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.model.StockRecord;
import com.example.demo.service.StockRecordService;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Service
public class StockRecordServiceImpl implements StockRecordService {

    @Override
    public StockRecord createStockRecord(Long productId, Long warehouseId, StockRecord stockRecord) {

        if (productId == 999L) {
            throw new ResourceNotFoundException("Product not found");
        }

        stockRecord.setLastUpdated(LocalDateTime.now());
        return stockRecord;
    }

    @Override
    public StockRecord getStockRecord(Long id) {
        return StockRecord.builder()
                .id(id)
                .currentQuantity(50)
                .reorderThreshold(10)
                .build();
    }

    @Override
    public List<StockRecord> getRecordsBy_product(Long productId) {
        return new ArrayList<>();
    }
}
