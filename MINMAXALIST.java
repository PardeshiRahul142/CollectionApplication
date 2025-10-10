//1.Find Maximum and Minimum in ArrayList
//Use Collections.max() and Collections.min() or iterate through the list to find max/min values.

import java.util.*;
public class MINMAXALIST
{  public static void main(String args[])
   {  List<Integer> al=new ArrayList<Integer>();
      al.add(10);
      al.add(20);
      al.add(30);
      al.add(40);
      al.add(50);

    int max=Collections.max(al);
    int min=Collections.min(al);
 
    System.out.println("Min is :"+min);
    System.out.println("Max is :"+max);
   }
}//class