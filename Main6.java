/* 5) Given a method with a string input. Write code to get the sum of all the digits present in the given String. Return the sum as output. If there is no digit in the given string return -1 as output. 
Example: Input=good23bad4 output=9 
*/

import java.util.*;
import java.lang.*;
import java.io.*;

class UserMainCode
{
  public static int sumOfnoinDigits(String s)
  {
      
       int flag=0,sum=0;
       int len=s.length();
       int no[]=new int[len];
       char ch[]=s.toCharArray();
       for(int i=0;i<len;i++)
        {  
          if(Character.isDigit(ch[i]))
                {
                   no[i]=Character.getNumericValue(ch[i]);
                   flag++;
                }
         }
        if(flag==0)
                   return -1;
        for(int i=0;i<no.length;i++)
                    sum=sum+no[i];
        return sum;      
  }
}

public class Main6
{
   public static void main(String[] args)
    {
       String s;
       int res;
       Scanner sc=new Scanner(System.in);
       s=sc.next();
       res=UserMainCode.sumOfnoinDigits(s);
       System.out.println(res);
    }
}