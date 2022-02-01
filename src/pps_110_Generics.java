import java.util.ArrayList;
class MyGenerics<T1,T2>{
    int val = 344;
    private T1 t1;
    private T2 t2;

    public MyGenerics(int val, T1 t1, T2 t2) {
        this.val = val;
        this.t1 = t1;
        this.t2 = t2;
    }

    public int getVal() {
        return val;
    }
    public T1 getT1() {
        return t1;
    }
    public void setVal(int val) {
        this.val = val;
    }
    public void setT1(T1 t1) {
        this.t1 = t1;
    }

    public T2 getT2() {
        return t2;
    }

    public void setT2(T2 t2) {
        this.t2 = t2;
    }
}
public class pps_110_Generics {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
      //  ArrayList<Int> = new ArrayList<>(); //this will produce an error
        arrayList.add(54);
        arrayList.add(59);
        arrayList.add(665);
      //  arrayList.add(new Scanner(System.in));
       // System.out.println(arrayList.get(2));
     //   int a = arrayList.get(0);
     //   System.out.println(a);
        MyGenerics<String, Integer> g1 = new MyGenerics(23,"This is generic class demo", 23);
        String str = g1.getT1();
        Integer int1 = g1.getT2();
        System.out.println(str);
        System.out.println(int1);
    }
}
