//Q5. Write a program to store 6 integers in an ArrayList and sort them in ascending order.
//Explanation:
 //Use Collections.sort(list) to perform sorting. This is a common real-life operation.

import java.util.*;
public class SortAList
{  public static void main(String args[])
   {
    ArrayList al=new ArrayList();
     al.add(10);
     al.add(20);
     al.add(120);
     al.add(40);
     al.add(89);

    System.out.println("before sorting :");
    for(Object obj:al)
    {  System.out.println(obj);
    }
    Collections.sort(al);
    System.out.println("before sorting :");
    for(Object obj:al)
    {  System.out.println(obj);
    }

   }//main
}//class