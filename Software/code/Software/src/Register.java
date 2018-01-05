import java.util.Scanner;
import java.util.Vector;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Register
{
    /*Malhomsh lazma 3shan mfysh GUI
    public JTextField firstName;
    public JTextField lastName;
    public JRadioButton userType;*/

    public void register(String name, String password, String type){
        User user=new User(name,password,type);
        user.type=type;
        if(type.equals("Buyer")){
            Scanner userInput=new Scanner(System.in);
            System.out.println("enter visa card number: ");
            int cardNumber=userInput.nextInt();
            ((Buyer)user).visaCard=new Visa_Card(cardNumber);
        }
        DataBase.addUser(user);
    }

}