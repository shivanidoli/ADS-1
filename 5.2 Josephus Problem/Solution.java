import java.io.BufferedReader;
import java.io.InputStreamReader;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Queue q=new Queue();
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int tc,n,m,i;
		tc=Integer.parseInt(br.readLine());
		String s=br.readLine();
		String k[]=s.split(" ");
		n=Integer.parseInt(k[0]);
		m=Integer.parseInt(k[1]);
		StringBuilder sb =new StringBuilder("");
		for(i=0;i<n;i++)
		{
			q.enqueue(i);
		}
		int count=0;
		  while(!q.isEmpty())
		  {
			 if(count==m-1)
			 {
				 sb.append(q.dequeue()+" ");
				 count=0;
			 }
			 else
			 {
				 q.enqueue(q.dequeue());
				 count++;
			 }
		  }
			int x=sb.length();
			  String l=sb.substring(0,x-1);
			System.out.println(l);    
			tc--;

		
	}
}
class Queue
{
	Node head=null;
	Node tail=null;
	int n=0;
	class Node
	{
		int data;
		Node next;
		Node prev;
		Node(int data)
		{
			this.data=data;
			this.next=null;
		}
	}
	boolean isEmpty()
	{
		return head==null;
	}
	public int size()
	{
		return n;
	}
	public void enqueue(int i)
	{
		 Node p = new Node(i);
		    if (isEmpty())
		    {
		    head=tail;
		    }
		    else
		    {
		    	p.next = tail;
		    }
		    ++n;
	}
	public int dequeue()
	{
		Node temp=head;
		if(isEmpty())
		{
			tail=null;
		}
		n--;
		return temp.data;
	}
}
