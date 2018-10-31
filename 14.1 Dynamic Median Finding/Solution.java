import java.util.Scanner;

public class Solution 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int []pq = new int[n];
		int b = 0;
		Sort st = new Sort();
		for (int a = 0; a < n; a++)
		{
			pq[a] = sc.nextInt();
			b = a + 1;
			st.sort(pq, b);
			st.display(pq, b);
		}
	}
}
	class Sort 
	{
		public void sort(int pq[], int b)
		{
			int n = b;
			for (int k = n / 2; k >= 1; k--)
			{
				sink(pq, k, n);
			}
			while (n > 1) {
				exch(pq, 1, n--);
				sink(pq, 1, n);
			}
		}
		void display(int pq[], int b) {

			/*
			 * for(int i=pq.length-1;i>=0;i--) { System.out.println(pq[i]); }
			 */
			if (b == 1)
			{
				double c = pq[b - 1];
				System.out.println(c);
			}
			else if (b % 2 == 0) {
				double k = (double) (pq[(b / 2 - 1)] + pq[(b / 2)]) / 2.0;
				System.out.println(k);
			}
			else
			{
				double s = pq[(b / 2)];
				System.out.println(s);
			}
			/*for (int i = 0; i < pq.length; i++)
			{
				System.out.println("c" + pq[i]);
			}*/
		}
		public  void sink(int pq[], int k, int n)
		{
			while ((2 * k) <= n)
			{
				int j = 2 * k;
				if (j < n && less(pq, j, j + 1))
					j++;
				{
					if (!less(pq, k, j))
						break;
					exch(pq, k, j);
					k = j;
				}
			}
		}

		 boolean less(int pq[], int i, int j)
		{
			return pq[i - 1] < pq[j - 1];
		}

		 void exch(int pq[], int n1, int n2) 
		{
			int temp = pq[n1 - 1];
			pq[n1 - 1] = pq[n2 - 1];
			pq[n2 - 1] = temp;
		}
	}