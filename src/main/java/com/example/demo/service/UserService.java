package com.example.demo.service;
import com.example.demo.entity.User;
import java.util.List;

public interface UserService{
    User createuser(User user);
    User getuserid(Long id);
    List<User> getAllUser();
}