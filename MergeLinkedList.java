/*Q.2
Write a program to merge two LinkedLists (e.g., List A = [1,2,3], List B = [4,5,6] → [1,2,3,4,5,6]).
*/
import java.util.*;
public class MergeLinkedList
{   public static void main(String args[])
    {
      List<Integer> A=new LinkedList<>();
      A.add(1);
      A.add(2);
      A.add(3);
 
     List<Integer> B=new LinkedList<>();
      B.add(4);
      B.add(5);
      B.add(6);

     A.addAll(B);
    
    System.out.println(A);
    }
}//class