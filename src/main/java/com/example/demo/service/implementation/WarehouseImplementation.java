package com.example.demo.service.impl;

import com.example.demo.model.Warehouse;
import com.example.demo.service.WarehouseService;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Service
public class WarehouseServiceImpl implements WarehouseService {

    @Override
    public Warehouse createWarehouse(Warehouse warehouse) {
        warehouse.setCreatedAt(LocalDateTime.now());
        return warehouse;
    }

    @Override
    public Warehouse getWarehouse(Long id) {
        return Warehouse.builder()
                .id(id)
                .warehouseName("Default Warehouse")
                .location("Default Location")
                .build();
    }

    @Override
    public List<Warehouse> getAllWarehouses() {
        return new ArrayList<>();
    }
}
