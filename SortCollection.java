//WAP to store 5 values in Vector and arrange in ascending without using sort() methods of Collections 
package collection.gth;

import java.util.Iterator;
import java.util.Vector;

public class SortCollection {
	public static void main(String[] args) {
	
		Vector v=new Vector();
		v.add(10);
		v.add(20);
		v.add(30);
		v.add(40);
		v.add(50);
		
		System.out.println("Descending order Vector sort :");
		for(int i=0;i<v.size();i++)
		{  for(int j=i+1;j<v.size();j++)
		   {    if((int)v.get(i) < (int)v.get(j))
		       {
			    int temp=(int)v.get(i);
			    v.set(i,v.get(j));
			    v.set(j,temp);
		       }
		   }
		}
		for(int i=0;i<v.size();i++)
		{
			System.out.println(v.get(i));
		}


	}

}
