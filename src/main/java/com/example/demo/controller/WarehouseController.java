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

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.warehouse;
import com.example.demo.service.ProductService;

@RestController
@RequestMapping("/Prouduct")
public class ProductController {

    @Autowired
    private ProductService prodService;

    // CREATE
    @PostMapping
    public ResponseEntity<Product> addProduct(@RequestBody Product product) {
        return ResponseEntity.ok(prodService.addProduct(product));
    }

    // READ ALL
    @GetMapping
    public ResponseEntity<List<Product>> getProducts() {
        return ResponseEntity.ok(prodService.getProducts());
    }

    // READ BY ID
    @GetMapping("/{id}")
    public ResponseEntity<Product> getProductById(@PathVariable Long id) {
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


