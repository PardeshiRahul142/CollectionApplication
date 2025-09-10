import java.util.*;
public class AddAllMethod
{   public static void main(String args[])
    {
       ArrayList al=new ArrayList();
       al.add(10);
       al.add(20);
       al.add(30);
       al.add(40);
       al.add(50);
   
      ArrayList a=new ArrayList();
       a.add(100);
       a.add(200);
       a.add(300);

     al.addAll(a);
  
     System.out.println(al);

    }

}

  