/*Q.1
Remove Duplicates from ArrayList

Input: [1, 2, 3, 2, 1, 4]

Output: [1, 2, 3, 4] without using Set.
*/

import java.util.*;
public class DuplicateArrayList
{   public static void main(String args[])
    {
     List<Integer> al=new ArrayList<>();
     al.add(1);
     al.add(2);
     al.add(3);
     al.add(2);
     al.add(1);
     al.add(4);
    
    List<Integer> li=new ArrayList<>();
   int size=al.size();
   for(int i=0;i<al.size();i++)
   {  for(int j=i+1;j<al.size()-1;j++)
      { 
       if(al.get(i) == al.get(j))
        {  al.remove(j);
           j--;
        }  
         
        
      }
   }
   for(int i=0;i<al.size();i++)
   { System.out.println(al.get(i));
   }
         
  }//main
}//class