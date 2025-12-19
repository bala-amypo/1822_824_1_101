package com.example.demo.repository;
import org.springframework.data.japa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.product;
import java.util.Long;

@Repository
public interface ProductRepository extends JpaRepository{
    
}