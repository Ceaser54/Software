

public class User
{
    public String name;
    public String password;
    public String type;

    User(){
        name="";
        password="";
        type="";
    }


    User(String name,String password,String type){
        this.name=name;
        this.password=password;
        this.type=type;
    }
    User(String name,String password){
        this.name=name;
        this.password=password;
    }



}