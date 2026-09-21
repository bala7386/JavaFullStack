import java.util.Scanner;
class SumOfEvenProdOfOddNumbers
{
	public static void main(String [] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the m value....");
	int m=sc.nextInt();
	System.out.println("enter the n value....");
	int n=sc.nextInt();
	int  sum=0,prod=1;
	for (int i=m;i<=n;i++)
{
	if (i%2==0)
	sum=sum+i;
	else 
	prod=prod*i;
}
	System.out.println("sum of even numbers=" +sum);
	System.out.println("product of odd numbers=" +prod);

}
}
