public class On_Order extends Payment
{
    public String address;

    public void buy(String productName){

        System.out.println("you had purchased this item: ");
        Product product=DataBase.searchProduct(productName);
        product.productBuyersNumber++;
        product.display();
        System.out.println("\n**Order will be shipped within 3 working days**\n");
    }
}