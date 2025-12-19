package com.example.demo.service;
import com.example.demo.entity.Warehouse;
import java.util.List;

public interface WarehouseService{
    Warehouse createWarehouse(Warehouse ware);
    Warehouse getWarehouseid(Long id);
    List<Warehouse> getAllWarehouse();
}