package Team_Debugger;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        System.out.println("\t\t\tWelcome Tor our Medical Service\n\n");
        System.out.print("Enter Your Username: ");
        String username = input.nextLine();

        System.out.print("Enter Your Password: ");
        String password = input.nextLine();

        //We will update later our Security System
//        if(username.equals("Team Debugger") && password.equals("Team"))
        {
            Menu menu = new Menu();
        }
    }
}
