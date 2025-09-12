//WAP to store 15 integers in a Vector and find the second largest and second smallest values.
import java.util.*;
public class FindMaxSmaxEle
{  public static void main(String args[])
   {
    Vector<Integer> v=new Vector<>();
   v.add(32);
   v.add(20);
   v.add(12);
   v.add(65);
   v.add(10);
   v.add(50);
   v.add(21);
   v.add(40);
   v.add(11);
   v.add(23);
 int size=v.size();
 int smax=v.get(0);
 int max=v.get(0);
 for(int i=0;i<size;i++)
 {
   if(v.get(i) > max)
    {
      max=v.get(i);
    }
    if(v.get(i) > smax && v.get(i) != max)
      {
       smax=v.get(i);
     } 
 }
  System.out.println("Max is :"+max);
  System.out.println("Smax is :"+smax);

}//main
}//class