/*2.Check whether a given string is palindrome also check whether it has atleast 2 different vowels
input: "madam"
output: false(no 2 diff vowels)*/


import java.io.*;
import java.lang.*;
import java.util.*;

class Main1
{
   public static void main(String args[])
   {
        String s,rev="";
        int flag=0;
        String vow[]={"a","e","i","o","u"};
        Scanner sc =new Scanner(System.in);
        s=sc.next();
        char[] s1=s.toCharArray();
        int len=s1.length;
        for(int i=len-1;i>=0;i--)        
             rev=rev+s1[i];
         for(int j=0;j<5;j++)
              {
                  if(s.contains(vow[j]))
                        flag++;
                }
          if(s.equals(rev)&&flag>1)
                     System.out.println("true");
        else
                       System.out.println("false");
    }

}



















