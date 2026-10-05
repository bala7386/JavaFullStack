import java.util.Scanner;
class  SmallestNumber
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number..");
		int num=sc.nextInt();

		int min=9;
		while(num!=0)
		{
			int ld=num%10;
			if(ld<min)
				min=ld;
			num=num/10;
		}
		System.out.println("The smallest number is:" +min);
	}
}
