import java.util.Scanner;
class Tribonacciseries
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the n value");
		int n=sc.nextInt();
		System.out.println("first" +n+ "tribonacci series :");
		int a=0,b=1,c=1;
		for(int i=1; i<=n; i++)
		{
			System.out.print(a+ "");
			int d=a+b+c;
			 a=b;
			b=c;
			c=d;
		}
		System.out.println();
	}
}






