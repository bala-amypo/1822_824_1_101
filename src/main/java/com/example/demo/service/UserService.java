package com.example.demo.service;
import com.example.demo.entity.user;
import java.util.List;

public interface UserService{
    consumptionlog createconsumptionlog(user user);
    user getuserid(Long id);
    List<user> getAlluser();
}