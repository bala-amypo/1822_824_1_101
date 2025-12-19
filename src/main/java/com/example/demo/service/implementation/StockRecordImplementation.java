package com.example.demo.service.implementation;
import java.util.List;
import com.example.demo.service.StockRecordService;
import org.springframework.stereotype.Service;
import com.example.demo.entity.StockRecord;
import com.example.demo.repository.StockRecordRepository;
import org.springframework.beans.factory.annotation.Autowired;
@Service
public abstract class StockRecordImplementation implements StockRecordService{
  @Autowired
  private StockRecordRepository obj;

  public StockRecord createStockRecord(StockRecord stockrec){
    return obj.save(stockrec);
  }
  public StockRecord getStockRecordid(Long id){
    return obj.findById(id).orElse(null);
  }
  public List<StockRecord>getAllStockRecords(){
    return obj.findAll();
  }
}