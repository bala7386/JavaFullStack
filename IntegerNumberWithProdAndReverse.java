import java.util.Scanner;
class  IntegerNumberWithProdAndReverse
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
		if(num>1000)
		{
			int prod=1;
		while(num!=0)
		{
			int ld=num%10;
			prod=prod*ld;
			num=num/10;
	}
	System.out.println("prod of digits:" +prod);
		int rev=0;
		while(prod!=0)
		{
			int ld=prod%10;
				rev=rev*10+ld;
			prod=prod/10;
		}
		System.out.println("reverse prod :" +rev);
		if (rev%2==0)
			System.out.println(rev+" is a even number");
			else
			System.out.println(rev+"is a odd number" );
		}
		else
			System.out.println(num+ "it is a invalid number because the number have atleast four digits");
	}
}

		
		



