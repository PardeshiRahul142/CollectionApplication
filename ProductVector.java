//WAP to create class name as Product with id,name ,price and store 10 product detail vector and search product by using its id 
import java.util.*;
class Product
{
   private int id;
   private String name;
   private int price;

   Product()
   {
   }
   Product(int id,String name,int price)
   {
     this.id=id;
     this.name=name;
     this.price=price;
   }
   public int getId()
   {return id;
   }
   public String getName()
   {return name;
   }
   public int getPrice()
   {return price;
   }
}//product class
public class ProductVector
{   public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
      Vector<Product> v=new Vector<>();
      v.add(new Product(1,"Soap",1200));
      v.add(new Product(2,"Oil",1500));
      v.add(new Product(3,"cloth",2000));
      v.add(new Product(4,"Shoes",4000));
   
    System.out.println("Enter the id :");
    int n=sc.nextInt();
     Boolean isFound=false;
    for(Product p:v)
    {
      if(p.getId() == n)
      {
        System.out.println("IS FOUND...");
           isFound=true;
           break;
      }
    }
   if(!isFound)
   { System.out.println("IS NOT FOUND... !");
   }
    
    }//main
}//ProductVector class