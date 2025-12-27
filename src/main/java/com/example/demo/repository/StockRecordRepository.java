package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.StockRecord;

public interface StockRecordRepository extends JpaRepository<StockRecord, Long> {

    List<StockRecord> findByProductId(Long productId);

    boolean existsByProductIdAndWarehouseId(Long productId, Long warehouseId);
}
