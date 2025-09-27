import java.util.*;
interface Lambda
{  void display();
   default void av();
   static void ads();
}
class LAPP 
{
  public static void main(String args[])
  {
     Lambda la=()->{ 
      System.out.println("I am display method of inner class");  //this is lambda function
     };
    la.display();
  }
}