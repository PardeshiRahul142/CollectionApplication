import java.util.*;
public class LinkedHashSetEx{
    public static void main(String[] args) {
        LinkedHashSet<Integer> lh = new LinkedHashSet<>();
        lh.add(10);
        lh.add(20);
        lh.add(30);
        lh.add(40);
        lh.add(50);

        System.out.println();  
        for (Object obj : lh) {
            System.out.println(obj);
        }
    }
}
