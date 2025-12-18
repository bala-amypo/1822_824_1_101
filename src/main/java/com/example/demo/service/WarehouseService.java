package com.example.demo.service;
import com.example.demo.entity.warehouse;
import java.util.List;

public interface WarehouseService{
    warehouse createconsumptionlog(warehouse ware);
    warehouse getwarehouseid(Long id);
    List<warehouse> getAllwarehouse();
}