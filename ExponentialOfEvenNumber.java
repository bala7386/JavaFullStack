import java.util.Scanner;
class ExponentialOfEvenNumber
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number..");
		int num=sc.nextInt();
		int temp=num;
		int counteven=0;
		while(temp!=0)
		{
			int ld=temp%10;
			if (ld%2==0)
				counteven++;
			temp=temp/10;
		}
		System.out.println("no of even digits=" +counteven);
		if(counteven>0)
		{
			while(num!=0)
			{
				int ld=num%10;
				int expo=1;
				for(int i=1;i<=counteven;i++)
				{
					expo=expo*ld;
				}
				System.out.println("exponential of "+ld+ "=" +expo);
				num=num/10;
			}
			}
			else
				System.out.println("no even digits..");

	}
}
