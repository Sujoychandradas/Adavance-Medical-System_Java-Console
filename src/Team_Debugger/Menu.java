package Team_Debugger;

import java.util.Scanner;
import java.util.Calendar;
public  class Menu {
    Menu() {
        int n;
        // To implement month into Array
        String[] months = {

                "Jan",
                "Feb",
                "Mar",
                "Apr",

                "May",
                "Jun",
                "Jul",
                "Aug",

                "Sep",
                "Oct",
                "Nov",
                "Dec"
        };

        Calendar calendar = Calendar.getInstance();

        System.out.print("Date: " + months[calendar.get(Calendar.MONTH)] + " " + calendar.get(Calendar.DATE) + " " + calendar.get(Calendar.YEAR));//To get Date

        System.out.println("\t\t\t\t\t\tTime: " + calendar.get(Calendar.HOUR) + ":" + calendar.get(Calendar.MINUTE) + ":" + calendar.get(Calendar.SECOND));//To get Time
        
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Create an account : ");
        System.out.println("2. Doctors list");
        System.out.println("3. Doctors Ability");
        System.out.println("4. Medicine Service");
        System.out.println("5. Ambulance Service");
        System.out.println("6. Exit");

        do{

            n = sc.nextInt();
            switch (n)
            {
                case 1:
                {
                    CreateAccount createAccount = new CreateAccount();
                    break;
                }
                case 2:
                {
                    DoctorsList doctorsList = new DoctorsList();
                    break;
                }
                case 3:
                {
                    break;
                }
                case 4:
                {
                    Medicine medicine = new Medicine();
                    break;
                }
                case 5:
                {
                    AmbulanceService ambulanceService = new AmbulanceService();
                    break;
                }
                case 6:
                {
                    Exit exit = new Exit();
                    break;
                }
                default:
                    System.out.println("Invalid option!!. Please enter again");
            }
        } while (n !=6);
    }
}
