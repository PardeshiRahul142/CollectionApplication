import java.util.*;
public class MMVector
{   public static void main(String args[])
    {
      Vector<Float> v=new Vector<>();
      v.add(23.2f);
      v.add(42.4f);
      v.add(3.4f);
      v.add(9.5f);
      v.add(3.2f);
   float max=v.get(0);
   float min=v.get(0);
   float sum=0;

   for(float n :v)
    {
      if(n > max)
       {
        max=n;
       }  
      if(n <= min)
       {
         min=n;
       }
     sum+=n;
    }
    float avg=sum/v.size();
  
 System.out.println("Max is :"+max);
 System.out.println("Min is :"+min);
 System.out.println("total is :"+avg);
  }
}//class