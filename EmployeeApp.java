/*Q2. Employee Salary Analysis using Vector

Problem:
Create an Employee POJO class with attributes: empId, empName, salary.

Store employee objects inside a Vector<Employee>.

Implement a generic method to find the employee with the highest salary.

Print all employees whose salary is above 50,000.

Explanation:
This helps in learning Vector<Employee> with POJO and using generics for comparison.
*/

import java.util.*;
class Employee
{
    private int empId;
    private String empName;
    private double salary;

   public Employee(int id ,String name ,double salary)
   {
        this.empId=id;
        this.empName=name;
        this.salary=salary;
   }
   public int getId() {return empId;}  
   public String getName(){return empName;}
   public double getSalary(){return salary;}
}//class

public class EmployeeApp
{   public static void main(String args[])
    {
      List<Employee> al=new ArrayList<>();
      al.add(new Employee(1,"Rahul",51000));
      al.add(new Employee(2,"Rohan",39999)); 
      al.add(new Employee(3,"Yuvraj",80000));
      al.add(new Employee(4,"Avd",58333)); 
      al.add(new Employee(5,"Parsad",19000));

     for(Employee emp:al)
     {
       if(emp.getSalary()> 50000)
       {
          System.out.println("empId :"+emp.getId()+" "+"empName :"+emp.getName()+" "+"salary :"+emp.getSalary());
       }
     }
     
 
    }
}//class