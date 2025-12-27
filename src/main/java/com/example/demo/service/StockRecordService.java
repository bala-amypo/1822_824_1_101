package com.example.demo.service;

import java.util.List;
import com.example.demo.model.StockRecord;

public interface StockRecordService {

    StockRecord createStockRecord(StockRecord stockRecord);

    List<StockRecord> getRecordsBy_product(Long productId);
}
