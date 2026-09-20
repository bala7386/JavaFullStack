import java.util.Scanner;
class FizzBuzzMToN
{
	public static void main(String [] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the m value....");
	int m=sc.nextInt();
	System.out.println("enter the n value....");
	int n=sc.nextInt();
	System.out.println("fizzbuzz numbers from"+ m + "to" + n);
	for (int i=m;i<=n;i++)
{
 	if(i%3==0 && i%5==0)
	System.out.println(i+"-fizzbuzz");
	else if(i%3==0)
	System.out.println(i+"-fizz");
	else if(i%5==0)
	System.out.println(i+"buzz");
	else
	System.out.println(i+"-not a fizz buzz");
}
}
}
