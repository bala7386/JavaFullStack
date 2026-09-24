import java.util.Scanner;
class ExponentialNumber
{
	public static void main(String [] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the base value");
	int x=sc.nextInt();
	System.out.println("enter the power value");
	int n=sc.nextInt();
	
	int expo=1;
	for(int i=1;i<=n;i++)
{
	expo=expo*x;
}
	System.out.println("exponential number:" +expo);
}
}
