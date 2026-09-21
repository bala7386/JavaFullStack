import java.util.Scanner;
class ProdOfNumbers
{
	public static void main(String [] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the m value...");
	int m=sc.nextInt();
	System.out.println("enter the n value...");
	int n=sc.nextInt();
	int prod=1;
	for (int i=m;i<=n;i++)
{
	prod=prod*i;
}
	System.out.println(prod);
}
}
