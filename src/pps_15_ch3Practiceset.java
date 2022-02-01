import java.util.Locale;

public class pps_15_ch3Practiceset {
    public static void main(String[] args) {
        //problem1
        String name = "Aradhya Malhar";
        name = name.toLowerCase();
        System.out.println(name);

        //prob2
        String text = "To Lower case";
        text = text.replace(" ", "_");
        System.out.println(text);

        //problem3
        String letter = "Dear < |name| >, Thanks a lot";
       // letter = letter.replace(target:"< |name| >", replacement: "Priti")
       // System.out.println(String);
        // prob 4
        String myString = "This string contains double   and triple spaces";

        System.out.println(myString.indexOf("  "));
        System.out.println(myString.indexOf("   "));

        //prob 5
        String myletter = "Dear priti,\n\t This java course is nice.\n\t Thanks!";
        System.out.println(myletter);

    }
}
