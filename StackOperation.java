/*Q.4
Write a program to push 5 elements into a Stack and then pop them one by one (LIFO order).
*/
import java.util.*;
public class StackOperation
{   public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
     Stack<Integer> v=new Stack<>();
     v.push(10);
     v.push(20);
     v.push(30);
     v.push(40);
     v.push(50);
     
  System.out.println(v);
   while (!v.isEmpty()) {
            System.out.println("Popped: " + v.pop());
        }
    }//main
}//class