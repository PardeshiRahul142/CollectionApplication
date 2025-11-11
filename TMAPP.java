import java.util.*;
public class TMAPP
{ public static void main(String args[])
  { TreeMap<Integer , String > tm=new TreeMap<Integer,String>();
   
     tm.put(1,"Rahul");
     tm.put(20,"Rohan");
     tm.put(2,"Nilesh");  
     tm.put(21,"Nilhil");

     Set<Map.Entry<Integer,String>>set=tm.entrySet();
     for(Map.Entry<Integer,String> m:set)
     { System.out.println(m.getKey()+"--------->"+m.getValue());
     }
  }
}