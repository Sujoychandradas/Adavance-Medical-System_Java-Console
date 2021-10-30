package Team_Debugger;
import java.util.*;
public class Medicine {
    Medicine() {


        System.out.println("\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t************ Welcome to our Medicine Store*************");
        //for(int a=1;a<=5; a++) {
        int a=0;
        while(a==0){
            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t \t1.Essential Tabs & Syrupps");
            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t \t2.Exit");
            System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t \tEnter your Choice (1-2): ");
            Scanner input = new Scanner(System.in);
            int num = input.nextInt();
            switch(num) {
                case 1:
                {
                    System.out.println("\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t************ Available Medicine List *************\n");
                    System.out.println("\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t(I). For fever,headache,body pain: ");

                    System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t1.tab.Ace 500");
                    System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t2.tab.Ace XR");
                    System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t3.tab.Napa 500");
                    System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t4.tab.Napa extent");

                    System.out.println("\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t(II). vomit sensation,stomach pain,vomit,aversion of food: ");

                    System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t4.tab.Motigut 10");
                    System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t5.tab.Deflux");
                    System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t6.tab.Domin");
                    System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t7.tab.Omidon");
                    System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t8.tab.Norvis 50");
                    System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t9.tab.Viset 50");

                    System.out.println("\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t(III). Burning sensation in chest,indigestion: ");

                    System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t10.cap.Sergel 20");
                    System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t11.cap. Exium 20");
                    System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t12.cap.Esonix 20");
                    System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t13.cap.Esoral 20");
                    System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t14.cap.Nexium 20");

                    System.out.println("\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t(IV). sneezing,severe etching,redness and etching in eyes: ");

                    System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t15.tab.alatrol 10");
                    System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t16.tab.Deslar 5");
                    System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t17.tab.Momento 5");
                    System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t18.tab.fenofex 120");
                    System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t19.tab.Axodin 120");
                    System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t20.tab.Bexidal 50\n\n");


                    System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t\t->\tHow many medicine do you need: ");
                    int n= input.nextInt();

                    int sum=0;
                    for(int i=1; i<=n; i++){
                        System.out.print("\n\t\t\t\t\t\t\t\t\t\t\t\t\t->\tEnter the serial number of "+i+"st medicine: ");
                        int med = input.nextInt();


                        if(med%2==0){
                            sum = sum+30;
                        }
                        else{
                            sum = sum+20;
                        }
                    }

                    System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\tPlease pay "+sum+" for continue...");
                    Payment payment = new Payment(3);

//                    System.out.println("Our Delivery Partners.... ");
//
//                    System.out.println("1.Sundorbon Courier Service ");
//                    System.out.println("2.Paper-fly Courier Service ");
//                    System.out.println("3.RED-EX Courier Service ");
//
//                    System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t \tEnter your Choice (1-3): ");
//
//                    int choice = input.nextInt();
//                    if(choice == 1)
//                    {
//                        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\tPlease pay "+sum+" for continue...");
//                        Payment payment = new Payment(3);
//                    }
//                    else if(choice==2)
//
//                    {
//                        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\tPlease pay "+sum+" for continue...");
//                        Payment payment = new Payment(3);
//                    }
//                    else if(choice==3)
//                    {
//                        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\tPlease pay "+sum" for continue...");
//                        Payment payment = new Payment(3);
//                    }
//                    else
//                        return;

                    //System.out.println(sum+"******");

                    /*for(int k=1;k<=5;k++) {
                        System.out.println("\n\t\t\t\t\t\t\t\t\t\t\t\t\tSelect your option: ");
                        System.out.println("\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t1.For fever,headache,body pain");
                        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t2.vomit sensation,stomach pain,vomit,aversion of food");
                        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t3.Burning sensation in chest,indigestion");
                        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t4.sneezing,severe etching,redness and etching in eyes");
                        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t5.Exit");
                        System.out.print("\n\t\t\t\t\t\t\t\t\t\t\t\t\t\tSelect Between(1-5)");
                        num=input.nextInt();
                        switch(num) {
                            case 1:{
                                ArrayList<String>Fever = new ArrayList<String>();
                                Fever.add("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t1.tab.Ace 500");
                                Fever.add("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t2.tab.Ace XR");
                                Fever.add("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t3.tab.Napa 500");
                                Fever.add("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t4.tab.Napa extent\n\n");
                                for(int i=0;i<Fever.size();i++) {
                                    System.out.println(Fever.get(i));
                                }
                                break;
                            }
                            case 2:{
                                ArrayList<String>Vomit = new ArrayList<String>();
                                Vomit.add("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t1.tab.Motigut 10");
                                Vomit.add("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t2.tab.Deflux");
                                Vomit.add("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t3.tab.Domin");
                                Vomit.add("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t4.tab.Omidon");
                                Vomit.add("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t5.tab.Norvis 50");
                                Vomit.add("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t6.tab.Viset 50\n\n");
                                for(int i=0;i<Vomit.size();i++) {
                                    System.out.println(Vomit.get(i));
                                }
                                break;
                            }
                            case 3: {
                                ArrayList<String>HeartBurn = new ArrayList<String>();
                                HeartBurn.add("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t1.cap.Sergel 20");
                                HeartBurn.add("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t2.cap. Exium 20");
                                HeartBurn.add("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t3.cap.Esonix 20");
                                HeartBurn.add("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t4.cap.Esoral 20");
                                HeartBurn.add("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t5.cap.Nexium 20\n\n");
                                for(int i=0;i<HeartBurn.size();i++) {
                                    System.out.println(HeartBurn.get(i));
                                }
                                break;
                            }
                            case 4:{
                                ArrayList<String>Sneez = new ArrayList<String>();
                                Sneez.add("\t\t\t\t\t\t\t\t\t\t\t\t \t1.tab.alatrol 10");
                                Sneez.add("\t\t\t\t\t\t\t\t\t\t\t\t \t2.tab.Deslar 5");
                                Sneez.add("\t\t\t\t\t\t\t\t\t\t\t\t \t3.tab.Momento 5");
                                Sneez.add("\t\t\t\t\t\t\t\t\t\t\t\t \t4.tab.fenofex 120");
                                Sneez.add("\t\t\t\t\t\t\t\t\t\t\t\t \t5.tab.Axodin 120");
                                Sneez.add("\t\t\t\t\t\t\t\t\t\t\t\t \t6.tab.Bexidal 50\n\n");
                                for(int i=0;i<Sneez.size();i++) {
                                    System.out.println(Sneez.get(i));
                                }
                                break;
                            }
                            case 5:{
                                break;
                            }
                        }
                    }
                    */
                    break;
                }
                case 2: {
                    return;
                }
            }

            System.out.println("\n\t\t\t\t\t\t\t\t\t\t\t\t\t\tDo you want to buy more medicne: ");
            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t1. YES");
            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t2. NO");

            System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t\t\tEnter your chose: ");
            int want = input.nextInt();

            if(want==1){
                a=0;
            }
            else{
                break;
            }

        }
    }
}

