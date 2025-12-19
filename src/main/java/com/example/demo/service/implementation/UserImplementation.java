package com.example.demo.service.implementation;
import java.util.List;
import com.example.demo.service.UserService;
import org.springframework.stereotype.Service;
import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
@Service
public abstract class UserImplementation implements UserService{
  @Autowired
   private UserRepository obj;

  public User createUser(User user){
    return obj.save(user);
  }
  public User getUserid(Long id){
    return obj.findById(id).orElse(null);
  }
  public List<User>getAllUsers(){
    return obj.findAll();
  }
}