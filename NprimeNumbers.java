import java.util.Scanner;
class NprimeNumbers
{
	public static boolean checkprime(int num)
	{
		int count=0;
		for (int i=1;i<=num;i++)
		{
			if (num%i==0)
				count++;
			}
			return count==2;
	}
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
		int count=0;
		for (int i=1; ;i++)
		{
			if(checkprime(i))
			{
				System.out.print(i+ "");
				count++;
		}
		if(count==num)
			break;
		}
		System.out.println();
	}
}



