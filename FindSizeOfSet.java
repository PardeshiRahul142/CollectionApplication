/*6)Find Size of Set
Create a HashSet of integers and print its size using size() method.
*/

import java.util.*;
public class FindSizeOfSet
{  public static void main(String args[])
   {
    Set<Integer> set=new HashSet<>();
    set.add(20);
    set.add(90);
    set.add(40);
    set.add(32);
    
   int size=set.size();
  System.out.println("Size is :"+size);

   }
}//class