class Count
{
public static void main(String args[])
  {
    A a=new A();
    System.out.println(a.count(717));
    System.out.println(a.count(7));
    System.out.println(a.count(123));
    System.out.println(a.count(47571));
    System.out.println(a.count(99999));
    }
}
class A
{
int count(int n) 
{
       System.out.println(n);
	  if(n<= 6)
	{
	    return 0;
	  }
	  if(n%10==7)
	  {
	    return 1 + count(n/10);
	  }
	  return count(n/10);
	}
}

count(717)
return 1+ count(71);
return count(7);
return 0;
answer:-2


count(7)
return 1+count(0);
return 0;
answer:-1


count(123)
return count(12);
return count(1);
return 0;
answer:-0

count(47571)
return count(4757);
return 1+ count(475);
return count(47);
return 1+count(4);
return 0;
answer:-2



count(99999)
return count(9999);
return count(999);
return count(99);
return count(9);
return 0;
answer:-0
