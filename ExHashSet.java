/*1)Create a HashSet
Write a Java program to create a HashSet of integers and add 5 numbers to it. Then print all elements.
*/
import java.util.*;
public class ExHashSet
{   public static void main(String args[])
    {
      HashSet<Integer> hs=new HashSet<>();
      hs.add(10);
      hs.add(9);
      hs.add(40);
      hs.add(20);
      hs.add(34);
  
     for(Integer a:hs)
      { System.out.println(a);
      }
    }
}//class 