package collection.gth;

import java.util.Vector;

public class Capcity {

	public static void main(String[] args) {
		Vector v=new Vector();
		v.add(10);
		v.add(20);
		v.add(30);
		v.add(40);
		v.add(50);
		
		System.out.println("Size of vector is :"+v.size());
		System.out.println("Capacity of vector is:"+v.capacity());

	}

}
