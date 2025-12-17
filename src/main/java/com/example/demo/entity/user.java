package.com.example.demo.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
@Entity
public class user{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id;
    private String name;
    @column(unique=true)
    private String email;
    private String password;
    private LocalDateTime createdAt;


    public long getId(){
        return id;
    }
    public void setId(){
        this.id=id;
    }
    public String getname(){
        return name;
    }
    public void setname(){
        this.name=name;
    }
    public String getemail(){
        return email;
    }
    public void setemail(){
        this.email=email;
    }
    public String getpassword(){
        return password;
    }
    public void setcategory(){
        this.password=password;
    }
    public LocalDateTime getcreatedAt(){
        return createdAt;
    }
    public void setcreatedAt(){
        this.createdAt=createdAt;
    }

     public warehouse(long id,String name,String email,String password,LocalDateTime createdAt){
        this.id=id;
        this.name=name;
        this.email=email;
        this.location=location;
        this.createdAt=createdAt;
    }
    public empty(){
        
    }
}