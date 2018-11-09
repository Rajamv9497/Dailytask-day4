/* 1.Two input strings are accepted. If the two strings are of same length concat them and return, if they are not of same length, reduce the longer string to size of smaller one, and concat them
input1:"hello"
input2:"hi"
output:"lohi"
input1:"aaa"
input2:"bbb"
output:"aaabbb"*/


import java.io.*;
import java.lang.*;
import java.util.*;

class Main
{
  public static void main(String args[])
  {
       String s1,s2;
       int a,b;
       Scanner sc =new Scanner(System.in);
       s1=sc.next();
       s2=sc.next();
       a=s1.length();
       b=s2.length();
       if(a==b)
              System.out.println(s1+""+s2);
       else
          {
              if(a<b)
                 System.out.println(s1+""+s2.substring(a-2));
              else
                 System.out.println(s1.substring(a-2)+""+s2);
          }

    }

}