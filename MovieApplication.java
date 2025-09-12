//WAP to create a Movie class with id, name, and rating, store 10 movies in a Vector, and display the movie(s) with the highest rating.
import java.util.*;
import java.lang.Comparable;
class MoviePOJO implements Comparable
{
  private int id;
  private String name;
  private int rating;

  MoviePOJO(int id,String name ,int rating )
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
    public int compareTo(Object ob)
    { 
     MoviePOJO po=(MoviePOJO)ob;
     if(this.rating > po.getRating())
      {return 1;
      }
    else if(this.rating < po.getRating())
      {   return -1;
      }
   else{
          return 0;
       }
    }
}//class MoviePOJO
public class MovieApplication
{   public static void main(String args[])
    {
     Vector v=new Vector();
       v.add(new MoviePOJO(1,"abc",3));
       v.add(new MoviePOJO(2,"ps",3));
       v.add(new MoviePOJO(3,"asc",2));
       v.add(new MoviePOJO(4,"wc",4));  
       v.add(new MoviePOJO(5,"bdc",2));
       v.add(new MoviePOJO(6,"addc",1));
       v.add(new MoviePOJO(7,"qwe",5));
       v.add(new MoviePOJO(8,"apod",2));
    
    System.out.println("before sorting vector :");
    for(Object ob:v)
    {
       MoviePOJO m=(MoviePOJO)ob;
      System.out.println("id :"+m.getId() +" "+"Name :"+m.getName()+" "+"rating :"+m.getRating());
   }
  
   
   Collections.sort(v);
 System.out.println("After sorting vector ");
 for(Object obj:v)
 {
  MoviePOJO m=(MoviePOJO)obj;
   System.out.println("id :"+m.getId() +" "+"Name :"+m.getName()+" "+"rating :"+m.getRating());
 }

  }//main method
}//class Movie Application