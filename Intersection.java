/*Intersection of Two ArrayLists

Input: [1, 2, 3, 4] and [3, 4, 5, 6] → Output: [3, 4].
*/

import java.util.*; 
public class Intersection
{ public static void main(String args[])
  {
    List<Integer> al=new ArrayList<>();
    al.add(1);
    al.add(2);
    al.add(3);
    al.add(4);
 
   List<Integer> al2=new ArrayList<>();
   al2.add(3);
   al2.add(4);
   al2.add(5);
   al2.add(6);

  List<Integer> al3=new ArrayList<>();
  al2.retainAll(al);


  System.out.println(al2);

  }//main
}//class