import java.util.Scanner;
class  CheckSpyNumber
{
	public static boolean spy(int num)
	{
		int sum=0,prod=1;
		while (num!=0)
		
		{
			int ld=num%10;
			sum=sum+ld;
			prod=prod*ld;
			num=num/10;
		}
		return sum==prod;
	}
		public static void main(String [] args)
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the number...");
			int num=sc.nextInt();
			String res=(spy(num))?"is a spy number":"is not a spy number";
			System.out.println(res+num);
		}
			}
