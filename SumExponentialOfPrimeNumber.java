import java.util.Scanner;
class  SumExponentialOfPrimeNumber
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number...");
		int num=sc.nextInt();
		int temp=num;
		int countprime=0;
		while(temp!=0)
		{
			int ld=temp%10;
			if(ld==2||ld==3||ld==5||ld==7)
				countprime++;
			temp=temp/10;
		}
		System.out.println("no of prime digits:" +countprime);
		if(countprime>0)
		{
			int sum=0;
			while(num!=0)
			{
				int ld=num%10;
				int expo=1;
				for(int i=1;i<=countprime;i++)
				{
					expo=expo*ld;
				}
				sum=sum+expo;
				num=num/10;
			}
			System.out.println("sum of exponential:" +sum);
		}
		else
			System.out.println("no prime digits present");
	}
}


	

