
import java.util.Scanner;
public class pps_6_Excrsice1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks of Maths");
        float m1 = sc.nextFloat();
        System.out.println("Enter marks of English");
        float m2 = sc.nextFloat();
        System.out.println("Enter marks of Science");
        System.out.println("Enter marks of Marathi");
        float m4 = sc.nextFloat();
        System.out.println("Enter marks of sst");
        float m3 = sc.nextFloat();

        float m5 = sc.nextFloat();
        float total = m1+m2+m3+m4+m5;
        System.out.println("Total marks is :");
        System.out.println(total);
        float per =((total)/500.0f)*100;
        System.out.println(per);

    }
}
