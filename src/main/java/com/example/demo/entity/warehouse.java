package.com.example.demo.entity;
public class warehouse{
   private long id;
   private String warehouseName;
   private String location; 
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
}