package Team_Debugger;

public class AmbulanceService {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("1.Inside sylhet?");
        System.out.println("2.Out of sylhet");
        int n;
        int tk1=2000;
        int tk2=1900;
        int tk3=2200;
        n=input.nextInt();
        if(n==1){
            System.out.println("1.Habiganj to sylhet ? ");
            System.out.println("2.Sunamgonj to sylhet ? ");
            System.out.println("3.Moulovibazar to sylhet? ");
            n=input.nextInt();
            switch(n){
                case 1:
                    System.out.println("1.You have to pay "+((tk1*0.05)+tk1)+"for AC");
                    System.out.println("2.You have to pay "+((tk1*0.01)+tk1)+"for Non-AC");
                    System.out.println("3.For freezing-ambulance :"+((tk3*0.04)+tk2));
                    System.out.println("4.For ICU :"+((tk2*0.09)+tk3));
                    n=input.nextInt();
                    if(n==1 || n==2||n==3||n==4){
                         System.out.println("How do you want to pay?");
                         System.out.println("1.bKash");
                         System.out.println("2.Cash");
                         n=input.nextInt();
                          if(n==1){
                        
                              break;
                           }
                        else{
                        
                              break;
                           }
                    }
              
              
                case 2:
                    System.out.println("1.You have to pay "+((tk2*0.07)+tk2)+"for AC");
                    System.out.println("2.You have to pay "+((tk2*0.01)+tk2)+"for Non-AC");
                    System.out.println("3.For freezing-ambulance :"+((tk3*0.03)+tk2));
                    System.out.println("4.For ICU :"+((tk1*0.09)+tk3));

                    n=input.nextInt();
                        if(n==1 || n==2||n==3||n==4){
                         System.out.println("How do you want to pay?");
                         System.out.println("1.bKash");
                         System.out.println("2.Cash");
                         n=input.nextInt();
                          if(n==1){
                        
                              break;
                           }
                        else{
                        
                              break;
                           }
                    }
                case 3:
                    System.out.println("1.You have to pay "+((tk3*0.05)+tk3)+"for AC");
                    System.out.println("2.You have to pay "+((tk3*0.01)+tk3)+"for Non-AC");
                    System.out.println("3.For freezing-ambulance :"+((tk3*0.04)+tk3));
                    System.out.println("4.For ICU :"+((tk3*0.09)+tk3));
                    n=input.nextInt();
                    if(n==1 || n==2||n==3||n==4){
                         System.out.println("How do you want to pay?");
                         System.out.println("1.bKash");
                         System.out.println("2.Cash");
                         n=input.nextInt();
                          if(n==1){
                        
                              break;
                           }
                        else{
                        
                              break;
                           }
                    }
        }
        }
        else if(n==2){
            System.out.println("1.Sylhet to dhaka?");
            System.out.println("2.Sylhet to Narayongonj?");
            n=input.nextInt();
            int tk4=4000;
            int tk5=4500;
            int tk6=3200;
            int tk7=3500;
            switch(n){
                case 1:
                    System.out.println("1.For AC :"+((tk4*0.06)+tk4));
                    System.out.println("2.For Non-AC :"+((tk5*0.09)+tk5));
                    System.out.println("3.For freezing-ambulance :"+((tk5*0.04)+tk4));
                    System.out.println("4.For ICU :"+((tk4*0.09)+tk5));
                    n=input.nextInt();
                    if(n==1||n==2||n==3||n==4){
                        System.out.println("How do you want to pay?");
                        System.out.println("1.Bkash?");
                        System.out.println("2.Cash?");
                        n=input.nextInt();
                        if(n==1){
                            break;
                        }
                        else{
                            break;
                        }
                    }
                case 2:
                    System.out.println("1.For AC :"+((tk6*0.06)+tk6));
                    System.out.println("2.For Non-AC :"+((tk7*0.07)+tk7));
                    System.out.println("3.For freezing-ambulance :"+((tk7*0.04)+tk6));
                    System.out.println("4.For ICU :"+((tk6*0.09)+tk7));
                    n=input.nextInt();
                    if(n==1||n==2||n==3||n==4){
                        System.out.println("How do you want to pay?");
                        System.out.println("1.Bkash?");
                        System.out.println("2.Cash?");
                        n=input.nextInt();
                        if(n==1){
                            break;
                        }
                        else{
                            break;
                        }
                    }
            }
        }
    }
}
