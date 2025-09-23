/*Q2. Vector - Employee Management

Create a Vector<Employee> where Employee has (id, name, salary).

Insert employees.

Display in ascending order of salary.

Search an employee by name.

Delete employee at given position.*/

import java.util.*;
import java.lang.Comparable;
class Employee implements Comparable<Employee>
{
   private int id;
   private String name;
   private double salary;
  
   Employee(int id ,String name ,double salary)
   {
    this.id=id;
    this.name=name;
    this.salary=salary;
   }
   public int getId(){return id;}
   public String getName(){return name;}
   public double getSalary(){return salary;}
 
   public void setId(int id){this.id=id;}
   public void setName(String name){this.name=name;}
   public void setSalary(int salary){this.salary=salary;}

    public int compareTo(Employee emp) {
    return Double.compare(this.salary, emp.salary);
    }
}//class
public class EmployeeApp
{ public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    List<Employee> v=new Vector<>();
    
    v.add(new Employee(1,"Rahul",90000.90));
    v.add(new Employee(2,"Shantanu",32103.20));
    v.add(new Employee(3,"Shree",45999.32));
    v.add(new Employee(4,"Shaurya",98000.12));
    v.add(new Employee(5,"Shiv",654549.540));
     
    Collections.sort(v);
    for(Employee emp:v)
    {
      System.out.println(" id is :"+emp.getId() +" | "+" Name is :"+emp.getName() +" | "+" Salary is :"+emp.getSalary());
    }
    System.out.println("--------------------------------------------------------------------------------------------");
    System.out.println("Enter the student name for searching :");
    String name=sc.nextLine();
    int flag=0;
    for(Employee emp:v)
    {
     if(emp.getName().equalsIgnoreCase(name))
     { System.out.println("Is found ");
        flag=1;
         break;
     }
    }
    if(flag==0)
    { System.out.println("Not Found...");
    }
    System.out.println("--------------------------------------------------------------------------------------------");
    System.out.println("Enter index where elements is delete :");
    int pos=sc.nextInt();
    if(pos>=0 && pos<v.size()-1)
    { Employee remove=v.remove(pos);
      System.out.println("Remove element Sucessfull");
    }
    else
    {  System.out.println("Invalid index...");
    }

   
   }//main
}//c;ass