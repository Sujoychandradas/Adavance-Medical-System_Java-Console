package Team_Debugger;

public class LoginDisplay {
    void login()
    {
        System.out.println("\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t************ HOME *************");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t*\t1. Sign up");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t*\t2. Log in");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t*\t4. All information of our service ");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t*\t5. Exit");
        System.out.println("\n\n");
    }

    void startDisplay()
    {


        System.out.println("\n\t\t\t\t\t\t\t\t\t\t\t..........................................................................\n");
        System.out.println("\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t************ Welcome to Our Services *************");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t*\t1. Doctors List");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t*\t2. Doctors Ability");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t*\t3. Medicine Service");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t*\t4. Ambulance Service");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t*\t5. Exit");
    }

    void welcomeScreen()
    {
        System.out.println("\n\n\n");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t *******************************************************************************\n");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t *                                                                             *\n");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t *                         Advanced Medical Service System                     *\n");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t *                                                                             *\n");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t *******************************************************************************\n");
    }
    void serviceTry()
    {
        System.out.println("\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t************ ####Explore our Services? *************\n");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t1. YES");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t2. NO");
    }

    void abouSERvice(){
        System.out.println("All information of our service\n" +
                "\n" +
                "Advanced Java Medical System console project is a group effort to make medical service accessible to all.This project represents a review on the console program “Advanced Medical Service System” as should be used in a Medical Service System.\n" +
                "People on the team that helped develop this system:-\n" +
                "\n" +
                "1.Sujoy chandra das\n" +
                "2.Rishad Al jubair talukar\n" +
                "3.Amio Das\n" +
                "4.Ayon Biswas\n" +
                "5.Apurbo Dey Mishu\n" +
                "\n" +
                "In this application we implemented many features like login, log out, seeing doctor list,dcotor colsultancy,online medical store, emergancy ambulance service.\n" +
                "The user can login in the program, then user is presented with some options in the menu like Doctor-list, seek medicine consumption consultancy and some must have medicines to keep.\n" +
                "User can see Doctor-list and their availability and also their field of specialization and user also can book ambulance in emergancey preiod.\n" +
                "In case of urgent hospitalization user can select which hospital to get admitted, user can select his/her location. \n" +
                "User can also select between AC, Non AC ambulance other type of ambulance sevices.\n" +
                "User has Payment getway option but this time only bkash,rocket and nagad only.\n" +
                "We hope to include more payment options to the user like DBBL,Nagad.We also had no option outside Sylhet, we hope to open our services in every district of Bangladesh.");
    }
}
