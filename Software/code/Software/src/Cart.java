import java.util.Vector;

public class Cart
{

    public Vector<String> cartProducts;

    public Cart(){
        cartProducts=new Vector<>(1);
    }

    public void addToCart(String productName)
    {
        cartProducts.add(productName);
    }
    public void removeFromCart(String productName){cartProducts.remove(productName);}
    public void showCartProducts(){
        for(int i=1;i<=cartProducts.size();i++){
            System.out.println(i+"-"+cartProducts.elementAt(i));
        }
    }

}