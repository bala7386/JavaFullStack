import java.util.Scanner;
class ExponentialPowerOfTotalNumber
{
	public static void main(String [] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number...");
	int num=sc.nextInt();
	int temp=num;
	//Count the Digits
	int count=0;
	while(temp!=0)
{
	temp=temp/10;
	count++;
}
	while(num!=0)
{
	int ld=num%10;
	int expo=1;
	for(int i=1;i<=count;i++)
{
	expo=expo*ld;
}
	System.out.println("exponential of " + ld + " = " + expo);
	num=num/10;
}
}
}
