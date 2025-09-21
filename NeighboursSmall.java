/*Q4. Problem: An element is a peak if it is not smaller than its neighbors. Print any peak element.
• Input: {10, 20, 15, 2, 23, 90, 67}
• Output: 20 or 90 (both are peaks).
Concept: Traverse or use binary search for efficient solution */

import java.util.*;
public class NeighboursSmall
{  public static void main(String args[])
   {
     int a[]={10,20,15,2,23,90,67};  
     int size=a.length-1;
     for(int i=1;i<size;i++)
     {
         if(a[i] > a[i+1] && a[i] > a[i-1])
         {System.out.println(a[i]);
         }
     }
  
   }//main
}//class