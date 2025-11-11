import java.util.*;
public class TESTMAPAPP
{ public static void main(String args[])
  {
    LinkedHashMap<String,ArrayList<String>>map=new LinkedHashMap<String, ArrayList<String>>();
    
    ArrayList<String> ind=new ArrayList<String>();
    ind.add("Rohit");
    ind.add("Virat");
    ind.add("Hardik");

    ArrayList<String> aus=new ArrayList<String>();
    aus.add("Warnar");
    aus.add("Smith");
    aus.add("Head");

   map.put("India",ind);
   map.put("Aus" , aus);

   Set<Map.Entry<String , ArrayList<String>>> set=map.entrySet();
   for(Map.Entry<String , ArrayList<String>> m:set)
   {
     System.out.println(m.getKey()+"   "+m.getValue());
   }
  }
}