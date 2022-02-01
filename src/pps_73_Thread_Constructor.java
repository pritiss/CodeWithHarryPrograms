
class Mythr extends Thread{
    public Mythr(String name){
        super(name);
    }
    public void run(){
        int id = 34;
            System.out.println("I am good");
        }
    }
public class pps_73_Thread_Constructor {
    public static void main(String[] args) {
        Mythr t1 = new Mythr("Priti");
        Mythr t2 = new Mythr("Sunath");
        t1.start();
        t2.start();
        System.out.println("The id of the thread is: "+t1.getId());
        System.out.println("The name of the thread is :"+t1.getName());
        System.out.println("The name of the thread is :"+t2.getId());
        System.out.println("The name of the thread is :"+t2.getName());
    }
}
