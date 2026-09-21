import java.util.Scanner;
class ProdOfEvenNumbers
{
	public static void main(String [] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the m value....");
	int m=sc.nextInt();
	System.out.println("enter the n value....");
	int n=sc.nextInt();
	int prod=1;
	for (int i=m;i<=n;i++)
{
	if(i%2==0)
	prod=prod*i;
}
	System.out.println("product of even numbers=" +prod);

}
}
