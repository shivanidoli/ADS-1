import java.util.Arrays;
import java.util.Scanner;
import java.io.*;
class Solution
{
public static void main(String[] args)throws Exception
{
	int []a;
	int n,i,j,k;
int count=0;
    //Scanner sc= new Scanner(System.in);
     BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
    n=Integer.parseInt(br.readLine());
    a=new int[n];
    for(i=0;i<a.length;i++)
     {
       a[i]=Integer.parseInt(br.readLine());
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
		         count++;
			}
		}
	}
   }   
  System.out.println(count);
  }
 }
