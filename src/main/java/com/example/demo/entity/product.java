package.com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
public class product{
    private long id;
    private String productName;
    private String sku;
    private String category;
    private String createdAt;

    public long getId(){
        return id;
    }
    public void setId(){
        this.id=id;
    }
    public String getproductName(){
        return productName;
    }
    public void setproductName(){
        this.productName=productName;
    }
    public String getsku(){
        return sku;
    }
    public void setsku(){
        this.sku=sku;
    }
    public String getcategory(){
        return category;
    }
    public void setcategory(){
        this.category=category;
    }
    public String getcreatedAt(){
        return createdAt;
    }
    public void setcreatedAt(){
        this.createdAt=createdAt;
    }
}