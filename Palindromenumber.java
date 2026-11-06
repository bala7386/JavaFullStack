import java.util.Scanner;
class Palindromenumber
{
	public static int reverse(int num)
	{
		int rev=0;
		while(num!=0)
		{
			int ld=num%10;
			rev=rev*10+ld;
			num=num/10;
		}
return rev;
	}
	public static boolean checkpalindrome(int num)
	{
		int rev=reverse(num);
	return rev==num;
	}
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
		int count=0;
		for (int i=1; ;i++)
		{
			if (checkpalindrome(i))
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
