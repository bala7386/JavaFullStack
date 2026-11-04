import java.util.Scanner;
class FibonacciSeries
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the n value");
		int n=sc.nextInt();
		System.out.println("first" +n+  "fibonacciseries");
		int a=0,b=1;
		for(int i=1; i<=n; i++)
		{
			System.out.print(a+"");
			int c=a+b;
			 a=b;
			b=c;
		}
		System.out.println();
	}
}



