package Team_Debugger;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Vector;
import java.util.*;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        // write your code here
        LoginDisplay lg = new LoginDisplay();
        Start start = new Start();

        Scanner input = new Scanner(System.in);

        Vector<String> name = new Vector<>();
        Vector<Integer> age = new Vector<>();
        Vector<String> gender = new Vector<>();
        Vector<String> username = new Vector<>();
        Vector<String> password = new Vector<>();
        Vector<String> phone1 = new Vector<>();

        username.add("Sujoy");
        username.add("Rishad");
        username.add("Amio");
        username.add("Mishu");
        username.add("Ayon");

        password.add("696969");
        password.add("646464");
        password.add("686868");
        password.add("666666");
        password.add("616161");


        name.add("Sujoy Chandra Das");
        name.add("Rishad Al Jubair");
        name.add("Amio Dey");
        name.add("Apurbo Dey Mishu");
        name.add("Ayon Biswas");

        age.add(22);
        age.add(23);
        age.add(22);
        age.add(21);
        age.add(22);

        gender.add("Male");
        gender.add("Male");
        gender.add("Male");
        gender.add("Male");
        gender.add("Male");

        phone1.add("741368836");
        phone1.add("798120755");
        phone1.add("744339125");
        phone1.add("704890393");
        phone1.add("712140810");



        //File
        DoctorList doctorList = new DoctorList();

        lg.welcomeScreen();

        int i = 0;

        while (i == 0) {
            lg.login();
            System.out.print("\t\t\t\t\t\t\t\t\t\t\t->\tEnter your chose (1-5): ");
            int user = 0;

            try {
                user = input.nextInt();
            } catch (Exception e) {
                System.out.println("\t\t\t\t\t\t\t\t\t\t\t->\tPlease enter number");
                break;

            }
            System.out.println("\n\t\t\t\t\t\t\t\t\t\t\t..........................................................................\n");

            if (user == 1)//Registration
            {
                System.out.println("\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t***************** REGISTRATION PAGE  ***********************");
                String s = input.nextLine();

                System.out.print("\n\t\t\t\t\t\t\t\t\t\t\t\t->\tUser name : ");
                String userName = input.nextLine();

                System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t->\tPassword (minimum 6 character) : ");
                String pass = input.nextLine();

                String name_temp = "";
                String pass_temp = "";

                int size = name.size();

                for (int j = 0; j < size; j++) {
                    if (userName.equals(name.get(j)) && userName.equals("admin")) {
                        System.out.println("\n\t\t\t\t\t\t\tPlease enter a new user name. This is used by other. You are not registered. \n");
                        name_temp = userName;
                    }
                }
                if (pass.length() < 6) {
                    System.out.println("\n\t\t\t\t\t\t\t\t\t\t\t\t\tYour password should have minimum six character.\n");

                    pass_temp = pass;
                } else if (name_temp.equals("") && pass_temp.equals("")) {

                    System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t->\tEnter Your Full Name : ");
                    String fullname = input.nextLine();

                    System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t->\tEnter Your AGE : ");
                    int ag = input.nextInt();

                    String x = input.nextLine();
                    System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t->\tEnter Your Gender : ");
                    String gen = input.nextLine();

                    System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t->\tEnter Your Phone Number : +880 1");
                    String phone = input.nextLine();

                    if (phone.length() == 9) {
                        if ((phone.charAt(0) == '0' || phone.charAt(0) == '1' || phone.charAt(0) == '2' || phone.charAt(0) == '3' || phone.charAt(0) == '4'
                                || phone.charAt(0) == '5' || phone.charAt(0) == '6' || phone.charAt(0) == '7' || phone.charAt(0) == '8' || phone.charAt(0) == '9') &&

                                (phone.charAt(1) == '0' || phone.charAt(1) == '1' || phone.charAt(1) == '2' || phone.charAt(1) == '3' || phone.charAt(1) == '4'
                                        || phone.charAt(1) == '5' || phone.charAt(1) == '6' || phone.charAt(1) == '7' || phone.charAt(1) == '8' || phone.charAt(1) == '9') &&

                                (phone.charAt(2) == '0' || phone.charAt(2) == '1' || phone.charAt(2) == '2' || phone.charAt(2) == '3' || phone.charAt(2) == '4'
                                        || phone.charAt(2) == '5' || phone.charAt(2) == '6' || phone.charAt(2) == '7' || phone.charAt(2) == '8' || phone.charAt(2) == '9') &&

                                (phone.charAt(3) == '0' || phone.charAt(3) == '1' || phone.charAt(3) == '2' || phone.charAt(3) == '3' || phone.charAt(3) == '4'
                                        || phone.charAt(3) == '5' || phone.charAt(3) == '6' || phone.charAt(3) == '7' || phone.charAt(3) == '8' || phone.charAt(3) == '9') &&

                                (phone.charAt(4) == '0' || phone.charAt(4) == '1' || phone.charAt(4) == '2' || phone.charAt(4) == '3' || phone.charAt(4) == '4'
                                        || phone.charAt(4) == '5' || phone.charAt(4) == '6' || phone.charAt(4) == '7' || phone.charAt(4) == '8' || phone.charAt(4) == '9') &&

                                (phone.charAt(5) == '0' || phone.charAt(5) == '1' || phone.charAt(5) == '2' || phone.charAt(5) == '3' || phone.charAt(5) == '4'
                                        || phone.charAt(5) == '5' || phone.charAt(5) == '6' || phone.charAt(5) == '7' || phone.charAt(5) == '8' || phone.charAt(5) == '9') &&

                                (phone.charAt(6) == '0' || phone.charAt(6) == '1' || phone.charAt(6) == '2' || phone.charAt(6) == '3' || phone.charAt(6) == '4'
                                        || phone.charAt(6) == '5' || phone.charAt(6) == '6' || phone.charAt(6) == '7' || phone.charAt(6) == '8' || phone.charAt(6) == '9') &&

                                (phone.charAt(7) == '0' || phone.charAt(7) == '1' || phone.charAt(7) == '2' || phone.charAt(7) == '3' || phone.charAt(7) == '4'
                                        || phone.charAt(7) == '5' || phone.charAt(7) == '6' || phone.charAt(7) == '7' || phone.charAt(7) == '8' || phone.charAt(7) == '9') &&

                                (phone.charAt(8) == '0' || phone.charAt(8) == '1' || phone.charAt(8) == '2' || phone.charAt(8) == '3' || phone.charAt(8) == '4'
                                        || phone.charAt(8) == '5' || phone.charAt(8) == '6' || phone.charAt(8) == '7' || phone.charAt(8) == '8' || phone.charAt(8) == '9')
                        ) {
                            String full_number = "01" + phone;
                            username.add(userName);
                            password.add(pass);
                            age.add(ag);
                            gender.add(gen);
                            phone1.add(phone);
                            name.add(fullname);
                            System.out.println("\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t~~~~ You are now registered ~~~~\n");

                        } else {
                            System.out.println("\n\t\t\t\t\t\t\t\t\t\t\t\t# Please entered a valid number.");
                            System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t->\tEnter Your Phone Number : +880 1");
                            phone = input.nextLine();
                        }
                    }
                    else {
                        System.out.println("\n\t\t\t\t\t\t\t\t\t\t\t\t# You entered a wrong number. You are not registered.");
                    }
                        name_temp = "";
                        pass_temp = "";
                }
            }//end user 1
            else if(user == 2)
            {
                String y = input.nextLine();
                System.out.println("\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t******************* LOGIN PAGE  *************************");
                System.out.print("\n\t\t\t\t\t\t\t\t\t\t\t\t->\tUser name: ");
                String name2 = input.nextLine();
                System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t->\tpassword: ");
                String pass2 = input.nextLine();

                String temp_name2 = "" ; String temp_pass2 = "";

                int size3 = name.size();
                for(int j = size3-1; j>=0; j--)
                {
                    if(name2.equals(username.get(j)) && pass2.equals(password.get(j)))
                    {
                        System.out.println("\n\t\t\t\t\t\t\t\t\t\t\t~~~~LOGIN SUCCESSFULLY!~~~~\n");
                        temp_name2 = name2;
                        temp_pass2 = pass2;

                        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\tYour Information-");
                        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t->\tYour User Name   :" + username.get(j));
                        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t->\tYour Full Name   :" + name.get(j));
                        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t->\tYour AGE         :" + age.get(j));
                        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t->\tYour Gender      :" + gender.get(j));
                        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t->\tYour Phone No    :01" + phone1.get(j));

                        for(int x = 0; x == 0; )
                        {
                            lg.serviceTry();// 1. Yes \n 2. No");
                            System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t\tEnter your choose (1-2):  ");
                            int service = input.nextInt();

                            if(service == 1)
                            {
                                lg.startDisplay();
                                System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t\tEnter your choose (1-5):  ");
                                int work = input.nextInt();

                                if(work == 1)
                                {
                                    doctorList.displayDoctor();

                                }

                            }
                        }
                    }
                }
            }
        }

    }
}
