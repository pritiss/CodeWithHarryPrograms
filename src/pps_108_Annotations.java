@FunctionalInterface //this annotation shows us weather this interface is functioal interface or not
interface myFunctionalInterface{
    void thisMethod();
}
class NewPhone extends Phone{
    @Override
    public void showTime() {
        System.out.println("Time is 8 PM");
    }
    @Deprecated
    public int sum(int a, int b){
        return a+b;
    }
}
public class pps_108_Annotations {
    @SuppressWarnings("deprication")
    public static void main(String[] args) {
    NewPhone  phone = new NewPhone();
    phone.showTime();
    phone.sum(5,6);
    }
}
