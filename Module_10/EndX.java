class EndX
{
	public static void main(String args[])
	{
		D d=new D();
	        System.out.println(d.endX("xxre"));
		System.out.println(d.endX("xxhixx"));
		System.out.println(d.endX("xx")); 
	        System.out.println(d.endX("bxx"));
		System.out.println(d.endX("bxax"));
	}
}
class D
{
	public String endX(String str)
	{
                System.out.println(str);
		if(str.length() == 0)
		{
		return str;
		}
		if(str.charAt(0) == 'x')
		{
	         return endX(str.substring(1)) + 'x';
		}   
		return str.charAt(0) + endX(str.substring(1));
	}
}


endX("xxre")
return endX("xre")+'x';
return endX("re")+'x';
return(r)+endX(e);
return(e)+endX(0);
return 0;
answer:-rexx

endX("xxhixx")

return endX("xhixx")+'x';
return endX("hixx")+'x';
return(h)+endX(i);
return(i)+endX(x);
return endX("x")+'x';
return endX("0")+'x';
return0;
answer:-hixxxx

endX("xx") 
return endX("x")+'x';
return endX("0")+'x';
return0;
answer:-xx


end("bxx")
return(b)+endX(x);
return endX("x")+'x';
return endX("0")+'x';
return0;
answer:-bxx



end("bxax")

return(b)+endX(x);
return endX("ax")+'x';
return(a)+endX(x);
return endX("0")+'x';
return0;
answer:-baxx

