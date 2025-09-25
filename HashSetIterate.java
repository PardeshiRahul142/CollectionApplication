/*4)Iterate a HashSet
Create a HashSet of integers and iterate over it using*/

import java.util.*;
public class HashSetIterate
{  public static void main(String args[])
   {
     HashSet<Integer> hs=new HashSet<>();
    hs.add(19);
    hs.add(30);
    hs.add(21);
    hs.add(49);
    hs.add(90);
  System.out.println("HashSet using inhance for loop ");
  for(Object an:hs)
  { System.out.println(an);
  }
 System.out.println("HashSet Using iterator ");
 Iterator i=hs.iterator();
 while(i.hasNext())
 {
   System.out.println(i.next());
 }

   }//main
}//class