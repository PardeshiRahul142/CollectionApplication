/*3.Find Frequency of Each Element in ArrayList
Use a HashMap<T, Integer> to count occurrences of each element.*/

import java.util.*;
public class FrequencyOf
{  public static void main(String args[])
   {
     int a[]={10,20,30,40,10,20,30,40,50};

     HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();

     List<Integer> al=new ArrayList<Integer>();
          al.add(10);
          al.add(20);
          al.add(30);
          al.add(10);
     for(int val : a)
     {  Integer count=map.get(val);
       
        if(count==null)
        {  map.put(val,1);
        }
       else
        { map.put(val,count+1);
        }
     }
     Set<Map.Entry<Integer,Integer>> set=map.entrySet();
     for(Map.Entry<Integer,Integer>m:set)
     { if(m.getValue() > 0)
       { System.out.println(m.getKey()+"----->"+m.getValue());
       }
     }

   }
}//class