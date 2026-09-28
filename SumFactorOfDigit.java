import java.util.Scanner;
class SumFactorOfDigit
{
	public static void main(String [] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number...");
	int num=sc.nextInt();

	while(num!=0)
{
	int ld=num%10;
	int sum=0;
	for(int i=1;i<=ld;i++)
{
	if(ld%i==0)
	sum=sum+i;
}
	System.out.println(" sum of factor of" +ld+ "=" +sum);
	num=num/10;
}
}
}
