package.com.example.demo.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import 
@Entity
public class predictionrule{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id;
    @Column(unique=true)
    private String ruleName;
    private int averageDaysWindow;
    private int maxDailyUsage;
    private LocalDateTime createdAt;

    public long getId(){
        return id;
    }
    public void setId(){
        this.id=id;
    }
    public String getruleName(){
        return ruleNameName;
    }
    public void setruleName(){
        this.ruleName=ruleName;
    }
    public int  getaverageDaysWindows(){
        return averageDaysWindow;
    }
    public void setaverageDaysWindow(){
        this.averageDaysWindow=averageDaysWindow;
    }
    public String getmaxDailyUsage(){
        return maxDailyUsage;
    }
    public void setmaxDailyUsage(){
        this.maxDailyUsage=maxDailyUsage;
    }
    public LocalDateTime getcreatedAt(){
        return createdAt;
    }
    public void setcreatedAt(){
        this.createdAt=createdAt;
    }
}