import java.util.Scanner;
class  SwapExtremedigits
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
		int l=num%10;
		int m=0,p=1;
		while(num>10)
		{
			int ld=num%10;
			m=ld*p+m;
			p=p*10;
			num=num/10;
	}
	m=1*p+m;
	m=m*10+num;
	System.out.println(m);

}
}
