import java.util.Scanner;
class  PalindromeOrNot
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
		int temp=num;
		int res=0;
		while(num!=0)
		{
			int ld=num%10;
			res=res*10+ld;
			num=num/10;
		}
		if(res==temp)
		{
			System.out.println("palindrome");
		}
		else
			System.out.println("not a palindrome");
	}
}
