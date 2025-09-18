/*Q6. Library Late Fine Calculator
👉 Create a LibraryMember POJO with fields: memberId, memberName, daysLate.
 👉 Store multiple members in ArrayList<LibraryMember>.
 👉 For each member, calculate fine as daysLate * 5 and display.
Explanation:
 Combines object data with calculations inside a loop.*/

import java.util.*;
class Library
{
  private int m_Id;
  private String  m_Name;
  private int daysLate;

  Library(int id,String name,int lateDays)
  {   this.m_Id=id;
      this.m_Name=name;
      this.daysLate=lateDays;
  }
  public int getId()
  { return m_Id;
  }
  public String getName()
  {  return m_Name;
  }
  public int getLateDay()
  { return daysLate;
  }
}//class

public class LibraryOperation
{   public static void main(String args[])
    {
        List<Library> al=new ArrayList<>();
        al.add(new Library(1,"Rahul",2));
        al.add(new Library(2,"Rohan",3));
        al.add(new Library(3,"Nilesh",4));
        al.add(new Library(4,"Nikhil",5));
    
     for(Library lab:al)
      {
         int fine=lab.getLateDay() * 5;
         System.out.println("Id :"+lab.getId() +" "+"Name :"+lab.getName() +"  "+" LateDay :"+lab.getLateDay()+"  "+" Fine :"+fine);
      }
    }
}//class 