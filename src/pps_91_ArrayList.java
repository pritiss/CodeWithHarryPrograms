import java.util.*;
public class pps_91_ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>(); //Generices Syntax
        ArrayList<Integer> l2 = new ArrayList<>(5); //Generices Syntax
        l2.add(15);
        l2.add(18);
        l2.add(19);

        l1.add(6);                                //means kisi bhi class ke saath hum
        l1.add(7);                                //means kisi bhi class ke saath hum
        l1.add(4);                                //means kisi bhi class ke saath hum
        l1.add(6);                                //means kisi bhi class ke saath hum
        l1.add(0, 5);
        l1.add(0, 7);
        l1.addAll(0, l2);
        System.out.println(l1.contains(55));
        System.out.println(l1.indexOf(6));
        System.out.println(l1.lastIndexOf(6));
        l1.set(2,600);
        // l1.clear();//means kisi bhi class ke saath hum
        for (int i = 0; i < l1.size(); i++) {            // kaunsa parameter supply karna chahte hain
            System.out.print(l1.get(i));
            System.out.print(",");
            // }
        }
        //it is may be int, Stings}}
    }
}
