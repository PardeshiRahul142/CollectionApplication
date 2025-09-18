/*Q8. Movie Rating System
👉 Create a Movie POJO with fields: movieId, title, rating.
 👉 Store multiple movies in ArrayList<Movie>.
 👉 Display movies that have rating greater than 4.0.	
Explanation:
 Tests conditional filtering with numeric values in an ArrayList.
*/

import java.util.*;
class Movie
{ 
   private int id;
   private String name;
   private float rating;

   Movie(int id,String name, float rating)
   {
        this.id=id;
        this.name=name;
        this.rating =rating;
   }
   public int getId()
   {  return id;
   } 
   public String getName()
   {  return name;
   }
   public float getRating()
   {  return rating;
   }
}//class
public class MovieEx
{ public static void main(String args[])
  {
   List<Movie> al=new ArrayList<>();
   al.add(new Movie(1,"baby",5f));
   al.add(new Movie(2,"Baghi",4.3f));
   al.add(new Movie(3,"Raudi Rathod",4f));
   al.add(new Movie(4,"ABCD",3));

   System.out.println(" Whoes rating is > 4.0 ");
  for(int i=0;i<al.size();i++)
  { 
   Movie mo=(Movie)al.get(i);
   if(mo.getRating() > 4.0f)
   {
    System.out.println("Id :"+mo.getId() +" "+"Name :"+mo.getName()+" "+"City :"+mo.getRating());
   }
  } 
  }//main
}//class