
 class employee {
     int id;
     int salary;
     String name;

     public void printdetails() {
         System.out.println("employee id= " + id);
         System.out.println("Name of employee = " + name);
         System.out.println("Salary of employee = "+salary);
     }

     public int getSalary() {
         return salary;
     }
 }


public class pps_38_custom_class {
    public static void main(String[] args) {
        System.out.println("This is our custom class");
        employee priti = new employee();//instantiation a new employee object
        employee nishu = new employee();
        //setting attributes for priti
        priti.id = 45;
        priti.name = "Code with harry";
        priti.salary = 10000;
        //setting attributes for nishu
        nishu.id = 88;
        nishu.name = "Aradhya";
        nishu.salary = 8900;
        priti.printdetails();
        nishu.printdetails();
       // System.out.println(salary);
        //printing the properties
        //System.out.println(priti.id);
        // System.out.println(priti.name);
    }
}


