//tree set NaviableSet<> for descending order
import java.util.*;
public class TreeSetEx
{ public static void main(String args[])
  {  TreeSet<Integer> ts=new TreeSet<>(); 
       ts.add(10);
       ts.add(20);
       ts.add(30);
       ts.add(40);

    NavigableSet<Integer> navSet=ts.descendingSet();
    for(Integer val:navSet)
    {  System.out.println(val);
    }


  }//main
}//class