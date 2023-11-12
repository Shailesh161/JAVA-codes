import java.util.Scanner;
class sumofdigits  //gives the sum of all digits
{
    public static void main(String[] args) {
        System.out.println("program for sum of digits;");
        Scanner input =new Scanner(System.in);
        int num=input.nextInt();
        int sum=0;
        while(num>0)
        {
            int digit =num%10;
            sum=sum+digit;
            num=num/10;//to reduce the size of num digit by digit after each step
        }
        System.out.println("sum is:"+sum);
        input.close();
    }
}
