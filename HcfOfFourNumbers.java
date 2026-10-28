import java.util.Scanner;
class HcfOfFourNumbers
{
	public static int bi(int num1,int num2,int num3,int num4)
	{
		int min=0;
		if(num1<=num2 && num1<=num3 && num1<=num4)
			min=num1;
		else if(num2<=num3 && num1<=num3)
			min=num2;
		else if(num3<=num4 && num1<=num4)
			min=num3;
	int hcf=0;
	for(int i=1;i<=min;i++)
	{
		if(num1%i==0 && num2%i==0 && num3%i==0 && num4%i==0){
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
		System.out.println("enter the third number ");
		int num3=sc.nextInt();
		System.out.println("enter the fourthnumber ");
		int num4=sc.nextInt();


		int num=bi(num1,num2,num3,num4);
		//System.out.println(bi);
	}
}

	




