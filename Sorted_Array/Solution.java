import java.util.Arrays;
import java.util.Scanner;

public class Solution 
{
	public static void main(String args[]) throws Exception
	{
		int n,m,i,j,k;
		int []a;
		int []b;
		int[] c;
	    Scanner sc= new Scanner(System.in);
	    Scanner sc1= new Scanner(System.in);
	   // System.out.println("enter n array size");
	    n=sc.nextInt();
	    //System.out.println("enter m array size");
	    m=sc1.nextInt();
	    a=new int[n];
	    b=new int[m];
	    c=new int[m+n];
	   // System.out.println("enter n array elements");
	    for(i=0;i<n;i++)
	   {
	       a[i]=sc.nextInt();
	   }
	   Arrays.sort(a);
		/*for(i=0;i<n;i++)
		{
		System.out.print(a[i]);
		}
		System.out.println("\n enter m array elements");*/
		for(j=0;j<m;j++)
		{
			b[j]=sc1.nextInt();
		}
		Arrays.sort(b);
	/*	for(j=0;j<m;j++)
		{
			System.out.print(b[j]+"\n");
		}*/
		
		i=0;
		j=0;
		k=0;
		while(i<a.length&&j<b.length)
		{
			if(a[i]>b[j])
			{
				c[k++]=b[j];
				j++;
			}
			else
			{
				c[k++]=a[i];
				i++;
			}
		}
		while(i<a.length)
		{
			c[k++]=a[i++];
		}
		while(j<b.length)
		{
			c[k++]=b[j++];
		}
		sc.close();
		sc1.close();
		for(k=0;k<c.length;k++)
		{
			if(k<c.length-1)
			{
			 System.out.print(c[k]+",");
			}
			else
			{
				 System.out.print(c[k]);
			}
		}
	}
}
