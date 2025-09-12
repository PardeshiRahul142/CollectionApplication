//WAP to store 10 integers in a Vector and shift all elements to the left by 2 positions.
import java.util.*;
public class ShiftElement
{    public static void main(String args[])
     {
       Vector<Integer> v=new Vector<>();
       v.add(10);
       v.add(20);
       v.add(30);
       v.add(40);
       v.add(50);
       v.add(60);
       v.add(70);

     int size=v.size();
     int k=2;
     for(int i=0;i<k;i++)
     {
       int temp=v.get(0);
       for(int j=0;j<size-1;j++)
       {
           v.set(j,v.get(j+1));
       }
        v.set(size-1,temp);
      }
      for(int i=0;i<size;i++)
       {
        System.out.println(v.get(i));
       }
     }//main
}//class 