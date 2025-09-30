/* wild Generic   in unbounded generic*/

import java.util.*;
class Test
{  void dataSet(List<?>list)
   {
     for(Object obj:list)
     {  System.out.println(obj);
     }
   }
}
public class TAPPP
{  public static void main(String args[])
   {
      Test t=new Test();

      List<Integer> li=new ArrayList<>();
      System.out.println("List with integer parameter");
      li.add(10);
      li.add(20);
      li.add(30);
      li.add(40);
      li.add(50);
     t.dataSet(li);
  
      List<String> li1 =new ArrayList<>();
      System.out.println("List with String parameter");

       li1.add("Rahul");
       li1.add("Rohan");
       li1.add("Nilesh");
       li1.add("Avx");
       li1.add("pwr");
      
      t.dataSet(li1);

     
   }
}