
class Base1{
    Base1(){
        System.out.println("I am a Constructor...!");
    }
    Base1(int x){
        System.out.println("I am an overloaded constructor with value of x as: "+x);
    }
    public int x;
    public int getX(){
        return x;
    }
    public void setX(int x){
        this.x=x;
    }
}
class Derived1 extends Base1{
    Derived1(){
        super(5);
        System.out.println("I am a derived class constructor..!");
    }
    Derived1(int x, int y){
        super(x);
        System.out.println("I am an overloaded constructor derived with value of y as: "+y);
    }
    public int y;
    public int getY(){
        return y;
    }
    public void setY(int y){
        this.y=y;
    }
}


public class pps_46_Constructor_in_Inheritance {
    public static void main(String[] args) {
       // Base1 b = new Base1();
        Derived1 d = new Derived1(4, 9);


    }
}
