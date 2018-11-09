/*7.Given a method with pan card no as string input .Write code to validate PAN no against following rules: 
1)	there must be 8 characters 
2)	first 3 letters must be alphabets followed by 4 digit number and ends with alphabet. 
3)	all alphabets should be in capital case 
If pan card no is valid return 1as output else return 2 as output 
Example:
 input= ALD3245E 
output=1
*/

import java.util.*;
import java.lang.*;
import java.io.*;

class UserMainCode
{
  public static int validatePAN(String s)
  {
   int flag=0;
    char ch[]=s.toCharArray();
    if(ch.length==8)
    {
      for(int i=0;i<8;i++)
        {
           if(i<3||i==7)
           {
              if(ch[i]>=65&&ch[i]<=90)
                  flag++;
              
           }
           else
            {
                if((ch[i]>=48)&&(ch[i]<=57))
                   flag++;
             }
         }

      if(flag==8)
          return 1;
      else
          return 2;
     }
    else
         return 2;     
  }
}

public class Main7
{
   public static void main(String[] args)
    {
       int res;
       String s;
       Scanner sc=new Scanner(System.in);
       s=sc.next();
       res=UserMainCode.validatePAN(s);
       System.out.println(res);
    }
}