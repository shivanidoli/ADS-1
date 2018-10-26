
import java.util.Scanner;

public class StringPair 
{
    public static  String pair(String str)
    {
    	int len=str.length();
    	//String result=" ";
    	if(len==1)
    		return str;
    	if(str.charAt(0)==str.charAt(1))
    	{
    		return str.charAt(0)+"*"+pair(str.substring(1));
    	}
		return str.charAt(0)+pair(str.substring(1));
    	
    }
    public static void main(String[] args)
    {
    	StringPair sp=new StringPair();
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter the string");
    	String str=sc.next();
    	String pair=pair(str);
    	System.out.println("Pair:"+pair);
    	}
}




