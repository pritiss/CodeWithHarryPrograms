import org.w3c.dom.ls.LSOutput;

public class pps17_LogicalOp {
    public static void main(String[] args){
       // System.out.println("For Logical AND...");
        //boolean a = true;
       // boolean b = true;
       // boolean c = true;
       // if(a&&b) {
        //    System.out.println("Y");
       // }
       // else{
           // System.out.println("N");
        //}

        System.out.println("For logical OR...");
        boolean a1 = false;
        boolean b1 = false;
        if(a1||b1) {
            System.out.println("Y");
        }
            else{
                System.out.println("N");
            }

        System.out.println("For Logical Not...");
        System.out.println("Not (a) is : ");
        System.out.println(!a1);
        System.out.println("Not (b) is : ");
        System.out.println((!b1));
        }
    }

