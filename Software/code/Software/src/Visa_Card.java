import javax.xml.crypto.Data;

public class Visa_Card extends Payment
{
    public Visa_Card(){}
    public Visa_Card(int _cardNumber){
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