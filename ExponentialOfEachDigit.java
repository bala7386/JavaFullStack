import java.util.Scanner;
class ExponentialOfEachDigit
{
	public static void main(String [] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number..");
	int num=sc.nextInt();
	System.out.println("enter the n value..");
	int n=sc.nextInt();

	while(num!=0)
{
	int ld=num%10;
	int expo=1;
	for(int i=1;i<=n;i++)
{
	expo=expo*ld;
}
	System.out.println("exponential of " + ld + " = " +expo);
	num=num/10;
}
}
}
	
