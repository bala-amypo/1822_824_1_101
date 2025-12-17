package.com.example.demo.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
@Entity
public class consumptionlog{
    private Long id;
    private int consumedQuantity;
    private String consumedDate;

    public long getId(){
        return id;
    }
    public void setId(){
        this.id=id;
    }
    public int getconsumedQuantity(){
        return consumedQuantity;
    }
    public void setconsumedQuantity(){
        this.consumedQuantity=consumedQuantity;
    }
    public String getconsumedDate(){
        return consumedDate;
    }
    public void setconsumedDate(){
        this.consumedDate=consumedDate;
    }
   
}