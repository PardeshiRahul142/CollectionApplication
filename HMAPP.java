import java.util.*;
public class HMAPP
{ public static void main(String args[])
  { LinkedHashMap<Integer,String> map=new LinkedHashMap<Integer,String>();
    map.put(1,"ABC");
    map.put(2,"PQR");
    map.put(3,"STV");

   String name=map.get(2);
   if(name != null)
   { System.out.println("Data found ..");
   }
   else
   { System.out.println("Data not found");
   }
  }
}