import java.util.ArrayDeque;

public class pps_93_ArrayDeque {
    public static void main(String[] args) {
        ArrayDeque <Integer> ad1 = new ArrayDeque<>();
        ad1.add(6);
        ad1.add(56);
        ad1.add(9);
        ad1.addFirst(99);
        System.out.println(ad1.getFirst());
        System.out.println(ad1.getLast());

    }
}
