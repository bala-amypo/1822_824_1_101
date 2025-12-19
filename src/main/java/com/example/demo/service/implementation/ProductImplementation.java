package com.example.demo.service.implementation;
import java.util.List;
import com.example.demo.service.ProductService;
import org.springframework.stereotype.Service;
import com.example.demo.entity.product;
import com.example.demo.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
@Service
public class ProductImplementation implements ProductService{
  @Autowired
 ProductRepository obj;

  public product createproduct(product prod){
    return obj.save(prod);
  }
  public product getproductid(Long id){
    return obj.findById(id).orElse(null);
  }
  public List<product>getAllproducts(){
    return obj.findAll();
  }
}