import java.util.Scanner;
public class pps_86_Exception_Ex {
    public static void main(String[] args) {
        //problem1
        // int a = 7//Syntax error

        // int age =78;
        // int year_born = 2000-78;//Logical error
        // System.out.println(6/0);//Divide by zero exception
// problem 2
/*        try {
            int a = 666 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Ha Ha Ha");
        } catch (IllegalArgumentException e) {
            System.out.println("He he..");
        }
    }*/
        //problem 3
        boolean flag = true;
        int []marks1 = new int[3];
        marks1[0] = 56;
        marks1[1] = 6;
        marks1[2] = 10;
        Scanner sc = new Scanner(System.in);
        int index;
        int i= 0;
        while (flag&&i<5) {
            try {
                System.out.println("Enter the value of Index");
                index = sc.nextInt();
                System.out.println("The value of marks1[index]=" + marks1[index]);
                i++;
                break;
            }catch (Exception e){
                System.out.println("Invalid Index");
                i++;
            }
            if(i<5){
                System.out.println("Error");
            }
        }
    }
    }
