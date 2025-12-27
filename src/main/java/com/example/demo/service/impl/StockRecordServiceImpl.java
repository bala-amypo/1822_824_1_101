package com.example.demo.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Product;
import com.example.demo.model.StockRecord;
import com.example.demo.model.Warehouse;
import com.example.demo.repository.ProductRepository;
import com.example.demo.repository.StockRecordRepository;
import com.example.demo.repository.WarehouseRepository;
import com.example.demo.service.StockRecordService;

@Service("stockRecordService")
public class StockRecordServiceImpl implements StockRecordService {

    private final StockRecordRepository stockRecordRepository;
    private final ProductRepository productRepository;
    private final WarehouseRepository warehouseRepository;

    public StockRecordServiceImpl(
            StockRecordRepository stockRecordRepository,
            ProductRepository productRepository,
            WarehouseRepository warehouseRepository) {
        this.stockRecordRepository = stockRecordRepository;
        this.productRepository = productRepository;
        this.warehouseRepository = warehouseRepository;
    }

    @Override
    public StockRecord createStockRecord(Long productId, Long warehouseId, StockRecord stockRecord) {

        Product product = productRepository.findById(productId)
                .orElseThrow(() -> new RuntimeException("Product not found"));

        Warehouse warehouse = warehouseRepository.findById(warehouseId)
                .orElseThrow(() -> new RuntimeException("Warehouse not found"));

        boolean exists = stockRecordRepository
                .existsByProductIdAndWarehouseId(productId, warehouseId);

        if (exists) {
            throw new IllegalArgumentException("StockRecord already exists");
        }

        stockRecord.setProduct(product);
        stockRecord.setWarehouse(warehouse);

        return stockRecordRepository.save(stockRecord);
    }

    @Override
    public StockRecord getStockRecord(Long id) {
        return stockRecordRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("StockRecord not found"));
    }

    @Override
    public List<StockRecord> getRecordsBy_product(Long productId) {
        return stockRecordRepository.findByProductId(productId);
    }
}
