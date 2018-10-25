
public class Parenbit
{
	public static void main(String args[])
	{
		 E e=new E();
		 System.out.println(e.parenBit("xyz(abc)123"));
		 System.out.println(e.parenBit("(xy)1")); 
                 System.out.println(e.parenBit("hello(not really)there"));
                 System.out.println(e.parenBit("()")) ;
                 System.out.println(e.parenBit("res (ipsa) loquitor"));
	}
}
class E
{
	public String parenBit(String str)
	{
               System.out.println(str);
		int len = str.length();
		if(str.charAt(0) != '(')
		{
			if(str.charAt(len - 1) != ')')
			{
			  return parenBit(str.substring(1, len -1));
			}
			return parenBit(str.substring(1));
		 }
		if(str.charAt(len - 1) != ')')
		{
		  return parenBit(str.substring(0, len - 1));
		}
		return str;
	}
}


parenBit("xyz(abc)123")
return parenBit("yz(abc)12");
return parenBit("z(abc)1");
return parenBit("(abc)")
return (abc);
answer:-(abc);


parenBit("(xy)1") 
return parenBit("(xy)");
return (xy);
answer:-(xy);


parenBit("hello(not really)there")
return parenBit("ello(not really)ther");
return parenBit("llo(not really)the");
return parenBit("lo(not really)th");
return parenBit("o(not really)t");
return parenBit("(not really)");
return (not really);
answer:-(not really);


parenBit("()") 
return ();
answer:-();


parenBit("res (ipsa) loquitor")
return parenBit("es(ipsa)loquito");
return parenBit("s(ipsa)loquit");
return parenBit("(ipsa)loqui");
return parenBit("(ipsa)loqu");
return parenBit("(ipsa)loq");
return parenBit("(ipsa)lo");
return parenBit("(ipsa)l");
return parenBit("(ipsa)");
return (ipsa);
answer:-(ipsa);
