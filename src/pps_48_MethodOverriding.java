
class A {
    public int a;

    public int harry() {
        return 4;
    }
    public void meth2(){
        System.out.println("I am method2 of class A");
    }
}
class B extends A{
    @Override
    public void meth2(){
        System.out.println("I am meth 2 of class B");
    }

}
public class pps_48_MethodOverriding {
    public static void main(String[] args) {
        A a = new A();
        a.meth2();
        B b = new B();
        b.meth2();

    }
}
