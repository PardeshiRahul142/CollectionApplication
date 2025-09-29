/*Question:
Write a Java program using LinkedHashMap to store the names of 5 students along with their marks.

Insert data into the map.

Display the students and their marks in insertion order.*/

import java.util.*;
class Student
{  private String name;
   private int marks;
   
 public Student(String name, int marks)
 {
  this.name=name;
  this.marks=marks;
 }
 public int getMarks(){return marks;}
 public String getName(){return name;}
 
}
public class StudentMap
{ public static void main(String args[])
  {
     LinkedHashMap<String,LinkedList<Student>> map=new LinkedHashMap<String,LinkedList<Student>>();
    // LinkedHashMap<String,LinkedList<Student>> map=new LinkedHashMap<String, LinkedList<Student>>();

      
     LinkedList<Student> al=new LinkedList<>();
     al.add(new Student("Rohan", 98));
     al.add(new Student("Rahul",88));
     al.add(new Student("Parsad",78));
     al.add(new Student("Nilehs", 89));
     al.add(new Student("Nikhil",99));

    map.put("Student ",al);

    Set<Map.Entry<String ,LinkedList<Student>>> set=map.entrySet();
  
     for(Map.Entry<String ,LinkedList<Student>> m:set)
     {  String key=m.getKey();
        LinkedList<Student> val=m.getValue();
        System.out.println("Student :"+key);

       for(Student s:val)
       { System.out.println(s.getName() +"\t"+s.getMarks());
       }
 
     }
  }
}