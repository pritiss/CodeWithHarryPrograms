    interface DemoAno {
        void meth1();
        //void meth2();
    }
   // class Priti implements DemoAno {
    //    @Override
     //   public void meth1() {
         //   System.out.println("I am method 1");
      //  }
   // }

        // class AnnonyDemo implements DemoAno {
        //  public void display() {
        // System.out.println("Hello");
        //    }
        // @Override
        //   public void meth1() {
        //      System.out.println("I am Meth1");
        //  }
        //  @Override
        //  public void meth2(){
        //       System.out.println("I am Meth2");
        //    }
        //  }
        public class pps_119_Lambda_expression {
            public static void main(String[] args) {
                //  AnnonyDemo Obj = new AnnonyDemo();
                //  Obj.meth1();
                //  Obj.meth2();
                //Anonymus Class
                // DemoAno obj = new DemoAno() {
                //     @Override
                //     public void meth1() {
                //         System.out.println("I am priti");
                //    }

                //    @Override
                //    public void meth2() {
               // System.out.println("I am Shubham");
//
                //        }public class pps_119_Lambda_expression {

                //     };
                // obj.meth1();
                //obj.meth2();
                // }
          //  }
             //   DemoAno obj = new Priti();
             //   obj.meth1();

               //***********************************Lambda Expressin

                DemoAno obj = ()->{System.out.println("I am method1 from this Lambda");};
                obj.meth1();
                 }
                 }