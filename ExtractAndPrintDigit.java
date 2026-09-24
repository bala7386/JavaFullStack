import java.util.Scanner;
class ExtractAndPrintDigit
{
	public static void main(String [] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number...");
	int num=sc.nextInt();
	System.out.println("The digits:-");
	
	while(num!=0)
{
	int ld=num%10;
	System.out.println(ld);
	num=num/10;
}
}
}
