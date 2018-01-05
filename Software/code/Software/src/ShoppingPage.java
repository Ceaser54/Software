
public class ShoppingPage extends WelcomePage {


    /*Malhomsh lazma 3shan mfysh GUI
    public Button ButtonAddToCart;
    public Button buy;
    public Button search;
    public Button signOut;*/


    public void viewProduct(String productName)
    {
        DataBase.viewProduct(productName);
    }
    public void addToCart(String productName)
    {
        ((Buyer)currUser).userCart.addToCart(productName);
    }
    public void search(String productName){
        Product product=DataBase.searchProduct(productName);
        if(product!=null){
            product.display();
        }else{
            System.out.println("Product "+productName+" not found");
        }
    }
    public void showCart(){
        ((Buyer)currUser).userCart.showCartProducts();
    }
    public void showStoreProducts(String storeName){
        DataBase.showStoreProducts(storeName);
    }
    public void buyProduct(String productName,Payment paymentMethod){
        Payment.startPayment(productName,paymentMethod);
        ((Buyer)currUser).userCart.removeFromCart(productName);
    }
    public void signOut() {
        User user=null;
    }

}