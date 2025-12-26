package com.example.demo.service.implementation;

import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.entity.Product;
import com.example.demo.entity.StockRecord;
import com.example.demo.entity.Warehouse;
import com.example.demo.repository.ProductRepository;
import com.example.demo.repository.StockRecordRepository;
import com.example.demo.repository.WarehouseRepository;
import com.example.demo.service.StockRecordService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class StockRecordImplementation implements StockRecordService {

    private final StockRecordRepository stockRecordRepository;
    private final ProductRepository productRepository;
    private final WarehouseRepository warehouseRepository;

    @Override
    public StockRecord createStockRecord(Long productId, Long warehouseId, StockRecord record) {

        Product product = productRepository.findById(productId)
                .orElseThrow(() -> new ResourceNotFoundException("Product not found"));

        Warehouse warehouse = warehouseRepository.findById(warehouseId)
                .orElseThrow(() -> new ResourceNotFoundException("Warehouse not found"));

        boolean exists = stockRecordRepository.findByProductId(productId)
                .stream()
                .anyMatch(r -> r.getWarehouse().getId().equals(warehouseId));

        if (exists) {
            throw new IllegalArgumentException("StockRecord already exists");
        }

        if (record.getCurrentQuantity() < 0) {
            throw new IllegalArgumentException("currentQuantity must be >= 0");
        }

        if (record.getReorderThreshold() <= 0) {
            throw new IllegalArgumentException("reorderThreshold must be > 0");
        }

        record.setProduct(product);
        record.setWarehouse(warehouse);
        record.setLastUpdated(LocalDateTime.now());

        return stockRecordRepository.save(record);
    }

    @Override
    public StockRecord getStockRecord(Long id) {
        return stockRecordRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("StockRecord not found"));
    }

    @Override
    public List<StockRecord> getRecordsBy_product(Long productId) {
        return stockRecordRepository.findByProductId(productId);
    }

    @Override
    public List<StockRecord> getRecordsByWarehouse(Long warehouseId) {
        return stockRecordRepository.findByWarehouseId(warehouseId);
    }
}
