package com.example.demo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.user;
import com.example.demo.service.UserService;

@RestController
public class AuthController{
    @Autowired
    private UserService use;

    @PostMapping("/adduser")
    public user adduser(@RequestBody user user){
        return use.adduser(user);
    }

    @GetMapping("/getuser")
    public List<user> getusers(){
        return use.getusers();
    }

    @GetMapping("/getuser/{id}")
    public user getuserById(@PathVariable Long id){
        return use.getuserById(id);
    }

    @DeleteMapping("/deleteuser/{id}")
    public String deleteuserById(@PathVariable Long id){
        user user=use.getuserById(id);
        if(user!=null){
           use.deleteuserById(id);
            return "user deleted successfully";
        }
        else{
            return "user not found.";
        }
    }


}