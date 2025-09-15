// Problem: Store integers in a Vector. Remove all odd numbers and print only even numbers.
import java.util.*;
public class IntergerVector
{   public static void main(String args[])
    {
      Vector<Integer> v=new Vector<>();
       v.add(3);
       v.add(3);
       v.add(2);
       v.add(10);
       v.add(20);
       v.add(40);
   
   System.out.println("Even number :");
    for(int i=0;i<v.size();i++)
    {
      int o=v.get(i);
      if(o % 2==0)
       { System.out.println(o);
       }
    }
}//main
}//class 