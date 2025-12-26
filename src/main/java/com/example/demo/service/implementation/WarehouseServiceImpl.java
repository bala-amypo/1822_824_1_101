package com.example.demo.service.impl;

import com.example.demo.model.Warehouse;
import com.example.demo.service.WarehouseService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class WarehouseServiceImpl implements WarehouseService {

    @Override
    public Warehouse createWarehouse(Warehouse warehouse) {
        return warehouse;
    }

    @Override
    public Warehouse getWarehouse(Long id) {
        Warehouse warehouse = new Warehouse();
        warehouse.setId(id);
        warehouse.setName("Main Warehouse");
        warehouse.setLocation("Chennai");
        return warehouse;
    }

    @Override
    public List<Warehouse> getAllWarehouses() {
        return new ArrayList<>();
    }
}
