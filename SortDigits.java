import java.util.Scanner;
class SortDigits
{
	public static void main(String [] args)
			{
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the number");
			int num=sc.nextInt();
		int res=0;
		for(int i=1;i<=9;i++)
		{
			int temp=num;
			while(temp!=0)
			{
				int ld=temp%10;
				if(ld==i)
					res=res*10+ld;
				temp=temp/10;
			}
		
			System.out.println(res);
		}
	}
}



