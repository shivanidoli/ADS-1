import java.util.Scanner;
public class Solution 
{
public static void main(String[] args) 
{
  int n;
  Linkedlist l=new Linkedlist();
  Scanner sc=new Scanner(System.in);
  String st[]=new String[3];
  String st1;
  for(int i = 0;sc.hasNext();i++)
   {
     st1=sc.nextLine();
     st=st1.split(" ");
     switch(st[0])
      {
	case "insertAt":
	if(Integer.parseInt(st[1])>=0&&Integer.parseInt(st[1])<=l.size())
	{
	 l.InserAt(Integer.parseInt(st[1]),Integer.parseInt(st[2]));
	 l.display();
        }
	else
	{
         System.out.println("Can't insert at this position.");
	}
	break;
	case "reverse":
	l.reverse(0);
	l.display();
	break;
	}
      }
   }
}	
class Linkedlist 
{
  Node head;
  class Node
  {
   int data;
   Node next;
   public Node(int b)
   {
    this.data=b;
   }
   }
public void InserAt(int a,int b)
{
  Node n=new Node(b);
  int c=0;
  if(head==null)
  {
   head=n;
  }
  else if(a==0)
  {
   n.next=head;
   head=n;
   }
   else
   {
    Node temp=head;
    recursion(a,b,temp,c);
    n.next=temp.next;
    temp.next=n;
    }
}
public void recursion(int a1,int b1,Node n1,int c)
{
  if(c+1!=a1 && n1.next!=null)
  {
   n1=n1.next;
   c++;
   recursion( a1, b1, n1, c);
   }
}
public void reverse(int c1)
{
 int c=c1;
 int n=size();
 Node temp = head; 
 int t;
 if(n<c)
  {
    System.out.println("No elements to reverse.");
  }
  if(c!=n && temp!=null)
  {
   t=popend();
   insertAt(c,t);
   temp=temp.next;
   c++;
   reverse(c);
   }	
}
public void display()
{	
 Node temp=head;
 if(head==null)
  {
   System.out.print("No elements to reverse.");
   }
  else
   {
    while(temp!=null)
    {
	if(temp.next!=null)
	{
	 System.out.print(temp.data+", ");
	}
	else
	{
	 System.out.print(temp.data);
	}
	temp=temp.next;
	}
	System.out.println();
	}
}
public int size()
{
 Node temp1=head;
 int count=0;
 while(temp1!=null)
 {
	temp1=temp1.next;
	count++;
	
}
return count;
	
}
public void insertAt(int a,int b)
{
	Node n=new Node(b);
	int count=0;
	
	if(head==null)
	{
		head=n;
	}
	else if(a==0)
	{
		n.next=head;
		head=n;
	}
	else
	{
		
		Node temp =head;
	while(count+1!=a && temp.next!=null)
	{
		temp=temp.next;
		count++;
	}
	
	n.next=temp.next;
	temp.next=n;
	}
	
}
public int  popend()
{
		Node temp1=null;
	
	if(head==null)
		
	{
		System.out.println("Stack is empty");
		return -1;
	}
	else if(head.next==null)
	{
         Node temp=head;
	 head=null;
	 return temp.data;
	}
	else
	{
		Node temp=head;
	
	while(temp.next.next!=null)
	{
		temp=temp.next;
	}
	temp1=temp.next;
	temp.next=null;
	return temp1.data;
	}
	

}

}

