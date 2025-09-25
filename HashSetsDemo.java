/*10)Union of Two Sets
Create two HashSets of integers. Add some elements in both. Perform union using addAll() and print the result.*/

import java.util.*;
public class HashSetsDemo
{  public static void main(String args[])
   {
     HashSet<Integer> hs=new HashSet<>();
    hs.add(20);
    hs.add(9);
    hs.add(23); 
    hs.add(32);
    hs.add(40);
 
    HashSet<Integer> hs1=new HashSet<>();
    hs1.add(20);
    hs1.add(9);
    hs1.add(11); 
    hs1.add(23);
    hs1.add(40);
  
   hs.addAll(hs1);
   
    for(Integer num:hs)
    { System.out.println(num);
    }
 
   

   
   }
}//class