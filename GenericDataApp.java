import java.util.*;
class Data
{ 
 private int id;
 private String name;
 private long sal;

 public Data(int id,String name,long sal)
 {
    this.id=id;
    this.name=name;
    this.sal=sal;

 }//constructor
 
 public int getId()
 {return id;
 }
 public String getName()
 { return name;
 }
 public long getSal()
 { return sal;
 }
}//class Data
public class GenericDataApp
{   public static void main(String args[])
    {
     ArrayList<Data> al=new ArrayList<>();
    Data d1=new Data(1,"Rahul",2100L);
    Data d2=new Data(2,"Pranjali",32100L);
    Data d3=new Data(3,"Yuvraj",21030L);
    al.add(d1);
    al.add(d2);
    al.add(d3);

   for(Data d:al)
   {
      System.out.println("Id is :"+d.getId() +"\t "+"Name is :"+d.getName()+"\t"+"salary is :"+d.getSal());
   }
    }//main
}//class G