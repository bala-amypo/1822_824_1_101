package com.example.demo.repository;
import org.springframework.data.japa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.WorkflowStepConfigRepository;
import java.util.Long;

@Repository
public interface ConsumptionLogRepository extends JpaRepository{
    
}