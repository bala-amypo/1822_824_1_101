// package com.example.demo.service.implementation;
// import java.util.List;
// import com.example.demo.service.StockRecordService;
// import org.springframework.stereotype.Service;
// import com.example.demo.entity.stockrecord;
// import com.example.demo.repository.StockRecordRepository;
// import org.springframework.beans.factory.annotation.Autowired;
// @Service
// public class StockRecordImplementation implements StockRecordService{
//   @Autowired
//   StockRecordRepository obj;

//   public stockrecord createstockrecord(stockrecord stockrec){
//     return obj.save(stockrec);
//   }
//   public stockrecord getstockrecordid(Long id){
//     return obj.findById(id).orElse(null);
//   }
//   public List<stockrecord>getAllstockrecords(){
//     return obj.findAll();
//   }
// }