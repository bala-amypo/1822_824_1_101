
package.com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
public class StockRecord{
    private long id;
    private int currentQuantity;
    private int reorderThreshold;
    private String lastUpdated;

    public long getId(){
        return id;
    }
    public void setId(){
        this.id=id;
    }
    public int getcurrentQuantity(){
        return currentQuantity;
    }
    public void setcurrentQuantity(){
        this.currentQuantity=currentQuantity;
    }
    public int getreorderThreshold(){
        return reorderThreshold;
    }
    public void setreorderThreshold(){
        this.reorderThreshold=reorderThreshold;
    }
    public String getlastUpdated(){
        return lastUpdated;
    }
    public void setlastUpdated(){
        this.lastUpdated=lastUpdated;
    }
    
}