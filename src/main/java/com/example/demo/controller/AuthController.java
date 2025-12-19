package com.example.demo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;

@RestController
public class AuthController{
    @Autowired
    private UserService use;

    @PostMapping("/adduser")
    public User addUser(@RequestBody User user){
        return use.adduser(user);
    }

    @GetMapping("/getuser")
    public List<User> getUsers(){
        return use.getUsers();
    }

    @GetMapping("/getuser/{id}")
    public User getUserById(@PathVariable Long id){
        return use.getUserById(id);
    }

    @DeleteMapping("/deleteuser/{id}")
    public String deleteUserById(@PathVariable Long id){
        User user=use.getUserById(id);
        if(user!=null){
           use.deleteUserById(id);
            return "user deleted successfully";
        }
        else{
            return "user not found.";
        }
    }


}