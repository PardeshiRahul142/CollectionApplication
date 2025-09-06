package collection.gth;

import java.util.ArrayList;
import java.util.*;
public class MenuDrivenApp {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	ArrayList al=new ArrayList();
	
  do
  {   System.out.println("1.Add Element");
	  System.out.println("2.Display element :");
	  System.out.println("3.is contain :");
	  System.out.println("4.is empty :");
      System.out.println("5.is size");
      System.out.println("Enter your chooice : ");
	  int ch=sc.nextInt();
    switch(ch)
    {
    case 1:  System.out.println("Enter element :");
              int el=sc.nextInt();
              boolean ad=al.add(el);
              if(ad)
              { System.out.println("Element Add");
              }
              else
              {  System.out.println("Element not Add");
              }
               break;
    case 2:
    	        System.out.println("Array List is :");
    	        Iterator i=al.iterator();
    	        while(i.hasNext())
    	        {   Object obj=i.next();
    	            System.out.println(obj);
    	        }
             break;
    case 3:
    	       System.out.println("Enter the element check in ArrayList :");
    	       int num=sc.nextInt();
    	       
    	       boolean isCon=al.contains(num);
    	       if(isCon)
    	       { System.out.println("Element is found");
    	       }
    	       else
    	       { System.out.println("Element is not found");
    	       }
    	         break;
    case 4:
    	           boolean isEmp=al.isEmpty();
    	       if(isEmp)
    	       {  System.out.println("ArrayList is empty");   	    	     
    	       }
    	       else
    	       {  System.out.println("ArrayList is not empty");
    	       }
    	          break;
    case 5:
    	         int len =al.size();
    	         System.out.println("Size of arrayList :"+len);
    	         break;
    default :
    	            System.out.println("Choice mismatch");
    	        
    } 
  }
  while(true);
}
}
