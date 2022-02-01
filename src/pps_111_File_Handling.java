import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class pps_111_File_Handling {
    public static void main(String[] args) {
        // Code to create a new file
       // File myFile = new File("pps111file.txt");
       // try {
       //     myFile.createNewFile();
        //  }catch (IOException e){
          //  System.out.println("Uable to create this file");
          //  e.printStackTrace();
      //  }
        //Code to how to write a file
       /* try {
            FileWriter fileWriter = new FileWriter("pps111file.txt");
            fileWriter.write("This is our first file to write java code \n Ok now bye...");
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        // Reading a file*/
      //  File myfile = new File("pps111file.txt");
      //  try {
       //     Scanner sc = new Scanner(myfile);
        //    while (sc.hasNextLine()){
         //       String line = sc.nextLine();
          //      System.out.println(line);
          //  }
        //    sc.close();
      //  } catch (FileNotFoundException e) {
        //    e.printStackTrace();
      //  }
//     Deleting file
        File myfile = new File("pps111file.txt");
        if(myfile.delete()) {
            System.out.println("I have deleted" + myfile.getName());
        }
            else{
                System.out.println("Some error occured while deleting the file");
            }
        }


    }

