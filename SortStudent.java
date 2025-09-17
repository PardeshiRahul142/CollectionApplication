/*Q1. Store and Sort Student Marks
Create a Student class with fields: name and marks.


Store multiple students in an ArrayList.


Sort them by marks using Comparable.


Print the sorted list.


 Explanation:
 This tests your ability to:
Implement Comparable<Student> for sorting.


Use Collections.sort(list) on an ArrayList of objects.


*/
import java.util.*;
import java.lang.Comparable;
class StudInfo implements Comparable
{ 
   private String name;
   private int marks;
   StudInfo()
   {
  
   }
   StudInfo(String name , int marks)
   {
      this.name=name;
      this.marks=marks;
   }
   public String getName()
   {
        return name;
   }
   public int getMarks()
   {
       return marks;
   }
   public int compareTo(Object o)
   {
     StudInfo in=(StudInfo)o;
     if(this.marks>in.marks) 
     {  return 1;
     }
    else if(this.marks < in.marks) 
     {  return -1;
     }
    else
     {  return 0;
     }
   }
}
public class SortStudent
{  public static void main(String args[])
   {
       List<StudInfo> list=new ArrayList<>();
       list.add(new StudInfo("Rahul",90));
       list.add(new StudInfo("Rohan",98));
       list.add(new StudInfo("Parsad",43));
        list.add(new StudInfo("Par",58));
       list.add(new StudInfo("shri",75));
 
       System.out.println("Before sorting List :");
      for(Object obj:list)
      {
        StudInfo st=(StudInfo)obj;
        System.out.println("Name :"+st.getName() +" "+"Marks :"+st.getMarks());
      }
      Collections.sort(list);
      System.out.println("After sorting :");
      for(Object obj:list)
      {
        StudInfo st=(StudInfo)obj;
        System.out.println("Name :"+st.getName() +" "+"Marks :"+st.getMarks());
      }
   
 
   }//main
}//class