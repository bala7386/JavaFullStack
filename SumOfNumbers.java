import java.util.Scanner;
class SumOfNumbers
{
	public static void main(String [] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the m value....");
	int m=sc.nextInt();
	System.out.println("enter the n value....");
	int n=sc.nextInt();
	int sum=0;
	System.out.println("sum of numbers from"+ m + "to" + n);
	for (int i=m;i<=n;i++)
{
	sum=sum+i;
}
	System.out.println(sum);

}
}
