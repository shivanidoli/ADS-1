import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Node
{

	public char data;
	public Node next;
	Node(char data)
	{
		this.data=data;
		this.next=null;
	}
	
}
class Paranthesis
{
    Node head=null;
	public boolean isEmpty()
	{
		return head==null;
	}
	public void push(char c)
	{
		Node n=new Node(c);
		if(head==null)
		{
			head=n;
		}
		else
		{
			n.next=head;
			head=n;
		}
	}
	public char pop()
	{
		char data = 0;
		if(head!=null)
		{
			data=head.data;
			head=head.next;
			
		}
		return data;
	}
}
class Braces
{
	Paranthesis pa=new Paranthesis();
	char ch;
	boolean b=true;
	
	 public Braces(String s)
	{
	for(int i=0;i<s.length();i++)
	{
		char c=s.charAt(i);
		if(c=='('||c=='{'||c=='[')
		{
			pa.push(c);
		}
		else if(c=='}'||c==']'||c==')')
		{
			if(pa.isEmpty())
			{
				System.out.println("NO");
				return;
			}
			ch=pa.pop();
			boolean t=Match(ch,c);
			if(t==false)
			{
				System.out.println("NO");
				return;
			}
		}	
	}	
	if(!pa.isEmpty())
	       {
	    	   System.out.println("NO");
	       }
	       else
		   System.out.println("YES");
	}

	  boolean Match(char c1,char c2)
	  { 
		  if(c1=='('&&c2==')')
		  {
			  return true;
		  }
		  else if(c1=='{'&&c2=='}')
		  {
			  return true;
		  }
		  else if(c1=='['&&c2==']')
		  {
			  return true;
		  }
		return false;
		  
	  }
}

public class Solution 
{
	public static void main(String[] args) throws IOException
	{
		 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int s;
		s=Integer.parseInt(br.readLine());
		for(int i=0;i<s;i++)
		{
			Braces p1=new Braces(br.readLine());
		}
     
	}
}
	
  
