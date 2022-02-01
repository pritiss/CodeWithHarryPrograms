abstract class Parent2{
    public Parent2(){
        System.out.println("Main base2 ka constructor hoon");
    }
    public void sayHello(){
        System.out.println("Hello");
    }
    abstract public void greet();
    abstract public void greet2();
}
class child2 extends Parent2 {
    @Override
    public void greet() {
        System.out.println("Good Morning");
    }

    @Override
    public void greet2() {
        System.out.println("Good Afternoon");
    }

    abstract class Child3 extends Parent2 {
        public void as() {
            System.out.println("i am priti");
        }
    }

    public class pps_53_Abstract {
        public static void main(String[] args) {
            //parent2 p = new parent2(); --error throw
            child2 c2 = new child2();
            //child3  c3 = new child3() -- error throw
            
        }

    }
}
