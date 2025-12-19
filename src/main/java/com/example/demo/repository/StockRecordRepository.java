package com.example.demo.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.StockRecord;
// import java.util.Lang;

@Repository
public interface StockRecordRepository extends JpaRepository<StockRecord, Long>{
    
}