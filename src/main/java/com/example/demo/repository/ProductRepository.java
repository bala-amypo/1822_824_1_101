package com.example.demo.repository;
import org.springframework.data.japa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.product;
import java.util.Lang;

@Repository
public interface ProductRepository extends JpaRepository{
    
}