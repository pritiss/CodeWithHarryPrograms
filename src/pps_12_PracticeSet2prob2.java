//program to encrpt a grade by adding 8 into it
public class pps_12_PracticeSet2prob2 {
    public static void main(String[] args) {
        char grade = 'f';
        grade = (char) (grade+8);
        System.out.println(grade);
        //Dycripting the grade
        grade = (char)(grade-8);
        System.out.println(grade);
    }
}
