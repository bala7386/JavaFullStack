import java.util.Scanner;
class PrintEvenDigit
{
	public static void main(String [] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number...");
	int num=sc.nextInt();
	System.out.println("print even digit:-");
	
	while(num!=0)
{
	int ld=num%10;
	if(ld%2==0)
	System.out.println(ld);
	num=num/10;
}
}
}
