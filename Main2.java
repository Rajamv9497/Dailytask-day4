/*3. Find no of characters in a given string which are not repeated.
input: "hello"
output: 3*/

import java.io.*;
import java.lang.*;
import java.util.*;

class Main2
{
  public static void main(String args[])
  {
       String s;
       String res="";
       Scanner sc =new Scanner(System.in);
       s=sc.next();
       int len=s.length();
       char c[]=s.toCharArray();
       for(int i=0;i<len;i++)
         {
           int flag=0;
           for(int j=0;j<len;j++)
            {
              if(c[i]==c[j])
                  flag++;
             }   
           if(flag==1)
              res=res+c[i];
          
         }
      System.out.println(res.length());
    }

}