package com.example.demo.service;
import com.example.demo.entity.StockRecord;
import java.util.List;

public interface StockRecordService{
    Stockrecord createstockrecord(stockrecord stockrec);
    stockrecord getstockrecordid(Long id);
    List<stockrecord> getAllstockrecord();
}