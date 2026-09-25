import java.util.Scanner;
class SumOfOnlyEvenDigit
{
	public static void main(String [] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number...");
	int num=sc.nextInt();
	int sum=0;
	
	while(num!=0)
{
	int ld=num%10;
	if(ld%2==0)
	sum=sum+ld;
	num=num/10;
}
	System.out.println("print sum of  even digit:" +sum);
}
}
