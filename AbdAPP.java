abstract class Acb
{
  abstract void show();
  abstract void display();
  public void show1()
  { System.out.println("Show 1");
  } 
}
class Demo extends Acb
{
   void show()
   { System.out.println("I am show method");
   }
   void display()
   { System.out.println("I am display method ");
   }
}
public class AbdAPP
{  public static void main(String args[])
   {
    Demo a=new Demo();
     a.show();
     a.display();
     a.show1();

   }
}