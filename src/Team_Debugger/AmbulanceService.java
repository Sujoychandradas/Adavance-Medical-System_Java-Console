package Team_Debugger;
import java.util.Scanner;
public class AmbulanceService {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Which hospital you want yourself or your patients to get admitted in?"); 
        System.out.println("1.OSMANI MEDICAL");
        System.out.println("2.NOORJAHAN");
        System.out.println("3.POPULAR");
        System.out.println("4.Sylhet Women’s Medical College Hospital.");
        System.out.println("5.Medinova Medical Services Ltd.");
        System.out.println("6.United Poly Clinic.");
        System.out.println("7.Niramoy Poly Clinic.");
        System.out.println("8.United Hospital Ltd.");
      int n;
      n=input.nextInt();
      if(n==1||n==2||n==3||n==4||n==5||n==6||n==7||n==8){
          System.out.println("Your location?");
          System.out.println("1.Sylhet");
          System.out.println("2.Habigonj");
          System.out.println("3.Moulovibazar");
          System.out.println("4.Sunamganj");
          System.out.println("5.Sreemangal");
          System.out.println("6.Biswanath");

          n=input.nextInt();
          switch(n){
              case 1:
                  System.out.println("1.You have to pay 700tk for AC");
                  System.out.println("2.You have to pay 500tk for Non-AC");
                  System.out.println("3.For freezing-ambulance 600tk");
                  System.out.println("4.For ICU 900tk");
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
                   System.out.println("1.You have to pay 1200tk for AC");
                  System.out.println("2.You have to pay 800tk for Non-AC");
                  System.out.println("3.For freezing-ambulance 900tk");
                  System.out.println("4.For ICU 1500tk");

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
                  System.out.println("1.You have to pay 1300tk for AC");
                  System.out.println("2.You have to pay 900tk for Non-AC");
                  System.out.println("3.For freezing-ambulance 1000tk");
                  System.out.println("4.For ICU 1500tk");
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
              case 4:
                  System.out.println("1.You have to pay 1500tk for AC");
                  System.out.println("2.You have to pay 1200tk for Non-AC");
                  System.out.println("3.For freezing-ambulance 1100tk");
                  System.out.println("4.For ICU 1800tk");
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
              case 5:
                  System.out.println("1.You have to pay 1450tk for AC");
                  System.out.println("2.You have to pay 1220tk for Non-AC");
                  System.out.println("3.For freezing-ambulance 1190tk");
                  System.out.println("4.For ICU 1700tk");
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
              case 6:
                  System.out.println("1.You have to pay 1000tk for AC");
                  System.out.println("2.You have to pay 800tk for Non-AC");
                  System.out.println("3.For freezing-ambulance 700tk");
                  System.out.println("4.For ICU 1200tk");
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

    }
}
