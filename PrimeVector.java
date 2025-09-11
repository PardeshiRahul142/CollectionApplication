////WAP to store 7 integer values in a Vector and display only the prime numbers.
import java.util.*;
public class PrimeVector
{  public static void main(String args[])
   {
     Vector<Integer> ve=new Vector();
         ve.add(30);
        ve.add(630);
	ve.add(3);
	ve.add(5);
	ve.add(7);
	ve.add(8);
	ve.add(56);
	ve.add(58);
	ve.add(77);
	ve.add(15);
	ve.add(45);
  
   for(int n:ve)
   {
      if(isPrime(n))
      {
         System.out.println(n);
      }
   }
}
     static boolean isPrime(int num)
      {
        if(num<= 1)
        {  return false;
        }
      for(int i=2 ; i<num/2;i++)
       {  if(num % i ==0)
          { return false;
          }
       }
       return true;
     }
}//class