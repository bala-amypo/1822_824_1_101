package.com.example.demo.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
@Entity
public class warehouse{
   @Id
   @GeneratedValue(strategy=GenerationType.IDENTITY)
   private long id;
   @Column(unique=true)
   private String warehouseName;
   @NotNull
   private String location; 
   private String createdAt;

   public long getId(){
        return id;
    }
    public void setId(){
        this.id=id;
    }
    public String getwarehouseName(){
        return warehouseName;
    }
    public void setwarehouseName(){
        this.warehouseName=warehouseName;
    }
    public String getlocation(){
        return location;
    }
    public void setlocation(){
        this.location=location;
    }
    public String getcreatedAt(){
        return createdAt;
    }
}