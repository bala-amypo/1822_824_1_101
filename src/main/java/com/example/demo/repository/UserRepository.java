package com.example.demo.repository;
import org.springframework.data.japa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.user;
import java.util.Lang;

@Repository
public interface UserRepository extends JpaRepository{
    
}