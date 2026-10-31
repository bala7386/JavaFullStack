
import java.util.Scanner;

class Happynumberorsadnumber
{
    public static int happynumberorsadnumber(int num)
    {
        while (num != 1 && num != 4)
        {
            int sum = 0;
            while (num != 0)
            {
                int ld = num % 10;
                sum = sum + ld * ld;
                num = num / 10;
            }
            num = sum;
        }
        return num;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int num = sc.nextInt();

        String res = (happynumberorsadnumber(num) == 1) ? " is a happy number" : " is a sad number";
        System.out.println(num + res);
    }
}
