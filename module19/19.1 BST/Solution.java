import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.Stack;

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
	public int compareTo(Book key)
	{
		if(this.name.equals(key.name))
		{
			return 0;
		}
		else if(this.name.compareTo(key.name)>0)
		{
			return 1;
		}
		else
		{
			return -1;
		}
	}
}
class Node
{
    Book key;
    int value;
	Node left;
	Node right;
	int size;
	public Node(Book key, int value,int size)
	{
		
		this.key = key;
		this.value = value;
		this.size=size;
	}
}
class Fcr
{
	Node root;
	void  put(Book key,int value)
	{
		root=put(root,key,value);
	}
	Node put(Node x,Book key, int value)
	{
		if(x==null)
		{
			return new Node(key,value,1);
		}
		int cmp=key.compareTo(x.key);
		if(cmp<0)
		{
			x.left= put(x.left,key,value);
		}
		else if(cmp>0)
		{
		x.right= put(x.right,key,value);
		}
		else
		{
		x.value=value;
		}
		x.size=1+size(x.left)+size(x.right);
		return x;
	}
	int get(String key,Node x)
	{
		while(x!=null)
		{
			int cmp=key.compareTo(x.key.name);
			if(cmp<0)
			{
				x=x.left;
			}
			else if(cmp>0)
			{
				x=x.right;
			}
			else
			{
				
				return x.value;
			}
		}
		return 0;
	}
	Book floor(String key)
	{
		Node x=floor(root,key);
		if(x==null)
		{
			return null;
		}
		else return x.key;
	}
	Node floor(Node x,String key)
	{
		if(x==null)
		{
			return null;
		}
		int cmp=key.compareTo(x.key.name);
		if(cmp==0)
		{
			return x;
		}
		if(cmp<0)
		{
			return floor(x.left,key);
		}
		Node t=floor(x.right,key);
		if(t!=null)
		{
			return t;
		}
		else
		{
			return x;
		}
	}
	Book ceiling(String key)
	{
		Node x=ceiling(root,key);
		if(x==null)
		{
			return null;
		}
		return x.key;
	}
	Node ceiling(Node x,String key)
	{
		if(x==null)
		{
			return null;
		}
		int cmp=key.compareTo(x.key.name);
		if(cmp==0)
		{
			return x;
		}
		if(cmp<0)
		{
			Node t=ceiling(x.left,key);
		if(t!=null)
		{
			return t;
		}
		else
		{
			return  x;
		}
			
		}
		return ceiling(x.right,key);
		
	}
	
	int rank(String key)
	{
		return rank(key,root);
	}
	int rank(String key,Node x)
	{
		if(x==null)
		{
			return 0;
		}
		int cmp=key.compareTo(x.key.name);
		if(cmp<0)
		{
			return rank(key,x.left);
		}
		else if(cmp>0)
		{
			return 1+size(x.left)+rank(key,x.right);
		}
		else
		{
		return size(x.left);	
		}
	}
	public int size()
	{
		return size(root);
	}
	int size(Node x)
	{
		if(x==null)
		{
			return 0;
		}
		return x.size;
	}
	Book select(int key)
	{
		Node x=select(root,key);
		return x.key ;	
	}
	Node select(Node x,int key)
	{
		while(x!=null)
		{
			int s=size(x.left);
			if(s>key)
			{
				return select(x.left,key);
			}
			else if(s<key)
			{
				return select(x.right,key-s-1);
			}
			else
			{
				return x;
			}
		}
		return null;
	}
	private boolean isEmpty() 
	{
		return false;
	}
	
	Book min()
	{
		if(isEmpty())
			throw new NoSuchElementException("calls min() with empty symbol table");
		return min(root).key;
	}
	private Node min(Node x)
	{ 
	    if (x.left == null) 
	    	return x; 
	    else
	    	return min(x.left); 
	}
	Book max()
	{
		if(isEmpty())
			throw new NoSuchElementException("calls max() with empty symbol table");
		return max(root).key;
	}
	private Node max(Node x)
	{
		if(x.right==null)
		{
			return x;
		}	
		else
		{
			return max(x.right);
		}
	}
	public Iterable<Book> keys() {
	    if (isEmpty()) return new Stack<Book>();
	    return keys(min(), max());
	}
	public Iterable<Book> keys(Book lo,Book hi) {
	    if (lo == null) throw new IllegalArgumentException("first argument to keys() is null");
	    if (hi == null) throw new IllegalArgumentException("second argument to keys() is null");

	    Stack<Book> q = new Stack<Book>();
	    keys(root, q, lo, hi);
	    return q;
	} 
	private void keys(Node x, Stack<Book> q, Book lo,Book hi) { 
	    if (x == null) return; 
	    int cmplo = lo.compareTo(x.key); 
	    int cmphi = hi.compareTo(x.key); 
	    if (cmplo < 0) keys(x.left, q, lo, hi); 
	    if (cmplo <= 0 && cmphi >= 0) q.push(x.key); 
	    if (cmphi > 0) keys(x.right, q, lo, hi); 
	}
}
public class Solution
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	Fcr fcr=new Fcr();
	while(sc.hasNext())
	{
	String s=sc.nextLine();
	String a[]=s.split(",");
	switch(a[0])
	{
	case "put":Book b=new Book(a[1],a[2],Double.parseDouble(a[3]));
	int x=Integer.parseInt(a[4]);
	fcr.put(b, x);
		break;
	case "get":
		int g=fcr.get(a[1],fcr.root);
		if(g==0)
		{
			System.out.println("null");
		}
		else
		{
			System.out.println(g);
		}
		break;
	case "max":
		System.out.println(fcr.max().name+","+fcr.max().Author+","+fcr.max().price);
		break;
	case "min":System.out.println(fcr.min().name+","+fcr.min().Author+","+fcr.min().price);
		break;
	case "rank":
		break;
	case "ceiling":Book b1=fcr.ceiling(a[1]);
	if(b1==null)
	{
		System.out.println("null");
	}
	else
	{
		System.out.println(b1.name+", "+b1.Author+", "+b1.price);
	}
		break;
	case "floor":Book b2=fcr.floor(a[1]);
	if(b2==null)
	{
		System.out.println("null");
	}
	else
	{
		System.out.println(b2.name+", "+b2.Author+", "+b2.price);
	}
		break;
	case "select":
		//System.out.println(a[1]);
		Book b3=fcr.select(Integer.parseInt(a[1]));
		System.out.println(b3.name+","+b3.Author+","+b3.price);
		//System.out.println(fcr.select(Integer.parseInt(a[1])).name+", "+fcr.select(Integer.parseInt(a[1])).Author+", "+fcr.select(Integer.parseInt(a[1])).price);
		break;
	}
	}
	}
}