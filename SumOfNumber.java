import java.util.Scanner;
class SumOfNumber
{
	public static void main(String [] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter m value....");
	int m=sc.nextInt();
	System.out.println("enter n value....");
	int n=sc.nextInt();
	 
	int i=m;
	while(i<=n)
{
	System.out.println(i+i);
	i++;
}

}
}
