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