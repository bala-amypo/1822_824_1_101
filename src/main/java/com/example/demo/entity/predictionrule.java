package.com.example.demo.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
@Entity
public class predictionrule{
    private long id;
    private String ruleName;
    private int averageDaysWindow;
    private int maxDailyUsage;
    private String createdAt;

    public long getId(){
        return id;
    }
    public void setId(){
        this.id=id;
    }
    public String getruleName(){
        return ruleNameName;
    }
    public void setproductName(){
        this.ruleName=ruleName;
    }
    public int  getaverage(){
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