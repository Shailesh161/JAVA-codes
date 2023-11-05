import java.util.Scanner;
class reverse
{
    public static void main(String[] args)
    {
        System.out.println("--------------Program for reversing string of digits------------"); 
        System.out.println("Enter a number:");
        Scanner input =new Scanner(System.in);
        int num=input.nextInt();
        while(num>0)
        {
            int digit=num%10;
            num=num/10;
            System.out.print(digit);
        }
        
    input.close();

    }    
}
