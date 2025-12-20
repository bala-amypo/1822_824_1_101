package com.example.demo.service;

import java.util.List;
import com.example.demo.entity.User;

public interface UserService {

    User addUser(User user);

    List<User> getUsers();

    User getUserById(Long id);

    void deleteUserById(Long id);
}
