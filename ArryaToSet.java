/*5)Convert Array to Set
Convert an array of strings to a Set and print unique elements.*/

import java.util.*;
public class ArryaToSet
{  public static void main(String args[])
   {
   int arr[]={1,2,32,2,3,4,2,4,3,2};
   
   Set<Integer> set=new HashSet<>();
   for(int num:arr)
   {
     set.add(num);
   }


   for(Integer s:set)
   {  System.out.println(s);
   }

   }
}//class