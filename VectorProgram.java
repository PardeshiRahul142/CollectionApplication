//WAP to store 5 values in Vector and arrange in ascending without using sort() methods of Collections 
import java.util.*;
public class VectorProgram
{   public static void main(String args[])
    {
       Vector v=new Vector();
       v.add(100);
       v.add(21);
       v.add(3023);
       v.add(402);
       v.add(11);

      for(int i=0;i<v.size();i++)
      {
          for(int j=i+1;j<v.size();j++)
          {
               if((int)v.get(i) > (int)v.get(j))
               {
                    int temp=(int)v.get(i);
                        v.set(i ,v.get(j));
                        v.set(j,temp);
               }
          }
      } 
       System.out.println("after Sorting vector ");
       for(int i=0;i<v.size();i++)
       {
          System.out.println(v.get(i));
       } 
    }
}