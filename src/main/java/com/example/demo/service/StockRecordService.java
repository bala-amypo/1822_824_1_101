package com.example.demo.service;
import com.example.demo.entity.stockrecord;
import java.util.List;

public interface StockRecordService{
    stockrecord createstockrecord(stockrecord stockrec);
    stockrec getstockrecordid(Long id);
    List<consumptionlog> getAllconsumptionlog();
}