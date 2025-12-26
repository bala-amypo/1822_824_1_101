package com.example.demo.service;

import com.example.demo.entity.Warehouse;

import java.util.List;

public interface WarehouseService {

    Warehouse createWarehouse(Warehouse warehouse);

    Warehouse getWarehouse(Long id);

    List<Warehouse> getAllWarehouses();
}
