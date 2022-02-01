
class NegativeRadiusException extends Exception{
    @Override
    public String toString(){
        return "Radius cannot be negative..!";
    }
    public String getMessage(){
        return "Radius cannot be negative..!";
    }
}
public class pps_84_Throw_Throws {
    public static double area(int r) throws NegativeRadiusException {
        if(r>0) {
            throw  new NegativeRadiusException();
        }
        double  result = Math.PI* r* r;
        return result;
    }
   // public static int divide(int a, int b)throws ArithmeticException{
        //Made by priti
       // int result = a/b;
       // return result;
  //  }
    public static void main(String[] args) {
        //Varsha - uses divide function created by priti
        try {
           double ar = area(6);
            System.out.println(ar);
           }catch (Exception e){
         //   System.out.println("Exception");
        }
    }
}
