class InvalidInputException extends Exception {
    @Override
    public String toString() {
        return "Cannot add 8 and 9";
    }
    @Override
    public String getMessage(){
        return "I am getMessage";
    }
}
class CannotDivideByZeroException extends Exception{
    @Override
     public String toString(){
    return "Cannot divide by zero";
     }
}
class MaxInputException extends Exception {
    @Override
    public String toString(){
        return "Input cannot be greater than 100000";
    }
    public String getMessage(){
        return "I am getMessage";
    }
}
class MaxMultiplyInputException extends Exception{
    @Override
    public String toString(){
        return  "Input cant be greater than 7000 while multiplying";
    }
    public String getMessage(){
        return "I am getMessage";
    }
}
class CustomCalculator {
    double add(double a, double b) throws InvalidInputException, MaxInputException {
        if (a > 100000 || b > 100000) {
            throw new MaxInputException();
        }
        if (a == 8 || b == 9) {
            throw new InvalidInputException();
        }
        return a + b;
    }


    double substract(double a, double b) throws MaxInputException {
        return a - b;
    }

    double multiply(double a, double b) throws MaxInputException, MaxMultiplyInputException {
        if(a>10000||b>10000){
            throw new MaxInputException();
        }
        else if(a>7000||b>7000){
            throw new MaxMultiplyInputException();
        }
        return a * b;
    }

    double divide(double a, double b) throws CannotDivideByZeroException, MaxInputException {
        if (a > 100000||b > 100000) {
            throw new MaxInputException();
        }
            else if (a > 7000 || b > 7000) {
            throw new MaxInputException();
        }
            if(b==0){
            throw new CannotDivideByZeroException();
        }
        return a/b;
    }
}
public class pps_87_Ex_Calculator {
    public static void main(String[] args) throws InvalidInputException, CannotDivideByZeroException, MaxInputException, MaxMultiplyInputException {
        CustomCalculator c = new CustomCalculator();
        c.multiply(5, 7888888);
      //  c.add(8,9);
      //  c.divide(6,0);
        //Ex: 6 : - u have to create a custom calculator which throws the following operations:
        //1.: -Addition
        //2: Substraction
        //3:Multiplication
        //4:Division
        //which throws the following exceptions:
        //1: Invalid input exception :  ex:8 & 9
        //2: Cannot divide by 0 exception
        //3: Max input exception if any of the input is greater than 100000
        //4:Max multiplier reached exception - Dont allow any multiplication input greater than 7000
    }

}
