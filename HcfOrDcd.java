import java.util.Scanner;
class HcfOrDcd
{
	public static int bi(int num1,int num2)
	{
		int min=0;
		if(num1<=num2)
			min=num1;
		else
			min=num2;
	int hcf=0;
	for(int i=1;i<=min;i++)
	{
		if(num1%i==0 && num2%i==0){
			hcf=i;
		}
		}
		System.out.println(hcf);
				return hcf;
	}
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first number");
		int num1=sc.nextInt();
		System.out.println("enter the second number ");
		int num2=sc.nextInt();

		int num=bi(num1,num2);
		//System.out.println(bi);
	}
}

	


