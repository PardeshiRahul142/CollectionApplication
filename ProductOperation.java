/*Q4. Product Price Update
 👉 Create a Product POJO class with fields: productId, productName, price.
 👉 Store products in an ArrayList<Product>.
 👉 Update the price of a given product by productId (take input) and display the updated list.
Explanation:
 Tests modifying object data inside an ArrayList.
*/
import java.util.*;
class UpdatePrice
{ 
  private int prodId;
  private String prodName;
  private int price;
 
 UpdatePrice(int pId , String pName,int price)
 {
   this.prodId=pId;
   this.prodName=pName;
   this.price=price;
 }
 public int getProdId()
 {   return prodId;
 }
 public String getProdName()
 {return prodName;
 }
  public int getPrice()
 { return price;
 }
 public void setPrice(int price)
 { this.price=price;
 }
}//class
class ProductOperation
{   public static void main(String args[])
    {
       List<UpdatePrice>  al=new ArrayList<>();
       al.add(new UpdatePrice(1,"Mobile",110000));
        al.add(new UpdatePrice(2,"TV",150000));
        al.add(new UpdatePrice(1,"Laptop",35000));
       
     Scanner sc=new Scanner(System.in);
    System.out.println("Enter the product Id which Price update :");
    int upId=sc.nextInt();
   System.out.println("Enter new Price :");
   int newPrice=sc.nextInt();
   boolean isFound=false;
    for(UpdatePrice up:al)
    {
     if(up.getProdId() == upId)
       {
            up.setPrice(newPrice);
            isFound=true;
            break;
       }
    }
  if(!isFound)
   {
     System.out.println("Invalid id ");
   }

   for(UpdatePrice up:al)
    { System.out.println("Id :"+up.getProdId() +" "+" Product :"+up.getProdName()+" "+ "Price "+up.getPrice());
    }
   }//main
}//class