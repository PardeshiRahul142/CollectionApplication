/*
8)TreeSet Sorting
Create a TreeSet of integers and add numbers in random order. Show how it automatically sorts elements.*/
import java.util.*;
public class TreeSetSort
{  public static void main(String args[])
   {
    Set<Integer> ts=new TreeSet<>();
    ts.add(50);
    ts.add(20);
    ts.add(30);
    ts.add(10);

   System.out.println("TreeSet is :");
   for(Integer set:ts)
   { System.out.println(set);
   }
 
   }
}//class