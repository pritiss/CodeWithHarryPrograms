import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;

public class pps_102_Advance_Java_Practice_Set {
    public static void main(String[] args) {
        //ps Q1.- Create an arraylist and store names of 10 students and print it using for each loop
        ArrayList MyAr1 = new ArrayList<>();
        MyAr1.add("Student1");
        MyAr1.add("Student2");
        MyAr1.add("Student3");
        MyAr1.add("Student4");
        MyAr1.add("Student5");
        MyAr1.add("Student6");
        MyAr1.add("Student7");
        MyAr1.add("Student8");
        MyAr1.add("Student9");
        MyAr1.add("Student10");
        for (Object O:MyAr1){
            System.out.println(O);
        }

        //Problem 5:  Create set in java..try to set duplicate element inside this set and
        //vrify that only one instance is stored.
        HashSet <Integer> s = new HashSet<>();
        s.add(5);
        s.add(6);
        s.add(46);
        s.add(60);
        s.add(9);
        s.add(6);
        System.out.println(s);
        //Problem 3 : use date class in java and print time in following format
        //21:47:02
        Date d = new Date();
        System.out.println(d.getHours()+":"+d.getMinutes()+":"+d.getSeconds());
         //Problem 3
        //repeat this using calender class
        Calendar c = Calendar.getInstance();
        System.out.println(c.get(Calendar.HOUR_OF_DAY)+":"+c.get(Calendar.MINUTE)+":"+c.get(Calendar.SECOND));

        //Problem 4
       // Solve Q 2 using java.TimeAPI
        LocalDateTime dt = LocalDateTime.now();
        DateTimeFormatter df1 = DateTimeFormatter.ofPattern("H:m:s");
        String MyDate1 = dt.format(df1);
        System.out.println(MyDate1);

    }
}
