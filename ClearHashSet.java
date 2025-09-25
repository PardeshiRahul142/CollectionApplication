/*7)Clear a Set
Create a HashSet of 5 numbers. Clear the set using clear() and check if it’s empty using isEmpty().
*/
import java.util.*;
public class ClearHashSet
{  public static void main(String args[])
   {
     HashSet<Integer> hs=new HashSet<>();
    hs.add(19);
    hs.add(30);
    hs.add(21);
    hs.add(49);
    hs.add(90);
 
   hs.clear();
  boolean b=hs.isEmpty();
  String msg=b?"Is empty":"No not empty";
 System.out.println(msg);

   }//main
}//class