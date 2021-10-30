package Team_Debugger;
import java.util.Scanner;
import java.util.Vector;

public class Ambulance {
    void ambulanceService() {
        Scanner input=new Scanner(System.in);

        System.out.println("\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t************ Welcome to our Ambulance Service *************");

        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t \tWhich Hospital You Want Yourself OR Your Patients To Get Admitted In?\n");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t->\t1.OSMANI MEDICAL");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t->\t2.NOORJAHAN");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t->\t3.POPULAR");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t->\t4.Sylhet Women’s Medical College Hospital.");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t->\t5.Medinova Medical Services Ltd.");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t->\t6.United Hospital Ltd.");

        System.out.println();
        System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t \tEnter your choice(1-6): ");
        int n;
        n=input.nextInt();


        Vector<Integer> tk = new Vector<>();

        //For Sylhet
        tk.add(1200);
        tk.add(700);
        tk.add(2000);
        tk.add(3000);


        //Habigonj
        tk.add(2000);
        tk.add(3000);
        tk.add(4000);
        tk.add(7000);


        //Moulovibazar
        tk.add(1500);
        tk.add(2500);
        tk.add(4000);
        tk.add(5000);


        //Sunamganj
        tk.add(1500);
        tk.add(2000);
        tk.add(5000);
        tk.add(6000);


        if(n==1)
        {

            System.out.print("\n\t\t\t\t\t\t\t\t\t\t\t\t \tWhat is your location: ");
            System.out.println("\n\t\t\t\t\t\t\t\t\t\t\t\t \t1.Sylhet");
            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t \t2.Habigonj");
            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t \t3.Moulovibazar");
            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t \t4.Sunamganj");


            System.out.print("\n\t\t\t\t\t\t\t\t\t\t\t\t \tEnter your choice(1-4): ");
            n=input.nextInt();

            if(n == 1)
            {
                System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t \t1.AC");
                System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t \t2.Non-AC");
                System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t \t3.Freezing-Ambulance");
                System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t \t4.ICU");

                System.out.print("\n\t\t\t\t\t\t\t\t\t\t\t\t \tEnter your choice(1-4): ");
                int sylhet = input.nextInt();

                if(sylhet == 1)
                {
                    System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t \tYour Total Bill is " + tk.get(0) + "tk");

                    System.out.println("\n\t\t\t\t\t\t\t\t\t\t\t\t\tConfirm Your Payment....\n");
                    System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t1. YES");
                    System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t2. NO");
                    System.out.print("\n\t\t\t\t\t\t\t\t\t\t\t\t \tEnter your choice(1/2): ");


                    sylhet = input.nextInt();

                    if(sylhet == 1)
                    {
                        Payment  payment = new Payment(2);
                    }
                    else {
                        return;
                    }
                }
                else if(sylhet == 2)
                {
                    System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t \tYour Total Bill is " + tk.get(1) + "tk");

                    System.out.println("\n\t\t\t\t\t\t\t\t\t\t\t\t\tConfirm Your Payment....\n");
                    System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t1. YES");
                    System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t2. NO");
                    System.out.print("\n\t\t\t\t\t\t\t\t\t\t\t\t\tEnter your choice(1/2): ");

                    sylhet = input.nextInt();

                    if(sylhet == 1)
                    {
                        Payment  payment = new Payment(2);
                    }
                    else {
                        return;
                    }
                }
                else if(sylhet == 3)
                {
                    System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t \tYour Total Bill is " + tk.get(2) + "tk");

                    System.out.println("\n\t\t\t\t\t\t\t\t\t\t\t\t\tConfirm Your Payment....\n");
                    System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t1. YES");
                    System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t2. NO");
                    System.out.print("\n\t\t\t\t\t\t\t\t\t\t\t\t\tEnter your choice(1/2): ");

                    sylhet = input.nextInt();

                    if(sylhet == 1)
                    {
                        Payment  payment = new Payment(2);
                    }
                    else {
                        return;
                    }
                }
                else if(sylhet == 4)
                {
                    System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t \tYour Total Bill is " + tk.get(3) + "tk");

                    System.out.println("\n\t\t\t\t\t\t\t\t\t\t\t\t\tConfirm Your Payment....\n");
                    System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t1. YES");
                    System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t2. NO");
                    System.out.print("\n\t\t\t\t\t\t\t\t\t\t\t\t\tEnter your choice(1/2): ");

                    sylhet = input.nextInt();

                    if(sylhet == 1)
                    {
                        Payment  payment = new Payment(2);
                    }
                    else {
                        return;
                    }
                }


            }
            else if(n==2)
            {
                System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t \t1.AC");
                System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t \t2.Non-AC");
                System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t \t3.Freezing-Ambulance");
                System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t \t4.ICU");
                System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t \tEnter your choice(1-4): ");
                int sylhet = input.nextInt();

                if(sylhet == 1)
                {
                    System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t \tYour Total Bill is " + tk.get(4) + "tk");

                    System.out.println("\n\t\t\t\t\t\t\t\t\t\t\t\t\tConfirm Your Payment....\n");
                    System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t1. YES");
                    System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t2. NO");
                    System.out.print("\n\t\t\t\t\t\t\t\t\t\t\t\t\tEnter your choice(1/2): ");

                    sylhet = input.nextInt();

                    if(sylhet == 1)
                    {
                        Payment  payment = new Payment(2);
                    }
                    else {
                        return;
                    }
                }
                else if(sylhet == 2)
                {
                    System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t \tYour Total Bill is " + tk.get(5) + "tk");

                    System.out.println("\n\t\t\t\t\t\t\t\t\t\t\t\t\tConfirm Your Payment....\n");
                    System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t1. YES");
                    System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t2. NO");
                    System.out.print("\n\t\t\t\t\t\t\t\t\t\t\t\t\tEnter your choice(1/2): ");

                    sylhet = input.nextInt();

                    if(sylhet == 1)
                    {
                        Payment  payment = new Payment(2);
                    }
                    else {
                        return;
                    }
                }
                else if(sylhet == 3)
                {
                    System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t \tYour Total Bill is " + tk.get(6) + "tk");

                    System.out.println("\n\t\t\t\t\t\t\t\t\t\t\t\t\tConfirm Your Payment....\n");
                    System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t1. YES");
                    System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t2. NO");
                    System.out.print("\n\t\t\t\t\t\t\t\t\t\t\t\t\tEnter your choice(1/2): ");

                    sylhet = input.nextInt();

                    if(sylhet == 1)
                    {
                        Payment  payment = new Payment(2);
                    }
                    else {
                        return;
                    }
                }
                else if(sylhet == 4)
                {
                    System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t \tYour Total Bill is " + tk.get(7) + "tk");

                    System.out.println("\n\t\t\t\t\t\t\t\t\t\t\t\t\tConfirm Your Payment....\n");
                    System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t1. YES");
                    System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t2. NO");
                    System.out.print("\n\t\t\t\t\t\t\t\t\t\t\t\t\tEnter your choice(1/2): ");

                    sylhet = input.nextInt();

                    if(sylhet == 1)
                    {
                        Payment  payment = new Payment(2);
                    }
                    else {
                        return;
                    }
                }

            }
            else if(n==3)
            {

                System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t \t1.AC");
                System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t \t2.Non-AC");
                System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t \t3.Freezing-Ambulance");
                System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t \t4.ICU");

                System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t \tEnter your choice(1-4): ");
                int sylhet = input.nextInt();

                if(sylhet == 1)
                {
                    System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t \tYour Total Bill is " + tk.get(8) + "tk");

                    System.out.println("\n\t\t\t\t\t\t\t\t\t\t\t\t\tConfirm Your Payment....\n");
                    System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t1. YES");
                    System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t2. NO");
                    System.out.print("\n\t\t\t\t\t\t\t\t\t\t\t\t\tEnter your choice(1/2): ");


                    sylhet = input.nextInt();

                    if(sylhet == 1)
                    {
                        Payment  payment = new Payment(2);
                    }
                    else {
                        return;
                    }
                }
                else if(sylhet == 2)
                {
                    System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t \tYour Total Bill is " + tk.get(9) + "tk");

                    System.out.println("\n\t\t\t\t\t\t\t\t\t\t\t\t\tConfirm Your Payment....\n");
                    System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t1. YES");
                    System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t2. NO");
                    System.out.print("\n\t\t\t\t\t\t\t\t\t\t\t\t\tEnter your choice(1/2): ");


                    sylhet = input.nextInt();

                    if(sylhet == 1)
                    {
                        Payment  payment = new Payment(2);
                    }
                    else {
                        return;
                    }
                }
                else if(sylhet == 3)
                {
                    System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t \tYour Total Bill is " + tk.get(10) + "tk");

                    System.out.println("\n\t\t\t\t\t\t\t\t\t\t\t\t\tConfirm Your Payment....\n");
                    System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t1. YES");
                    System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t2. NO");
                    System.out.print("\n\t\t\t\t\t\t\t\t\t\t\t\t\tEnter your choice(1/2): ");


                    sylhet = input.nextInt();

                    if(sylhet == 1)
                    {
                        Payment  payment = new Payment(2);
                    }
                    else {
                        return;
                    }
                }
                else if(sylhet == 4)
                {
                    System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t \tYour Total Bill is " + tk.get(11) + "tk");

                    System.out.println("\n\t\t\t\t\t\t\t\t\t\t\t\t\tConfirm Your Payment....\n");
                    System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t1. YES");
                    System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t2. NO");
                    System.out.print("\n\t\t\t\t\t\t\t\t\t\t\t\t\tEnter your choice(1/2): ");


                    sylhet = input.nextInt();

                    if(sylhet == 1)
                    {
                        Payment  payment = new Payment(2);
                    }
                    else {
                        return;
                    }
                }


            }
            else if(n==4)
            {
                System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t \t1.AC");
                System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t \t2.Non-AC");
                System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t \t3.Freezing-Ambulance");
                System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t \t4.ICU");
                Payment payment4 = new Payment(2);
                System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t \tEnter your choice(1-4): ");
                int sylhet = input.nextInt();

                if(sylhet == 1)
                {
                    System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t \tYour Total Bill is " + tk.get(12) + "tk");

                    System.out.println("\n\t\t\t\t\t\t\t\t\t\t\t\t\tConfirm Your Payment....\n");
                    System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t1. YES");
                    System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t2. NO");
                    System.out.print("\n\t\t\t\t\t\t\t\t\t\t\t\t\tEnter your choice(1/2): ");


                    sylhet = input.nextInt();

                    if(sylhet == 1)
                    {
                        Payment  payment = new Payment(2);
                    }
                    else {
                        return;
                    }
                }
                else if(sylhet == 2)
                {
                    System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t \tYour Total Bill is " + tk.get(13) + "tk");

                    System.out.println("\n\t\t\t\t\t\t\t\t\t\t\t\t\tConfirm Your Payment....\n");
                    System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t1. YES");
                    System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t2. NO");
                    System.out.print("\n\t\t\t\t\t\t\t\t\t\t\t\t\tEnter your choice(1/2): ");


                    sylhet = input.nextInt();

                    if(sylhet == 1)
                    {
                        Payment  payment = new Payment(2);
                    }
                    else {
                        return;
                    }
                }
                else if(sylhet == 3)
                {
                    System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t \tYour Total Bill is " + tk.get(14) + "tk");

                    System.out.println("\n\t\t\t\t\t\t\t\t\t\t\t\t\tConfirm Your Payment....\n");
                    System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t1. YES");
                    System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t2. NO");
                    System.out.print("\n\t\t\t\t\t\t\t\t\t\t\t\t\tEnter your choice(1/2): ");


                    sylhet = input.nextInt();

                    if(sylhet == 1)
                    {
                        Payment  payment = new Payment(2);
                    }
                    else {
                        return;
                    }
                }
                else if(sylhet == 4)
                {
                    System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t \tYour Total Bill is " + tk.get(15) + "tk");

                    System.out.println("\n\t\t\t\t\t\t\t\t\t\t\t\t\tConfirm Your Payment....\n");
                    System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t1. YES");
                    System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t2. NO");
                    System.out.print("\n\t\t\t\t\t\t\t\t\t\t\t\t\tEnter your choice(1/2): ");


                    sylhet = input.nextInt();

                    if(sylhet == 1)
                    {
                        Payment  payment = new Payment(2);
                    }
                    else {
                        return;
                    }
                }
            }
            else {
                System.out.println("Wrong Input..");
            }

        }

    }
}