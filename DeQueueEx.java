import java.util.*;
public class DeQueueEx
{ public static void main(String args[])
  {
     ArrayDeque<Integer> deq=new ArrayDeque<Integer>();
     deq.addFirst(10);
     deq.add(20);
     deq.add(30);
    deq.addLast(100);
    deq.addLast(50);
    System.out.println("Before removing element :");
    for(Integer val:deq)
    {  System.out.println(val);
    }

    Integer rem=deq.removeLast();
     System.out.println("After removing Last element :"+rem);
    for(Integer val1:deq)
    {  System.out.println(val1);
    }
     Integer rem1=deq.removeFirst();
     System.out.println("After removing first element :"+rem1);
    for(Integer val2:deq)
    {  System.out.println(val2);
    } 
     System.out.println("After void push  element :");
     deq.push(29);
    Iterator i=deq.iterator();
    while(i.hasNext())
    {System.out.println(i.next());
    }
  }//main 
}//class