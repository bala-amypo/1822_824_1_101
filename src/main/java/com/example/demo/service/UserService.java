package com.example.demo.service;

import com.example.demo.model.User;

public interface UserService {

    User register(User user);

   User user = userRepository.findByEmail(email)
        .orElseThrow(() -> new RuntimeException("User not found"));

}
