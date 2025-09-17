/*Q3. Book Search by Author
👉 Create a Book POJO class with fields: bookId, title, author.
 👉 Store multiple books in an ArrayList<Book>.
 👉 Write logic to search and display books written by a given author (take input from user).
Explanation:
 Tests searching for objects in an ArrayList based on object field values.*/

import java.util.*;
class BookSearch
{
    private int bookId;
    private String title;
    private String author;

   BookSearch(int bookId,String title , String author)
   {  this.bookId=bookId;
      this.title=title;
      this.author=author;
   }
   public int getId()
   { return bookId;
   }
   public String getTitle()
   {return title;
   }
   public String getAuthor()
   { return author;
   } 
}
class BookSearchOp
{   public static void main(String args[])
    {
      List<BookSearch> al=new ArrayList<>();
        
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the how many Books add ");
      int n=sc.nextInt();

      for(int i=0;i<n;i++)
      { 
         System.out.println("Enter the bookId , Title , Author");
         int bookId=sc.nextInt();
         sc.nextLine();
         String title=sc.nextLine();
         String author=sc.nextLine();
      
        al.add(new BookSearch(bookId,title,author));
 
      }
      System.out.println("Enter the author for search :");
      String au=sc.nextLine();
      Boolean isFound=false;
      for(Object obj:al)
      {
        BookSearch bs=(BookSearch)obj;
        if(bs.getAuthor().equalsIgnoreCase(au))
         {
           isFound=true;
         }
      }
      if(isFound)
        {System.out.println("Is found ");
        }
       else
        {System.out.println("Is not found...");
        }
 
    }//main
}//class