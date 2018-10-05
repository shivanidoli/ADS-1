import java.util.Arrays;
import java.util.Scanner;

class Solution
{
public static void main(String[] args)
{
	int []a;
	int n,i,j,k;
    Scanner sc= new Scanner(System.in);
    n=sc.nextInt();
    a=new int[n];
    for(i=0;i<a.length;i++)
     {
       a[i]=sc.nextInt();
     }
   Arrays.sort(a);
   for(i=0;i<a.length-2;i++) 
   {
	for(j=i+1;j<a.length-1;j++)
	{
		for(k=j+1;k<a.length;k++)
		{
			if((a[i]+a[j]+a[k])==0)
			{
		         System.out.println("true");
		       	 return;
			}
		}
	}
   }   
  System.out.println("false");
  }
 }
