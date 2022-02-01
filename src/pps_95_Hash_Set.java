import java.util.HashSet;

public class pps_95_Hash_Set {
    public static void main(String[] args) {
        HashSet<Integer> myHashSet = new HashSet<>(6,0.5f);
        myHashSet.add(5);
        myHashSet.add(8);
        myHashSet.add(7);
        myHashSet.add(11);
        myHashSet.contains(11);
        System.out.println(myHashSet);
    }

}
