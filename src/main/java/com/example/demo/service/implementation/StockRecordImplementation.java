package com.example.demo.service.implementation;
import java.util.List;
import com.example.demo.service.StockRecordService;
import org.springframework.stereotype.Service;
import com.example.demo.entity.stockrecord;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
@Service
public class UserImplementation implements UserService{
  @Autowired
  UserRepository obj;

  public user creatuser(user user){
    return obj.save(user);
  }
  public user getuserid(Long id){
    return obj.findById(id).orElse(null);
  }
  public List<user>getAllusers(){
    return obj.findAll();
  }
}