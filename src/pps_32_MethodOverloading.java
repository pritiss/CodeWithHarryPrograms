public class pps_32_MethodOverloading {
    static void foo() {
        System.out.println("Good morning bro..!");
    }
    static void foo(int a) {
        System.out.println("Good morning " + a + "bro..!");
    }
    static void foo(int a, int b){
        System.out.println("Good morning " +a+ " bro and " +b+ " sisters");
    }

    public static void main(String[] args) {
        foo();
        foo(500);
        foo(40,50);//aruments are actual
    }
}
//arguments are actual!

   // static void tellJoke(){
  //      System.out.println("I am invented a new world..AA");
//}

  //  public static void main(String[] args) {
      //  tellJoke();
       // int[] marks ={52,66}
  //  }
//}
