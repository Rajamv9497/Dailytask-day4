/*5.Retrieve the odd numbers till given input number. add and subtract it consecutively and return the result.
Input:9
Output:1+3-5+7-9=-3*/


import java.io.*;
import java.lang.*;
import java.util.*;

class Main4
{
  public static void main(String args[])
  {
     int n,res=1;
     Scanner sc=new Scanner(System.in);
     n=sc.nextInt();
     for(int i=3,j=1;i<=n;j++,i+=2)
          {
                if(j%2!=0)
                   res=res+i;
                else
                    res=res-i;    
            }
      System.out.println(res);          

    }

}