/*Q10. Car Showroom Inventory
👉 Create a Car POJO with fields: carId, model, price, year.
 👉 Store multiple cars in ArrayList<Car>.
 👉 Display cars whose year is after 2020 and price below 10 lakh.
Explanation:
 Tests filtering with multiple conditions on an ArrayList.
*/
import java.util.*;
class Showroom
{
   private int carId;
   private int model;
   private double price;
   private int year;

   public Showroom(int cid,int m,double p, int y)
   {
      this.carId=cid;
      this.model=m;
      this.price=p;
      this.year=y;
   }
    public int getId()
    { return carId;
    }
    public int getModel()
    {   return model;
    } 
    public double getPrice()
    {  return price;
    }
    public int getYear()
    {  return year;
    }
}//class
public class CarShowroom
{  public static void main(String args[])
   { 
    List<Showroom> al=new ArrayList();
    al.add(new Showroom(1,2023,900000,2019));
    al.add(new Showroom(2,2019,700000,2024));
    al.add(new Showroom(3,2022,2100000,2025));
    al.add(new Showroom(5,2023,500000,2023)); 
    al.add(new Showroom(6,2021,200000,2013));

   for(Showroom sh:al)
   {
    if(sh.getPrice() < 1000000 && sh.getYear() > 2020)
    {
       System.out.println("car_Id :"+sh.getId() +" "+"car_Model :"+sh.getModel()+" "+"car_Price :"+sh.getPrice()+" "+"Year :"+sh.getYear());
    }
   }
 
   }//main
}//class
