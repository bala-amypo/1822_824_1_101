// package com.example.demo.controller;

// import java.util.List;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.web.bind.annotation.DeleteMapping;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.RequestBody;
// import org.springframework.web.bind.annotation.RestController;

// import com.example.demo.entity.StockRecord;
// import com.example.demo.service.StockRecordService;

// @RestController
// public class StockRecordController{
//     @Autowired
//     StockRecordService storec;

//     @PostMapping("/addStock")
//     public StockRecord addStockRecord(@RequestBody StockRecord stock){
//         return storec.addStockRecord(stock);
//     }

//     @GetMapping("/getStockRecord")
//     public List<StockRecord> getStockRecords(){
//         return storec.getStockRecords();
//     }

//     @GetMapping("/getStockRecord/{id}")
//     public StockRecord getStockRecordtById(@PathVariable Long id){
//         return storec.getStockRecordById(id);
//     }

//     @DeleteMapping("/deleteStockRecord/{id}")
//     public String deleteStockRecordById(@PathVariable Long id){
//         StockRecord StockRecord=storec.getStockRecordById(id);
//         if(StockRecord!=null){
//             prod.deleteStockRecordById(id);
//             return "StockRecord deleted successfully";
//         }
//         else{
//             return "StockRecord not found.";
//         }
//     }


// }


package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.StockRecord;
import com.example.demo.service.StockRecordService;

@RestController
@RequestMapping("/StockRecord")
public class StockRecordController {

    @Autowired
    private StockRecordService stockService;

    // CREATE
    @PostMapping
    public ResponseEntity<StockRecord> addStockRecord(@RequestBody StockRecord stock) {
        return ResponseEntity.ok(stockService.addStockRecord(stock));
    }

    // READ ALL
    @GetMapping
    public ResponseEntity<List<StockRecord>> getStockRecords() {
        return ResponseEntity.ok(stockService.getStockRecords());
    }

    // READ BY ID
    @GetMapping("/{id}")
    public ResponseEntity<StockRecord> getProductById(@PathVariable Long id) {
        Product Product =prodService.getProductById(id);
        if (Product == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(Product);
    }

    // DELETE
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteProductById(@PathVariable Long id) {
        Product  Product =  prodService.getProductById(id);
        if ( Product == null) {
            return ResponseEntity.notFound().build();
        }
        prodService.deleteProductById(id);
        return ResponseEntity.ok("Product deleted successfully");
    }
}


