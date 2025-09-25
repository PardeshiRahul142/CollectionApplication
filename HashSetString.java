/*
2)Check if Element Exists
Create a HashSet of Strings. Add some names and check if a particular name exists using contains().
*/

import java.util.*;
public class HashSetString
{  public static void main(String args[])
   {
     HashSet<String> hs=new HashSet<>();
    hs.add("Rahul");
    hs.add("Rohan");
    hs.add("Nilesh");
    hs.add("Nikhil");
    hs.add("Yuvraj");
  
   Boolean co=hs.contains("Rahul");
   String msg=co?"Is Found ":"Is not Found ";
   System.out.println(msg);

 

   }//main
}//class