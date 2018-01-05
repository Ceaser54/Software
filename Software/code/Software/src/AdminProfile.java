import java.util.Scanner;
import java.util.Vector;

public class AdminProfile extends WelcomePage
{
    /*Malhomsh lazma 3shan mfysh GUI
    public Button addProduct;
    public Button removeProduct;
    public Button addBrand;
    public Button removeBrand;
    public Button updateProduct;
    public Button seeSuggests;*/

    public void addProductToDB(Product product) {
        DataBase.addProduct(product);
    }
    public void removeProductFromDB(String productName) {
        DataBase.removeProduct(productName);
    }
    public void addBrand(Brand brand) {
        DataBase.addBrand(brand);
    }
    public void removeBrand(String brandName) {
        DataBase.removeBrand(brandName);
    }
    public void seeSuggests(){
        Vector<Product> suggestedProducts=DataBase.suggestedProducts();
        for(Product p: suggestedProducts){
            p.display();
        }
    }
    public void updateProduct(String productName) {
        Scanner in=new Scanner(System.in);
        Product p=DataBase.searchProduct(productName);
        System.out.print("Enter new Price: ");
        p.price=in.nextFloat();
        System.out.print("Enter new Brand: ");
        p.brand=in.nextLine();

        DataBase.removeProduct(productName);
        DataBase.addProduct(p);
    }
    public void provideVoucherCard(){}
    public void signOut()
    {
        currUser=null;
    }

}