import java.util.*;
import java.io.*;
import java.util.Scanner;

public class Solution 
{
  public static void main(String[] args)throws Exception
 {		   
     int[] a=null;
     int[] b=null;
     int n,m;
    // Scanner sc=new Scanner(System.in);
     BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
     String s=br.readLine();
     String r=br.readLine();
     n=Integer.parseInt(s);
     m=Integer.parseInt(r);
     String w[]=null;
     String x[]=null;
     a=new int[n];
     b=new int[m];
     String p=br.readLine();
     String q=br.readLine();
     w=p.split("[,.]");
     x=q.split("[,.]");
     for(int i=0;i<n;i++)
      {
        a[i]=Integer.parseInt(w[i]); 
      }
     for(int j=0;j<m;j++)
     {
    	 b[j]=Integer.parseInt(x[j]);
     }
     int[] c;
     int i=0,j=0,k=0;
     c=new int[m+n];
     while(i<a.length&&j<b.length)
     {
      if(a[i]>b[j])
      {
        c[k]=b[j];
         k++;
         j++;
       }
	   else
	   {
		   c[k]=a[i];
		   k++;
		   i++;
	   }
      }
     while(i<a.length)
     {
    	 c[k]=a[i];
    	 k++;
    	 i++;
     }
     while(j<b.length)
     {
    	 c[k]=b[j];
    	 k++;
    	 j++;
     }
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
