package com.example.demo.service.implementation;
import java.util.List;
import com.example.demo.service.WarehouseService;
import org.springframework.stereotype.Service;
import com.example.demo.entity.warehouse;
import com.example.demo.repository.WarehouseRepository;
import org.springframework.beans.factory.annotation.Autowired;
@Service
public class WarehouseImplementation implements WarehouseService{
  @Autowired
  private WarehouseRepository obj;

  public warehouse createwarehouse(warehouse ware){
    return obj.save(ware);
  }
  public warehouse getwarehouseid(Long id){
    return obj.findById(id).orElse(null);
  }
  public List<warehouse>getAllwarehouses(){
    return obj.findAll();
  }
}