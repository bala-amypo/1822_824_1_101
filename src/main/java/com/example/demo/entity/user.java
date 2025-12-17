package.com.example.demo.entity;

@Entity
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
}