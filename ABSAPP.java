import java.util.*;
abstract class ABS
{
    void display()
    { System.out.println("I am display method ");
    }
     abstract void show();
}
public class ABSAPP
{   public static void main(String args[])
    {
     ABS a=new ABS(){
 
       void show()
      {  System.out.println("I am Abstract inner class method");
      }
     };
     a.show();
     a.display();
 
     }//main
}//class