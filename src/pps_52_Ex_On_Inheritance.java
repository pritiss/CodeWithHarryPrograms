//problem1: create a class circle and create another class cylinder from it
class Circle{
    public int radius;
    Circle(){
        System.out.println("I am non parameterised constuctor");
    }
    Circle(int r){
        System.out.println("I am circle parameterised constructor");
        this.radius=r;
    }
    public double area(){
        return Math.PI*this.radius*this.radius;
    }
}
class Cylinder extends Circle{
    public int height;
    Cylinder(int r, int h) {
        super(r);
        System.out.println("I am Cylinder parameterised constructor");
        this.height=h;
    }
    public double volume(){
        return Math.PI*this.radius*this.radius*height;
    }
}
public class pps_52_Ex_On_Inheritance {
    public static void main(String[] args) {
       // Circle objC = new Circle(12);
        Cylinder obj = new Cylinder(12,4);
    }
}
