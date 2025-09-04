package collection.gth;

import java.util.ArrayList;

public class IsEmpty {

	public static void main(String[] args) {
	 
		ArrayList al=new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		
		Boolean b=al.isEmpty();
		String em=b?"ArrayList is empty":"ArrayList is not empty";
		System.out.println(em);
	
	}

}
