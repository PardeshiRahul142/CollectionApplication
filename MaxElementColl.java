package collection.gth;
import java.util.*;
import java.util.ArrayList;
public class MaxElementColl {
	public static void main(String[] args) {
	 
		ArrayList al=new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		
		Iterator i=al.iterator();
		int max=(int)al.get(0);
		while(i.hasNext())
		{
			Object ob=i.next();
			if((int)ob > max)
			{
				max=(int)ob;
			}
		}
		System.out.println("Max number is :"+max);
	}

}
