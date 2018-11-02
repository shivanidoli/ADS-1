import java.util.Scanner;

public class Solution
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		Binarytree bt=new Binarytree();

		while(sc.hasNext())
		{
		String s=sc.nextLine();
		String a[]=s.split(",");
		switch(a[0])
		{
		case "put":
			Book b=new Book(a[1],a[2],Double.parseDouble(a[3]));
			int x=Integer.parseInt(a[4]);
			bt.put(b, x);
			break;
		case "get":
			Book buk=new Book(a[1],a[2],Double.parseDouble(a[3]));
			int p=bt.get(bt.root,buk);
			if(p==0)
			{
				System.out.println("null");
			}
			else
			 System.out.println(p);
			
				break;
		}
	}
	}
}
class Book
{
	String name;
	String Author;
	Double price;
	Book(String name,String Author,Double price)
	{
		this.name=name;
		this.Author=Author;
		this.price=price;
	}
}

class Node
{
	Book key;
	int value;
	Node left;
	Node right;
	public Node(Book key, int value) {
		
		this.key = key;
		this.value = value;
		this.left=this.right=null;
	}
}

class Binarytree
{
	Node root;
	void put(Book key ,int value)
	{
		root=put(root,key,value);
	}
	private Node put(Node x,Book key,int value)
	{
		if(x==null)
		{
			return new Node(key,value);
		}
		int cmp=compare(key,x.key);
		if(cmp<0)
		{
			x.left=put(x.left,key,value);
		}
		else if(cmp>0)
		{
			x.right=put(x.right,key,value);
		}
		else
		{
			x.value=value;
		}
		return x;
	}
	private int compare(Book k, Book s) {
		if(k.name.compareTo(s.name)==0)
		{
			return 0;
		}
		else if(k.name.compareTo(s.name)>0)
		{
			return 1;
		}
		else
		return -1;
	}
	 int get(Node x,Book key)
	{
		if(x==null)
		{
			return 0;
		}
		int cmp=compare(key,x.key);
		if(cmp<0)
		{
			return get(x.left,key);
		}
		else if(cmp>0)
		{
			return get(x.right,key);
		}
		else
		{
			return x.value;
		}
}
}
