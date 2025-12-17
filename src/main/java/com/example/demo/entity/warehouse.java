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
   private LocalDateTime createdAt;

   public long getId(){
        return id;
    }
    public void setId(long id){
        this.id=id;
    }
    public String getwarehouseName(){
        return warehouseName;
    }
    public void setwarehouseName(String warehouseName){
        this.warehouseName=warehouseName;
    }
    public String getlocation(){
        return location;
    }
    public void setlocation(String location){
        this.location=location;
    }
    public LocalDateTime getcreatedAt(){
        return createdAt;
    }
    public void setcreatedAt(LocalDateTime createdAt){
        this.createdAt=createdAt;
    }

    public warehouse(long id,String warehouseName,String location,LocalDateTime createdAt){
        this.id=id;
        this.warehouseName=warehouseName;
        this.location=location;
        this.createdAt=createdAt;
    }
    public warehouse(){

    }
}