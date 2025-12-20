// package com.example.demo.controller;

// import java.util.List;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.web.bind.annotation.DeleteMapping;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.RequestBody;
// import org.springframework.web.bind.annotation.RestController;

// import com.example.demo.entity.PredictionRule;
// import com.example.demo.service.PredictionService;

// @RestController
// public class PredictionController{
//     @Autowired
//     PredictionService pred;

//     @PostMapping("/addprediction")
//     public PredictionRule addPredictionRule(@RequestBody PredictionRule prediction){
//         return pred.addPredictionPule(prediction);
//     }

//     @GetMapping("/getprediction")
//     public List<PredictionRule> getPredictionRules(){
//         return pred.getPredictionRules();
//     }

//     @GetMapping("/getpredicitonrule/{id}")
//     public PredictionRule getPredictionRuleById(@PathVariable Long id){
//         return pred.getPredictionRuleById(id);
//     }

//     @DeleteMapping("/deletepredictionrule/{id}")
//     public String deletePredictionRuleById(@PathVariable Long id){
//         PredictionRule PredictionRule=pred.getPredictionRuleById(id);
//         if(PredictionRule!=null){
//            pred.deletePredictionRuleById(id);
//             return "predictionrule deleted successfully";
//         }
//         else{
//             return "predictionrule not found.";
//         }
//     }





// }



package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.PredictionRule;
import com.example.demo.service.PredictionService;

@RestController
@RequestMapping("/PredictionRules")
public class PredictionController {

    @Autowired
    private PredictionService predService;

    // CREATE
    @PostMapping
    public ResponseEntity<PredictionRule> addPredictionRule(@RequestBody PredictionRule prerule) {
        return ResponseEntity.ok(PredictionRuleService.addPredictionRule(prerule));
    }

    // READ ALL
    @GetMapping
    public ResponseEntity<List<PredictionRule>> getPredictionRules() {
        return ResponseEntity.ok(PredictionRuleService.getPredictionRules());
    }

    // READ BY ID
    @GetMapping("/{id}")
    public ResponseEntity<PredictionRule> getPredictionRuleById(@PathVariable Long id) {
        PredictionRule PredictionRule = Service.getConsumptionLogById(id);
        if (ConsumptionLog == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(ConsumptionLog);
    }

    // DELETE
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteConsumptionLogById(@PathVariable Long id) {
        ConsumptionLog  ConsumptionLog =  ConsumptionLogService.getConsumptionLogById(id);
        if ( ConsumptionLog == null) {
            return ResponseEntity.notFound().build();
        }
        userService.deleteConsumptionLogById(id);
        return ResponseEntity.ok("User deleted successfully");
    }
}
