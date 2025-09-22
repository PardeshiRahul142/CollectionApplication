/*Q.3
Create a menu-driven program using LinkedList where user can:

Add element

Remove element

Search element

Display all elements
*/

import java.util.*;
public class MenuDrivenAppAL
{   public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       List<Integer> al=new LinkedList<>();
      while(true)
      {
        System.out.println("----------------------------Menu-----------------------------");
        System.out.println("1.Add Element:");
        System.out.println("2.Remove Element");
        System.out.println("3.Search Element");
        System.out.println("4.Display Element");
        System.out.println("5.Exit...");
        System.out.println("Enter your choice :");
        int ch=sc.nextInt();
 
       switch(ch) 
       {
         case 1:
                 System.out.println("Enter Element :");
                 int ele=sc.nextInt();
                 al.add(ele);
                 break;
         case 2:
                 System.out.println("Eleter index where Element is remove :");
                 int idx=sc.nextInt();
                 int msg =al.remove(idx);
                 System.out.println("Remove Successfull...");
                 break;
       case 3: 
                 System.out.println("Enter Element for search :");
                 int search=sc.nextInt();
                 boolean con=al.contains(search);
                 String isCon=con ? " is found " :" Is not Found !";
                 System.out.println(con);
                 break;
      case 4:
                System.out.println("Linked list is ");
                for(Object obj:al)
                { System.out.println(obj);
                }
                 break;
      case 5:  
                System.exit(0);
                  return;
       default:
                  System.out.println("Invalid choice ");

       }//switch
      }//while

    }//main
}//class 