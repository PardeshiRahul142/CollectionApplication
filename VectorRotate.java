/*Q.6
Vector Rotation

Input: [1, 2, 3, 4, 5], rotate by 2

Output: [4, 5, 1, 2, 3].

Q.7*/

import java.util.*;
public class VectorRotate
{ public static void main(String args[])
  {
   List<Integer> al=new Vector<>();
   al.add(1);
   al.add(2);
   al.add(3);
   al.add(4);
   al.add(5);
   int n=al.size();
   int k=2;
   List<Integer> v2=new Vector<>();
   int index=2;
   for(int i=0;i<n;i++)
   {   v2.add(al.get((i+n-k)%n));  
   }
   for(int i=0;i<n;i++)
   {  System.out.println(v2.get(i));
   }
   
  }//main
}//class