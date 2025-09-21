/*he right of every element in the array.
• If a smaller element exists on the right, store that.
• If no element is smaller, store -1.
Input: {8, 58, 71, 18, 31, 32, 63, 92, 43, 3, 91, 93, 25, 80, 28}
Output : {3, 18, 18, 3, 25, 25, 43, 43, 3, -1, 25, 25, 28, 28, -1}*/

import java.util.*;
public class SmallEle
{  public static void main(String args[])
   {
    int a[]={8, 58, 71, 18, 31, 32, 63, 92, 43, 3, 91, 93, 25, 80, 28};
    int size=a.length;
    
      for(int i=0;i<size;i++)
      { boolean flag=false;
         for(int j=i+1;j<size;j++)
        { if(a[i] > a[j])
          {
            System.out.println(a[j]); 
                flag=true;
                break;
         }
       }
        if(flag == false) {   // if no smaller element was found
        System.out.print(-1 + " ");
         }
      }
   }
}
