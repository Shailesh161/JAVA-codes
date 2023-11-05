import java.util.Scanner;

public class countoccurence
{
    Scanner input =new Scanner(System.in);

    void add()
    {
        System.out.println("Enter :");
        int a=input.nextInt();
        int b=input.nextInt();
        System.out.println("Addition is :"+(a+b));
    }

    void multiply()
    {
        System.out.println("Enter:");
        int a=input.nextInt();
        int b=input.nextInt();
        System.out.println("Multiplication is :"+(a*b));
    }

    public static void main(String[] args) 
    {
        Scanner input=new Scanner (System.in);
        countoccurence obj=new countoccurence();
        obj.add();
        obj.multiply();
        int x =input.nextInt();
        System.out.println("You Entered:"+x);
        input.close();
    }
}