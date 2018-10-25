import java.util.Scanner;

class Factorial
 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num = sc.nextInt();
		int fact =1;
		factorial(num,fact);
  }

	public static int factorial(int num, int fact)
	{
                System.out.println(fact);
		if(num == 0)
		{
			return fact;
		}
		else
		{
			fact=fact*num;
			num=num-1;
			factorial(num,fact);
		}
		return fact;
	}

}






