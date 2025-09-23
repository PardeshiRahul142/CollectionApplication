import java.util.*;
@FunctionalInterface
interface A
{
      void show();
}

/*class B implements A
{
  public void show()
  { System.out.println("I am show ");
  }
}*/
class LamdaEXp
{    public static void main(String args[])
    {
      A ab= () ->
      { System.out.println("I am Lamda expresion ");
      };
      ab.show();
     }
}