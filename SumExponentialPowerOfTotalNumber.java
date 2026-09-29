import java.util.Scanner;
class SumExponentialPowerOfTotalNumber
{
	public static void main(String [] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number...");
	int num=sc.nextInt();
	int temp=num;
	int count=0;
	while(temp!=0)
{
	temp=temp/10;
	count++;
}
	System.out.println("no of digits:" +count);
	int sum=0;
	while(num!=0)
{
	int ld=num%10;
	int expo=1;
	for(int i=1;i<=count;i++)
{
	expo=expo*ld;
}
	sum=sum+expo;
	num=num/10;
}

	System.out.println("sum of exponential :" +sum);
}
}

