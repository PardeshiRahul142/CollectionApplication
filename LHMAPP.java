import java.util.*;
public class LHMAPP
{ public static void main(String args[])
  {
     LinkedHashMap<Integer,String > lh=new LinkedHashMap<Integer,String>();
     lh.put(1,"Rahul");
     lh.put(1,"NI");
     lh.put(10,"Rohan");
     lh.put(30,"Nilesh");
     lh.put(2,"Hey");

     Set<Map.Entry<Integer,String>>setRef=lh.entrySet();
     for(Map.Entry<Integer,String>m:setRef)
     { System.out.println(m.getKey()+"----------->"+m.getValue());
     }
  }
}