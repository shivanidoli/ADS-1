import java.util.Scanner;

class Factorial
 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num = sc.nextInt();
		int fact =factorial(num);
                System.out.println(fact);

  }

	public static int factorial(int num)
	{
               		if(num==1)
		{
			return 1;
		}
		return num*factorial(num-1);
	}

}












