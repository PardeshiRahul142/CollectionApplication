//wild card generic
import java.util.*;
class Test
{ 
    public void setDate(List<?>list)
    { 
      for(Object obj:list)
      { System.out.println(obj);
      }
    }
}
public class TAPP
{   public static void main(String args[])
    { Test t1=new Test();
      List<Integer> list=new ArrayList<>();
      list.add(10);
      list.add(30);
      list.add(10);
      t1.setDate(list);
      System.out.println("");
     List<String> list1=new ArrayList<>();
    list1.add("Rahul");
     list1.add("Rohan");
     list1.add("Abc");
     t1.setDate(list1);
    }
}