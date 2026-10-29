
import java.util.Scanner;
class NthLargestNumber

{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
		System.out.println("enter the nth value");
		int n=sc.nextInt();
		int count=0;
		for(int i=9;i>=0;i--)
		{
			int temp=num;
			while(temp!=0)
			{
				int ld=temp%10;
				if(ld==i)
				{
					count++;
					break;
				}
						temp=temp/10;
					}
					if(count==n)
			{
						System.out.println(i);
						break;
			}
		}
	}
}

				

