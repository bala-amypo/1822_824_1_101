package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.ConsumptionLog;
import com.example.demo.service.ConsumptionLogService;

@RestController
@RequestMapping("/consumptionlogs")
public class ConsumptionLogController {

    @Autowired
    private ConsumptionLogService consumptionLogService;

    // CREATE
    @PostMapping
    public ConsumptionLog addConsumptionLog(@RequestBody ConsumptionLog log) {
        return consumptionLogService.addConsumptionLog(log);
    }

    // READ ALL
    @GetMapping
    public List<ConsumptionLog> getAllConsumptionLogs() {
        return consumptionLogService.getAllConsumptionLogs();
    }

    // READ BY ID
    @GetMapping("/{id}")
    public ConsumptionLog getConsumptionLogById(@PathVariable Long id) {
        return consumptionLogService.getConsumptionLogById(id);
    }

    // DELETE
    @DeleteMapping("/{id}")
    public String deleteConsumptionLog(@PathVariable Long id) {
        consumptionLogService.deleteConsumptionLogById(id);
        return "Consumption log deleted successfully";
    }
}
