import java.util.Scanner;
class EvenOrOddNumber
{
	public static void main(String [] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter m value....");
	int m=sc.nextInt();
	System.out.println("enter n value....");
	int n=sc.nextInt();
	for (int i=m;i<=n;i++)
{
	if(i%2==0)
{/

	System.out.println(i+ " even ");
}
	else
{
	System.out.println(i+ " odd ");

}

}
}
}
