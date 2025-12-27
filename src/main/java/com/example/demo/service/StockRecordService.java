package com.example.demo.service;

import java.util.List;
import com.example.demo.model.StockRecord;

public interface StockRecordService {

    StockRecord createStockRecord(Long productId, Long warehouseId, StockRecord stockRecord);

    StockRecord getStockRecord(Long id);

    List<StockRecord> getRecordsBy_product(Long productId);
}
