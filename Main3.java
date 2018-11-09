/*4.A integer array is given as input. find the difference between each element. Return the index of the largest element which has the largest difference gap.
input: {2,3,4,2,3}
logic: 2-3=1,3-4=1,4-2=2,2-3=1
2 is the max diff between 4 and 2,return the index of 4(2)
output:2*/

import java.io.*;
import java.lang.*;
import java.util.*;

class Main3
{
  public static void main(String args[])
  {
     int n;
     Scanner sc=new Scanner(System.in);
     System.out.println("enter the size of the array");
     n=sc.nextInt();
     System.out.println("enter the elements");
     int a[]=new int[n];
     int diff[]=new int[n-1];
     for(int i=0;i<n;i++)
         a[i]=sc.nextInt();
     for(int i=0;i<n-1;i++)
           diff[i]=Math.abs(a[i]-a[i+1]);
     int max=diff[0];  
     for(int i=0;i<n-1;i++){
         if(max<diff[i])
            max=diff[i];   
               }
     System.out.println(max);


    }

}