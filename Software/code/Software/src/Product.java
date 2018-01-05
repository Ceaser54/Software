import java.awt.Image;
import java.util.Vector;

public class Product
{
    public String name;
    public float price;
    public String brand;
    public Image image;
    public int      productBuyersNumber;
    public int      productViewersNumber;

    public Product(){
        name="";
        price=0;
        brand="";
        productBuyersNumber=0;
        productViewersNumber=0;
    }
    public Product(String _name,float _price, String _brand){
        name=_name;
        price=_price;
        brand=_brand;
        productBuyersNumber=0;
        productViewersNumber=0;
    }

    public void display(){
        System.out.println("Name : "+this.name);
        System.out.println("Price: "+this.price);
        System.out.println("Brand: "+this.brand);
        System.out.println("-----------------------------------------------------------");

    }

}