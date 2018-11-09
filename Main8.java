/*8)	Given a method with a string, start index and length. write code to extract substring from right to left. Assume the last character has index 0. Example:
 input1="Rajasthan"
 input2=2
 input3=3. 
Output = hts. 
*/

import java.util.*;
import java.lang.*;
import java.io.*;

class UserMainCode
{
  public static String extSubString(String s,int a,int b)
  {
    String ext="";
    int len=s.length();     
    char ch[]=s.toCharArray();
    for(int i=len-a-1;i>(len-a-1-b);i--)
         ext=ext+ch[i];
    return ext;

  }
}

public class Main8
{
   public static void main(String[] args)
    {
       int n1,n2;
       String ip,res;
       Scanner sc=new Scanner(System.in);
       ip=sc.next();
       n1=sc.nextInt();
       n2=sc.nextInt();
       res=UserMainCode.extSubString(ip,n1,n2);
       System.out.println(res);
    }
}