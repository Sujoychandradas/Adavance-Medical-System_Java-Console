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


        Vector<String> medicine = new Vector<>();
        Vector<String> cardiologist = new Vector<>();
        Vector<String> gynecologist = new Vector<>();
        Vector<String> orthopedic = new Vector<>();
        Vector<String> neurologist = new Vector<>();

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


        //Doctor name storing on vector
        medicine.add("Dr.Murad");
        medicine.add("Dr.Fariha");
        medicine.add("Dr.Rotan");
        medicine.add("Dr.Kashfi");
        medicine.add("Dr.Anika");

        cardiologist.add("Dr.Sohel");
        cardiologist.add("Dr.Resham");
        cardiologist.add("Dr.Ravi");

        gynecologist.add("Dr.Marufa");
        gynecologist.add("Dr.Shopna");
        gynecologist.add("Dr.Roshni");
        gynecologist.add("Dr.Nilima");
        gynecologist.add("Dr.Oyshee");
        gynecologist.add("Dr.Liza");

        orthopedic.add("Dr.Halima");
        orthopedic.add("Dr.Asif");
        orthopedic.add("Dr.Rahi");

        neurologist.add("Dr.Shakkor");
        neurologist.add("Dr.Protiva");
        neurologist.add("Dr.Taneam");
        neurologist.add("Dr.Kashem");
        neurologist.add("Dr.Afroja");

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

                                if (work == 1)
                                {
                                    doctorList.displayDoctor();
                                }
                                else if(work == 2)
                                {
                                    System.out.println("\n\t\t\t\t\t\t\t\t\t\t\t\t*\tWhat kind of doctor do you want?");
                                    System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t \t1.Medicine");
                                    System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t \t2.Cardiologist");
                                    System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t \t3.Gynecologist");
                                    System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t \t4.Orthopedic");
                                    System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t \t5.Neurologist");
                                    System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t \tEnter your choice(1-5): ");

                                    int doctype;
                                    doctype = input.nextInt();
                                    if (doctype == 1)
                                    {
                                        System.out.println("\n\t\t\t\t\t\t\t\t\t\t\t\t \tList of Medicine specialist doctors:");
                                        System.out.println("\n\t\t\t\t\t\t\t\t\t\t\t\t \tNo.\tName\tAge \tGender\tPhone number\tTime \t\tCity\t\tDays\n" +
                                                "\t\t\t\t\t\t\t\t\t\t\t\t \t1.\tMurad\t27\t\tMale\t017123456749\t12am – 4pm\tHabiganj\tSun – Fri\n" +
                                                "\t\t\t\t\t\t\t\t\t\t\t\t \t2.\tFariha\t33\t\tFemale\t018123456729\t7pm – 12pm\tDhaka\t\tMon-Tue\n" +
                                                "\t\t\t\t\t\t\t\t\t\t\t\t \t3.\tRotan\t61\t\ttMale\t019987654123\t12am – 4pm\tSylhet\t\tThu – Fri\n" +
                                                "\t\t\t\t\t\t\t\t\t\t\t\t \t4.\tKashfi\t26\t\tFemale\t017748596123\t10am – 1pm\tSylhet\t\tMon-Tue\n" +
                                                "\t\t\t\t\t\t\t\t\t\t\t\t \t5.\tAnika \t39\t\tFemale\t013965847321\t2pm – 6 pm\tDhaka\t\tSun – Fri");

                                        System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t \tEnter your choice(1-5): ");

                                        int med = input.nextInt();

                                        if(med == 1)
                                        {
                                            System.out.print("\n\t\t\t\t\t\t\t\t\t\t\t\t \tYou have Selected : "+ medicine.get(0));

                                            lg.confirm();

                                            int murad = input.nextInt();
                                            if(murad == 1)
                                            {
                                                System.out.println("Confirm Payment: ");


                                            }
                                            else {
                                                break;
                                            }
                                        }
                                        else if(med == 2)
                                        {
                                            System.out.print("\n\t\t\t\t\t\t\t\t\t\t\t\t \tYou have Selected : "+ medicine.get(0));

                                            lg.confirm();

                                            int fariha = input.nextInt();
                                            if(fariha == 1)
                                            {
                                                System.out.println("Confirm Payment: ");


                                            }
                                            else {
                                                break;
                                            }
                                        }

                                        else if(med == 3)
                                        {
                                            System.out.print("\n\t\t\t\t\t\t\t\t\t\t\t\t \tYou have Selected : "+ medicine.get(0));

                                            lg.confirm();

                                            int rotan = input.nextInt();
                                            if(rotan == 1)
                                            {
                                                System.out.println("Confirm Payment: ");


                                            }
                                            else {
                                                break;
                                            }
                                        }
                                        else if(med == 4)
                                        {
                                            System.out.print("\n\t\t\t\t\t\t\t\t\t\t\t\t \tYou have Selected : "+ medicine.get(0));

                                            lg.confirm();

                                            int kashfi = input.nextInt();
                                            if(kashfi == 1)
                                            {
                                                System.out.println("Confirm Payment: ");


                                            }
                                            else {
                                                break;
                                            }
                                        }
                                        else if(med == 5)
                                        {
                                            System.out.print("\n\t\t\t\t\t\t\t\t\t\t\t\t \tYou have Selected : "+ medicine.get(0));

                                            lg.confirm();

                                            int anika = input.nextInt();
                                            if(anika == 1)
                                            {
                                                System.out.println("Confirm Payment: ");


                                            }
                                            else {
                                                break;
                                            }
                                        }else
                                        {
                                            break;
                                        }
                                    }
                                    else if (doctype == 2)
                                    {
                                        System.out.println("\n\t\t\t\t\t\t\t\t\t\t\t\t \tList of Cardiology specialist doctors:");
                                        System.out.println("\n\t\t\t\t\t\t\t\t\t\t\t\t \tNo.\tName\tAge \tGender\tPhone number\tTime \t\tCity\t\tDays\n" +
                                                "\t\t\t\t\t\t\t\t\t\t\t\t \t1.\tSohel\t32\t\tMale\t017123456789\t12am – 4pm\tSylhet\t\tSun – Fri\n" +
                                                "\t\t\t\t\t\t\t\t\t\t\t\t \t2.\tReshama\t29\t\tFemale\t018123456789\t7pm – 12pm\tDhaka\t\tMon-Wed\n" +
                                                "\t\t\t\t\t\t\t\t\t\t\t\t \t3.\tRavi\t56\t\tMale\t019987654123\t12am – 4pm\tSylhet\t\tSun – Fri");


                                        System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t \tEnter your choice(1-5): ");

                                        int car = input.nextInt();

                                        if(car == 1)
                                        {
                                            System.out.print("\n\t\t\t\t\t\t\t\t\t\t\t\t \tYou have Selected : "+ medicine.get(0));

                                            lg.confirm();

                                            int sohel = input.nextInt();
                                            if(sohel == 1)
                                            {
                                                System.out.println("Confirm Payment: ");


                                            }
                                            else {
                                                break;
                                            }
                                        }
                                        else if(car == 2)
                                        {
                                            System.out.print("\n\t\t\t\t\t\t\t\t\t\t\t\t \tYou have Selected : "+ medicine.get(0));

                                            lg.confirm();

                                            int resham = input.nextInt();
                                            if(resham == 1)
                                            {
                                                System.out.println("Confirm Payment: ");


                                            }
                                            else {
                                                break;
                                            }
                                        }

                                        else if(car == 3)
                                        {
                                            System.out.print("\n\t\t\t\t\t\t\t\t\t\t\t\t \tYou have Selected : "+ medicine.get(0));

                                            lg.confirm();

                                            int ravi = input.nextInt();
                                            if(ravi == 1)
                                            {
                                                System.out.println("Confirm Payment: ");


                                            }
                                            else {
                                                break;
                                            }
                                        }
                                        else {
                                            break;
                                        }
                                    }
                                    else if (doctype == 3)
                                    {
                                        System.out.println("\n\t\t\t\t\t\t\t\t\t\t\t\t \tList of Gynecology specialist doctors:");
                                        System.out.println("\n\t\t\t\t\t\t\t\t\t\t\t\t \tNo.\tName\tAge \tGender\tPhone number\tTime \t\tCity\t\tDays\n" +
                                                "\t\t\t\t\t\t\t\t\t\t\t\t \t1.\tMarufa\t27\t\tFemale\t017123456749\t12am – 4pm\tHabiganj\tSun – Fri\n" +
                                                "\t\t\t\t\t\t\t\t\t\t\t\t \t2.\tShopna\t33\t\tFemale\t018123456729\t7pm – 12pm\tDhaka\t\tMon-Tue\n" +
                                                "\t\t\t\t\t\t\t\t\t\t\t\t \t3.\tRoshni\t61\t\tFemale\t019987654123\t12am – 4pm\tSylhet\t\tThu – Fri\n" +
                                                "\t\t\t\t\t\t\t\t\t\t\t\t \t4.\tNilima\t26\t\tFemale\t017748596123\t10am – 1pm\tSylhet\t\tMon-Tue\n" +
                                                "\t\t\t\t\t\t\t\t\t\t\t\t \t5.\tLiza\t36\t\tFemale\t017369852147\t7pm – 12pm\tDhaka\t\tMon-Wed");

                                        System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t \tEnter your choice(1-5): ");

                                        int gyno = input.nextInt();

                                        if(gyno == 1)
                                        {
                                            System.out.print("\n\t\t\t\t\t\t\t\t\t\t\t\t \tYou have Selected : "+ medicine.get(0));

                                            lg.confirm();

                                            int murad = input.nextInt();
                                            if(murad == 1)
                                            {
                                                System.out.println("Confirm Payment: ");


                                            }
                                            else {
                                                break;
                                            }
                                        }
                                        else if(gyno == 2)
                                        {
                                            System.out.print("\n\t\t\t\t\t\t\t\t\t\t\t\t \tYou have Selected : "+ medicine.get(0));

                                            lg.confirm();

                                            int fariha = input.nextInt();
                                            if(fariha == 1)
                                            {
                                                System.out.println("Confirm Payment: ");

                                            }
                                            else {
                                                break;
                                            }
                                        }

                                        else if(gyno == 3)
                                        {
                                            System.out.print("\n\t\t\t\t\t\t\t\t\t\t\t\t \tYou have Selected : "+ medicine.get(0));

                                            lg.confirm();

                                            int rotan = input.nextInt();
                                            if(rotan == 1)
                                            {
                                                System.out.println("Confirm Payment: ");


                                            }
                                            else {
                                                break;
                                            }
                                        }
                                        else {
                                            break;
                                        }
                                    }
                                    else if (doctype == 4)
                                    {
                                        System.out.println("\n\t\t\t\t\t\t\t\t\t\t\t\t \tList of Orthopedic specialist doctors:");
                                        System.out.println("\n\t\t\t\t\t\t\t\t\t\t\t\t \tNo.\tName\tAge \tGender\tPhone number\tTime \t\tCity\t\tDays\n" +
                                                "\t\t\t\t\t\t\t\t\t\t\t\t \t1.\tHalima\t32\t\tFemale\t017123456789\t12am – 4pm\tSylhet\t\tSun – Fri\n" +
                                                "\t\t\t\t\t\t\t\t\t\t\t\t \t2.\tAsif\t40\t\tMale\t018123456789\t7pm – 12pm\tDhaka\t\tMon-Wed\n" +
                                                "\t\t\t\t\t\t\t\t\t\t\t\t \t3.\tRahi\t28\t\tMale\t019987654123\t12am – 4pm\tSylhet\t\tSun – Fri");


                                        System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t \tEnter your choice(1-5): ");

                                        int ortho = input.nextInt();

                                        if(ortho == 1)
                                        {
                                            System.out.print("\n\t\t\t\t\t\t\t\t\t\t\t\t \tYou have Selected : "+ medicine.get(0));

                                            lg.confirm();

                                            int halima = input.nextInt();
                                            if(halima == 1)
                                            {
                                                System.out.println("Confirm Payment: ");


                                            }
                                            else {
                                                break;
                                            }
                                        }
                                        else if(ortho == 2)
                                        {
                                            System.out.print("\n\t\t\t\t\t\t\t\t\t\t\t\t \tYou have Selected : "+ medicine.get(0));

                                            lg.confirm();

                                            int asif = input.nextInt();
                                            if(asif == 1)
                                            {
                                                System.out.println("Confirm Payment: ");

                                            }
                                            else {
                                                break;
                                            }
                                        }

                                        else if(ortho == 3)
                                        {
                                            System.out.print("\n\t\t\t\t\t\t\t\t\t\t\t\t \tYou have Selected : "+ medicine.get(0));

                                            lg.confirm();

                                            int rahi = input.nextInt();
                                            if(rahi == 1)
                                            {
                                                System.out.println("Confirm Payment: ");


                                            }
                                            else {
                                                break;
                                            }
                                        }
                                        else {
                                            break;
                                        }
                                    }
                                    else if (doctype == 5)
                                    {
                                        System.out.println("\n\t\t\t\t\t\t\t\t\t\t\t\t \tList of Neurology specialist doctors:");
                                        System.out.println("\n\t\t\t\t\t\t\t\t\t\t\t\t \tNo.\tName\tAge \tGender\tPhone number\tTime \t\tCity\t\tDays\n" +
                                                "\t\t\t\t\t\t\t\t\t\t\t\t \t1.\tShakkor\t27\t\tMale\t017123456749\t12am – 4pm\tHabiganj\tSun – Fri\n" +
                                                "\t\t\t\t\t\t\t\t\t\t\t\t \t2.\tProtiva\t33\t\tFemale\t018123456729\t7pm – 12pm\tDhaka\t\tMon-Tue\n" +
                                                "\t\t\t\t\t\t\t\t\t\t\t\t \t3.\tTanim\t61\t\ttMale\t019987654123\t12am – 4pm\tSylhet\t\tThu – Fri\n" +
                                                "\t\t\t\t\t\t\t\t\t\t\t\t \t4.\tBristy\t26\t\tFemale\t017748596123\t10am – 1pm\tSylhet\t\tMon-Tue\n" +
                                                "\t\t\t\t\t\t\t\t\t\t\t\t \t5.\tAfrija \t39\t\tFemale\t013965847321\t2pm – 6 pm\tDhaka\t\tSun – Fri");

                                        System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t \tEnter your choice(1-5): ");

                                        int nuro = input.nextInt();

                                        if(nuro == 1)
                                        {
                                            System.out.print("\n\t\t\t\t\t\t\t\t\t\t\t\t \tYou have Selected : "+ medicine.get(0));

                                            lg.confirm();

                                            int sohel = input.nextInt();
                                            if(sohel == 1)
                                            {
                                                System.out.println("Confirm Payment: ");


                                            }
                                            else {
                                                break;
                                            }
                                        }
                                        else if(nuro == 2)
                                        {
                                            System.out.print("\n\t\t\t\t\t\t\t\t\t\t\t\t \tYou have Selected : "+ medicine.get(0));

                                            lg.confirm();

                                            int resham = input.nextInt();
                                            if(resham == 1)
                                            {
                                                System.out.println("Confirm Payment: ");


                                            }
                                            else {
                                                break;
                                            }
                                        }

                                        else if(nuro == 3)
                                        {
                                            System.out.print("\n\t\t\t\t\t\t\t\t\t\t\t\t \tYou have Selected : "+ medicine.get(0));

                                            lg.confirm();

                                            int ravi = input.nextInt();
                                            if(ravi == 1)
                                            {
                                                System.out.println("Confirm Payment: ");


                                            }
                                            else {
                                                break;
                                            }
                                        }
                                        else {
                                            break;
                                        }


                                    }
                                    else
                                    {
                                        break;
                                    }

                                }


                            }
                        }
                    }
                }
            }
        }

    }
}
