/*Q.3
Merge Two ArrayLists

Merge ArrayList<Integer> A and B into one sorted list.
*/
import java.util.*;
public class MargeArrayList
{  public static void main(String arvs[])
   {
     ArrayList<Integer> al=new ArrayList<>();
     al.add(10);
     al.add(40);
     al.add(10);
     al.add(30);

     ArrayList<Integer> al2=new ArrayList<>();
     al.add(2);
     al.add(10);
     al.add(10);
     al.add(10);
    
    al.addAll(al2);
    System.out.println("Marged List :"+al);

    for(int i=0;i<al.size();i++)
    {  for(int j=i+1;j<al.size();j++)
       { if(al.get(i) == al.get(j))
         {
          al.remove(j);
          j--;
         }
       }
    }
    System.out.println("After removing duplicate :");
    for(Integer an:al)
    { System.out.println(an);
    }

   }//main
}//class