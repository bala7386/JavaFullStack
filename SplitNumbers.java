import java.util.Scanner;
class SplitNumbers
{
public static void main(String [] args)
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number");
	int num=sc.nextInt();
	int count=0,t=num;
		while (num!=0)
		{
			num=num/10;
			count++;
		}
		int p=1;
		for (int i=1;i<=count/2 ;i++ )
		{
			p=p*10;
		}
		int s=t%p;
		int f=t/p;
		System.out.println(f+ "\n" +s);
	}
}











