public class Bunny
{
public static void main(String args[])
	{
		C c=new C();
		System.out.println(c.bunnyEars(0));
                System.out.println(c.bunnyEars(2));
		System.out.println(c.bunnyEars(4));
		System.out.println(c.bunnyEars(5));
		System.out.println(c.bunnyEars(10));
		
	}
}
class C
{
	public int bunnyEars(int bunnies)
	{
        System.out.println(bunnies);
 	if(bunnies == 0)
 	{  
   	 return 0;
 	}
	if(bunnies % 2 == 1)
	{
	  return 2 + bunnyEars(bunnies-1);
	}
	return 3 + bunnyEars(bunnies-1);
	}
}

bunnyEars(0)
return 0;
Answer 0


bunnyEars(2)
return 3+bunnyEars(1);
return 2+bunnyears(0);
return 0;
Answer 5

bunnyEars(4)
return 3+bunnyEars(3);
return 2+bunnyEars(2);
return 3+bunnyEars(1);
return 2+bunnyEars(0);
return 0;
Answer 10

bunnyEars(5)
return 2+bunnyEars(4);
return 3+bunnyEars(3);
return 2+bunnyEars(2);
return 3+bunnyEars(1);
return 2+bunnyEars(0);
return 0;
Answer 12

bunnyEars(10)
return 3+bunnyEars(9);
return 2+bunnyEars(8);
return 3+bunnyEars(7);
return 2+bunnyEars(6);
return 3+bunnyEars(5);
return 2+bunnyEars(4);
return 3+bunnyEars(3);
return 2+bunnyEars(2);
return 3+bunnyEars(1);
return 2+bunnyEars(0);
return 0;
Answer 25
