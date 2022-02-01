public class pps_24_BtreakCont {
    public static void main(String[] args) {
        //break and continue using for loop
       // for(int i = 0; i<5; i++){
         //   System.out.println(i);
           // System.out.println("Java is great!");
            //if (i==2){
              //  System.out.println("Ending the loop");
                //break;
            //}
            //System.out.println("Loop ends here..");
        //}

        //***************
        //for continue...
        for(int i=0; i<50; i++){
            if(i==2){
                System.out.println("Ending the loop here");
                continue;
            }
            System.out.println(i);
            System.out.println("Java is great");
        }

    }
}
