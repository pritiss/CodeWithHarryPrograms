 //problem 1
    class MyClass {
        int salary;
        String name;

        public int getSalary() {
            return salary;
        }

        public String getName() {
            return name;
        }
        public void setName(String n) {
            name = n;
        }
    }
  //problem 2
    class Cellphone{
    public void Ring(){
        System.out.println("Ringing...");
    }
    public void Vibrate(){
        System.out.println("Vibrating...");
    }
    public void CallFriend(){
        System.out.println("Callig Mukul...");
    }
    }

    class Square{
    int side;
     public int area(){
         return  side*side;
     }
     public int perimeter(){
         return 4*side;
     }
    }
    class Tommy{
    public void Hit(){
        System.out.println("Tommy is heating");
    }
    public void Run(){
        System.out.println("Running from the enemy...");
    }
    public void fire(){
        System.out.println("Firing on the enemy");
    }

    }


     public class pps_39_oop_practice_set {
         public static void main(String[] args) {
       /* MyClass nishu = new MyClass();
        nishu.salary= 5000;
        nishu.setName("Priti Shingade");
        System.out.println(nishu.getName());
        System.out.println(nishu.getSalary());
        //problem 2
            Cellphone vivov3= new Cellphone();
            vivov3.CallFriend();
            vivov3.Vibrate();
            vivov3.Ring();*/

             //problem 3
             Tommy t1 = new Tommy();
             t1.Hit();
             t1.Run();
             t1.fire();
         }
     }

