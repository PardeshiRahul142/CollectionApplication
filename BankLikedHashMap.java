/*Bank accouont*/
import java.util.*;
class Bank
{
 private int id;
 private String name;
 private int bal;

 Bank(int id,String name , int bal)
 {
   this.id=id;
   this.name=name;
   this.bal=bal;
 }
 public int getId(){return id;}
 public String getName(){return name;} 
 public int getBal(){return bal;}
}//class
public class BankLikedHashMap
{  public static void main(String args[])
   {
    LinkedHashMap<String , LinkedList<Bank>> hm=new LinkedHashMap<String , LinkedList<Bank>>();

     LinkedList<Bank> sav=new LinkedList<Bank>();
     sav.add(new Bank(1,"Rahul",1200000));
     sav.add(new Bank(2,"Rohan",323030));
     sav.add(new Bank(3,"Nikhil",3232));
    
     LinkedList<Bank> cur=new LinkedList<Bank>();
     cur.add(new Bank(1,"Yuvraj",90000));
     cur.add(new Bank(2,"Parsad",43020));
     cur.add(new Bank(3,"Abhay",45494));

     hm.put(" Saving :",sav);
     hm.put(" Current :",cur);

     Set<Map.Entry<String , LinkedList<Bank>>> setFun=hm.entrySet();

    for(Map.Entry<String , LinkedList<Bank>> m:setFun)   
    {
     String key=m.getKey();
     LinkedList<Bank> val=m.getValue();
     System.out.println("Account type "+key);
    
       for(Bank b:val)
       {
         System.out.println(b.getId()+"\t"+b.getName()+"\t"+b.getBal());
       }
    }
  }//main
}//class