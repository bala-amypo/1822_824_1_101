package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.StockRecord;
import com.example.demo.service.StockRecordService;

@RestController
@RequestMapping("/stockrecords")
public class StockRecordController {

    @Autowired
    private StockRecordService stockRecordService;

    // CREATE
    @PostMapping
    public StockRecord addStockRecord(@RequestBody StockRecord stockRecord) {
        return stockRecordService.addStockRecord(stockRecord);
    }

    // READ ALL
    @GetMapping
    public List<StockRecord> getAllStockRecords() {
        return stockRecordService.getAllStockRecords();
    }

    // READ BY ID
    @GetMapping("/{id}")
    public StockRecord getStockRecordById(@PathVariable Long id) {
        return stockRecordService.getStockRecordById(id);
    }

    // DELETE
    @DeleteMapping("/{id}")
    public String deleteStockRecordById(@PathVariable Long id) {
        stockRecordService.deleteStockRecordById(id);
        return "Stock record deleted successfully";
    }
}
