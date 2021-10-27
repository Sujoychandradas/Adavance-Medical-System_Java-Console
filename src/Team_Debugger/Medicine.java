package Team_Debugger;
import java.util.*;
public class Medicine {
    public static void main(String[] args) {


        System.out.println("\t\t\tour Medicine consultancy page");
        System.out.println("\t\t---------------------------------------");
        for(int a=1;a<4;a++) {
            System.out.println("\t\t---------------------------------------");
            System.out.println("1.Allergy and Immune System");
            System.out.println("2.Respiratory System");
            System.out.println("3.Essential Tabs & Syrupps");
            System.out.println("4.Exit");
            System.out.print("Enter your Choice (1-4): ");
            System.out.println("\n-------------------------------");
            Scanner input = new Scanner(System.in);
            int num = input.nextInt();
            switch(num) {
                case 1 :
                {
                    ArrayList<String> Allergy = new ArrayList<String>();
                    Allergy.add("\n\tThe drugs for allergic response\n\n Antihistamines that tend to cause drowsiness include:\n\n"
                            + "Diphenhydramine\n"
                            + "Chlorpheniramine\n\n"
                            + " These antihistamines stated below are much less likely to cause drowsiness:");
                    Allergy.add("\nCetirizine (Zyrtec, Zyrtec Allergy)\n");
                    Allergy.add("Desloratadine (Clarinex)\n");
                    Allergy.add("Fexofenadine (Allegra, Allegra Allergy)\n");
                    Allergy.add("Levocetirizine (Xyzal, Xyzal Allergy)\n");
                    Allergy.add("Loratadine (Alavert, Claritin)\n");
                    Allergy.add("See your physician if you experience any allergy problems.");
                    for (int i = 0; i < Allergy.size(); i++) {
                        System.out.println(Allergy.get(i));
                    }
                    break;
                }
                case 2:
                {
                    ArrayList<String>Respiratory = new ArrayList<String>();
                    Respiratory.add("Commonly used drugs for respiratory condition\n\n");
                    Respiratory.add("Atibicrobial Medication: tobramycin (TOBI), ribavirin (Virazole), pentamidine (Nebupent).\n Used for the treatment of breathing infections");
                    Respiratory.add("Corticosteroids: Budesonide (Pulmicort Respules).\n These are type of steroids which are designed to reduce swelling in the airways");
                    Respiratory.add("Bronchodilator medications: Metaproterenol (Alupent) and ipratropium (Atrovent).\n These are used in order to open and relax the air passages");
                    Respiratory.add("Mucolytics:  Dornase alfa (Pulmozyme),Acetylcysteine (Mucomyst)\n these drugs are used for thinning, loosening and clearing out secretions of mucus from lungs");
                    Respiratory.add("See your physician if you experience any breathing problems.");
                    for (int i = 0; i < Respiratory.size(); i++) {
                        System.out.println(Respiratory.get(i));
                    }
                    break;
                }
                case 3:
                {
                    for(int k=1;k<=5;k++) {
                        System.out.println("1.For fever,headache,body pain");
                        System.out.println("2.vomit sensation,stomach pain,vomit,aversion of food");
                        System.out.println("3.Burning sensation in chest,indigestion");
                        System.out.println("4.sneezing,severe etching,redness and etching in eyes");
                        System.out.println("5.Exit");
                        System.out.println("Select Between(1-5)");
                        num=input.nextInt();
                        switch(num) {
                            case 1:{
                                ArrayList<String>Fever = new ArrayList<String>();
                                Fever.add("1.tab.Ace 500");
                                Fever.add("2.tab.Ace XR");
                                Fever.add("3.tab.Napa 500");
                                Fever.add("4.tab.Napa extent\n\n");
                                for(int i=0;i<Fever.size();i++) {
                                    System.out.println(Fever.get(i));
                                }
                                break;
                            }
                            case 2:{
                                ArrayList<String>Vomit = new ArrayList<String>();
                                Vomit.add("1.tab.Motigut 10");
                                Vomit.add("2.tab.Deflux");
                                Vomit.add("3.tab.Domin");
                                Vomit.add("4.tab.Omidon");
                                Vomit.add("5.tab.Norvis 50");
                                Vomit.add("6.tab.Viset 50\n\n");
                                for(int i=0;i<Vomit.size();i++) {
                                    System.out.println(Vomit.get(i));
                                }
                                break;
                            }
                            case 3: {
                                ArrayList<String>HeartBurn = new ArrayList<String>();
                                HeartBurn.add("1.cap.Sergel 20");
                                HeartBurn.add("2.cap. Exium 20");
                                HeartBurn.add("3.cap.Esonix 20");
                                HeartBurn.add("4.cap.Esoral 20");
                                HeartBurn.add("5.cap.Nexium 20\n\n");
                                for(int i=0;i<HeartBurn.size();i++) {
                                    System.out.println(HeartBurn.get(i));
                                }
                                break;
                            }
                            case 4:{
                                ArrayList<String>Sneez = new ArrayList<String>();
                                Sneez.add("1.tab.alatrol 10");
                                Sneez.add("2.tab.Deslar 5");
                                Sneez.add("3.tab.Momento 5");
                                Sneez.add("4.tab.fenofex 120");
                                Sneez.add("5.tab.Axodin 120");
                                Sneez.add("6.tab.Bexidal 50");
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
                    break;
                }
                case 4: {
                    break;
                }
            }

        }
    }
}
