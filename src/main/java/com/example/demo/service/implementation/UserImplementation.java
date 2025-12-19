package com.example.demo.service.implementation;
import java.util.List;
import com.example.demo.service.UserService;
import org.springframework.stereotype.Service;
import com.example.demo.entity.user;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
@Service
public interface UserImplementation implements UserService{
  @Autowired
  UserRepository obj;

  public user createuser(user user){
    return obj.save(user);
  }
  public user getuserid(Long id){
    return obj.findById(id).orElse(null);
  }
  public List<user>getAllusers(){
    return obj.findAll();
  }
}