package com.example.demo.service.implementation;
import java.util.List;
import com.example.demo.service







@Service
public class WarehouseImplementation implements WarehouseService{
  @Autowired
  WarehouseRepository obj;

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