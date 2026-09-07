import java.util.Scanner;
class Alphabets
{
	public static void main(String [] args)
{	
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the character....");
	char ch=sc.next().charAt(0);
	String res=(ch>'a' && ch<'z')?"lowercasealphabet": (ch>'A' && ch<'Z')?"uppercasealphabet":(ch>'0' && ch<'9')? "digit": "special character";
	System.out.println(ch + "is" + res);
}
}
