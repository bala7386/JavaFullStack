import java.util.Scanner;
class ProdFactorOfDigit
{
	public static void main(String [] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number...");
	int num=sc.nextInt();

	while(num!=0)
{
	int ld=num%10;
	int prod=1;
	for(int i=1;i<=ld;i++)
{
	if(ld%i==0)
	prod=prod*i;
}
	System.out.println(" prod of factor of " + ld + " = " +prod);
	num=num/10;
}
}
}
