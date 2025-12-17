package.com.example.demo.entity;
public class user{
    private long id;
    private String name;
    private String email;
    private String password;
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
        return password;
    }
    public void setcategory(){
        this.password=password;
    }
    public LocalDateTime getcreatedAt(){
        return createdAt;
    }
}