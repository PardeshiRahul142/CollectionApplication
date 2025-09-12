//WAP to create a Movie class with id, name, and rating, store 10 movies in a Vector, and display the movie(s) with the highest rating.
import java.util.*;
class MovieRating
{
  private int id;
  private String name;
  private int rating;

  MovieRating(int id,String name ,int rating )
  {
       this.id=id;
       this.name=name;
       this.rating=rating;
   
  }//constructor
 
   public int getId()
   {return id;
   }
   public String getName()
   {return name;
   }
   public int getRating()
   {return rating;
   }
}//class MoviePOJO
public class MovieMaxRating
{   public static void main(String args[])
    {
     Vector<MovieRating> v=new Vector<>();
       v.add(new MovieRating(1,"abc",3));
       v.add(new MovieRating(2,"ps",3));
       v.add(new MovieRating(3,"asc",2));
       v.add(new MovieRating(4,"wc",4));  
       v.add(new MovieRating(5,"bdc",2));
       v.add(new MovieRating(6,"addc",1));
       v.add(new MovieRating(7,"qwe",5));
       v.add(new MovieRating(8,"apod",2));
    
      
    int Maxrating=0;

    for(MovieRating m:v)
    {
       if(m.getRating() > Maxrating)
       {
          Maxrating=m.getRating();
       }
    }
   
        System.out.println("Max Movie Rating is :");
    for(MovieRating m:v)
    {
       if(m.getRating() == Maxrating)
       {
          System.out.println(" id :"+m.getId() +" | "+"MovieName :"+m.getName() +" | "+"Movie Rating :"+m.getRating());
       }
    }
   
       
  }//main method
}//class Movie Application