/*Q1. WAP to create Vector and store 5 values in it and fetch it using Iterator, ListIterator, Enumeration and enhance for loop?*/

import java.util.*;
public class VAPP
{ public static void main(String args[])
  {
    Vector<Integer> v=new Vector<Integer>();
                  v.add(10);
                  v.add(20); 
                  v.add(30);
                  v.add(40);
                  v.add(50);
     System.out.println("Using iterator interface fetching data...");
     Iterator i=v.iterator();
     while(i.hasNext())
     {
       Object obj=i.next();
       System.out.println(obj);
     }
     
     System.out.println("Using Enumeration method fetching Data...");
     Enumeration<Integer> enu = v.elements();
     while(enu.hasMoreElements()) 
     {
       Integer obj = enu.nextElement();  // or use Object if generic type not known
       System.out.println(obj);
    }
     System.out.println("Using ArrayList to fetch Data... Forward");
     ListIterator<Integer> t=v.listIterator();
     while(t.hasNext())
     {//  Object obj=t.next();
        System.out.println(t.next());
     }
 
      System.out.println("Using array List to fetch Data...BackWord");
     ListIterator<Integer> t1=v.listIterator(v.size());
     while(t1.hasPrevious())
     {//  Object obj=t1.previous();
        System.out.println(t1.previous());
     }
     System.out.println("Fetching data by using inhance for loop...");
     for(Integer inh:v)
     { System.out.println(inh);
     }
     
    
    
   }

}