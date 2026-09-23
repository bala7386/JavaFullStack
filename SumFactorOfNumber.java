import java.util.Scanner;
class SumFactorOfNumber
{
	public static void main(String [] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number");
	int num=sc.nextInt();
	int sum=0;
	System.out.println("factor of =" +num);
	for (int i=1;i<=num;i++)
{
	if(num%i==0)
	sum=sum+i;
}
	System.out.println("sum of factors=" +sum);
}
}
