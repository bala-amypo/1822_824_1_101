package com.example.demo.service.implementation;
import java.util.List;
import com.example.demo.service.WarehouseService;
import org.springframework.stereotype.Service;
import com.example.demo.entity.Warehouse;
import com.example.demo.repository.WarehouseRepository;
import org.springframework.beans.factory.annotation.Autowired;
@Service
public abstract class WarehouseImplementation implements WarehouseService{
  @Autowired
  private WarehouseRepository obj;

  public Warehouse createWarehouse(Warehouse ware){
    return obj.save(ware);
  }
  public Warehouse getWarehouseid(Long id){
    return obj.findById(id).orElse(null);
  }
  public List<Warehouse>getAllWarehouses(){
    return obj.findAll();
  }
}