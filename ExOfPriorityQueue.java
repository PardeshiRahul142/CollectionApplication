import java.util.*;
public class ExOfPriorityQueue
{ public static void main(String args[])
  {
    PriorityQueue<Integer> pq=new PriorityQueue<>();
    pq.add(6);
    pq.add(1);
    pq.add(4);
    pq.add(2);
 
   for(Integer val : pq)
   {  System.out.println(val);
   }
  }
}//class