package collection.gth;
import java.util.*;
//java.util.ArrayList;

public class LinkListSortEx {

	public static void main(String[] args) {
	ArrayList ar=new ArrayList();
	ar.add(10);
	ar.add(20);
	ar.add(30);
	ar.add(40);
	ar.add(50);
	
	Iterator i=ar.iterator();
	int sum=0;
	while(i.hasNext())
	{
 		Object obj=i.next();
		sum=sum+(int)obj;
		
	}
	System.out.println("sum is :"+sum);
	}
}
