//WAP to store 10 integers in a Vector and check whether all elements are unique.
import java.util.*;
public class CheckUnique
{  public static void main(String args[])
   {
    Vector<Integer> v=new Vector<>();
   v.add(32);
   v.add(20);
   v.add(12);
   v.add(65);
   v.add(10);
   v.add(10);
   v.add(21);
   v.add(40);
   v.add(11);
   v.add(12);
 int size=v.size();
boolean isDuplicate=false;
 for(int i=0;i<size;i++)
 {
  for(int j=i+1;j<size;j++)
  {
   if(v.get(i) == v.get(j))
    {
      isDuplicate=true;
        break;
    }
  }
}
 if(isDuplicate)
  { 
  System.out.println("Is not unique");
  }
 else
  {
  System.out.println("Is unique");
  }

}//main
}//class
