public class pps_33_VariableArgument {
   // static int sum(int a, int b) {
      //  return a + b;
    static int sum (int x, int  ...arr){
        int result = x;
        for(int a:arr){
            result+=a;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Wecome to variable arguments tutorial");
       // System.out.println("sum of nothing is:"+sum()); //it reurns 0
        System.out.println("Sum of 20 and 20 is :"+sum(20,20));
        System.out.println("Sum of 20 and 20 is :"+sum(20,10,30));
        System.out.println("Sum of 20 and 20 is :"+sum(4,5,2,1));
        System.out.println("Sum of 20 and 20 is :"+sum(5,1,3,1));
    }
}
