import java.util.Vector;

public class StoreOwner extends User
{

    public Integer storesNumber;
    public Vector<String> stores;

    StoreOwner(){
        storesNumber=0;
        stores=new Vector(1);
    }

}