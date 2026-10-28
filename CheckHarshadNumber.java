import java.util.Scanner;
class  CheckHarshadNumber
{
	public static boolean harshadnumber(int num)
	{
		int sum=0,og=num;
		while (num!=0)
		
		{
			int ld=num%10;
			sum=sum+ld;
			num=num/10;
		}
		return og%sum==0;
	}
		public static void main(String [] args)
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the number...");
			int num=sc.nextInt();
			String res=(harshadnumber(num))?"is a harshad number":"is not a harshad number";
			System.out.println(res+num);
		}
			}

