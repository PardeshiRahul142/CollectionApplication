import java.util.*;
public class CMAPP
{ public static void main(String args[])
  {
    List<Integer> al=new ArrayList<Integer>();
                  al.add(40);
                  al.add(50);
                  al.add(10);
                  al.add(30);
                

    System.out.println("Before sorting arrayList..."); 
    Iterator i=al.iterator();
     while(i.hasNext())
     { System.out.println(i.next());
     }

    Collections.sort(al);
    System.out.println("After sorting ArrayList...");
    ListIterator li=al.listIterator();
    while(li.hasNext())
    { System.out.println(li.next());
    }

   Integer min=Collections.min(al);
   Integer max=Collections.max(al);

   System.out.println("Min element is :"+min);
   System.out.println("Max element is :"+max);

   Collections.reverse(al);
  
   System.out.println("After reverse element ");
   for(Integer re:al)
   { System.out.println(re);
   }
  
}
}