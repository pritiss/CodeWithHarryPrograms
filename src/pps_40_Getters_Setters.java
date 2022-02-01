
    class MyEmployee {
        private int id;
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String n) {
            this.name = n;
        }
        public void setId(int i) {
            id = i;
        }
        public int getId(){
            return id;
        }
    }
    public class pps_40_Getters_Setters {
        public static void main(String[] args) {
        MyEmployee priti =  new  MyEmployee();
        //getters value return karta hain
       // priti.id = 4;
      //  priti.name = "Aradhya and Malhar";  //throws an error due to private access modifier
            priti.setId(5);
            System.out.println(priti.getId());
            priti.setName("Priti Sunath Shingade");
            System.out.println(priti.getName());
        }
}
