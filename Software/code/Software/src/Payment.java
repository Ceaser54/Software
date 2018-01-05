import java.util.Scanner;
import java.util.Vector;

public class Payment {

    public int cardNumber;

    Payment(){

    }
    Payment(int _cardNumber){
        cardNumber=_cardNumber;
    }

    public static void startPayment(String productName, Payment method){
        method.buy(productName);
    }
    public void buy(String productName){
        System.out.println("\n***Payment::Buy()***\n");
    }
}