/* generic with interface */
import java.util.*;
interface ABC<E>
{ void show(E e);
}
class MNO implements ABC<Integer>
{  public void show(Integer x)
   {  System.out.println("Integer x is :"+x);
   }
}
class PQR implements ABC<Float>
{  public void show(Float f)
   { System.out.println("Float no is "+f);
   }
}
public class MNOPQR
{   public static void main(String args[])
    {
       MNO m=new MNO();
       m.show(10);
       PQR p=new PQR();
       p.show(40.4f);
    }
}