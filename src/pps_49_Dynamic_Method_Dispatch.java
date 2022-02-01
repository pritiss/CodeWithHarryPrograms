
class Phone{
    public void showTime(){
        System.out.println("Time is 8 am");
    }
    void on(){
        System.out.println("Turning on phone");
    }
}
class SmartPhone extends Phone{
    public void music(){
        System.out.println("Playing music..");
    }
    @Override
    void on(){
        System.out.println("Turning on smart phone..");
    }
}
public class pps_49_Dynamic_Method_Dispatch {
    public static void main(String[] args) {
   // Phone obj = new Phone();             //Allowed
    //SmartPhone smobj = new SmartPhone(); //Allowed
    //obj.name();
         Phone obj              = new SmartPhone();   //yes..it is allowed
        //super class referacne = base class object
        //SmartPhone obj2 = new Phone();  //not allowed
        //obj.greet();
        obj.on();
        obj.showTime();
       // obj.music();
    }
}
