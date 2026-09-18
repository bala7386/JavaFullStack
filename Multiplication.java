import java.util.Scanner;
class Multiplication
{
	public static void main(String [] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number....");
	int num=sc.nextInt();
	System.out.println("enter the n value....");
	int n=sc.nextInt();
	System.out.println("multiplication table of " + num);
	for (int i=1;i<=n;i++)
{
	System.out.println(num + " * " + i + " = " + (num*i));
}

}
}
