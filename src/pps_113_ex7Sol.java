class Book{
    private int id;
    private String name;

    public void setId(int id){
        this.id = id;
    }
    public int getId(){
        return id;
    }
    public void SetName(String n){
        name = n;
    }
    public String getName(){
        return name;
    }
}
public class pps_113_ex7Sol {
    public static void main(String[] args) {
     Book b1 = new Book();
     b1.SetName("Priti");
        System.out.println(b1.getName());
        b1.setId(89);
        System.out.println(b1.getId());

    }
}