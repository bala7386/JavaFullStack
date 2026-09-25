import java.util.Scanner;
class PrimeDigits
{
	public static void main(String [] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number...");
	int num=sc.nextInt();
	
	while(num!=0)
{
	int ld=num%10;
	if(ld%2==0||ld%3==0||ld%5==0||ld%7==0)
	System.out.println(ld);
	num=num/10;
}
}
}
