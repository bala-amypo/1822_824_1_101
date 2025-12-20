// package com.example.demo.controller;

// import java.util.List;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.web.bind.annotation.DeleteMapping;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.RequestBody;
// import org.springframework.web.bind.annotation.RestController;

// import com.example.demo.entity.Product;
// import com.example.demo.service.ProductService;

// @RestController
// public class ProductController{
//     @Autowired
//     ProductService prod;

//     @PostMapping("/addProducts")
//     public Product addProducts(@RequestBody Product product){
//         return prod.addProducts(product);
//     }

//     @GetMapping("/getProducts")
//     public List<Product> getProducts(){
//         return prod.getProducts();
//     }

//     @GetMapping("/getProduct/{id}")
//     public Product getProductById(@PathVariable Long id){
//         return prod.getProductById(id);
//     }

//     @DeleteMapping("/deleteProduct/{id}")
//     public String deleteProductById(@PathVariable Long id){
//         Product Product=prod.getProductById(id);
//         if(Product!=null){
//             prod.deleteProductById(id);
//             return "Product deleted successfully";
//         }
//         else{
//             return "Product not found.";
//         }
//     }



// }



package com.example.demo.controller;

import java.util.List;
import java.util.Long;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.Product;
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
    public ResponseEntity<List<Product>> getProduct() {
        return ResponseEntity.ok(prodService.getProduct());
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


