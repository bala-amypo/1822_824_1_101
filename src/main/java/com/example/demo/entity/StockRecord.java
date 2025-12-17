
package.com.example.demo.entity;
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
    public void set(){
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