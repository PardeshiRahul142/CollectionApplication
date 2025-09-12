//WAP to store 10 employee ages in a Vector and count how many employees are minors (<18), adults (18–60), and seniors (>60).
import java.util.*;
public class CountAge
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
    int minor=0;
    int adult=0;
    int senior=0;
   for(int i=0;i<v.size();i++)
    {
     if(v.get(i) < 18 )
      {
        minor++;
      }
    else if(v.get(i)> 18 && v.get(i) < 60)
      {
         adult++;
      }
     else
      {
       senior++;
      }
   }
   System.out.println("Minor count is :"+minor);
   System.out.println("Adult count is :"+adult);
   System.out.println("Senior count is :"+senior);
   }
}//class
