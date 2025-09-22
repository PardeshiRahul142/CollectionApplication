/*Q.1
Create a LinkedList of integers. Perform the following operations:

Insert 5 numbers from the user.

Delete the 2nd element.

Update the last element with a new value.

Display the list.*/

import java.util.*;
public class LinkedListApp
{   public static void main(String args[])
    {   
      List<Integer> al=new LinkedList<>();
      al.add(10);
      al.add(20);
      al.add(30);
      al.add(40);
      al.add(50); 
      
    al.set(al.size()-1 ,5000);
    
    al.remove(2);
   for(Object obj:al)
    { System.out.println(obj);
    }

    }
}//class