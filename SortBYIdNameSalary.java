import java.util.*;

class StudentSort
{ 
    private int id;
    private String name;
    private int salary;

    StudentSort(int id,String name , int salary)
    {
       this.id=id;
       this.name=name;
       this.salary=salary;
    }
    
    public int getId(){ return id;}
    public String getName(){ return name;}
    public int getSalary(){ return salary;}

}//class

class SortById implements Comparator
{
   public int compare(Object o1, Object o2)
   {
      StudentSort obj1=(StudentSort)o1;
      StudentSort obj2=(StudentSort)o2;
     if(obj1.getId() > obj2.getId())
     { 
      return 1 ; 
     }
     else if(obj1.getId() < obj2.getId())
     { return -1;
     }
     else
     { return 0;
     }
 
   }
}//class
class SortByName implements Comparator
{
   public int compare(Object o1,Object o2)
   {
     StudentSort obj1 = (StudentSort)o1;
     StudentSort obj2 = (StudentSort)o2;
     return obj1.getName().compareTo(obj2.getName());
   }
}

public class SortBYIdNameSalary
{  public static void main(String args[])
   {
     List<StudentSort> al=new ArrayList<>();
     al.add(new StudentSort(1,"Rahul",9000));
     al.add(new StudentSort(2,"Rohan",4000));
     al.add(new StudentSort(3,"Nilesh",8000));
     al.add(new StudentSort(90,"Parsad",5303));
     al.add(new StudentSort(5,"Shree",8090));
      
     System.out.println("Original ArrayList :");
     for(StudentSort so:al)
     { System.out.println(so.getId() +"\t"+so.getName()+"\t"+so.getSalary());
     }
     System.out.println("---------------------------------------------------------------------");
     Comparator c=new SortById();
     Collections.sort(al , c);
     System.out.println("Sort by id :");
    for(StudentSort so : al)
    { System.out.println(so.getId() +"\t"+so.getName()+"\t"+so.getSalary());
    }
    System.out.println("---------------------------------------------------------------------");
    System.out.println("Sort By Name :");
    Comparator co=new SortByName();
    Collections.sort(al,co);
    for(StudentSort so:al)
    { // System.out.println(so.getId() +"\t"+so.getName()+"\t"+so.getSalary());
      System.out.println(so);
    }
   }
}