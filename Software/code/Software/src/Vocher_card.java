public class Vocher_card extends Payment
{
    float voucherCardCredit;

    public Vocher_card(){}
    public Vocher_card(int _cardNumber){
        super(_cardNumber);
    }

    public void buy(String productName){
        DataBase.validateCard(cardNumber);
        Product product=DataBase.searchProduct(productName);
        product.productBuyersNumber++;
        System.out.println("you had purchased this item: ");
        product.display();
    }


}