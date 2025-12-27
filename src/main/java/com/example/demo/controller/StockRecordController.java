package com.example.demo.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.demo.model.StockRecord;
import com.example.demo.service.StockRecordService;

@RestController
@RequestMapping("/api/stocks")
public class StockRecordController {

    private final StockRecordService stockRecordService;

    public StockRecordController(StockRecordService stockRecordService) {
        this.stockRecordService = stockRecordService;
    }

    // TEST 12,21
    @PostMapping("/{productId}/{warehouseId}")
    public ResponseEntity<StockRecord> createStock(
            @PathVariable Long productId,
            @PathVariable Long warehouseId,
            @RequestBody StockRecord stockRecord) {

        return ResponseEntity.ok(
                stockRecordService.createStockRecord(productId, warehouseId, stockRecord)
        );
    }

    // TEST 13
    @GetMapping("/{id}")
    public ResponseEntity<StockRecord> getStock(@PathVariable Long id) {
        return ResponseEntity.ok(stockRecordService.getStockRecord(id));
    }

    // TEST 14
    @GetMapping("/product/{productId}")
    public ResponseEntity<List<StockRecord>> getByProduct(@PathVariable Long productId) {
        return ResponseEntity.ok(stockRecordService.getRecordsBy_product(productId));
    }
}
