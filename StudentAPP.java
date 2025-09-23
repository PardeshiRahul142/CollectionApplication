/*Write a program using ArrayList and POJO class Student (id, name, marks).

Add at least 5 students.

Display all records.

Update marks of a given student.

Remove student by id.

Find student with highest marks.*/

import java.util.*;
import java.lang.Comparable;
class StudentDetails implements Comparable
{
   private int id;
   private String name;
   private int marks;

 
   public int getId(){return id;}
   public String getName(){return name;}
   public int getMarks(){return marks;}
 
   public void setId(int id){this.id=id;}
   public void setName(String name){this.name=name;}
   public void setMarks(int marks){this.marks=marks;}

   public int compareTo(Object obj)
   { StudentDetails std=(StudentDetails)obj;
     if(this.getMarks() > std.getMarks())
     {  return 1;
     }
   else if(this.getMarks() < std.getMarks())
     {  return -1;
     }
   else
     {  return 0;
     }
   }
}//class
public class StudentAPP
{  public static void main(String args[])
   {
      Scanner sc=new Scanner(System.in);
      List<StudentDetails> al=new ArrayList<>();
      System.out.println("Enter how many employee add :");
      int n=sc.nextInt();

      for(int i=0;i<n;i++)
    {
      StudentDetails st=new StudentDetails();
      System.out.println("Enter the id , name ,marks :");
      int id=sc.nextInt();
      sc.nextLine();
      String name=sc.nextLine();
      int marks=sc.nextInt();
      st.setId(id);
      st.setName(name);
      st.setMarks(marks);
     
      al.add(st);
    
    }//for
   
    for(StudentDetails obj : al)
    { System.out.println("Id is :"+obj.getId() + " | "+"Name is :"+obj.getName()+" | "+"Marks is :"+obj.getMarks());
    }
   System.out.println("-------------------------------------------------------");
    System.out.println("Enter the id for marks updating :");
    int newId=sc.nextInt();
    System.out.println("Enter marks ");
    int mark=sc.nextInt();
    boolean flag=false;
    for(StudentDetails dt:al)
    {
      if(dt.getId()==newId)
      {  dt.setMarks(mark);
         System.out.println("Marks updated ..");
         flag=true;
         break;
      }
    }
    if(!flag)
    {  System.out.println("Invalid id ...");
    } 
    System.out.println("-------------------------------------------------------");
    System.out.println("Enter the id for remove student ");
    int remStd=sc.nextInt();
    int flags=0;
    for(int i=0;i<al.size();i++)
     { if(al.get(i).getId()==remStd)
      { 
        al.remove(i);
        System.out.println("Remove student successful ...");
        flags=1;
        break;
      }
    }
    if(flags==0)
    {  System.out.println("Invalid id :");
    }
    System.out.println("-------------------------------------------------------");
   Collections.sort(al);
   for(int i=0;i<3;i++)
   { StudentDetails obj=al.get(i);
     System.out.println("Id is :"+obj.getId() + " | "+"Name is :"+obj.getName()+" | "+"Marks is :"+obj.getMarks());
   }
   }//main
}//class