package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.StockRecord;

public interface StockRecordService {

    StockRecord addStockRecord(StockRecord stockRecord);

    List<StockRecord> getAllStockRecords();

    StockRecord getStockRecordById(Long id);

    void deleteStockRecordById(Long id);
}
