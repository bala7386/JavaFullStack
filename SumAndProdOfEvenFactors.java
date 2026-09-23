import java.util.Scanner;
class SumAndProdOfEvenFactors
{
	public static void main(String [] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number...");
	int num=sc.nextInt();
	int sum=0,prod=1;
	for (int i=1;i<=num;i++)
{	
	if(num%i==0)
	if(i%2==0)
	sum=sum+i;
	else
	prod=prod*i;
}
	
	System.out.println("sum of even numbers:"+sum);
	System.out.println("prod of even numbers:"+prod);

}
}
