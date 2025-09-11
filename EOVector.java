//WAP to store 7 integer values in a Vector and display only the prime numbers.
import java.util.*;
public class EOVector
{   public static void main(String args[])
    {
     Vector<Integer> v=new Vector<>();
     v.add(10);
     v.add(12);
     v.add(31);
     v.add(43);
     v.add(50);
     v.add(41);
     v.add(43);
     v.add(41);
    System.out.println("Even Element in vector : ");
    for(int n:v)
    {
      if(n % 2== 0 )
      {
        System.out.println(n);
      }
    }
    System.out.println("Odd Element in vector : ");
    for(int no:v)
    {
      if(no % 2 !=0)
      {
          System.out.println(no);
      }
    }
         
    }//main method
}//class