//WAP to store 15 integer values in a Vector and separate even and odd numbers into two different Vectors.
import java.util.*;
public class OddEvenVector
{  public static void main(String args[])
   { 
     Vector<Integer> v=new Vector<>();
      v.add(30);
      v.add(21);
      v.add(40);
      v.add(53);
      v.add(70);
      v.add(54);
      v.add(11);
      v.add(13);
    Vector<Integer> even= new Vector<>();
    Vector<Integer>odd=new Vector<>();
     for(int n:v)
      {
        if(n % 2 == 0 )
        {
         even.add(n);
        }
        if(n % 2 !=0)
        {
           odd.add(n);
        }
      }
    System.out.println("Original vector :");
    Iterator a=v.iterator();
  while(a.hasNext())
  {
    Object o=a.next();
   System.out.println(o);
  }

   System.out.println("Even Vector is :");
     Iterator i=even.iterator();
   while(i.hasNext())
   { 
     Object obj=i.next();
    System.out.println(obj);
   } 
  System.out.println("Odd Vector is :");
  Iterator it=odd.iterator();
  while(it.hasNext())
   {
    Object obj=it.next();
    System.out.println(obj);
   }
    }//main
}//class