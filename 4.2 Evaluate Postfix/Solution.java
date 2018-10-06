import java.util.Scanner;
public class Solution
{
	public static void main(String[] args)
	{
                Scanner sc=new Scanner(System.in);
		String s;
                s=sc.nextLine();
		Stack st=new Stack();
                st.postfix(s);
	}

}
class Node
{
int data;
Node next;

Node(int data)
{
	this.data=data;
	this.next=null;
}
}
class Stack
{
	Sort so=new Sort();
	int postfix(String s)
	{
		int i;
		for(i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(c==' ')
			{
				continue;
			}
			else if(Character.isDigit(c))
			{
				int n=0;
				while(Character.isDigit(c))
				{
					n=n*10+(int)(c-'0');
					i++;
					c=s.charAt(i);
				}
				i--;
				so.push(n);
				}
			else
			{
				int result=0;
				int c1=so.pop();
				int c2=so.pop();
				switch(c)
				{
				case '+':
					result=c1+c2;
					so.push(result);
					break;
				case '-':
					result=c1-c2;
					so.push(result);
					break;
				case '*':
					result=c1*c2;
					so.push(result);
					break;
				case '/':
					result=c1/c2;
					so.push(result);
					break;
			    }
				
				}
			}
		
		return so.pop();
		}
}
class Sort
{
	Node head=null;
	boolean isEmpty()
	{
		return head==null;
	}
	public void push(int data)
	{
		Node n=new Node(data);
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
	int pop()
	{
		Node temp=head;
		head=head.next;
		System.out.println(temp.data);
		return 0;
	}
}