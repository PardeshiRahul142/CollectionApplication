/*Q.5
Create a menu-driven program using Stack where user can:
Push element
Pop element
Peek element
Display all elements
__________________________*/

import java.util.*;
public class MenuStack
{   public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      Stack<Integer> v=new Stack<>();
      while(true)
      {
          System.out.println("-------------------------menu-----------------------");
          System.out.println("1.push");
          System.out.println("2.pop");
          System.out.println("3.peek");
          System.out.println("4.display");
          System.out.println("5.exit..");
          System.out.println("Enter your choice :");
          int ch=sc.nextInt();
          
          switch(ch)
          {
           case 1:
                    System.out.println("Enter element :");
                    int ele=sc.nextInt();
                    v.push(ele);
                    break;
            case 2:
                    v.pop();
                    System.out.println("Pop element successfully");
                    break;
            case 3:
                    System.out.println("Peek is "+v.peek());
                    break;
             case 4:
                    System.out.println("Stack is :");
                    for(Object obj:v)
                    {  System.out.println(obj);
                    } 
                        break;

             case 5:
                    System.exit(0);
                       return;
             default:
                    System.out.println("invalid input ...");
 

          }//switch

  
       }//while


    }//main
}//class