package com.example.demo.service.impl;

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
    return stockRecord;
    }

    @Override
     public List<StockRecord> getRecordsBy_product(Long productId) {
    return new ArrayList<>();
    }



    @Override
    public StockRecord getStockRecord(Long id) {
        StockRecord stockRecord = new StockRecord();
        stockRecord.setId(id);
        stockRecord.setQuantity(100);
        stockRecord.setCreatedAt(LocalDateTime.now());
        return stockRecord;
    }

    @Override
    public List<StockRecord> getAllStockRecords() {
        return new ArrayList<>();
    }
}
