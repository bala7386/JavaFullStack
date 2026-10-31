import java.util.Scanner;
class CheckXylemOrPhloem
{
	public static boolean checkxylemorphloem(int num)
	{
		int sume=0;
		int summ=0;
		sume=sume+(num%10);
		num=num/10;
		while(num>9)
		{
			int ld=num%10;
			summ=summ+ld;
			num=num/10;
		}
		sume=sume+num;
		return sume==summ;
	}
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
		if(num>=100)
		{
				String res=(checkxylemorphloem(num))?"is a xylem number":"is a phloem number";
				System.out.println(num+res);
		}
		else 
			System.out.println("neither xylem nor phloem");
	}
}





