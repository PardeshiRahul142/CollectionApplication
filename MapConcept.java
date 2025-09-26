/*Example of map*/

import java.util.*;
class Player
{
   private int id;
   private String name;
   private int run;

   Player(int id,String name,int run)
   {
     this.id=id;
     this.name=name;
     this.run=run;
   } 
   public int getId(){return id;}
   public String getName(){return name;}
   public int getRun(){return run;}
 
  
}
public class MapConcept
{  public static void main(String args[])
   {
    LinkedHashMap<String ,ArrayList<Player>> map= new LinkedHashMap<String,ArrayList<Player>>();

    ArrayList<Player> ind=new ArrayList<>();
    ind.add(new Player(1,"Rahul",9000));
    ind.add(new Player(2,"Rohit",5499));
    ind.add(new Player(3,"Hardik",9008));

    ArrayList<Player> aus=new ArrayList<>(); 
    aus.add(new Player(1,"Smite",300));
    aus.add(new Player(2,"Head",2499));
    aus.add(new Player(3,"Warner",308));


     map.put("India",ind);
     map.put("Australia",aus);

   Set<Map.Entry<String,ArrayList<Player>>> set=map.entrySet();
for(Map.Entry<String,ArrayList<Player>>m:set)
{
  String key=m.getKey();
  ArrayList<Player> val=m.getValue();
  System.out.println("Team Name :"+key);

 for(Player n:val)
 {
   System.out.println(n.getId() +"\t"+n.getName()+"\t"+n.getRun());
 }
}

 
   }//main
}//class