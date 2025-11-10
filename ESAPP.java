/*Create 5 emoploye Information*/

import java.util.*;
class Emp
{  private int  id;
   private String name;
   private int salary;

  Emp(int id,String name, int salary)
  {   this.id=id;
      this.name=name;
      this.salary=salary;
  }

  public int getId(){ return id ;}
  public String getName(){ return name;}
  public int getSalary(){ return salary;}

}
public class ESAPP
{ public static void main(String args[])
  {
     Vector<Emp> v=new Vector<Emp>();
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the count of employe..");
     int count=sc.nextInt();
 
     for(int i=0;i<count;i++) 
     {
       System.out.println("Enter id , name, salary ");
       int id=sc.nextInt();
       sc.nextLine();
       String name=sc.nextLine();
       int salary=sc.nextInt();
       Emp emp=new Emp(id , name , salary);
       v.add(emp);
     }

     for(Emp e:v)
     { System.out.println("id :"+e.getId()+" "+"name :"+e.getName()+" "+"salary :"+e.getSalary());
     }
  }
}