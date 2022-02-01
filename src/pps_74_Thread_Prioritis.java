class Mythr1 extends Thread {
    public Mythr1(String name) {
        super(name);
    }
    public void run() {
        int id = 34;
        while (true) {
            System.out.println("Thank you" + this.getName());
        }
    }
}
public class pps_74_Thread_Prioritis {
    public static void main(String[] args) {
        //Ready Queue: t1,t2,t3,t4,t5
        Mythr1 t1 = new Mythr1("Priti");
        Mythr1 t2 = new Mythr1("Priti1");
        Mythr1 t3 = new Mythr1("Priti2");
        Mythr1 t4 = new Mythr1("Priti3");
        Mythr1 t5 = new Mythr1("Priti4(MostImp");
        t5.setPriority(Thread.MAX_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
