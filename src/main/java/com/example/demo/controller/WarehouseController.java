// package com.example.demo.controller;

// import java.util.List;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.web.bind.annotation.DeleteMapping;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.RequestBody;
// import org.springframework.web.bind.annotation.RestController;

// import com.example.demo.entity.Warehouse;
// import com.example.demo.service.WarehouseService;

// @RestController
// public class WarehouseController{
//     @Autowired
//     WarehouseService ware;

//     @PostMapping("/addwarehouse")
//     public Warehouse addWarehouse(@RequestBody Warehouse warehouse){
//         return ware.addWarehouse(warehouse);
//     }

//     @GetMapping("/getwarehouse")
//     public List<Warehouse> getWarehouses(){
//         return ware.getWarehouses();
//     }

//     @GetMapping("/getwarehouse/{id}")
//     public Warehouse getWarehouseById(@PathVariable Long id){
//         return ware.getWarehouseById(id);
//     }

//     @DeleteMapping("/deletewarehouse/{id}")
//     public String deleteWarehouseById(@PathVariable Long id){
//         Warehouse Warehouse=ware.getWarehouseById(id);
//         if(Warehouse!=null){
//             ware.deleteWarehouseById(id);
//             return "warehouse deleted successfully";
//         }
//         else{
//             return "warehouse not found.";
//         }
//     }


// }


package com.example.demo.controller;

import java.util.List;
import jva.util.Long;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.Warehouse;
import com.example.demo.service.WarehouseService;

@RestController
@RequestMapping("/Warehouse")
public class WarehouseController {

    @Autowired
    private WarehouseService wareService;

    // CREATE
    @PostMapping
    public ResponseEntity<Warehouse> addWarehouse(@RequestBody Warehouse warehouse) {
        return ResponseEntity.ok(wareService.addWarehouse(warehouse));
    }

    // READ ALL
    @GetMapping
    public ResponseEntity<List<Warehouse>> getWarehouse() {
        return ResponseEntity.ok(wareService.getWarehouse());
    }

    // READ BY ID
    @GetMapping("/{id}")
    public ResponseEntity<Warehouse> getWarehouseById(@PathVariable Long id) {
        Warehouse Warehouse =wareService.getWarehouseById(id);
        if (Warehouse == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(Warehouse);
    }

    // DELETE
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteWarehouseById(@PathVariable Long id) {
        Warehouse  Warehouse =  wareService.getWarehouseById(id);
        if ( Warehouse == null) {
            return ResponseEntity.notFound().build();
        }
        wareService.deleteWarehouseById(id);
        return ResponseEntity.ok("Warehouse deleted successfully");
    }
}


