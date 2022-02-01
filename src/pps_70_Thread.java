
//Method 1 : Creating a thread by extending thread class
//Here while creating thread class we have extend it by thread
//ie. class MyThread Extends Thread
class MyThread1 extends Thread{
    @Override
    public void run(){
        int i = 0;
        while (i<40000) {
            System.out.println("My Thread is running");
            System.out.println("I am Happy...");
            i++;

        }
    }
}
class MyThread2 extends Thread{
    @Override
    public void run(){
        int i = 0;
   while(i<40000){
        System.out.println(" Thread 2 is good");
        System.out.println("I am Sad...");
        i++;
       }
    }
}
 class pps_70_Thread_By_Extend_Threadclass {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();
        t1.start();
        t2.start();

    }
}
