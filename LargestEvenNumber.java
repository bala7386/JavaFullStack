import java.util.Scanner;
class  LargestEvenNumber
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number..");
		int num=sc.nextInt();

		int max=0;
		while(num!=0)
		{
			int ld=num%10;
			if(ld%2==0 && ld>max)
				max=ld;
			num=num/10;
		}
			{
		       if(max>0)
		       System.out.println(max);
	else
		System.out.println("no even digits");
	}
}
}

