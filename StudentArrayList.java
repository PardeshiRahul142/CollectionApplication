/*Q1. Student Management System using ArrayList

Problem:
Create a Student POJO class with attributes: id, name, and marks.

Store multiple students inside an ArrayList<Student>.

Write a method using generics that prints all student details.

Perform operations:

Add students

Remove a student by id

Search student by name

Explanation:
Here you’ll learn how to use ArrayList<Student> (with POJO) and Generics (List<Student>) to perform CRUD operations.
*/

import java.util.*;
class Student
{
  private int id;
  private String name;
  private int marks;

  public Student(int id,String name , int marks)
  {
     this.id=id;
     this.name=name;
     this.marks=marks;
  }

  public int getId()
  {
    return id;
  }
   public String getName()
   {
      return name;
   }
   public int getMarks()
   {
     return marks;
   }
}//class
public class StudentArrayList
{   public static void main(String args[])
    {
      List<Student> al=new ArrayList<>();
      al.add(new Student(1,"Rahul",89));
      al.add(new Student(2,"Rohan",80));
      al.add(new Student(3,"Pranjali",67));
      al.add(new Student(4,"Yuvraj",87));

     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the student id which record remove");
     int newId=sc.nextInt();
     sc.nextLine();
     boolean flag =false;
     for(Student st:al)
     {
         if(st.getId() == newId)
         {
           al.remove(newId);
           System.out.println("remove record");
            flag=true;
            break;
         }
     }
     if(!flag)
     { System.out.println("Not found id !");
     }
     System.out.println("Enter the student name for search :");
     String newName=sc.nextLine();
     boolean isFound=false;
     for(Student st:al)
     {  
         if(st.getName().equalsIgnoreCase(newName))
         {
           System.out.println(" Is found ");
           isFound=true;
            break;
         }
     }
     if(!isFound)
     {
       System.out.println("Not found name !");
     }
      
    System.out.println(" Array list is :");
    for(Student st:al)
    { System.out.println("id :"+st.getId()+" "+"Name :"+st.getName()+" "+"Marks :"+st.getMarks());
    } 
     }//main
 
}//class












