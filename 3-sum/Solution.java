import java.util.Arrays;
import java.util.Scanner;

class Solution
{
public static void main(String[] args)
{
	int []a;
	int n;
   // System.out.println("enter array size");
    Scanner sc= new Scanner(System.in);
    n=sc.nextInt();
    a=new int[n];
   // System.out.println("enter array elements");
    for(int i=0;i<a.length;i++)
   {
       a[i]=sc.nextInt();
   }
   Arrays.sort(a);
   /*for(int i=0;i<a.length;i++)
   {
    System.out.print(a[i]);
   }*/
   for(int i=0;i<a.length;i++)
   {
     int j=i+1;  
     int k=a.length-1;
     while(j<k)
     {
      if((a[i]+a[j]+a[k])==0)
      {
       System.out.println("true");
        return;
       }
      else if((a[i]+a[j]+a[k])<0)
       {
        j++;
       }
      else if((a[i]+a[j]+a[k])>0)
      {
       k--;
      }
     sc.close();
    }
   }
  System.out.println("false");
  }
 }
