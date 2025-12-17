
package.com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
public class StockRecord{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id;
    private int currentQuantity;
    private int reorderThreshold;
    private LocalDateTime lastUpdated;

    public long getId(){
        return id;
    }
    public void setId(long id){
        this.id=id;
    }
    public int getcurrentQuantity(){
        return currentQuantity;
    }
    public void setcurrentQuantity(int currentQuantity){
        this.currentQuantity=currentQuantity;
    }
    public int getreorderThreshold(){
        return reorderThreshold;
    }
    public void setreorderThreshold(int reorderThreshold){
        this.reorderThreshold=reorderThreshold;
    }
    public LocalDateTime getlastUpdated(){
        return lastUpdated;
    }
    public void setlastUpdated(LocalDateTime lastUpdated){
        this.lastUpdated=lastUpdated;
    }
    
}