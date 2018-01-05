import java.awt.Button;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;
import javax.swing.JTextField;

public class WelcomePage
{
    /*Malhomsh lazma 3shan mfysh GUI
    public JTextField name;
    public JTextField password;
    public Button login;
    public Button register;*/

    public User currUser;

    public void login(String userName, String userPassword){
        if(DataBase.validateUserPassword(userName,userPassword)){
            setCurrUser(DataBase.searchUser(userName));
        }else{
            System.out.println("\n***wrong password***\n");
        }
    }
    public void setCurrUser(User user)
    {
        currUser=user;
    }


}