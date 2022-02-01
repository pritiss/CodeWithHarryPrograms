import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class pps_101_Date_Time_Formatter {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.now();//This is the date
        System.out.println(dt);

        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy!!--E H:m a");//This is the format
        DateTimeFormatter dt1 = DateTimeFormatter.ISO_LOCAL_DATE;
        System.out.println(df);
       // System.out.println(dt1);
        String MyDate = dt.format(df);//Creating date string using date and format
       // String MyDate2 = dt.format(dt1);
        System.out.println(MyDate);
    }
}
