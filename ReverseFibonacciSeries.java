import java.util.Scanner;
class ReverseFibonacciSeries
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the n value");
		int n=sc.nextInt();
		System.out.println("first" +n+  "fibonacciseries");
		int a=0,b=1;
		String res="";
		for(int i=1; i<=n; i++)
		{
			res="" + a + res;
			int c=a+b;
			 a=b;
			b=c;
		}
		System.out.println(res);
	}
}




