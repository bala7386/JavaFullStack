import java.util.Scanner;
class EvenFactors
{
	public static void main(String [] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number...");
	int num=sc.nextInt();
	System.out.println("even factors of=" +num);
	for (int i=1;i<=num;i++)
{	
	if(num%i==0 && i%2==0)
	System.out.println(i);
}
}
}
