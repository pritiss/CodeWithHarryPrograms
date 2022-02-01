
public class pps_96_Date {
    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis());
        //if we want to find out secnds since 1 jan then
        System.out.println(System.currentTimeMillis()/1000);
        //if we want to find out yrs since 1 jan then
        System.out.println(System.currentTimeMillis()/1000/3600/24/365);
        System.out.println("No of Hours since 1970 are :");
        System.out.println(System.currentTimeMillis()/1000/24);






        // it shows number witch shows past time in milliseconds
        //since 1 jan 1970
    }
}
