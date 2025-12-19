package com.example.demo.service;
import com.example.demo.entity.StockRecord;
import java.util.List;

public interface StockRecordService{
    StockRecord createStockRecord(StockRecord stockrec);
    StockRecord getStockRecordid(Long id);
    List<StockRecord> getAllStockRecord();
}