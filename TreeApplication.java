import java.util.*;
import java.lang.*;
class Employe implements Comparable
{  private int id;
   private String name;
   private int sal;

   Employe(int id,String name,int sal)
   {   this.id=id;
       this.name=name;
       this.sal=sal;
   }
   
   public int getId(){return id;}
   public String getName(){return name;}
   public int getSal(){return sal;}
   
   public String toString()
   {  return id+"\t"+name+"\t"+sal;
   }

   public int compareTo(Object o1)
   {
       Employe obj=(Employe)o1;
       if(obj.getId()<this.getId())
        {
           return -1;
         } else if (obj.getId() <this.getId())
          {
             return 1;
          }else{
            return 0;
          }
   }
}
public class TreeApplication
{  public static void main(String args[])
   {
    TreeSet<Employe> emp=new TreeSet<Employe>();
    emp.add(new Employe(1,"Rahul",21000000));
    emp.add(new Employe(2,"Rohan",4034030));
    emp.add(new Employe(3,"Nilesh",493939));
    emp.add(new Employe(4,"Parsad",5400));
    Collections.sort(emp);
    for(Employe e:emp)
    {  System.out.println(e);
    }
   }//main
}//class