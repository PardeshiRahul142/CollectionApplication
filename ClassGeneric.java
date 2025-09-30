import java.util.*;
class Box<T>
{  private T content;

   public void set(T content)
   {  this.content=content;
   }
  public T get()
  {  return content;
  }
}
public class ClassGeneric
{  public static void main(String args[])
   {
     Box<Integer> bi=new Box<>();
     bi.set(199);
     System.out.println("The class with integer :"+bi.get());
    
     Box<String> bs=new Box<>();
     bs.set("String with class generic");
     System.out.println("String :"+bs.get());

 
   }
}