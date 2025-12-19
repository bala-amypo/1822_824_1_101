package com.example.demo.service.implementation;
import java.util.List;
import com.example.demo.service.ProductService;
import org.springframework.stereotype.Service;
import com.example.demo.entity.Product;
import com.example.demo.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
@Service
public abstract class ProductImplementation implements ProductService{
  @Autowired
 private ProductRepository obj;

  public Product createProduct(Product prod){
    return obj.save(prod);
  }
  public Product getProductid(Long id){
    return obj.findById(id).orElse(null);
  }
  public List<Product>getAllProducts(){
    return obj.findAll();
  }
}