/*Q5. Sort Books by Title (Alphabetically)
Create a Book class with id, title, and author.


Store books in an ArrayList.


Sort them alphabetically by title.


 Explanation:
 This shows how to sort strings (lexicographically) using compareToIgnoreCase().
*/

import java.util.*;
import java.lang.Comparable;
class Book implements Comparable
{
   private int id;
   private String title;
   private String author;
 
   Book(int id ,String title,String author)
   {
      this.id=id;
      this.title=title;
      this.author=author;
   }
   public String getAuthor()
   { return author;
   }
   public int getId()
   {  return id;
   }
   public String getTitle()
   { return title;
    }
   public int compareTo(Object ob)
   {
      Book b=(Book)ob;
     return this.title.compareToIgnoreCase(b.title);     
   }
 
 
  
}//class

public class SortBook
{ public static void main(String args[])
  {
    List<Book>  li=new ArrayList<>();
    li.add(new Book(1,"Java","Sum micro"));
    li.add(new Book(2,"Python","avb"));
    li.add(new Book(3,"Php","Rosmos"));
    li.add(new Book(4,"SQL","Ab "));
 

  Collections.sort(li);
  for(Object obj:li)
  { 
    Book bk=(Book)obj;
    System.out.println("Id :"+bk.getId()+"  "+"title :"+bk.getTitle()+" "+"Author :"+bk.getAuthor());
  }

  }//main

}//class