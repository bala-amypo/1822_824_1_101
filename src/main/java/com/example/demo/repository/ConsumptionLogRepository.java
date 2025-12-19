package com.example.demo.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.consumptionlog;
// import java.util.Lang;

@Repository
public interface ConsumptionLogRepository extends JpaRepository<consumptionlog, Long>{
    
}