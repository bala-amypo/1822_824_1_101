package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Warehouse;

public interface WarehouseService {

    Warehouse addWarehouse(Warehouse warehouse);

    List<Warehouse> getAllWarehouses();

    Warehouse getWarehouseById(Long id);

    void deleteWarehouseById(Long id);
}
