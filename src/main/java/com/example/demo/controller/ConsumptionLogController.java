// package com.example.demo.controller;

// import java.util.List;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.web.bind.annotation.DeleteMapping;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.RequestBody;
// import org.springframework.web.bind.annotation.RestController;

// import com.example.demo.entity.ConsumptionLog;
// import com.example.demo.service.ConsumptionLogService;

// @RestController
// public class ConsumptionLogController{
//     @Autowired
//     ConsumptionLogService clog;

//     @PostMapping("/addconsumptionlog")
//     public ConsumptionLog addConsumptionLog(@RequestBody ConsumptionLog conslog){
//         return clog.addConsumptionLog(conslog);
//     }

//     @GetMapping("/getconsuptionlog")
//     public List<ConsumptionLog> getConsumptionLogs(){
//         return clog.getConsumptionLogs();
//     }

//     @GetMapping("/getconsumptionlog/{id}")
//     public ConsumptionLog getConsumptionLogById(@PathVariable Long id){
//         return clog.getConsumptionLogById(id);
//     }

//     @DeleteMapping("/deleteconsumptionlog/{id}")
//     public String deleteConsumptionLogById(@PathVariable Long id){
//         ConsumptionLog Consumptionlog=clog.getconsumptionlogById(id);
//         if(consumptionlog!=null){
//            clog.deleteconsumptionlogById(id);
//             return "consumptionlog deleted successfully";
//         }
//         else{
//             return "consumptionlog not found.";
//         }
//     }


// }



package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.ConsumptionLog;
import com.example.demo.service.ConsumptionLogService;

@RestController
@RequestMapping("/Consumptionlogs")
public class ConsumptionLogController {

    @Autowired
    private ConsumptionLogService clogService;

    // CREATE
    @PostMapping
    public ResponseEntity<ConsumptionLog> addConsumptionLog(@RequestBody ConsumptiionLog Log) {
        return ResponseEntity.ok(ConsumptionLogService.addConsumptionLog(Log));
    }

    // READ ALL
    @GetMapping
    public ResponseEntity<List<ConsumptionLog>> getConsumptionLogs() {
        return ResponseEntity.ok(ConsumptionLogService.getConsumptionLogs());
    }

    // READ BY ID
    @GetMapping("/{id}")
    public ResponseEntity<ConsumptionLog> getUserById(@PathVariable Long id) {
        User user = userService.getUserById(id);
        if (user == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(user);
    }

    // DELETE
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteUserById(@PathVariable Long id) {
        User user = userService.getUserById(id);
        if (user == null) {
            return ResponseEntity.notFound().build();
        }
        userService.deleteUserById(id);
        return ResponseEntity.ok("User deleted successfully");
    }
}
