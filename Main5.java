/*6).Given a method with a positive number as input. write a code to calculate the sum of squares of individual digits of given number. Return it as output. 
Example: Input=321 output=(3*3+2*2+1*1)=14
*/

import java.util.*;
import java.lang.*;
import java.io.*;

class UserMainCode
{
  public static int sumOfSquaresOfDigits(int s)
  {
    int sum=0,rem;
    while(s>0)
     {
        rem=s%10;
        s=s/10;
        sum=sum+(rem*rem);
      }
    return sum;
  }
}

public class Main5
{
   public static void main(String[] args)
    {
       int no,res;
       Scanner sc=new Scanner(System.in);
       no=sc.nextInt();
       res=UserMainCode.sumOfSquaresOfDigits(no);
       System.out.println(res);
    }
}