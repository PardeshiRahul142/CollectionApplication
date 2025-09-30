import java.util.*;
class Bounded
{ void setData(List<? extends Number>list)
  {
     for(Object obj:list)
     {  System.out.println(obj);
     }
  }
}
class BGAPP
{  public static void main(String args[])
   {
     Bounded b=new Bounded();
 
    List<Integer> list=new ArrayList<>();
    list.add(20);
    list.add(200);
    list.add(2000);
    list.add(20000);
   b.setData(list);

    List<Float> listF=new ArrayList<>();
    listF.add(20.0f);
    listF.add(200.0f);
    listF.add(210.10f);
    listF.add(10.0f);
    listF.add(220.30f);
    b.setData(listF);

    
   }
}