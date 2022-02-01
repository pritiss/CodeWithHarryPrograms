
import java.util.Scanner;

public class pps_79_Errors_Demo {
    public static void main(String[] args) {
        //Logical error demo
        //program to print all prime nos between 1 to 10
        for (int i=1; i<10;i++) {
            System.out.println(2 * i + 1);
        }
            //Runtime Error
        int k;
        Scanner sc = new Scanner(System.in);
        k= sc.nextInt();
        System.out.println("Integer part of 1000 divided by k is "+1000/k);


    }
}
