package Team_Debugger;

import java.util.Scanner;

public class Payment {
    Scanner input = new Scanner(System.in);

    Payment(int m) {

        //System.out.print("\n\t\t\t\t\t\t\t\t\t\t\t\t\t#### Are you Confirming  Your booking (Y/N) : ");
        //String ch = input.nextLine();

        //if (ch.equals("Y") || ch.equals("y")) {

        System.out.println("\n\t\t\t\t\t\t\t\t\t\t\t\t\t\tPlease select a payment Method: ");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t1. Bkash");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t2. Nagad");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t3. Rocket");

        System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t\t\tEnter your Choose (1-3): ");

        int n = input.nextInt();

        if (n == 1) {
            Scanner in = new Scanner(System.in);
            System.out.println("\n\n\t\t\t\t\t\t\t\t\t\t\t\t\t**** Please Pay BDT  500tk on +880 1763175828");
            System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t\t->\tEnter the Transaction Number: ");
            String str = in.nextLine();

            if(m == 1)
            {
                System.out.println("\n\t\t\t\t\t\t\t\t\t\t\t*************************************************************************************\n");
                System.out.println("\t\t\t\t\t\t\t\t\t\t\t*\t\t\t\t**** ~~~~ Thank you! For using using our service.. ~~~~ ****\t\t\t\t*");
                System.out.println("\t\t\t\t\t\t\t\t\t\t\t*\t\t~~~~ We will send zoom link through your mobile Number via SMS. ~~~~\t\t*");
                System.out.println("\n\t\t\t\t\t\t\t\t\t\t\t*************************************************************************************\n");
            }
            else if(m == 2)
            {
                System.out.println("\n\t\t\t\t\t\t\t\t\t\t\t*************************************************************************************\n");
                System.out.println("\t\t\t\t\t\t\t\t\t\t\t*\t\t\t\t**** ~~~~ Thank you! For using our service.. ~~~~ ****\t\t\t\t*");
                System.out.println("\t\t\t\t\t\t\t\t\t\t\t*\t\t~~~~ We will contact as soon as possible. ~~~~\t\t*");
                System.out.println("\n\t\t\t\t\t\t\t\t\t\t\t*************************************************************************************\n");
            }
            else if(m==3)
            {
                System.out.println("\n\t\t\t\t\t\t\t\t\t\t\t*************************************************************************************\n");
                System.out.println("\t\t\t\t\t\t\t\t\t\t\t*\t\t\t\t**** ~~~~ Thank you! For using our service.. ~~~~ ****\t\t\t\t*");
                System.out.println("\t\t\t\t\t\t\t\t\t\t\t*\t\t~~~~ You will get your medicine as soon as possible.. ~~~~\t\t*");
                System.out.println("\n\t\t\t\t\t\t\t\t\t\t\t*************************************************************************************\n");
            }

        } else if (n == 2) {
            Scanner in = new Scanner(System.in);
            System.out.println("\n\n\t\t\t\t\t\t\t\t\t\t\t\t\t**** Please Pay BDT 500tk on +880 1738980447");
            System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t\t->\tEnter the Transaction Number: ");
            String str = in.nextLine();

            if(m == 1)
            {
                System.out.println("\n\t\t\t\t\t\t\t\t\t\t\t*************************************************************************************\n");
                System.out.println("\t\t\t\t\t\t\t\t\t\t\t*\t\t\t\t**** ~~~~ Thank you! For using using our service.. ~~~~ ****\t\t\t\t*");
                System.out.println("\t\t\t\t\t\t\t\t\t\t\t*\t\t~~~~ We will send zoom link through your mobile Number vai SMS. ~~~~\t\t*");
                System.out.println("\n\t\t\t\t\t\t\t\t\t\t\t*************************************************************************************\n");
            }
            else if(m == 2)
            {
                System.out.println("\n\t\t\t\t\t\t\t\t\t\t\t*************************************************************************************\n");
                System.out.println("\t\t\t\t\t\t\t\t\t\t\t*\t\t\t\t**** ~~~~ Thank you! For using our service.. ~~~~ ****\t\t\t\t*");
                System.out.println("\t\t\t\t\t\t\t\t\t\t\t*\t\t\t\t**** ~~~~ We will contact as soon as possible. ~~~~ ****\t\t\t\t*");
                System.out.println("\n\t\t\t\t\t\t\t\t\t\t\t*************************************************************************************\n");
            }
            else if(m==3)
            {
                System.out.println("\n\t\t\t\t\t\t\t\t\t\t\t*************************************************************************************\n");
                System.out.println("\t\t\t\t\t\t\t\t\t\t\t*\t\t\t\t**** ~~~~ Thank you! For using our service.. ~~~~ ****\t\t\t\t*");
                System.out.println("\t\t\t\t\t\t\t\t\t\t\t*\t\t~~~~ You will get your medicine as soon as possible.. ~~~~\t\t*");
                System.out.println("\n\t\t\t\t\t\t\t\t\t\t\t*************************************************************************************\n");
            }
        } else if (n == 3) {
            Scanner in = new Scanner(System.in);
            System.out.println("\n\n\t\t\t\t\t\t\t\t\t\t\t\t\t**** Please Pay BDT 500tk on +880 1741368836");
            System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t\t->\tEnter the Transaction Number: ");
            String str = in.nextLine();

            if(m == 1)
            {
                System.out.println("\n\t\t\t\t\t\t\t\t\t\t\t*************************************************************************************\n");
                System.out.println("\t\t\t\t\t\t\t\t\t\t\t*\t\t\t\t**** ~~~~ Thank you! For using using our service.. ~~~~ ****\t\t\t\t*");
                System.out.println("\t\t\t\t\t\t\t\t\t\t\t*\t\t~~~~ We will send zoom link through your mobile Number via SMS. ~~~~\t\t*");
                System.out.println("\n\t\t\t\t\t\t\t\t\t\t\t*************************************************************************************\n");
            }
            else if(m == 2)
            {
                System.out.println("\n\t\t\t\t\t\t\t\t\t\t\t*************************************************************************************\n");
                System.out.println("\t\t\t\t\t\t\t\t\t\t\t*\t\t\t\t**** ~~~~ Thank you! For using our service.. ~~~~ ****\t\t\t\t*");
                System.out.println("\t\t\t\t\t\t\t\t\t\t\t*\t\t~~~~ We will contact as soon as possible. ~~~~\t\t*");
                System.out.println("\n\t\t\t\t\t\t\t\t\t\t\t*************************************************************************************\n");
            }
            else if(m==3)
            {
                System.out.println("\n\t\t\t\t\t\t\t\t\t\t\t*************************************************************************************\n");
                System.out.println("\t\t\t\t\t\t\t\t\t\t\t*\t\t\t\t**** ~~~~ Thank you! For using our service.. ~~~~ ****\t\t\t\t*");
                System.out.println("\t\t\t\t\t\t\t\t\t\t\t*\t\t~~~~ You will get your medicine as soon as possible.. ~~~~\t\t*");
                System.out.println("\n\t\t\t\t\t\t\t\t\t\t\t*************************************************************************************\n");
            }
        }

    }
}