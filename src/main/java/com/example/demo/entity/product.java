package.com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import java.time.LocalDateTime;

@Entity
public class product{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id;
    @NotNull
    private String productName;
    @Column(unique=true)
    private String sku;
    private String category;
    private LocalDateTime createdAt;

    public long getId(){
        return id;
    }
    public void setId(long id){
        this.id=id;
    }
    public String getproductName(){
        return productName;
    }
    public void setproductName(String productName){
        this.productName=productName;
    }
    public String getsku(){
        return sku;
    }
    public void setsku(String sku){
        this.sku=sku;
    }
    public String getcategory(){
        return category;
    }
    public void setcategory(String category){
        this.category=category;
    }
    public LocalDateTime getcreatedAt(){
        return createdAt;
    }
    public void setcreatedAt(LocalDateTime createdAt){
        this.createdAt=createdAt;
    }
     public product(long id,String productName,String sku, String category,LocalDateTime createdAt){
        this.id=id;
        this.productName=productName;
        this.sku=sku;
        this.category=category;
        this.createdAt=createdAt;
    }
    public product(){

    }
}