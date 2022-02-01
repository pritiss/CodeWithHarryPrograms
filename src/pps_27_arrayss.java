public class pps_27_arrayss {
    public static void main(String[] args) {
        // float[] marks = {48.7f,63.6f,78.2f,74.7f,99.9f};
        //String[] students={"Priti","Malhar","Aradhya", "Sai"};
        // System.out.println(students[3]);

        // for displaying array
        //int[] marks = {56, 89, 74, 63, 77};
       // System.out.println(marks.length);
        //displaying array(naive way)
        //System.out.println(marks[0]);
       // System.out.println(marks[1]);
        //System.out.println(marks[2]);
       // System.out.println(marks[3]);
       // System.out.println(marks[4]);

        //displaying the array(for loop)
        //printing using for loop
        //for (int i = 0; i < marks.length; i++) {
          //  System.out.println(marks[i]);

            //Quick quiz : dislaying array in reverse order
        int[] marks = {56, 89, 74, 63, 77};
            for (int i = marks.length - 1; i >= 0; i--) {
                System.out.println(marks[i]);
            }
            // quick quiz :displaying the array with for each loop
        System.out.println("This printing array using for each loop");
            for(int element:marks){
                System.out.println(element);
            }
        }
    }
