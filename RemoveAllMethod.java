import java.util.*;
public class RemoveAllMethod
{   public static void main(String args[])
    {
       ArrayList al=new ArrayList();
       al.add(10);
       al.add(20);
       al.add(30);
       al.add(40);
       al.add(50);

     Boolean r=al.removeAll(Arrays.asList(20,10));
     String res=r ? "is remove all" : "is not remove";
     System.out.println(res);

    System.out.println(al);

    }

}