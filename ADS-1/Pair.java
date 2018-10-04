package pairs;
import java.util.Arrays;
import java.util.Scanner;

public class Pair 
{
	
	public static void main(String[] args)
	{
		int []a;
		int []b;
	    int n;
		System.out.println("enter n value");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		System.out.println("enter array elements");
		 a=new int[n];
		 b=new int[n];
		for(int i=0;i<n;i++)
		{   
			a[i]=sc.nextInt();
		}
		Arrays.sort(a);
		for(int i=0;i<n;i++)
		{   
			System.out.println(a[i]);
		}
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(a[i]==a[j])	
				{
				b[i]=a[i];	
				}
			}
		}
		for(int i=0;i<b.length;i++)
		{
			if(b[i]!=0)
			{
		System.out.println(b[i]+"have pair");
			}
		}
		sc.close();
	}
}
