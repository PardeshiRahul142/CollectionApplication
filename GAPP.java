import java.util.*;
public class GAPP
{  public static void main(String x[])
   {   ArrayList al = new ArrayList();
       al.add(100);
	   al.add(200);
	   al.add(300);
	   al.add("good");
	   al.add(400);
	   al.add(new java.util.Date());
	   int sum=0;
	   for(Object obj:al)
	   {
		  if(obj instanceof Integer)
		  {
	        sum = sum +(int)obj;
		  }
	   }
	   System.out.println("Sum is  "+sum);
   }
}
