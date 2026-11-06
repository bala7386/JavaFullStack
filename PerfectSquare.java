import java.util.Scanner;
class  PerfectSquare
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the numbner");
		int num=sc.nextInt();
		for (int i=1; ;i++)
		{
			int res=i*i;
			if(res==num)
			{
			System.out.println(num + " Is a perfect square ");
			break;
}
if (res>num)
{
	System.out.println(num + " Is not a perfect square ");
	break;
}
}
	}
}
