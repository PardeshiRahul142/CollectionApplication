/*utility class*/
import java.util.*;
class A
{   private A()
    {  System.out.println("I am private constructor");
    } 
    static void show()
    {  System.out.println("I am static method of Show");
    }
    static void display()
    {   System.out.println("I am static display method");
    }
}
public class UtilityEx
{  public static void main(String args[])
   {
    A.show();
    A.display();
   }
}
 