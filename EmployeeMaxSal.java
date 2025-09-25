/*Employee Payroll System

Store employees in Vector<Employee>.

Calculate total salary, max salary, and min salary employee.*/

import java.util.*;
class employees
{  private int id;
   private String name;
   private int sal;

   employees(int id,String name,int sal)
   {
      this.id=id;
      this.name=name;
      this.sal=sal;
   }
   public int getId(){return id;}
   public String getName(){return name;}
   public int getSal(){return sal;}
}
class Operation
{
    public static int MaxSalary(Vector<employees> vc) 
    {
      int max=Integer.MIN_VALUE;
      for(employees e:vc)
      {  if(e.getSal() > max)
         {
          max=e.getSal();
         }
      }
        return max;
    }

    public static int MinSalary(Vector<employees> vs)
    {
      int min=Integer.MAX_VALUE;
      for(employees e:vs)
      {
        if(e.getSal() < min)
        { min=e.getSal();
        }
      }
        return min;
    }
   public static double TotalSalary(Vector<employees> ve)
   {
    double total=0;
    for(employees e:ve)
    { total+=e.getSal();
    }
    return total;
   }
}
public class EmployeeMaxSal
{   public static void main(String args[])
    {
      Vector<employees> v=new Vector<>();
      v.add(new employees(1,"Rahul",89779));
      v.add(new employees(2,"Rohan",7643));
      v.add(new employees(3,"Raj",59493));
      v.add(new employees(4,"Shree",3274));
      
      //System.out.println("Max salary :"+  System.out.println("All Employees: " + v);
        System.out.println("Max Salary: " + Operation.MaxSalary(v));
        System.out.println("Min Salary: " + Operation.MinSalary(v));
        System.out.println("Total salary is :"+Operation.TotalSalary(v));

    
    }//main
}//class