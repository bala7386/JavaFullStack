import java.util.Scanner;
class FindLcm
{
	public static int hcf(int n1,int n2)
	{
		while(n2!=0)
		{
			int rem=n1%n2;
			n1=n2;
			n2=rem;
		}
		return n1;
	}
	public static int lcm(int n1,int n2)
	{
		int hcf=hcf(n1,n2);
	return n1/hcf*n2;
}
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the n1 number");
		int n1=sc.nextInt();
		System.out.println("enter the n2 number");
		int n2=sc.nextInt();
		int lcm=lcm(n1,n2);
			System.out.println(lcm);
	}
}
