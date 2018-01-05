import java.util.Vector;

public  class DataBase
{
    public static String dataBaseName;
    public static Admin dataBaseAdmin;

    public static Vector<User>     systemUsers              =new Vector(1);
    public static Vector<Brand>    systemBrands             =new Vector(1);;
    public static Vector<Product>  systemProducts           =new Vector(1);;
    public static Vector<Product>  systemSuggestedProducts  =new Vector(1);;
    public static Vector<Store>    systemStores             =new Vector(1);;
    public static Vector<Payment>  systemUsersCards         =new Vector(1);;

    public static void              addProduct(Product product){
        systemProducts.add(product);
    }
    public static void              removeProduct(String productName) {
        Product tempProduct=searchProduct(productName);
        systemProducts.remove(tempProduct);
    }
    public static void              addStore(Store store) {
        systemStores.add(store);
    }
    public static void              removeStore(String storeName) {
        Store tempStore=searchStore(storeName);
        systemStores.remove(tempStore);
    }
    public static void              addBrand(Brand brand) {
        systemBrands.add(brand);
    }
    public static void              removeBrand(String brandName) {
        Brand tempBrand=new Brand();
        for (Brand _brand:systemBrands) {
            if(_brand.name.equals(brandName)){
                tempBrand=_brand;
                break;
            }
        }
        systemBrands.remove(tempBrand);
    }
    public static void              showStoreProducts(String storeName){
        Store tempStore=new Store();
        for (Store _store:systemStores) {
            if(_store.name.equals(storeName)){
                tempStore=_store;
                break;
            }
        }
        int i=1;
        for (String _productName:tempStore.productsNames) {
            System.out.println(i+"-"+_productName);
        }
    }
    public static void              addUser(User user) {
        systemUsers.add(user);
        if(user.type.equals("Buyer")){
            systemUsersCards.add(((Buyer)user).visaCard);
            systemUsersCards.add(((Buyer)user).voucherCard);
        }
    }
    public static void              addToSuggestedProducts(Product product) {
        systemSuggestedProducts.add(product);
    }
    public static void              getStoreStats(String storeName) {
        productsViewers(storeName);
        bestSellingProduct(storeName);
    }
    public static void              viewProduct(String productName) {
        Product tempProduct=searchProduct(productName);
        tempProduct.productViewersNumber++;
        tempProduct.display();
    }
    public static void              productsViewers(String storeName){
        Store tempStore=searchStore(storeName);
        for(String productName:tempStore.productsNames){
            Product tempProduct=searchProduct(productName);
            System.out.println("Product Name: "+tempProduct.name);
            System.out.println("Product Viewers: "+tempProduct.productViewersNumber);
        }
    }
    public static void              bestSellingProduct(String storeName){
        Store tempStore=searchStore(storeName);
        int bestSellingProduct=0;
        Product tempProduct=null;
        for(String productName:tempStore.productsNames){
            tempProduct=searchProduct(productName);
            if(tempProduct.productViewersNumber>bestSellingProduct){
                bestSellingProduct=tempProduct.productViewersNumber;
            }
        }
        if(tempProduct==null){
            System.out.println("No product is viewed");
        }else{
            System.out.println("Best Selling Product Name: "+tempProduct.name);
            System.out.println("Best Selling Product Viewers: "+tempProduct.productViewersNumber);
        }
    }
    public static void              viewStores(User user){
        int i=1;
        for (String storeName:((StoreOwner)user).stores) {
            Store tempStore=searchStore(storeName);
            System.out.println(i+"-"+"\nStore Name: "+tempStore.name);
            System.out.println("Store Type: "+tempStore.type);
            System.out.println("----------------------------------------------------------");
        }
    }
    public static boolean           validateCard(int cardNumber){

        for(Payment card:systemUsersCards){
            if(card.cardNumber==cardNumber){
                return true;
            }
        }
        return false;
    }
    public static boolean           validateUserPassword(String userName,String userPassword){
        return searchUser(userName).password.equals(userPassword);
    }
    public static Product           searchProduct(String productName){
        Product tempProduct=new Product();
        for (Product _product:systemProducts) {
            if(_product.name.equals(productName)){
                tempProduct=_product;
                break;
            }
        }
        return tempProduct;
    }
    public static User              searchUser(String userName) {

        User tempUser=new User();
        for (User _user:systemUsers) {
            if(_user.name.equals(userName)){
                tempUser=_user;
                return tempUser;
            }
        }
        return null;
    }
    public static Store             searchStore(String storeName){
        Store tempStore=new Store();
        for (Store _store:systemStores) {
            if(_store.name.equals(storeName)){
                tempStore=_store;
                break;
            }
        }
        return tempStore;
    }
    public static Vector<Product>   suggestedProducts() {

        return systemSuggestedProducts;
    }


}