import java.util.Scanner;



public class StoreControl extends WelcomePage
{
    /*Malhomsh lazma 3shan mfysh GUI
    public Button addStore;
    public Button removeStore;
    public JTextField addSuggest;
    public Button addProduct;
    public Button removeProduct;*/

    public void addStore(String storeName, String storeType) {
        ((StoreOwner)currUser).stores.add(storeName);
        Store store=new Store(storeName , storeType);
        DataBase.addStore(store);
    }
    public void removeStore(String storeName) {
        DataBase.removeStore(storeName);
    }
    public void suggest(Product product) {
        DataBase.addToSuggestedProducts(product);
    }
    public void addProductToStore(Store store,Product product) {
        store.productsNames.add(product.name);
    }
    public void removeProductFromStore(Store store,String productName) {
        store.productsNames.remove(productName);
    }
    public void addBrandToStore(Store store,String brandName) {
        store.brands.add(brandName);
    }
    public void signOut() {
        currUser=null;
    }
    public void viewStores(){
        DataBase.viewStores(currUser);
    }
    public void getStoreStats() {
        viewStores();
        String storeName;
        Scanner userInput=new Scanner(System.in);
        storeName=userInput.nextLine();
        DataBase.getStoreStats(storeName);
    }
    public void removeBrandFromStore(Store store,String brandName) {
        store.brands.remove(brandName);
    }

}