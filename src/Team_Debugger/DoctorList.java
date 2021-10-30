package Team_Debugger;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class DoctorList {

    void displayDoctor() {

        File myFile = new File("files/DoctorsList.txt");
        try {
            myFile.createNewFile();

        } catch (IOException e) {
            System.out.println("\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t************ File not Found..*************");
            e.printStackTrace();
        }


        File m = new File("files/DoctorsList.txt");


        try {
            Scanner s = new Scanner(m);
            while(s.hasNextLine()){
                String line = s.nextLine();
                System.out.println(line);
            }
            s.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}