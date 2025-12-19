package com.example.demo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.warehouse;
import com.example.demo.service.WarehouseService;

@RestController
public class WarehouseController{
    @Autowired
    WarehouseService ware;

    @PostMapping("/addwarehouse")
    public Warehouse addWarehouse(@RequestBody Warehouse warehouse){
        return ware.addwarehouse(warehouse);
    }

    @GetMapping("/getwarehouse")
    public List<warehouse> getStockRecords(){
        return storec.getStockRecords();
    }

    @GetMapping("/getStockRecord/{id}")
    public StockRecord getStockRecordtById(@PathVariable Long id){
        return storec.getStockRecordById(id);
    }

    @DeleteMapping("/deleteStockRecord/{id}")
    public String deleteStockRecordById(@PathVariable Long id){
        StockRecord StockRecord=storec.getStockRecordById(id);
        if(StockRecord!=null){
            prod.deleteStockRecordById(id);
            return "StockRecord deleted successfully";
        }
        else{
            return "StockRecord not found.";
        }
    }


}