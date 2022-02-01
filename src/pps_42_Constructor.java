
class MyMainEmployee {
    private int id;
    private String name;

    public MyMainEmployee(){ // Simple Constructor
        id = 23;
        name = "Priti Solat";
   }
    public MyMainEmployee(String myName, int myId){ //Constructer with parameter
        id = myId;
        name = "myName";
    }
    public String getName() {
        return name;
    }

    public void setName(String n) {
        this.name = n;
    }

    public void setId(int i) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}

    public class pps_42_Constructor {
        public static void main(String[] args) {
           // MyMainEmployee Obj = new MyMainEmployee("Code With Aradhya", 24);
            MyMainEmployee Obj = new MyMainEmployee();

            //  Pobj.setName = "Code with priti";
           // System.out.println(Pobj.MyMainEmp;());
          //          Pobj.setid = 23;
            System.out.println(Obj.getId());
            System.out.println(Obj.getName());
        }
    }

