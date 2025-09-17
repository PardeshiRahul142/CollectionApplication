/*Q2. Student Marks Filter
👉 Create a Student POJO class with fields: rollNo, name, marks.
 👉 Store multiple students in an ArrayList<Student>.
 👉 Display only those students who have marks greater than 60.
Explanation:
 Tests filtering data from an ArrayList of objects using conditions.
*/
import java.util.*;
class StdFilter
{
  private int rollNo;
  private String name;
  private float marks;

  public StdFilter(int id, String name, float marks)
  {
     this.rollNo=id;
     this.name=name;
     this.marks=marks;
   }
    public int getRollNo()
    { return rollNo;
    }
    public String getName()
    {  return name;
    }
    public float getMarks()
    {  return marks;
    }
  
}//class
class StudentArratListEx
{   public static void main(String args[])
    { 
      List<StdFilter> al=new ArrayList<>();
      al.add(new StdFilter(1,"Rahul",90f)); 
      al.add(new StdFilter(2,"Pranjal",89f));
      al.add(new StdFilter(3,"Yuvraj",43f));
      al.add(new StdFilter(4,"Parsad",63f));
      al.add(new StdFilter(5,"Nilesh",57f));
      al.add(new StdFilter(6,"Nikil",77f));

    for(Object obj:al)
    {
     StdFilter ft=(StdFilter)obj;
      if(ft.getMarks() > 60)
       {
         System.out.println("RollNo :"+ft.getRollNo() + " | "+"Name :"+ft.getName()+" | "+"Marks :"+ft.getMarks());
       }
    }
    
    }//main
}//class