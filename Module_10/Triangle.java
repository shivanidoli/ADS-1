class Triangle
{
public static void main(String args[])
 {
   B b=new B();
   System.out.println(b.triangle(3));
   System.out.println(b.triangle(2));
   System.out.println(b.triangle(6));
   System.out.println(b.triangle(4));
   System.out.println(b.triangle(7));
 }
}
class B
{
public int triangle(int rows) 
{
 System.out.println(rows);
  if(rows == 0)
  {
    return 0;
  }
  return rows + triangle(rows-1);
}
}


triangle(3)
return(3)+triangle(2);
return(2)+triangle(1);
return(1)+triangle(0);
return 0;
answer :-6


triangle(2)
return(2)+triangle(1);
return(1)+triangle(0);
return 0;
answer:-3


triangle(6)
return(6)+triangle(5);
return(5)+triangle(4);
return(4)+triangle(3);
return(3)+triangle(2);
return(2)+triangle(1);
return(1)+triangle(0);
return 0;
answer:-21


triangle(4)
return(4)+triangle(3);
return(3)+triangle(2);
return(2)+triangle(1);
return(1)+triangle(0);
return 0;
answer:-10


triangle(7)
return(7)+triangle(6);
return(6)+triangle(5);
return(5)+triangle(4);
return(4)+triangle(3);
return(3)+triangle(2);
return(2)+triangle(1);
return(1)+triangle(0);
return 0;
answer:-28