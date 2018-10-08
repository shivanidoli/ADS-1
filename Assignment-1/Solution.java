import java.util.Scanner;

class AddLargeNumbers 
{

 public static LinkedList numberToDigits(String number) 
  {

     return null;
    }


 public static String digitsToNumber(LinkedList list) 
 {

 
   return null;
   }


 public static LinkedList addLargeNumbers(LinkedList list1, LinkedList list2) 
 {


    return null;
    }

}

 class LinkedList 
{
 
	class Node1
	{
		int data;
		Node1 next;
	
	Node1(int data)
	{
		this.data=data;
		this.next=null;
	}
}
	Node1 head=null;
	public void push(int data)
	{
		Node1 n=new Node1(data);
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
	public int pop()
	{
		Node1 temp=head;
		head=head.next;
		System.out.println(temp.data);
		return temp.data;
	}
}

public class Solution 
{

 public static void main(String[] args)
 {
      
    Scanner sc = new Scanner(System.in);

    String input = sc.nextLine();
    
    String p = sc.nextLine();
     
    String q = sc.nextLine();
    LinkedList ll=new LinkedList();  
        
    switch(input)
	{
  
          case "numberToDigits":
            
          LinkedList pDigits = AddLargeNumbers.numberToDigits(p);
      
          LinkedList qDigits = AddLargeNumbers.numberToDigits(q);
  
          System.out.println(AddLargeNumbers.digitsToNumber(pDigits));

          System.out.println(AddLargeNumbers.digitsToNumber(qDigits));
             
          break;

           
          case "addLargeNumbers":
  
          LinkedList pDigits1 = AddLargeNumbers.numberToDigits(p);

          LinkedList qDigits1 = AddLargeNumbers.numberToDigits(q);
          LinkedList result = AddLargeNumbers.addLargeNumbers(pDigits1, qDigits1);

          System.out.println(AddLargeNumbers.digitsToNumber(result));
  
          break;

        }
    
      }

    
}
