import java.util.Scanner;
class Concatination
{
	public static void main(String [] args)
{	
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number....");
	int num = sc.nextInt();
	String res=(num%3==0 && num%5==0)? "fizzbuzz": (num%3==0)? "fizz": (num%5==0)? "buzz": "not a fizzbuzz";
	System.out.println(num + "is" + res);
}
}
