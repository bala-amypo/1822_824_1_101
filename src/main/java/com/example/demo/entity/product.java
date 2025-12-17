package.com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

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
    public LocalDateTime getcreatedAt(){
        return createdAt;
    }
    public void setcreatedAt(){
        this.createdAt=createdAt;
    }
}