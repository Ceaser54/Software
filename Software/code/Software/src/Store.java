import java.util.Vector;

public class Store
{

    public String name;
    public String type;
    public static Integer storeID=0;
    public Vector<String> productsNames;
    public Vector<String>  brands;

    public Store(){
        name="";
        type="";
        storeID++;
        productsNames   =new Vector<>(1);
        brands          =new Vector<>(1);

    }
    public Store(String _name,String _type){
        name=_name;
        type=_type;
        storeID++;
        productsNames   =new Vector<>(1);
        brands          =new Vector<>(1);
    }

}