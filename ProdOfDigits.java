import java.util.Scanner;
class ProdOfDigits
{
	public static void main(String [] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number...");
	int num=sc.nextInt();
	int prod=1;
	
	while(num!=0)
{
	int ld=num%10;
	prod=prod+ld;
	num=num/10;
}
	System.out.println("print prod of digits:" +prod);
}
}
