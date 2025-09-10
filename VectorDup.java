import java.util.*;
public class VectorDup
{   public static void main(String args[])
    {
       Vector v=new Vector();
        v.add(90);
	v.add(32);
	v.add(23);
	v.add(66);
	v.add(75);
	v.add(43);
	v.add(23);
	v.add(32);
	v.add(90);
	v.add(40);
        v.add(75);
     int k=0;
      for(int i=0;i<v.size();i++)
       {    for(int j=i+1;j<v.size();j++)
            {   if((int)v.get(i) == (int)v.get(j))
                {
                    boolean isCheck=false;
                    for(int m=0 ;m<k;m++)
                    {  if((int)v.get(m) == (int)v.get(i))
                       {
                          isCheck=true;
                          break;
                       }
                    }//m
              
                      if(!isCheck)
                      {
                          v.set(k,(int)v.get(i));
                              k++;
                      }
              }//if
            }//j
       }//i
        for(int i=0;i<k;i++)
         {   System.out.println(v.get(i));
         }
	

     }
}