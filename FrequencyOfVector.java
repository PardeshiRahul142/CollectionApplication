//WAP to store 12 numbers in a Vector and display the frequency of each number.
import java.util.*;
public class FrequencyOfVector
{   public static void main(String args[])
    { 
     Vector<Integer> v=new Vector<>();
     v.add(20);
     v.add(30);
     v.add(20);
     v.add(30);
     v.add(50);
     v.add(30);
     v.add(50);
     v.add(50);
 
    int size=v.size();
    System.out.println("Sort the vector ");
    for(int i=0;i<size;i++)
    {
       for(int j=i+1;j<size;j++)
       {
           if(v.get(i) > v.get(j))
           {
               int temp=v.get(i);
                v.set(i,v.get(j));
                v.set(j,temp);
           }
       }
    }
    for(int i=0;i<size;i++)
    {
       System.out.println(v.get(i));
    }
    int count=1;
    for(int i=0;i<size-1;i++)
    {
      if(v.get(i) == v.get(i+1))
      {
         count++;
      }
      else
      {
       System.out.println(" "+v.get(i)+": times :"+count );
       count=1;
      }
    }
     System.out.println(" "+v.get(size-1)+": times :"+count );

    
    
     
    }//main method
 
}//class