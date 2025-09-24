/*Q.2
Sorting Custom Objects

Store Employee objects (id, name, salary).

Sort using Collections.sort() with Comparator (by name or salary).*/
import java.util.*;
import java.util.Comparator;
class Custom
{  
    private int id;
    private String name;
    private int salary;
   
   Custom(int id,String name ,int salary)
   {
     this.id=id;
     this.name=name;
     this.salary=salary;
   }
  
   public void setId(int id){ this.id=id;}
   public void setName(String name){this.name=name;}
   public void setSalary(int salary){ this.salary=salary;}

   public int getId(){ return id;}
   public String getName(){return name;}
   public int getSalary(){return salary;}

}//class 

class SortEmployeeBySal implements Comparator
{
	@Override
	public int compare(Object o1, Object o2) {
		Custom e1 = (Custom) o1;
		Custom e2 = (Custom) o2;
		return(e1.getSalary()>e2.getSalary()?1:e1.getSalary() < e2.getSalary()?-1:0);
		
	}
}
    class SortCustom implements Comparator<Custom> {
    public int compare(Custom c1, Custom c2) {
        return c1.getName().compareTo(c2.getName());
    }
}

public class SortApp
{  public static void main(String args[])
   {
    List<Custom> v=new Vector<>();
    v.add(new Custom(1,"Rahul",90432));
    v.add(new Custom(2,"Rohan",65394));
    v.add(new Custom(3,"Xys",43853));
    v.add(new Custom(4,"msi",6543));
    System.out.println("---------------------------------------------------------------------");

    System.out.println("Vector before sotrting");
    for(Custom cu:v)
    { System.out.println(cu.getId()+"\t"+cu.getName()+"\t"+cu.getSalary());
    } 
    Comparator c = new SortCustom();
    Collections.sort(v,c);
    System.out.println("---------------------------------------------------------------------");

    System.out.println("Employee Sorted by using Salary");
    for(Custom e:v) 
    {
     System.out.println(e.getId()+"\t"+e.getName()+"\t"+e.getSalary()); 
    }

    Comparator p=new SortEmployeeBySal();
    Collections.sort(v,p);
    System.out.println("---------------------------------------------------------------------");
    System.out.println("Sort by name : ");
    for(Custom e:v)
    {
      System.out.println(e.getId()+"\t"+e.getName()+"\t"+e.getSalary()); 
    }


   }//main
}//class

 